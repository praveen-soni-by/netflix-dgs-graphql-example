package  com.syscho.graphql.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Geo {
  private String lat;

  private String lng;

  public Geo() {
  }

  public Geo(String lat, String lng) {
    this.lat = lat;
    this.lng = lng;
  }

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getLng() {
    return lng;
  }

  public void setLng(String lng) {
    this.lng = lng;
  }

  @Override
  public String toString() {
    return "Geo{" + "lat='" + lat + "'," +"lng='" + lng + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geo that = (Geo) o;
        return java.util.Objects.equals(lat, that.lat) &&
                            java.util.Objects.equals(lng, that.lng);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(lat, lng);
  }

  public static  com.syscho.graphql.generated.types.Geo.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String lat;

    private String lng;

    public Geo build() {
                   com.syscho.graphql.generated.types.Geo result = new  com.syscho.graphql.generated.types.Geo();
                      result.lat = this.lat;
          result.lng = this.lng;
                      return result;
    }

    public  com.syscho.graphql.generated.types.Geo.Builder lat(String lat) {
      this.lat = lat;
      return this;
    }

    public  com.syscho.graphql.generated.types.Geo.Builder lng(String lng) {
      this.lng = lng;
      return this;
    }
  }
}
