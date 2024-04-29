package com.sevenwindsstudio.testtasksevenwindsstudiowebapplication.dao;

import com.sevenwindsstudio.testtasksevenwindsstudiowebapplication.entity.PersonalData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalDataRepository extends JpaRepository<PersonalData, Integer> {

}
