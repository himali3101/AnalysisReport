package com.cg.realestate.dao;
import java.util.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.realestate.model.LocationAnalysis;

@Repository
public interface AnalysisDao extends CrudRepository<LocationAnalysis, String >{

}
