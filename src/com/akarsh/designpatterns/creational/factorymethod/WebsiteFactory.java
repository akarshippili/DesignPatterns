package com.akarsh.designpatterns.creational.factorymethod;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType websiteType){
        switch (websiteType){
            case Blog -> {
                return new Blog();
            }
            case Shop -> {
                return new Shop();
            }
            default -> {
                return null;
            }
        }
    }


}
