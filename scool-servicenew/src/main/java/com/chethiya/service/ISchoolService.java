package com.chethiya.service;

import java.util.List;

import com.chethiya.modal.School;

public interface ISchoolService {
	
	School save (School school);
	List<School> fetchAll();
	School fetchbyId(Integer id);
	void delete(School school);
	
	
	

}
