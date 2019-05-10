package com.possible.imisconnect.service.impl;

import org.hl7.fhir.dstu3.model.Claim;
import org.hl7.fhir.dstu3.model.ClaimResponse;
import org.hl7.fhir.dstu3.model.EligibilityRequest;
import org.hl7.fhir.dstu3.model.EligibilityResponse;
import org.hl7.fhir.dstu3.model.Task;
import org.springframework.stereotype.Component;

import com.possible.imisconnect.Properties;
import com.possible.imisconnect.service.AInsuranceClientService;

@Component
public class ImisFhirClientServiceImpl extends AInsuranceClientService {

	public ImisFhirClientServiceImpl(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ClaimResponse getClaimResponse(Claim claimRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EligibilityResponse getElibilityResponse(EligibilityRequest eligbilityRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClaimResponse getClaimStatus(Task claimStatusRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}