package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class MutationResolver {
  private Department newDepartment;

  private Book addBook;

  private Book updateBook;

  private Employee newEmployee;

  private Organization newOrganization;

  public MutationResolver() {
  }

  public MutationResolver(Department newDepartment, Book addBook, Book updateBook,
      Employee newEmployee, Organization newOrganization) {
    this.newDepartment = newDepartment;
    this.addBook = addBook;
    this.updateBook = updateBook;
    this.newEmployee = newEmployee;
    this.newOrganization = newOrganization;
  }

  public Department getNewDepartment() {
    return newDepartment;
  }

  public void setNewDepartment(Department newDepartment) {
    this.newDepartment = newDepartment;
  }

  public Book getAddBook() {
    return addBook;
  }

  public void setAddBook(Book addBook) {
    this.addBook = addBook;
  }

  public Book getUpdateBook() {
    return updateBook;
  }

  public void setUpdateBook(Book updateBook) {
    this.updateBook = updateBook;
  }

  public Employee getNewEmployee() {
    return newEmployee;
  }

  public void setNewEmployee(Employee newEmployee) {
    this.newEmployee = newEmployee;
  }

  public Organization getNewOrganization() {
    return newOrganization;
  }

  public void setNewOrganization(Organization newOrganization) {
    this.newOrganization = newOrganization;
  }

  @Override
  public String toString() {
    return "MutationResolver{" + "newDepartment='" + newDepartment + "'," +"addBook='" + addBook + "'," +"updateBook='" + updateBook + "'," +"newEmployee='" + newEmployee + "'," +"newOrganization='" + newOrganization + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutationResolver that = (MutationResolver) o;
        return java.util.Objects.equals(newDepartment, that.newDepartment) &&
                            java.util.Objects.equals(addBook, that.addBook) &&
                            java.util.Objects.equals(updateBook, that.updateBook) &&
                            java.util.Objects.equals(newEmployee, that.newEmployee) &&
                            java.util.Objects.equals(newOrganization, that.newOrganization);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(newDepartment, addBook, updateBook, newEmployee, newOrganization);
  }

  public static  com.syscho.graphql.generated.types.MutationResolver.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private Department newDepartment;

    private Book addBook;

    private Book updateBook;

    private Employee newEmployee;

    private Organization newOrganization;

    public MutationResolver build() {
                   com.syscho.graphql.generated.types.MutationResolver result = new  com.syscho.graphql.generated.types.MutationResolver();
                      result.newDepartment = this.newDepartment;
          result.addBook = this.addBook;
          result.updateBook = this.updateBook;
          result.newEmployee = this.newEmployee;
          result.newOrganization = this.newOrganization;
                      return result;
    }

    public  com.syscho.graphql.generated.types.MutationResolver.Builder newDepartment(
        Department newDepartment) {
      this.newDepartment = newDepartment;
      return this;
    }

    public  com.syscho.graphql.generated.types.MutationResolver.Builder addBook(Book addBook) {
      this.addBook = addBook;
      return this;
    }

    public  com.syscho.graphql.generated.types.MutationResolver.Builder updateBook(
        Book updateBook) {
      this.updateBook = updateBook;
      return this;
    }

    public  com.syscho.graphql.generated.types.MutationResolver.Builder newEmployee(
        Employee newEmployee) {
      this.newEmployee = newEmployee;
      return this;
    }

    public  com.syscho.graphql.generated.types.MutationResolver.Builder newOrganization(
        Organization newOrganization) {
      this.newOrganization = newOrganization;
      return this;
    }
  }
}
