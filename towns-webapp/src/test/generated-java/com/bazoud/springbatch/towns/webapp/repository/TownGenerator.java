/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/test/java/service/ModelGenerator.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.repository;

import javax.inject.Named;
import javax.inject.Singleton;

import com.bazoud.springbatch.towns.webapp.domain.Town;
import com.bazoud.springbatch.towns.webapp.util.ValueGenerator;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@Named
@Singleton
public class TownGenerator {

    /**
     * Returns a new Town instance filled with random values.
     */
    public Town getTown() {
        Town town = new Town();

        // primary key column must be set manually
        town.setId(ValueGenerator.getUniqueInteger());
        // simple attributes follows
        town.setDepartment("a");
        town.setName("a");
        town.setNameReal("a");
        town.setPostcode("a");
        town.setPopulation(1);
        town.setArea(1);
        town.setLongitudeDeg("a");
        town.setLatitudeDeg("a");
        town.setLongitudeGrd("a");
        town.setLatitudeGrd("a");
        town.setLongitudeDms("a");
        town.setLatitudeDms("a");
        town.setZmin(1);
        town.setZmax(1);
        return town;
    }

}