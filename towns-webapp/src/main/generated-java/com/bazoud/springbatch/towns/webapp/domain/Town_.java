/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/EntityMeta_.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Town.class)
public abstract class Town_ {

    // Raw attributes
    public static volatile SingularAttribute<Town, Integer> id;
    public static volatile SingularAttribute<Town, String> department;
    public static volatile SingularAttribute<Town, String> name;
    public static volatile SingularAttribute<Town, String> nameReal;
    public static volatile SingularAttribute<Town, String> postcode;
    public static volatile SingularAttribute<Town, Integer> population;
    public static volatile SingularAttribute<Town, Integer> area;
    public static volatile SingularAttribute<Town, String> longitudeDeg;
    public static volatile SingularAttribute<Town, String> latitudeDeg;
    public static volatile SingularAttribute<Town, String> longitudeGrd;
    public static volatile SingularAttribute<Town, String> latitudeGrd;
    public static volatile SingularAttribute<Town, String> longitudeDms;
    public static volatile SingularAttribute<Town, String> latitudeDms;
    public static volatile SingularAttribute<Town, Integer> zmin;
    public static volatile SingularAttribute<Town, Integer> zmax;
}