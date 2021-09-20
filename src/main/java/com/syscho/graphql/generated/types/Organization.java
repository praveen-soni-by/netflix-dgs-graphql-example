package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class Organization {
  private String id;

  private String name;

  private List<Employee> employees;

  private List<Department> departments;

  public Organization() {
  }

  public Organization(String id, String name, List<Employee> employees,
      List<Department> departments) {
    this.id = id;
    this.name = name;
    this.employees = employees;
    this.departments = departments;
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

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  public List<Department> getDepartments() {
    return departments;
  }

  public void setDepartments(List<Department> departments) {
    this.departments = departments;
  }

  @Override
  public String toString() {
    return "Organization{" + "id='" + id + "'," +"name='" + name + "'," +"employees='" + employees + "'," +"departments='" + departments + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(employees, that.employees) &&
                            java.util.Objects.equals(departments, that.departments);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, employees, departments);
  }

  public static  com.syscho.graphql.generated.types.Organization.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String name;

    private List<Employee> employees;

    private List<Department> departments;

    public Organization build() {
                   com.syscho.graphql.generated.types.Organization result = new  com.syscho.graphql.generated.types.Organization();
                      result.id = this.id;
          result.name = this.name;
          result.employees = this.employees;
          result.departments = this.departments;
                      return result;
    }

    public  com.syscho.graphql.generated.types.Organization.Builder id(String id) {
      this.id = id;
      return this;
    }

    public  com.syscho.graphql.generated.types.Organization.Builder name(String name) {
      this.name = name;
      return this;
    }

    public  com.syscho.graphql.generated.types.Organization.Builder employees(
        List<Employee> employees) {
      this.employees = employees;
      return this;
    }

    public  com.syscho.graphql.generated.types.Organization.Builder departments(
        List<Department> departments) {
      this.departments = departments;
      return this;
    }
  }
}
