package com.chethiya.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chethiya.modal.School;

public interface SchoolRepo extends JpaRepository<School, Integer> {

}
