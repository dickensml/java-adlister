package com.codeup.adlister.dao;

class Config {
    public String getUrl() {
        return "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false";
    }
    public String getUser() {
        return null;
    };
    public String getPassword() {
        return null;
    }
}