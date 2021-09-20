package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class QueryResolver {
  private List<Department> departments;

  private Department department;

  private Book bookById;

  private List<Book> books;

  private Book bookByIdContext;

  private List<Employee> employees;

  private List<Employee> employeesWithFilter;

  private Employee employee;

  private List<UserInfo> findAllUsers;

  private List<Post> findAllPosts;

  private List<Album> findAllAlbums;

  private MasterData findAll;

  private MasterData findAllWithFilter;

  private List<Organization> organizations;

  private Organization organization;

  public QueryResolver() {
  }

  public QueryResolver(List<Department> departments, Department department, Book bookById,
      List<Book> books, Book bookByIdContext, List<Employee> employees,
      List<Employee> employeesWithFilter, Employee employee, List<UserInfo> findAllUsers,
      List<Post> findAllPosts, List<Album> findAllAlbums, MasterData findAll,
      MasterData findAllWithFilter, List<Organization> organizations, Organization organization) {
    this.departments = departments;
    this.department = department;
    this.bookById = bookById;
    this.books = books;
    this.bookByIdContext = bookByIdContext;
    this.employees = employees;
    this.employeesWithFilter = employeesWithFilter;
    this.employee = employee;
    this.findAllUsers = findAllUsers;
    this.findAllPosts = findAllPosts;
    this.findAllAlbums = findAllAlbums;
    this.findAll = findAll;
    this.findAllWithFilter = findAllWithFilter;
    this.organizations = organizations;
    this.organization = organization;
  }

  public List<Department> getDepartments() {
    return departments;
  }

  public void setDepartments(List<Department> departments) {
    this.departments = departments;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Book getBookById() {
    return bookById;
  }

  public void setBookById(Book bookById) {
    this.bookById = bookById;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  public Book getBookByIdContext() {
    return bookByIdContext;
  }

  public void setBookByIdContext(Book bookByIdContext) {
    this.bookByIdContext = bookByIdContext;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  public List<Employee> getEmployeesWithFilter() {
    return employeesWithFilter;
  }

  public void setEmployeesWithFilter(List<Employee> employeesWithFilter) {
    this.employeesWithFilter = employeesWithFilter;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public List<UserInfo> getFindAllUsers() {
    return findAllUsers;
  }

  public void setFindAllUsers(List<UserInfo> findAllUsers) {
    this.findAllUsers = findAllUsers;
  }

  public List<Post> getFindAllPosts() {
    return findAllPosts;
  }

  public void setFindAllPosts(List<Post> findAllPosts) {
    this.findAllPosts = findAllPosts;
  }

  public List<Album> getFindAllAlbums() {
    return findAllAlbums;
  }

  public void setFindAllAlbums(List<Album> findAllAlbums) {
    this.findAllAlbums = findAllAlbums;
  }

  public MasterData getFindAll() {
    return findAll;
  }

  public void setFindAll(MasterData findAll) {
    this.findAll = findAll;
  }

  public MasterData getFindAllWithFilter() {
    return findAllWithFilter;
  }

  public void setFindAllWithFilter(MasterData findAllWithFilter) {
    this.findAllWithFilter = findAllWithFilter;
  }

  public List<Organization> getOrganizations() {
    return organizations;
  }

  public void setOrganizations(List<Organization> organizations) {
    this.organizations = organizations;
  }

  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  @Override
  public String toString() {
    return "QueryResolver{" + "departments='" + departments + "'," +"department='" + department + "'," +"bookById='" + bookById + "'," +"books='" + books + "'," +"bookByIdContext='" + bookByIdContext + "'," +"employees='" + employees + "'," +"employeesWithFilter='" + employeesWithFilter + "'," +"employee='" + employee + "'," +"findAllUsers='" + findAllUsers + "'," +"findAllPosts='" + findAllPosts + "'," +"findAllAlbums='" + findAllAlbums + "'," +"findAll='" + findAll + "'," +"findAllWithFilter='" + findAllWithFilter + "'," +"organizations='" + organizations + "'," +"organization='" + organization + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QueryResolver that = (QueryResolver) o;
        return java.util.Objects.equals(departments, that.departments) &&
                            java.util.Objects.equals(department, that.department) &&
                            java.util.Objects.equals(bookById, that.bookById) &&
                            java.util.Objects.equals(books, that.books) &&
                            java.util.Objects.equals(bookByIdContext, that.bookByIdContext) &&
                            java.util.Objects.equals(employees, that.employees) &&
                            java.util.Objects.equals(employeesWithFilter, that.employeesWithFilter) &&
                            java.util.Objects.equals(employee, that.employee) &&
                            java.util.Objects.equals(findAllUsers, that.findAllUsers) &&
                            java.util.Objects.equals(findAllPosts, that.findAllPosts) &&
                            java.util.Objects.equals(findAllAlbums, that.findAllAlbums) &&
                            java.util.Objects.equals(findAll, that.findAll) &&
                            java.util.Objects.equals(findAllWithFilter, that.findAllWithFilter) &&
                            java.util.Objects.equals(organizations, that.organizations) &&
                            java.util.Objects.equals(organization, that.organization);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(departments, department, bookById, books, bookByIdContext, employees, employeesWithFilter, employee, findAllUsers, findAllPosts, findAllAlbums, findAll, findAllWithFilter, organizations, organization);
  }

  public static  com.syscho.graphql.generated.types.QueryResolver.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private List<Department> departments;

    private Department department;

    private Book bookById;

    private List<Book> books;

    private Book bookByIdContext;

    private List<Employee> employees;

    private List<Employee> employeesWithFilter;

    private Employee employee;

    private List<UserInfo> findAllUsers;

    private List<Post> findAllPosts;

    private List<Album> findAllAlbums;

    private MasterData findAll;

    private MasterData findAllWithFilter;

    private List<Organization> organizations;

    private Organization organization;

    public QueryResolver build() {
                   com.syscho.graphql.generated.types.QueryResolver result = new  com.syscho.graphql.generated.types.QueryResolver();
                      result.departments = this.departments;
          result.department = this.department;
          result.bookById = this.bookById;
          result.books = this.books;
          result.bookByIdContext = this.bookByIdContext;
          result.employees = this.employees;
          result.employeesWithFilter = this.employeesWithFilter;
          result.employee = this.employee;
          result.findAllUsers = this.findAllUsers;
          result.findAllPosts = this.findAllPosts;
          result.findAllAlbums = this.findAllAlbums;
          result.findAll = this.findAll;
          result.findAllWithFilter = this.findAllWithFilter;
          result.organizations = this.organizations;
          result.organization = this.organization;
                      return result;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder departments(
        List<Department> departments) {
      this.departments = departments;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder department(
        Department department) {
      this.department = department;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder bookById(Book bookById) {
      this.bookById = bookById;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder books(List<Book> books) {
      this.books = books;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder bookByIdContext(
        Book bookByIdContext) {
      this.bookByIdContext = bookByIdContext;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder employees(
        List<Employee> employees) {
      this.employees = employees;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder employeesWithFilter(
        List<Employee> employeesWithFilter) {
      this.employeesWithFilter = employeesWithFilter;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder employee(Employee employee) {
      this.employee = employee;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder findAllUsers(
        List<UserInfo> findAllUsers) {
      this.findAllUsers = findAllUsers;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder findAllPosts(
        List<Post> findAllPosts) {
      this.findAllPosts = findAllPosts;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder findAllAlbums(
        List<Album> findAllAlbums) {
      this.findAllAlbums = findAllAlbums;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder findAll(MasterData findAll) {
      this.findAll = findAll;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder findAllWithFilter(
        MasterData findAllWithFilter) {
      this.findAllWithFilter = findAllWithFilter;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder organizations(
        List<Organization> organizations) {
      this.organizations = organizations;
      return this;
    }

    public  com.syscho.graphql.generated.types.QueryResolver.Builder organization(
        Organization organization) {
      this.organization = organization;
      return this;
    }
  }
}
