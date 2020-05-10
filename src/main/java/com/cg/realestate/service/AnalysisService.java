package com.cg.realestate.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.realestate.dao.AnalysisDao;
import com.cg.realestate.model.LocationAnalysis;

@Service
public class AnalysisService {

	@Autowired
	private AnalysisDao dao;
	

	LocationAnalysis locationAnalysis = new LocationAnalysis();
	
	public LocationAnalysis save( LocationAnalysis locationAnalysis) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date = new Date();  
		locationAnalysis.setAnalysisDate(date);
		return dao.save(locationAnalysis);
	}
	
}
