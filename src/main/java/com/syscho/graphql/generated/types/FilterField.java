package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class FilterField {
  private String operator;

  private String value;

  public FilterField() {
  }

  public FilterField(String operator, String value) {
    this.operator = operator;
    this.value = value;
  }

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "FilterField{" + "operator='" + operator + "'," +"value='" + value + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilterField that = (FilterField) o;
        return java.util.Objects.equals(operator, that.operator) &&
                            java.util.Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(operator, value);
  }

  public static  com.syscho.graphql.generated.types.FilterField.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String operator;

    private String value;

    public FilterField build() {
                   com.syscho.graphql.generated.types.FilterField result = new  com.syscho.graphql.generated.types.FilterField();
                      result.operator = this.operator;
          result.value = this.value;
                      return result;
    }

    public  com.syscho.graphql.generated.types.FilterField.Builder operator(String operator) {
      this.operator = operator;
      return this;
    }

    public  com.syscho.graphql.generated.types.FilterField.Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
