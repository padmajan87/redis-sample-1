package com.redis.example.redisexample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.redis.example.redisexample.beans.CurrencyConversionBean;
import com.redis.example.redisexample.services.RedisSer;

@RestController
public class HelloRedisController {

	@Autowired
	RedisSer ser;
	
	@Cacheable(value="exchange",key="#id")
	@GetMapping(path="/hello-redis/{id}")
	public CurrencyConversionBean helloRedis(@PathVariable("id") long id) {
			return ser.getConversionRate("USD", "INR");
	}
}
