package com.bazoud.springbatch.towns.batch.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Department {
  private int id;
  private String code;
  private String name;
  @XStreamAlias("name_uppercase")
  private String nameUpperCase;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNameUpperCase() {
    return nameUpperCase;
  }

  public void setNameUpperCase(String nameUpperCase) {
    this.nameUpperCase = nameUpperCase;
  }
}
