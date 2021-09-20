package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Address {
  private String street;

  private String suite;

  private String city;

  private String zipcode;

  private Geo geo;

  public Address() {
  }

  public Address(String street, String suite, String city, String zipcode, Geo geo) {
    this.street = street;
    this.suite = suite;
    this.city = city;
    this.zipcode = zipcode;
    this.geo = geo;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getSuite() {
    return suite;
  }

  public void setSuite(String suite) {
    this.suite = suite;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public Geo getGeo() {
    return geo;
  }

  public void setGeo(Geo geo) {
    this.geo = geo;
  }

  @Override
  public String toString() {
    return "Address{" + "street='" + street + "'," +"suite='" + suite + "'," +"city='" + city + "'," +"zipcode='" + zipcode + "'," +"geo='" + geo + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address that = (Address) o;
        return java.util.Objects.equals(street, that.street) &&
                            java.util.Objects.equals(suite, that.suite) &&
                            java.util.Objects.equals(city, that.city) &&
                            java.util.Objects.equals(zipcode, that.zipcode) &&
                            java.util.Objects.equals(geo, that.geo);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(street, suite, city, zipcode, geo);
  }

  public static  com.syscho.graphql.generated.types.Address.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String street;

    private String suite;

    private String city;

    private String zipcode;

    private Geo geo;

    public Address build() {
                   com.syscho.graphql.generated.types.Address result = new  com.syscho.graphql.generated.types.Address();
                      result.street = this.street;
          result.suite = this.suite;
          result.city = this.city;
          result.zipcode = this.zipcode;
          result.geo = this.geo;
                      return result;
    }

    public  com.syscho.graphql.generated.types.Address.Builder street(String street) {
      this.street = street;
      return this;
    }

    public  com.syscho.graphql.generated.types.Address.Builder suite(String suite) {
      this.suite = suite;
      return this;
    }

    public  com.syscho.graphql.generated.types.Address.Builder city(String city) {
      this.city = city;
      return this;
    }

    public  com.syscho.graphql.generated.types.Address.Builder zipcode(String zipcode) {
      this.zipcode = zipcode;
      return this;
    }

    public  com.syscho.graphql.generated.types.Address.Builder geo(Geo geo) {
      this.geo = geo;
      return this;
    }
  }
}
