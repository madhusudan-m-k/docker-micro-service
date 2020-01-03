# docker-micro-service

Docker micro service examples

##### URL to access to invoke Currency conversion rates query service

```
http://192.168.99.101:8080/conversionservice/conversionrate/from/USD/to/INR

Sample output -

{
  "id": 2,
  "sourceCurrency": "USD",
  "targetCurrency": "INR",
  "exchangeRate": 75.000
}
```

##### URL to access to invoke Currency exchange service

```
http://192.168.99.101:9090/currencyexchange/exchangeccy/from/GBP/to/INR/amount/100

Sample output -
{
  "id": 1,
  "sourceCurrency": "GBP",
  "targetCurrency": "INR",
  "exchangeRate": 90.000,
  "sourceCcyAmount": 100,
  "targetCcyAmount": 9000.000
}
```
