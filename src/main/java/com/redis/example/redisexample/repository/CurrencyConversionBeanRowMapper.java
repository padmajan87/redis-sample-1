package com.redis.example.redisexample.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.redis.example.redisexample.beans.CurrencyConversionBean;

public class CurrencyConversionBeanRowMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		CurrencyConversionBean currBean = new CurrencyConversionBean(
					rs.getLong("id")
					,rs.getString("currFrom")
					,rs.getString("currTo")
					,rs.getBigDecimal("exchangeRate")
				);
		return currBean;
	}

}
