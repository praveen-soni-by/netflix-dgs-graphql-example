package  com.syscho.graphql.generated;

import java.lang.String;

public class DgsConstants {
  public static class BOOK {
    public static final String TYPE_NAME = "Book";

    public static final String Id = "id";

    public static final String Title = "title";

    public static final String Genre = "genre";

    public static final String Publisher = "publisher";

    public static final String PublishDate = "publishDate";

    public static final String CreatedTime = "createdTime";
  }

  public static class QUERYRESOLVER {
    public static final String TYPE_NAME = "QueryResolver";

    public static final String Departments = "departments";

    public static final String Department = "department";

    public static final String BookById = "bookById";

    public static final String Books = "books";

    public static final String BookByIdContext = "bookByIdContext";

    public static final String Employees = "employees";

    public static final String EmployeesWithFilter = "employeesWithFilter";

    public static final String Employee = "employee";

    public static final String FindAllUsers = "findAllUsers";

    public static final String FindAllPosts = "findAllPosts";

    public static final String FindAllAlbums = "findAllAlbums";

    public static final String FindAll = "findAll";

    public static final String FindAllWithFilter = "findAllWithFilter";

    public static final String Organizations = "organizations";

    public static final String Organization = "organization";
  }

  public static class MUTATIONRESOLVER {
    public static final String TYPE_NAME = "MutationResolver";

    public static final String NewDepartment = "newDepartment";

    public static final String AddBook = "addBook";

    public static final String UpdateBook = "updateBook";

    public static final String NewEmployee = "newEmployee";

    public static final String NewOrganization = "newOrganization";
  }

  public static class DEPARTMENT {
    public static final String TYPE_NAME = "Department";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Organization = "organization";

    public static final String Employees = "employees";
  }

  public static class EMPLOYEE {
    public static final String TYPE_NAME = "Employee";

    public static final String Id = "id";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String Position = "position";

    public static final String Salary = "salary";

    public static final String Age = "age";

    public static final String Department = "department";

    public static final String Organization = "organization";
  }

  public static class MASTERDATA {
    public static final String TYPE_NAME = "MasterData";

    public static final String Users = "users";

    public static final String Posts = "posts";

    public static final String Albums = "albums";
  }

  public static class USERINFO {
    public static final String TYPE_NAME = "UserInfo";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Username = "username";

    public static final String Email = "email";

    public static final String Address = "address";

    public static final String Phone = "phone";

    public static final String Website = "website";

    public static final String Company = "company";
  }

  public static class ADDRESS {
    public static final String TYPE_NAME = "Address";

    public static final String Street = "street";

    public static final String Suite = "suite";

    public static final String City = "city";

    public static final String Zipcode = "zipcode";

    public static final String Geo = "geo";
  }

  public static class GEO {
    public static final String TYPE_NAME = "Geo";

    public static final String Lat = "lat";

    public static final String Lng = "lng";
  }

  public static class COMPANY {
    public static final String TYPE_NAME = "Company";

    public static final String Name = "name";

    public static final String CatchPhrase = "catchPhrase";

    public static final String Bs = "bs";
  }

  public static class POST {
    public static final String TYPE_NAME = "Post";

    public static final String UserId = "userId";

    public static final String Id = "id";

    public static final String Title = "title";

    public static final String Body = "body";
  }

  public static class ALBUM {
    public static final String TYPE_NAME = "Album";

    public static final String UserId = "userId";

    public static final String Id = "id";

    public static final String Title = "title";
  }

  public static class ORGANIZATION {
    public static final String TYPE_NAME = "Organization";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Employees = "employees";

    public static final String Departments = "departments";
  }

  public static class BOOKUPDATEINPUT {
    public static final String TYPE_NAME = "BookUpdateInput";

    public static final String Id = "id";

    public static final String Title = "title";

    public static final String Genre = "genre";

    public static final String Publisher = "publisher";
  }

  public static class BOOKINPUT {
    public static final String TYPE_NAME = "BookInput";

    public static final String Title = "title";

    public static final String Genre = "genre";

    public static final String Publisher = "publisher";
  }

  public static class DEPARTMENTINPUT {
    public static final String TYPE_NAME = "DepartmentInput";

    public static final String Name = "name";

    public static final String OrganizationId = "organizationId";
  }

  public static class EMPLOYEEINPUT {
    public static final String TYPE_NAME = "EmployeeInput";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String Position = "position";

    public static final String Salary = "salary";

    public static final String Age = "age";

    public static final String OrganizationId = "organizationId";

    public static final String DepartmentId = "departmentId";
  }

  public static class EMPLOYEEFILTER {
    public static final String TYPE_NAME = "EmployeeFilter";

    public static final String Salary = "salary";

    public static final String Age = "age";

    public static final String Position = "position";
  }

  public static class FILTERFIELD {
    public static final String TYPE_NAME = "FilterField";

    public static final String Operator = "operator";

    public static final String Value = "value";
  }

  public static class ORGANIZATIONINPUT {
    public static final String TYPE_NAME = "OrganizationInput";

    public static final String Name = "name";
  }

  public static class COMMON {
    public static final String TYPE_NAME = "Common";

    public static final String UserId = "userId";

    public static final String Id = "id";

    public static final String Title = "title";
  }
}
