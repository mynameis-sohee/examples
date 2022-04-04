package io.confluent.examples.clients.cloud.model;


import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryException;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.JobId;
import com.google.cloud.bigquery.QueryJobConfiguration;
import com.google.cloud.bigquery.Table;
import com.google.cloud.bigquery.TableId;
import com.google.cloud.bigquery.EncryptionConfiguration;
import com.google.cloud.bigquery.TableResult;

// Sample to check table exist
public class TableExist {

  public static void main(String[] args) {
    // TODO(developer): Replace these variables before running the sample.
    String datasetName = "datasetName";
    String tableName = "tableName";
    tableExists(datasetName, tableName);
  }

  public static void tableExists(String datasetName, String tableName) {
    try {
      // Initialize client that will be used to send requests. This client only needs to be created
      // once, and can be reused for multiple requests.

      BigQuery bigquery = BigQueryOptions.getDefaultInstance().getService();

      Table table = bigquery.getTable(TableId.of(datasetName, tableName));
      if (table != null
          && table
              .exists()) { // table will be null if it is not found and setThrowNotFound is not set
        // to `true`
        System.out.println("Table already exist");
      } else {
        System.out.println("Table not found");
      }
    } catch (BigQueryException e) {
      System.out.println("Table not found. \n" + e.toString());
    }
  }

}