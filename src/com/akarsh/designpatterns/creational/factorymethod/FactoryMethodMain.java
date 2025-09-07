package com.akarsh.designpatterns.creational.factorymethod;

public class FactoryMethodMain {

    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite(WebsiteType.Blog);
        System.out.println(website);

        website = WebsiteFactory.getWebsite(WebsiteType.Shop);
        System.out.println(website);
    }

}
