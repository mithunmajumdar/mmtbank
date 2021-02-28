package com.mmtbank.microservices.limitsservice;  
import org.springframework.boot.context.properties.ConfigurationProperties;  
import org.springframework.stereotype.Component;  

@Component  
@ConfigurationProperties("mmtbank-limits-service")  
public class MMTBankConfiguration   
{  
	private int minimumBalance; 
	private int maximumBalance; 
	
	public int getMinimumBalance() {
		return minimumBalance;
	}
	
	public void setMinimumBalance(int minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	public int getMaximumBalance() {
		return maximumBalance;
	}
	
	public void setMaximumBalance(int maximumBalance) {
		this.maximumBalance = maximumBalance;
	}
	 
}  