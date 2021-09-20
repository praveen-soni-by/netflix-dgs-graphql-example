package  com.syscho.graphql.generated.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Employee {
  private String id;

  private String firstName;

  private String lastName;

  private String position;

  private Integer salary;

  private Integer age;

  private Department department;

  private Organization organization;

  public Employee() {
  }

  public Employee(String id, String firstName, String lastName, String position, Integer salary,
      Integer age, Department department, Organization organization) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = position;
    this.salary = salary;
    this.age = age;
    this.department = department;
    this.organization = organization;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  @Override
  public String toString() {
    return "Employee{" + "id='" + id + "'," +"firstName='" + firstName + "'," +"lastName='" + lastName + "'," +"position='" + position + "'," +"salary='" + salary + "'," +"age='" + age + "'," +"department='" + department + "'," +"organization='" + organization + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee that = (Employee) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(firstName, that.firstName) &&
                            java.util.Objects.equals(lastName, that.lastName) &&
                            java.util.Objects.equals(position, that.position) &&
                            java.util.Objects.equals(salary, that.salary) &&
                            java.util.Objects.equals(age, that.age) &&
                            java.util.Objects.equals(department, that.department) &&
                            java.util.Objects.equals(organization, that.organization);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, firstName, lastName, position, salary, age, department, organization);
  }

  public static  com.syscho.graphql.generated.types.Employee.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String firstName;

    private String lastName;

    private String position;

    private Integer salary;

    private Integer age;

    private Department department;

    private Organization organization;

    public Employee build() {
                   com.syscho.graphql.generated.types.Employee result = new  com.syscho.graphql.generated.types.Employee();
                      result.id = this.id;
          result.firstName = this.firstName;
          result.lastName = this.lastName;
          result.position = this.position;
          result.salary = this.salary;
          result.age = this.age;
          result.department = this.department;
          result.organization = this.organization;
                      return result;
    }

    public  com.syscho.graphql.generated.types.Employee.Builder id(String id) {
      this.id = id;
      return this;
    }

    public  com.syscho.graphql.generated.types.Employee.Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public  com.syscho.graphql.generated.types.Employee.Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public  com.syscho.graphql.generated.types.Employee.Builder position(String position) {
      this.position = position;
      return this;
    }

    public  com.syscho.graphql.generated.types.Employee.Builder salary(Integer salary) {
      this.salary = salary;
      return this;
    }

    public  com.syscho.graphql.generated.types.Employee.Builder age(Integer age) {
      this.age = age;
      return this;
    }

    public  com.syscho.graphql.generated.types.Employee.Builder department(Department department) {
      this.department = department;
      return this;
    }

    public  com.syscho.graphql.generated.types.Employee.Builder organization(
        Organization organization) {
      this.organization = organization;
      return this;
    }
  }
}
