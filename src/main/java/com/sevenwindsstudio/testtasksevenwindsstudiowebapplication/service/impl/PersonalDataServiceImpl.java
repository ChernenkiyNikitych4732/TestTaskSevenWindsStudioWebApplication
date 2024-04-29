package com.sevenwindsstudio.testtasksevenwindsstudiowebapplication.service.impl;

import com.sevenwindsstudio.testtasksevenwindsstudiowebapplication.dao.PersonalDataRepository;
import com.sevenwindsstudio.testtasksevenwindsstudiowebapplication.dto.AddPersonalDataRequestDto;
import com.sevenwindsstudio.testtasksevenwindsstudiowebapplication.entity.PersonalData;
import com.sevenwindsstudio.testtasksevenwindsstudiowebapplication.service.PersonalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalDataServiceImpl implements PersonalDataService {

    @Autowired
    PersonalDataRepository personalDataRepository;

    @Override
    public List<PersonalData> getAllPersonalData() {
        return personalDataRepository.findAll();
    }

    @Override
    public PersonalData getPersonalDataById(int id) {
        PersonalData personalData = null;
        Optional<PersonalData> optionalPersonalData = personalDataRepository.findById(id);
        if (optionalPersonalData.isPresent()) {
            personalData = optionalPersonalData.get();
        }
        return personalData;
    }

    @Override
    public void savePersonalData(AddPersonalDataRequestDto personalDataDto) {

        PersonalData personalData = new PersonalData();

        personalData.setEmail(personalDataDto.getEmail());
        personalData.setFirstName(personalDataDto.getFirstName());
        personalData.setLastName(personalDataDto.getLastName());
        personalData.setPatronymic(personalDataDto.getPatronymic());
        personalData.setPhoneNumber(personalDataDto.getPhoneNumber());

        personalDataRepository.save(personalData);
    }
}