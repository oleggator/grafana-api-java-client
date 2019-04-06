package com.appnexus.grafana.client.models;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class Metric {

  String field;
  Integer id;
  Type type;

  public enum Type {
    MIN("min"),
    MAX("max"),
    AVG("avg"),
    SUM("sum"),
    COUNT("count"),
    LAST("last"),
    MEDIAN("median");
    private final String value;

    Type(String s) {
      value = s;
    }

    @JsonValue
    public String value() {
      return value;
    }
  }
}
