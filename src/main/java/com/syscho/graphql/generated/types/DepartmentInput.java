package  com.syscho.graphql.generated.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class DepartmentInput {
  private String name;

  private Integer organizationId;

  public DepartmentInput() {
  }

  public DepartmentInput(String name, Integer organizationId) {
    this.name = name;
    this.organizationId = organizationId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Integer organizationId) {
    this.organizationId = organizationId;
  }

  @Override
  public String toString() {
    return "DepartmentInput{" + "name='" + name + "'," +"organizationId='" + organizationId + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentInput that = (DepartmentInput) o;
        return java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(organizationId, that.organizationId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, organizationId);
  }

  public static  com.syscho.graphql.generated.types.DepartmentInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String name;

    private Integer organizationId;

    public DepartmentInput build() {
                   com.syscho.graphql.generated.types.DepartmentInput result = new  com.syscho.graphql.generated.types.DepartmentInput();
                      result.name = this.name;
          result.organizationId = this.organizationId;
                      return result;
    }

    public  com.syscho.graphql.generated.types.DepartmentInput.Builder name(String name) {
      this.name = name;
      return this;
    }

    public  com.syscho.graphql.generated.types.DepartmentInput.Builder organizationId(
        Integer organizationId) {
      this.organizationId = organizationId;
      return this;
    }
  }
}
