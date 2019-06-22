package com.redis.example.redisexample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redis.example.redisexample.beans.CurrencyConversionBean;
import com.redis.example.redisexample.repository.RedisRepo;

@Service
public class RedisSerImpl implements RedisSer{

	@Autowired
	RedisRepo repo;
	
	@Override
	public CurrencyConversionBean getConversionRate(String fromCurrency, String toCurrency) {
		return repo.getConversionAmt();
		
	}

}
