package com.microservice.docker.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currencyconversionrate")
public class CurrencyConversionRate {

    @Id
    @GeneratedValue
    private long id;

    private String sourceCurrency;

    private String targetCurrency;

    private float exchangeRate;

    public CurrencyConversionRate() {
    }

    public CurrencyConversionRate(String sourceCurrency, String targetCurrency, float exchangeRate) {
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.exchangeRate = exchangeRate;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CurrencyConversionRate [exchangeRate=").append(exchangeRate).append(", id=").append(id)
                .append(", sourceCurrency=").append(sourceCurrency).append(", targetCurrency=").append(targetCurrency)
                .append("]");
        return builder.toString();
    }

}