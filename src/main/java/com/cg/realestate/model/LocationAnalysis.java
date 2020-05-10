package com.cg.realestate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.UniqueElements;

import rx.annotations.Beta;

@Entity
public class LocationAnalysis {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String location;
	@Column
	private Date analysisDate;
	
	@Column
	private int numberOfProperties;
	
	
	
	public LocationAnalysis( String location, int numberOfProperties) {
		super();
		
		this.location = location;
		this.numberOfProperties = numberOfProperties;
	}
	public LocationAnalysis() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getAnalysisDate() {
		return analysisDate;
	}
	public void setAnalysisDate(Date analysisDate) {
		this.analysisDate = analysisDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNumberOfProperties() {
		return numberOfProperties;
	}
	public void setNumberOfProperties(int numberOfProperties) {
		this.numberOfProperties = numberOfProperties;
	}
	
	
	
}
