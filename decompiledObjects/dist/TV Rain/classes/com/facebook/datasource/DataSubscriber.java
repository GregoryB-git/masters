package com.facebook.datasource;

public abstract interface DataSubscriber<T>
{
  public abstract void onCancellation(DataSource<T> paramDataSource);
  
  public abstract void onFailure(DataSource<T> paramDataSource);
  
  public abstract void onNewResult(DataSource<T> paramDataSource);
  
  public abstract void onProgressUpdate(DataSource<T> paramDataSource);
}

/* Location:
 * Qualified Name:     com.facebook.datasource.DataSubscriber
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */