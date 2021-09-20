package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class Department {
  private String id;

  private String name;

  private Organization organization;

  private List<Employee> employees;

  public Department() {
  }

  public Department(String id, String name, Organization organization, List<Employee> employees) {
    this.id = id;
    this.name = name;
    this.organization = organization;
    this.employees = employees;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  @Override
  public String toString() {
    return "Department{" + "id='" + id + "'," +"name='" + name + "'," +"organization='" + organization + "'," +"employees='" + employees + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(organization, that.organization) &&
                            java.util.Objects.equals(employees, that.employees);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, organization, employees);
  }

  public static  com.syscho.graphql.generated.types.Department.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String name;

    private Organization organization;

    private List<Employee> employees;

    public Department build() {
                   com.syscho.graphql.generated.types.Department result = new  com.syscho.graphql.generated.types.Department();
                      result.id = this.id;
          result.name = this.name;
          result.organization = this.organization;
          result.employees = this.employees;
                      return result;
    }

    public  com.syscho.graphql.generated.types.Department.Builder id(String id) {
      this.id = id;
      return this;
    }

    public  com.syscho.graphql.generated.types.Department.Builder name(String name) {
      this.name = name;
      return this;
    }

    public  com.syscho.graphql.generated.types.Department.Builder organization(
        Organization organization) {
      this.organization = organization;
      return this;
    }

    public  com.syscho.graphql.generated.types.Department.Builder employees(
        List<Employee> employees) {
      this.employees = employees;
      return this;
    }
  }
}
