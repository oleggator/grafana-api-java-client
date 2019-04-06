/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = false)
public class DashboardPanelElasticSearchTarget extends DashboardPanelTarget {
  String query;
  String alias;
  String refId;

  List<Metric> metrics;
  List<BucketAgg> bucketAggs;
}
