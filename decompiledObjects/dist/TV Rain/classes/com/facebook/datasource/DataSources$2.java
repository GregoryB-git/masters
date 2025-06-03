package com.facebook.datasource;

import java.util.concurrent.CountDownLatch;

final class DataSources$2
  implements DataSubscriber<T>
{
  public DataSources$2(DataSources.ValueHolder paramValueHolder1, CountDownLatch paramCountDownLatch, DataSources.ValueHolder paramValueHolder2) {}
  
  public void onCancellation(DataSource<T> paramDataSource)
  {
    val$latch.countDown();
  }
  
  public void onFailure(DataSource<T> paramDataSource)
  {
    try
    {
      val$pendingException.value = paramDataSource.getFailureCause();
      return;
    }
    finally
    {
      val$latch.countDown();
    }
  }
  
  public void onNewResult(DataSource<T> paramDataSource)
  {
    if (!paramDataSource.isFinished()) {
      return;
    }
    try
    {
      val$resultHolder.value = paramDataSource.getResult();
      return;
    }
    finally
    {
      val$latch.countDown();
    }
  }
  
  public void onProgressUpdate(DataSource<T> paramDataSource) {}
}

/* Location:
 * Qualified Name:     com.facebook.datasource.DataSources.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */