package  com.syscho.graphql.generated.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class EmployeeInput {
  private String firstName;

  private String lastName;

  private String position;

  private Integer salary;

  private Integer age;

  private int organizationId;

  private int departmentId;

  public EmployeeInput() {
  }

  public EmployeeInput(String firstName, String lastName, String position, Integer salary,
      Integer age, int organizationId, int departmentId) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = position;
    this.salary = salary;
    this.age = age;
    this.organizationId = organizationId;
    this.departmentId = departmentId;
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

  public int getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(int organizationId) {
    this.organizationId = organizationId;
  }

  public int getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(int departmentId) {
    this.departmentId = departmentId;
  }

  @Override
  public String toString() {
    return "EmployeeInput{" + "firstName='" + firstName + "'," +"lastName='" + lastName + "'," +"position='" + position + "'," +"salary='" + salary + "'," +"age='" + age + "'," +"organizationId='" + organizationId + "'," +"departmentId='" + departmentId + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeInput that = (EmployeeInput) o;
        return java.util.Objects.equals(firstName, that.firstName) &&
                            java.util.Objects.equals(lastName, that.lastName) &&
                            java.util.Objects.equals(position, that.position) &&
                            java.util.Objects.equals(salary, that.salary) &&
                            java.util.Objects.equals(age, that.age) &&
                            organizationId == that.organizationId &&
                            departmentId == that.departmentId;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(firstName, lastName, position, salary, age, organizationId, departmentId);
  }

  public static  com.syscho.graphql.generated.types.EmployeeInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String firstName;

    private String lastName;

    private String position;

    private Integer salary;

    private Integer age;

    private int organizationId;

    private int departmentId;

    public EmployeeInput build() {
                   com.syscho.graphql.generated.types.EmployeeInput result = new  com.syscho.graphql.generated.types.EmployeeInput();
                      result.firstName = this.firstName;
          result.lastName = this.lastName;
          result.position = this.position;
          result.salary = this.salary;
          result.age = this.age;
          result.organizationId = this.organizationId;
          result.departmentId = this.departmentId;
                      return result;
    }

    public  com.syscho.graphql.generated.types.EmployeeInput.Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public  com.syscho.graphql.generated.types.EmployeeInput.Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public  com.syscho.graphql.generated.types.EmployeeInput.Builder position(String position) {
      this.position = position;
      return this;
    }

    public  com.syscho.graphql.generated.types.EmployeeInput.Builder salary(Integer salary) {
      this.salary = salary;
      return this;
    }

    public  com.syscho.graphql.generated.types.EmployeeInput.Builder age(Integer age) {
      this.age = age;
      return this;
    }

    public  com.syscho.graphql.generated.types.EmployeeInput.Builder organizationId(
        int organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    public  com.syscho.graphql.generated.types.EmployeeInput.Builder departmentId(
        int departmentId) {
      this.departmentId = departmentId;
      return this;
    }
  }
}
