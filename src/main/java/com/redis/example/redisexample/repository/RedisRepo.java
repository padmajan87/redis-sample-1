package com.redis.example.redisexample.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.redis.example.redisexample.beans.CurrencyConversionBean;

@Repository
public class RedisRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CurrencyConversionBean getConversionAmt() {
		String sql = "SELECT id,currency_from currFrom,currency_to currTo, "
				+ " exchange_rate exchangeRate "
				+ " FROM test_ms.exchange_value "
				+ " WHERE id=? ";	
		
		   RowMapper<CurrencyConversionBean> rowMapper = new BeanPropertyRowMapper<CurrencyConversionBean>(CurrencyConversionBean.class);		
		   CurrencyConversionBean currBean = jdbcTemplate.queryForObject(sql,rowMapper,10001);
		   System.out.println(" CurrObject  :::: "+currBean);
		return currBean;
	}
}
