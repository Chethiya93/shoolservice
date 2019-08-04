package com.chethiya.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chethiya.exception.IdNotFoundException;
import com.chethiya.modal.School;
import com.chethiya.repositary.SchoolRepo;

@Service
public class SchoolService implements ISchoolService{

@Autowired
SchoolRepo schoolRepo;
@Autowired
School school;

@Override
public School save(School school) {
	
	return schoolRepo.save(school);
}

@Override
public List<School> fetchAll() {
	return schoolRepo.findAll();
	
	//return schoolRepo.findAll().stream().filter(t1->t1.getCity().equals("matara")).collect(Collectors.toList());
}

@Override
public School fetchbyId(Integer id) {
	Optional<School> optional = schoolRepo.findById(id);
	if(optional.isPresent())
	{
		return optional.get();
	}
else {
throw new IdNotFoundException("School not found:"+id);
}

}
public List<School>filterbyId(Integer id)
{
	Optional<School> optional = schoolRepo.findById(id);
	
	if(optional.isPresent())
	{
		return schoolRepo.findAll().stream().filter(t2-> t2.getId().equals(4)).collect(Collectors.toList());
	}
	
	else throw new IdNotFoundException("School not found:"+id);
}

public List<School> fetchbyCity(String city)
{
	return schoolRepo.findAll().stream()
			.filter(t2-> t2.getCity().equals(city)).collect(Collectors.toList());
}

public void delete(School school) {
	Optional<School> optional = schoolRepo.findById(school.getId());
	if (optional.isPresent()) {
		schoolRepo.delete(school);
	}else {
		throw new IdNotFoundException("School not found:");
	}
}
}
