package com.facebook.datasource;

public abstract class BaseBooleanSubscriber
  implements DataSubscriber<Boolean>
{
  public void onCancellation(DataSource<Boolean> paramDataSource) {}
  
  public void onFailure(DataSource<Boolean> paramDataSource)
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
  
  public abstract void onFailureImpl(DataSource<Boolean> paramDataSource);
  
  public void onNewResult(DataSource<Boolean> paramDataSource)
  {
    try
    {
      onNewResultImpl(((Boolean)paramDataSource.getResult()).booleanValue());
      return;
    }
    finally
    {
      paramDataSource.close();
    }
  }
  
  public abstract void onNewResultImpl(boolean paramBoolean);
  
  public void onProgressUpdate(DataSource<Boolean> paramDataSource) {}
}

/* Location:
 * Qualified Name:     com.facebook.datasource.BaseBooleanSubscriber
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */