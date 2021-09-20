package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Company {
  private String name;

  private String catchPhrase;

  private String bs;

  public Company() {
  }

  public Company(String name, String catchPhrase, String bs) {
    this.name = name;
    this.catchPhrase = catchPhrase;
    this.bs = bs;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCatchPhrase() {
    return catchPhrase;
  }

  public void setCatchPhrase(String catchPhrase) {
    this.catchPhrase = catchPhrase;
  }

  public String getBs() {
    return bs;
  }

  public void setBs(String bs) {
    this.bs = bs;
  }

  @Override
  public String toString() {
    return "Company{" + "name='" + name + "'," +"catchPhrase='" + catchPhrase + "'," +"bs='" + bs + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company that = (Company) o;
        return java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(catchPhrase, that.catchPhrase) &&
                            java.util.Objects.equals(bs, that.bs);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, catchPhrase, bs);
  }

  public static  com.syscho.graphql.generated.types.Company.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String name;

    private String catchPhrase;

    private String bs;

    public Company build() {
                   com.syscho.graphql.generated.types.Company result = new  com.syscho.graphql.generated.types.Company();
                      result.name = this.name;
          result.catchPhrase = this.catchPhrase;
          result.bs = this.bs;
                      return result;
    }

    public  com.syscho.graphql.generated.types.Company.Builder name(String name) {
      this.name = name;
      return this;
    }

    public  com.syscho.graphql.generated.types.Company.Builder catchPhrase(String catchPhrase) {
      this.catchPhrase = catchPhrase;
      return this;
    }

    public  com.syscho.graphql.generated.types.Company.Builder bs(String bs) {
      this.bs = bs;
      return this;
    }
  }
}
