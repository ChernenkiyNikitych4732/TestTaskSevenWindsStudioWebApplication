package com.sevenwindsstudio.testtasksevenwindsstudiowebapplication.service;

import com.sevenwindsstudio.testtasksevenwindsstudiowebapplication.dto.AddPersonalDataRequestDto;
import com.sevenwindsstudio.testtasksevenwindsstudiowebapplication.entity.PersonalData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PersonalDataService {

    List<PersonalData> getAllPersonalData();

    PersonalData getPersonalDataById(int id);

    void savePersonalData(AddPersonalDataRequestDto personalDataDto);
}
