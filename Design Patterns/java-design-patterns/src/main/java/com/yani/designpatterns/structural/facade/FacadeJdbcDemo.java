package com.yani.designpatterns.structural.facade;

import java.util.List;

/**
 * Pluralsight link <a>https://app.pluralsight.com/course-player?clipId=cd0ace40-4e8e-470c-9687-dad34fcdd1fe</a>
 */
public class FacadeJdbcDemo {
    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();

        jdbcFacade.insertIntoTable();

        List<Address> addressList = jdbcFacade.getAddresses();

        for (Address address : addressList) {
            System.out.println(address.getId() + " : "  + address.getStreetName() + " : " + address.getCity());
        }

        jdbcFacade.closeConnection();
    }
}
