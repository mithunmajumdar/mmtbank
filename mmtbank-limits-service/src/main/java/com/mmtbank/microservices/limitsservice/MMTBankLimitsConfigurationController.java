package com.mmtbank.microservices.limitsservice;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.mmtbank.microservices.limitservice.bean.MMTBankLimitConfiguration;  

@RestController  
public class MMTBankLimitsConfigurationController   
{  
	@Autowired
	MMTBankConfiguration configuration;
	
	@GetMapping("/mmtbank-limits")  
	public MMTBankLimitConfiguration retriveLimitsFromConfigurations()  
	{  
		//return new LimitConfiguration(1000, 1);  
		//getting values from the properties file  
		return new MMTBankLimitConfiguration(configuration.getMinimumBalance(), configuration.getMaximumBalance());  
	}  
}  