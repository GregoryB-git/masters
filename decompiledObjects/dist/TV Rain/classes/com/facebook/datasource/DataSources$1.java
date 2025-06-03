package com.facebook.datasource;

import com.facebook.common.internal.Supplier;

final class DataSources$1
  implements Supplier<DataSource<T>>
{
  public DataSources$1(Throwable paramThrowable) {}
  
  public DataSource<T> get()
  {
    return DataSources.immediateFailedDataSource(val$failure);
  }
}

/* Location:
 * Qualified Name:     com.facebook.datasource.DataSources.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */