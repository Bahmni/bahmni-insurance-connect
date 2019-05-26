package org.bahmni.insurance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Properties {

	@Value("${openmrs.db.url}")
	public String openmrsDBUrl;

	@Value("${openelis.db.url}")
	public String openelisDBUrl;

	@Value("${imis.url}")
	public String imisUrl;

	@Value("${imis.password}")
	public String imisPassword;
	
	@Value("${imisconnect.user}")
	public String imisConnectUser;

	@Value("${imisconnect.password}")
	public String imisConnectPassword;

	@Value("${imis.user}")
	public String imisUser;

	@Value("${openmrs.url}")
	public String openmrsUrl;

	@Value("${openmrs.password}")
	public String openmrsPassword;

	@Value("${openmrs.user}")
	public String openmrsUser;

	@Value("${log4j.config.file}")
	public String log4jConfigFile;

	@Value("${openmrs.odoo.api}")
	public String openmrsOdooApi;

}
