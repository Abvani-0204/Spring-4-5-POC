package com.ab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ab.model.WebServiceModel;
import com.ab.repository.RegistrationRepository;

@Service
@Transactional
public class RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;

	public void saveRecordService(WebServiceModel model) {
		/* registrationRepository.saveRecordWithHibernateTemplate(model); */
		registrationRepository.saveRecord(model);
	}
}
