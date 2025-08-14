package com.corejavapractice.JavaPractice.corejava;

public class Address implements Cloneable{

  public String city;
  public String country;

  public Address(String location, String city, String country, int pincode){
      this.city = city;
      this.country = country;
  }

  public Address(){}

  protected Object clone() throws CloneNotSupportedException{
      return (Address)super.clone();
  }

  @Override
  public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
  }
}
