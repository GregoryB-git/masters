package com.facebook.datasource;

 enum AbstractDataSource$DataSourceStatus
{
  static
  {
    DataSourceStatus localDataSourceStatus1 = new DataSourceStatus("IN_PROGRESS", 0);
    IN_PROGRESS = localDataSourceStatus1;
    DataSourceStatus localDataSourceStatus2 = new DataSourceStatus("SUCCESS", 1);
    SUCCESS = localDataSourceStatus2;
    DataSourceStatus localDataSourceStatus3 = new DataSourceStatus("FAILURE", 2);
    FAILURE = localDataSourceStatus3;
    $VALUES = new DataSourceStatus[] { localDataSourceStatus1, localDataSourceStatus2, localDataSourceStatus3 };
  }
  
  private AbstractDataSource$DataSourceStatus() {}
}

/* Location:
 * Qualified Name:     com.facebook.datasource.AbstractDataSource.DataSourceStatus
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */