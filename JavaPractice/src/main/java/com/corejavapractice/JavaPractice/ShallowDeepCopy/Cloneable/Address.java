package com.corejavapractice.JavaPractice.ShallowDeepCopy.Cloneable;

public class Address implements Cloneable{

  public String city;
  public String country;
  public String location;

  public Address(String location, String city, String country, int pincode){
      this.city = city;
      this.country = country;
      this.location = location;
  }

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
