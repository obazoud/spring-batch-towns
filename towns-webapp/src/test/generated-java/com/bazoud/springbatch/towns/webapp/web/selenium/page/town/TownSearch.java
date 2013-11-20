/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/SearchPage.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.selenium.page.town;

import com.bazoud.springbatch.towns.webapp.web.selenium.support.Page;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.Autocomplete;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.CustomWebElement;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.EntityAction;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.Messages;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.OrderBy;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.SearchForm;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.StringRange;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.Table;

@Page
public class TownSearch {
    public Table table;
    public EntityAction entity;
    public Messages messages;
    public TownSearchOrders orders;
    public TownSearchForm form;

    public static class TownSearchOrders extends CustomWebElement {
        public OrderBy id = new OrderBy("town_id");
        public OrderBy department = new OrderBy("town_department");
        public OrderBy name = new OrderBy("town_name");
        public OrderBy nameReal = new OrderBy("town_nameReal");
        public OrderBy postcode = new OrderBy("town_postcode");
        public OrderBy population = new OrderBy("town_population");
        public OrderBy area = new OrderBy("town_area");
        public OrderBy longitudeDeg = new OrderBy("town_longitudeDeg");
        public OrderBy latitudeDeg = new OrderBy("town_latitudeDeg");
        public OrderBy longitudeGrd = new OrderBy("town_longitudeGrd");
        public OrderBy latitudeGrd = new OrderBy("town_latitudeGrd");
        public OrderBy longitudeDms = new OrderBy("town_longitudeDms");
        public OrderBy latitudeDms = new OrderBy("town_latitudeDms");
        public OrderBy zmin = new OrderBy("town_zmin");
        public OrderBy zmax = new OrderBy("town_zmax");
    }

    public static class TownSearchForm extends SearchForm {
        public Autocomplete id = new Autocomplete("form:id");
        public Autocomplete department = new Autocomplete("form:department");
        public Autocomplete name = new Autocomplete("form:name");
        public Autocomplete nameReal = new Autocomplete("form:nameReal");
        public Autocomplete postcode = new Autocomplete("form:postcode");
        public StringRange population = new StringRange("form:population");
        public StringRange area = new StringRange("form:area");
        public Autocomplete longitudeDeg = new Autocomplete("form:longitudeDeg");
        public Autocomplete latitudeDeg = new Autocomplete("form:latitudeDeg");
        public Autocomplete longitudeGrd = new Autocomplete("form:longitudeGrd");
        public Autocomplete latitudeGrd = new Autocomplete("form:latitudeGrd");
        public Autocomplete longitudeDms = new Autocomplete("form:longitudeDms");
        public Autocomplete latitudeDms = new Autocomplete("form:latitudeDms");
        public StringRange zmin = new StringRange("form:zmin");
        public StringRange zmax = new StringRange("form:zmax");
    }
}