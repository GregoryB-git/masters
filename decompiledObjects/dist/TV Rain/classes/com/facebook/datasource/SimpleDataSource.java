package com.facebook.datasource;

import com.facebook.common.internal.Preconditions;

public class SimpleDataSource<T>
  extends AbstractDataSource<T>
{
  public static <T> SimpleDataSource<T> create()
  {
    return new SimpleDataSource();
  }
  
  public boolean setFailure(Throwable paramThrowable)
  {
    return super.setFailure((Throwable)Preconditions.checkNotNull(paramThrowable));
  }
  
  public boolean setProgress(float paramFloat)
  {
    return super.setProgress(paramFloat);
  }
  
  public boolean setResult(T paramT)
  {
    return super.setResult(Preconditions.checkNotNull(paramT), true);
  }
  
  public boolean setResult(T paramT, boolean paramBoolean)
  {
    return super.setResult(Preconditions.checkNotNull(paramT), paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.facebook.datasource.SimpleDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */