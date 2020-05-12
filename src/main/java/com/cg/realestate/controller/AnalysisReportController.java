package com.cg.realestate.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.realestate.model.Buyer;
import com.cg.realestate.model.LocationAnalysis;
import com.cg.realestate.model.PropertySell;
import com.cg.realestate.service.AnalysisService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@CrossOrigin
@RequestMapping("/analysis")
@Api(value = "Property Analysis Report")
public class AnalysisReportController {

	private static final Logger logger = LoggerFactory.getLogger(AnalysisReportController.class);
	
	@Autowired
	AnalysisService service;
	
	@GetMapping(path = "/data")
	@HystrixCommand(fallbackMethod="alternateMethod")
	@ApiOperation(value = "LocationWiseAnalysis", nickname = "LocationWiseAnalysis")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = PropertySell.class),
							@ApiResponse(code = 500, message = "Failure", response = PropertySell.class) })
	public List<PropertySell> locationAnalysis() {
		    String url = "http://localhost:9009/buyorsell/display";
			RestTemplate restTemplate = new RestTemplate();
			//List<User> user = restTemplate.getClientHttpRequestInitializers(url)
			ResponseEntity<PropertySell[]> responseEntity = restTemplate.getForEntity(url, PropertySell[].class);
			List<PropertySell> properties = Arrays.asList(responseEntity.getBody());
			
		/*	List<Buyer> buyers = new ArrayList<>();
		
			for( PropertySell propertySell : properties) {
				buyer = propertySell.getBuyer();
				buyers.add(buyer);
			}
		*/	
			logger.info("number propertiessold at particular location");
			logger.trace(" Inside locationAnalysis() ");
			logger.error("Error happened at locationAnalysis()");

			return properties;
	}

	
	public List<PropertySell> alternateMethod() {   
        System.out.println("inside alternateMethod");
        logger.info("Due to Exception, the fallbackmethod is called by Hystrix");
        List<PropertySell> list = new ArrayList<>();
        return list;
 }
	
	
	@PostMapping(path = "/storedata")
	public LocationAnalysis storeAnalysisData(@RequestBody LocationAnalysis locationAnalysis) {
		
		return service.save(locationAnalysis);
	}
}
