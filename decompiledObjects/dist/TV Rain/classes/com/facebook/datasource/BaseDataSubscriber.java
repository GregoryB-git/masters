package com.facebook.datasource;

public abstract class BaseDataSubscriber<T>
  implements DataSubscriber<T>
{
  public void onCancellation(DataSource<T> paramDataSource) {}
  
  public void onFailure(DataSource<T> paramDataSource)
  {
    try
    {
      onFailureImpl(paramDataSource);
      return;
    }
    finally
    {
      paramDataSource.close();
    }
  }
  
  public abstract void onFailureImpl(DataSource<T> paramDataSource);
  
  public void onNewResult(DataSource<T> paramDataSource)
  {
    boolean bool = paramDataSource.isFinished();
    try
    {
      onNewResultImpl(paramDataSource);
      return;
    }
    finally
    {
      if (bool) {
        paramDataSource.close();
      }
    }
  }
  
  public abstract void onNewResultImpl(DataSource<T> paramDataSource);
  
  public void onProgressUpdate(DataSource<T> paramDataSource) {}
}

/* Location:
 * Qualified Name:     com.facebook.datasource.BaseDataSubscriber
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */