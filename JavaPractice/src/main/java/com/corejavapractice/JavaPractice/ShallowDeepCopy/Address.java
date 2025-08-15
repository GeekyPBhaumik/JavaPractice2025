package com.corejavapractice.JavaPractice.ShallowDeepCopy;

public class Address implements Cloneable{

  public String city;
  public String country;
  public String location;

  public Address(String location, String city, String country, int pincode){
      this.city = city;
      this.country = country;
      this.location = location;
  }

  public Address(){}

  @Override
  protected Object clone() throws CloneNotSupportedException{
      return super.clone();
  }

  @Override
  public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", location='" + location + '\'' +
                '}';
  }
}
