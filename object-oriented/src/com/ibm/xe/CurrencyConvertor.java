package com.ibm.xe;

import Currency;

public class CurrencyConvertor {
 public double convert(double amount,Currency source,Currency target) {
	 double rate;
	 rate=target.dollarValue()/source.dollarValue();
	 return rate=amount;
	 }
}
