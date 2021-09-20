package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class EmployeeFilter {
  private FilterField salary;

  private FilterField age;

  private FilterField position;

  public EmployeeFilter() {
  }

  public EmployeeFilter(FilterField salary, FilterField age, FilterField position) {
    this.salary = salary;
    this.age = age;
    this.position = position;
  }

  public FilterField getSalary() {
    return salary;
  }

  public void setSalary(FilterField salary) {
    this.salary = salary;
  }

  public FilterField getAge() {
    return age;
  }

  public void setAge(FilterField age) {
    this.age = age;
  }

  public FilterField getPosition() {
    return position;
  }

  public void setPosition(FilterField position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "EmployeeFilter{" + "salary='" + salary + "'," +"age='" + age + "'," +"position='" + position + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeFilter that = (EmployeeFilter) o;
        return java.util.Objects.equals(salary, that.salary) &&
                            java.util.Objects.equals(age, that.age) &&
                            java.util.Objects.equals(position, that.position);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(salary, age, position);
  }

  public static  com.syscho.graphql.generated.types.EmployeeFilter.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private FilterField salary;

    private FilterField age;

    private FilterField position;

    public EmployeeFilter build() {
                   com.syscho.graphql.generated.types.EmployeeFilter result = new  com.syscho.graphql.generated.types.EmployeeFilter();
                      result.salary = this.salary;
          result.age = this.age;
          result.position = this.position;
                      return result;
    }

    public  com.syscho.graphql.generated.types.EmployeeFilter.Builder salary(FilterField salary) {
      this.salary = salary;
      return this;
    }

    public  com.syscho.graphql.generated.types.EmployeeFilter.Builder age(FilterField age) {
      this.age = age;
      return this;
    }

    public  com.syscho.graphql.generated.types.EmployeeFilter.Builder position(
        FilterField position) {
      this.position = position;
      return this;
    }
  }
}
