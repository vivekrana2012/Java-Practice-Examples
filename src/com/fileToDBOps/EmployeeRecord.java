package com.fileToDBOps;

public class EmployeeRecord {
    private String country;
    private String currency;
    private int salary;
    private int exchange_rate_to_usd;
    private int salary_in_usd;

    public EmployeeRecord(String country, int salary, String currency, int exchange_rate_to_usd, int salary_in_usd) {
        this.country = country;
        this.currency = currency;
        this.salary = salary;
        this.exchange_rate_to_usd = exchange_rate_to_usd;
        this.salary_in_usd = salary_in_usd;
    }

    public static class Builder{
        private String country;
        private String currency;
        private int salary;
        private int exchange_rate_to_usd;
        private int salary_in_usd;

        public Builder setSalary_in_usd(int salary_in_usd) {
            this.salary_in_usd = salary_in_usd;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder setExchange_rate_to_usd(int exchange_rate_to_usd) {
            this.exchange_rate_to_usd = exchange_rate_to_usd;
            return this;
        }

        public EmployeeRecord build(){
            return new EmployeeRecord(country, salary, currency, exchange_rate_to_usd, salary_in_usd);
        }
    }

    public String getCountry() {
        return country;
    }

    public String getCurrency() {
        return currency;
    }

    public int getSalary() {
        return salary;
    }

    public int getExchange_rate_to_usd() {
        return exchange_rate_to_usd;
    }

    public int getSalary_in_usd() {
        return salary_in_usd;
    }

    public String toString(){
        return this.country + " " + this.currency + this.salary + " " + this.exchange_rate_to_usd + " = " + this.salary_in_usd;
    }
}
