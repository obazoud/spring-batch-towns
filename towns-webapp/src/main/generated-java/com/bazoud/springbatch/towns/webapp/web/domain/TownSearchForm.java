/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/SearchForm.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.domain;

import static com.bazoud.springbatch.towns.webapp.repository.support.PropertySelector.newPropertySelector;
import static com.bazoud.springbatch.towns.webapp.repository.support.Range.newRange;

import javax.inject.Named;

import com.bazoud.springbatch.towns.webapp.domain.Town;
import com.bazoud.springbatch.towns.webapp.domain.Town_;
import com.bazoud.springbatch.towns.webapp.repository.support.PropertySelector;
import com.bazoud.springbatch.towns.webapp.repository.support.Range;
import com.bazoud.springbatch.towns.webapp.repository.support.SearchParameters;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericSearchForm;
import com.bazoud.springbatch.towns.webapp.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link Town}.
 * It exposes a {@link Town} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class TownSearchForm extends GenericSearchForm<Town, Integer, TownSearchForm> {
    private static final long serialVersionUID = 1L;
    protected Town town = new Town();
    protected Range<Town, Integer> populationRange = newRange(Town_.population);
    protected Range<Town, Integer> areaRange = newRange(Town_.area);
    protected Range<Town, Integer> zminRange = newRange(Town_.zmin);
    protected Range<Town, Integer> zmaxRange = newRange(Town_.zmax);
    protected PropertySelector<Town, Integer> idSelector = newPropertySelector(Town_.id);
    protected PropertySelector<Town, String> departmentSelector = newPropertySelector(Town_.department);
    protected PropertySelector<Town, String> nameSelector = newPropertySelector(Town_.name);
    protected PropertySelector<Town, String> nameRealSelector = newPropertySelector(Town_.nameReal);
    protected PropertySelector<Town, String> postcodeSelector = newPropertySelector(Town_.postcode);
    protected PropertySelector<Town, Integer> populationSelector = newPropertySelector(Town_.population);
    protected PropertySelector<Town, Integer> areaSelector = newPropertySelector(Town_.area);
    protected PropertySelector<Town, String> longitudeDegSelector = newPropertySelector(Town_.longitudeDeg);
    protected PropertySelector<Town, String> latitudeDegSelector = newPropertySelector(Town_.latitudeDeg);
    protected PropertySelector<Town, String> longitudeGrdSelector = newPropertySelector(Town_.longitudeGrd);
    protected PropertySelector<Town, String> latitudeGrdSelector = newPropertySelector(Town_.latitudeGrd);
    protected PropertySelector<Town, String> longitudeDmsSelector = newPropertySelector(Town_.longitudeDms);
    protected PropertySelector<Town, String> latitudeDmsSelector = newPropertySelector(Town_.latitudeDms);
    protected PropertySelector<Town, Integer> zminSelector = newPropertySelector(Town_.zmin);
    protected PropertySelector<Town, Integer> zmaxSelector = newPropertySelector(Town_.zmax);

    public Town getTown() {
        return town;
    }

    @Override
    protected Town getEntity() {
        return getTown();
    }

    @Override
    public TownSearchForm newInstance() {
        return new TownSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.range(populationRange, areaRange, zminRange, zmaxRange);
        sp.property(idSelector, departmentSelector, nameSelector, nameRealSelector, postcodeSelector, populationSelector, areaSelector, longitudeDegSelector,
                latitudeDegSelector, longitudeGrdSelector, latitudeGrdSelector, longitudeDmsSelector, latitudeDmsSelector, zminSelector, zmaxSelector);
        return sp;
    }

    @Override
    public void resetWithOther(TownSearchForm other) {
        this.town = other.getTown();
        this.populationRange = other.getPopulationRange();
        this.areaRange = other.getAreaRange();
        this.zminRange = other.getZminRange();
        this.zmaxRange = other.getZmaxRange();
        this.idSelector = other.getIdSelector();
        this.departmentSelector = other.getDepartmentSelector();
        this.nameSelector = other.getNameSelector();
        this.nameRealSelector = other.getNameRealSelector();
        this.postcodeSelector = other.getPostcodeSelector();
        this.populationSelector = other.getPopulationSelector();
        this.areaSelector = other.getAreaSelector();
        this.longitudeDegSelector = other.getLongitudeDegSelector();
        this.latitudeDegSelector = other.getLatitudeDegSelector();
        this.longitudeGrdSelector = other.getLongitudeGrdSelector();
        this.latitudeGrdSelector = other.getLatitudeGrdSelector();
        this.longitudeDmsSelector = other.getLongitudeDmsSelector();
        this.latitudeDmsSelector = other.getLatitudeDmsSelector();
        this.zminSelector = other.getZminSelector();
        this.zmaxSelector = other.getZmaxSelector();
    }

    // Ranges
    public Range<Town, Integer> getPopulationRange() {
        return populationRange;
    }

    public Range<Town, Integer> getAreaRange() {
        return areaRange;
    }

    public Range<Town, Integer> getZminRange() {
        return zminRange;
    }

    public Range<Town, Integer> getZmaxRange() {
        return zmaxRange;
    }

    // Property selectors
    public PropertySelector<Town, Integer> getIdSelector() {
        return idSelector;
    }

    public PropertySelector<Town, String> getDepartmentSelector() {
        return departmentSelector;
    }

    public PropertySelector<Town, String> getNameSelector() {
        return nameSelector;
    }

    public PropertySelector<Town, String> getNameRealSelector() {
        return nameRealSelector;
    }

    public PropertySelector<Town, String> getPostcodeSelector() {
        return postcodeSelector;
    }

    public PropertySelector<Town, Integer> getPopulationSelector() {
        return populationSelector;
    }

    public PropertySelector<Town, Integer> getAreaSelector() {
        return areaSelector;
    }

    public PropertySelector<Town, String> getLongitudeDegSelector() {
        return longitudeDegSelector;
    }

    public PropertySelector<Town, String> getLatitudeDegSelector() {
        return latitudeDegSelector;
    }

    public PropertySelector<Town, String> getLongitudeGrdSelector() {
        return longitudeGrdSelector;
    }

    public PropertySelector<Town, String> getLatitudeGrdSelector() {
        return latitudeGrdSelector;
    }

    public PropertySelector<Town, String> getLongitudeDmsSelector() {
        return longitudeDmsSelector;
    }

    public PropertySelector<Town, String> getLatitudeDmsSelector() {
        return latitudeDmsSelector;
    }

    public PropertySelector<Town, Integer> getZminSelector() {
        return zminSelector;
    }

    public PropertySelector<Town, Integer> getZmaxSelector() {
        return zmaxSelector;
    }
}
