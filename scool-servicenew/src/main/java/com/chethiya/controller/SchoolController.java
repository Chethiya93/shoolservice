package com.chethiya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chethiya.modal.School;
import com.chethiya.service.SchoolService;


@RestController
@RequestMapping(value="/smscloud")
public class SchoolController {
	@Autowired
	SchoolService schoolService;
	
    @PostMapping(value="/school")
	public ResponseEntity<School>  save(@RequestBody School school)
	{
		return ResponseEntity.ok(schoolService.save(school));
	}
    
    
    @RequestMapping(value="/school", method= RequestMethod.GET)
    public List<School> fetchAll()
    {
    	return schoolService.fetchAll();
    }
     @RequestMapping(value="/school/school/{city}",method = RequestMethod.GET)
    public ResponseEntity<List<School>>  fetchbyCity(@PathVariable String city)
    {
    	return ResponseEntity.ok(schoolService.fetchbyCity(city));
    }
    @RequestMapping(value="/school/{id}",method =RequestMethod.GET )
    public ResponseEntity<School> fetchbyId(@PathVariable Integer id)
    {
    	School school= schoolService.fetchbyId(id);
    	if(school==null)
    	{
    		return ResponseEntity.notFound().build();
    	}
    	else {
    		return ResponseEntity.ok(school);
    	}
    }
    @RequestMapping(value="/school/filter/{id}",method =RequestMethod.GET )
    public ResponseEntity<School> filterbyId(@PathVariable Integer id)
    {
    	School school= schoolService.fetchbyId(id);
    	if(school==null)
    	{
    		return ResponseEntity.notFound().build();
    	}
    	else {
    		return ResponseEntity.ok(school);
    	}
    }
    	 @RequestMapping(value = "/school/{id}",method = RequestMethod.DELETE)
    	public  void   delete(@RequestBody School school ,@PathVariable Integer id)
    	
    	{
        	schoolService.delete(school);
    		
    	}
    	
    }
	

	
	
	
	
	
	
	
	
	
	
	


