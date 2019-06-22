package com.redis.example.redisexample.services;

import com.redis.example.redisexample.beans.CurrencyConversionBean;

public interface RedisSer {
	public CurrencyConversionBean getConversionRate(String fromCurrency,String toCurrency);
}
