package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class OrganizationInput {
  private String name;

  public OrganizationInput() {
  }

  public OrganizationInput(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "OrganizationInput{" + "name='" + name + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganizationInput that = (OrganizationInput) o;
        return java.util.Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name);
  }

  public static  com.syscho.graphql.generated.types.OrganizationInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String name;

    public OrganizationInput build() {
       com.syscho.graphql.generated.types.OrganizationInput result = new  com.syscho.graphql.generated.types.OrganizationInput();
          result.name = this.name;
          return result;
    }

    public  com.syscho.graphql.generated.types.OrganizationInput.Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
