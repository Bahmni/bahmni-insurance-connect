package org.bahmni.insurance.serviceImpl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

import org.bahmni.insurance.Properties;
import org.bahmni.insurance.service.AOpernmrsFhirConstructorService;
import org.hl7.fhir.dstu3.model.Claim;
import org.hl7.fhir.dstu3.model.EligibilityRequest;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
@Configurable
public class OpenmrsFhirConstructorServiceImpl extends AOpernmrsFhirConstructorService {

	public OpenmrsFhirConstructorServiceImpl(Properties properties) {
		super(properties);
	}

	@Override
	public String getFhirPatient(String patientId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		return this.getApiClient()
				.exchange(this.getProperties().openmrsUrl + patientId, HttpMethod.GET, entity, String.class).getBody();
	}

	@Override
	public Claim constructFhirClaimRequest(String patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
