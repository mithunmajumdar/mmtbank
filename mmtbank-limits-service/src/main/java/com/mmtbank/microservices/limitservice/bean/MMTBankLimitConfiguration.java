package com.mmtbank.microservices.limitservice.bean;

public class MMTBankLimitConfiguration   
{  
	private int maximumBalance;  
	private int minimumBalance;  
	//no-argument constructor  
	protected MMTBankLimitConfiguration()  
	{  
	}  
	//generating getters  
	public int getMaximumBalance()   
	{  
		return maximumBalance;  
	}  
	public int getMinimumBalance()   
	{  
		return minimumBalance;  
	}  
	//genetrating constructor using fields  
	public MMTBankLimitConfiguration(int minimumBalance, int maximumBalance)   
	{  
		super();  
		this.maximumBalance = maximumBalance;  
		this.minimumBalance = minimumBalance;  
	}  
}  