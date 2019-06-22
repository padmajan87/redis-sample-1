package com.redis.example.redisexample.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class CurrencyConversionBean implements Serializable{
	private long id;
	private String currFrom;
	private String currTo;
	private BigDecimal exchangeRate;
	private int port;
	
	protected CurrencyConversionBean() {}
	
	public CurrencyConversionBean(long id, String currencyFrom, String currencyTo, BigDecimal exchangeRate) {
		super();
		this.id = id;
		this.currFrom = currencyFrom;
		this.currTo = currencyTo;
		this.exchangeRate = exchangeRate;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the currFrom
	 */
	public String getCurrFrom() {
		return currFrom;
	}

	/**
	 * @param currFrom the currFrom to set
	 */
	public void setCurrFrom(String currFrom) {
		this.currFrom = currFrom;
	}

	/**
	 * @return the currTo
	 */
	public String getCurrTo() {
		return currTo;
	}

	/**
	 * @param currTo the currTo to set
	 */
	public void setCurrTo(String currTo) {
		this.currTo = currTo;
	}

	/**
	 * @return the exchangeRate
	 */
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	/**
	 * @param exchangeRate the exchangeRate to set
	 */
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CurrencyConversionBean [id=" + id + ", currency_from=" + currFrom + ", currency_to=" + currTo
				+ ", exchange_rate=" + exchangeRate + ", port=" + port + "]";
	}
	
	
	
}
