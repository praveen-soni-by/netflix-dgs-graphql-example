package  com.syscho.graphql.generated.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class UserInfo {
  private Integer id;

  private String name;

  private String username;

  private String email;

  private Address address;

  private String phone;

  private String website;

  private Company company;

  public UserInfo() {
  }

  public UserInfo(Integer id, String name, String username, String email, Address address,
      String phone, String website, Company company) {
    this.id = id;
    this.name = name;
    this.username = username;
    this.email = email;
    this.address = address;
    this.phone = phone;
    this.website = website;
    this.company = company;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  @Override
  public String toString() {
    return "UserInfo{" + "id='" + id + "'," +"name='" + name + "'," +"username='" + username + "'," +"email='" + email + "'," +"address='" + address + "'," +"phone='" + phone + "'," +"website='" + website + "'," +"company='" + company + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo that = (UserInfo) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(username, that.username) &&
                            java.util.Objects.equals(email, that.email) &&
                            java.util.Objects.equals(address, that.address) &&
                            java.util.Objects.equals(phone, that.phone) &&
                            java.util.Objects.equals(website, that.website) &&
                            java.util.Objects.equals(company, that.company);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, username, email, address, phone, website, company);
  }

  public static  com.syscho.graphql.generated.types.UserInfo.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private Integer id;

    private String name;

    private String username;

    private String email;

    private Address address;

    private String phone;

    private String website;

    private Company company;

    public UserInfo build() {
                   com.syscho.graphql.generated.types.UserInfo result = new  com.syscho.graphql.generated.types.UserInfo();
                      result.id = this.id;
          result.name = this.name;
          result.username = this.username;
          result.email = this.email;
          result.address = this.address;
          result.phone = this.phone;
          result.website = this.website;
          result.company = this.company;
                      return result;
    }

    public  com.syscho.graphql.generated.types.UserInfo.Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public  com.syscho.graphql.generated.types.UserInfo.Builder name(String name) {
      this.name = name;
      return this;
    }

    public  com.syscho.graphql.generated.types.UserInfo.Builder username(String username) {
      this.username = username;
      return this;
    }

    public  com.syscho.graphql.generated.types.UserInfo.Builder email(String email) {
      this.email = email;
      return this;
    }

    public  com.syscho.graphql.generated.types.UserInfo.Builder address(Address address) {
      this.address = address;
      return this;
    }

    public  com.syscho.graphql.generated.types.UserInfo.Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public  com.syscho.graphql.generated.types.UserInfo.Builder website(String website) {
      this.website = website;
      return this;
    }

    public  com.syscho.graphql.generated.types.UserInfo.Builder company(Company company) {
      this.company = company;
      return this;
    }
  }
}
