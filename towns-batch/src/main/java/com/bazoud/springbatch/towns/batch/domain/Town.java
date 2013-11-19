package com.bazoud.springbatch.towns.batch.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Town {
  private int id;
  private String department;
  private String name;
  @XStreamAlias("name_real")
  private String nameReal;
  @XStreamAlias("post_code")
  private String postCode;
  private int population;
  private int area;
  @XStreamAlias("longitude_deg")
  private String longitudeDeg;
  @XStreamAlias("latitude_deg")
  private String latitudeDeg;
  @XStreamAlias("longitude_grd")
  private String longitudeGrd;
  @XStreamAlias("latitude_grd")
  private String latitudeGrd;
  @XStreamAlias("longitude_dms")
  private String longitudeDms;
  @XStreamAlias("latitude_dms")
  private String latitudeDms;
  private int zmin;
  private int zmax;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNameReal() {
    return nameReal;
  }

  public void setNameReal(String nameReal) {
    this.nameReal = nameReal;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public int getArea() {
    return area;
  }

  public void setArea(int area) {
    this.area = area;
  }

  public String getLongitudeDeg() {
    return longitudeDeg;
  }

  public void setLongitudeDeg(String longitudeDeg) {
    this.longitudeDeg = longitudeDeg;
  }

  public String getLatitudeDeg() {
    return latitudeDeg;
  }

  public void setLatitudeDeg(String latitudeDeg) {
    this.latitudeDeg = latitudeDeg;
  }

  public String getLongitudeGrd() {
    return longitudeGrd;
  }

  public void setLongitudeGrd(String longitudeGrd) {
    this.longitudeGrd = longitudeGrd;
  }

  public String getLatitudeGrd() {
    return latitudeGrd;
  }

  public void setLatitudeGrd(String latitudeGrd) {
    this.latitudeGrd = latitudeGrd;
  }

  public String getLongitudeDms() {
    return longitudeDms;
  }

  public void setLongitudeDms(String longitudeDms) {
    this.longitudeDms = longitudeDms;
  }

  public String getLatitudeDms() {
    return latitudeDms;
  }

  public void setLatitudeDms(String latitudeDms) {
    this.latitudeDms = latitudeDms;
  }

  public int getZmin() {
    return zmin;
  }

  public void setZmin(int zmin) {
    this.zmin = zmin;
  }

  public int getZmax() {
    return zmax;
  }

  public void setZmax(int zmax) {
    this.zmax = zmax;
  }
}
