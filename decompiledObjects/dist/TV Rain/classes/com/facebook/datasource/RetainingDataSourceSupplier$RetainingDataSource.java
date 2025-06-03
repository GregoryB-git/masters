package com.facebook.datasource;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Supplier;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

class RetainingDataSourceSupplier$RetainingDataSource<T>
  extends AbstractDataSource<T>
{
  @Nullable
  @GuardedBy("RetainingDataSource.this")
  private DataSource<T> mDataSource = null;
  
  private static <T> void closeSafely(DataSource<T> paramDataSource)
  {
    if (paramDataSource != null) {
      paramDataSource.close();
    }
  }
  
  private void onDataSourceFailed(DataSource<T> paramDataSource) {}
  
  private void onDataSourceNewResult(DataSource<T> paramDataSource)
  {
    if (paramDataSource == mDataSource) {
      setResult(null, false);
    }
  }
  
  private void onDatasourceProgress(DataSource<T> paramDataSource)
  {
    if (paramDataSource == mDataSource) {
      setProgress(paramDataSource.getProgress());
    }
  }
  
  public boolean close()
  {
    try
    {
      if (!super.close()) {
        return false;
      }
      DataSource localDataSource = mDataSource;
      mDataSource = null;
      closeSafely(localDataSource);
      return true;
    }
    finally {}
  }
  
  @Nullable
  public T getResult()
  {
    try
    {
      Object localObject1 = mDataSource;
      if (localObject1 != null) {
        localObject1 = ((DataSource)localObject1).getResult();
      } else {
        localObject1 = null;
      }
      return (T)localObject1;
    }
    finally {}
  }
  
  public boolean hasResult()
  {
    try
    {
      DataSource localDataSource = mDataSource;
      if (localDataSource != null)
      {
        bool = localDataSource.hasResult();
        if (bool)
        {
          bool = true;
          break label29;
        }
      }
      boolean bool = false;
      label29:
      return bool;
    }
    finally {}
  }
  
  public void setSupplier(@Nullable Supplier<DataSource<T>> paramSupplier)
  {
    if (isClosed()) {
      return;
    }
    if (paramSupplier != null) {
      paramSupplier = (DataSource)paramSupplier.get();
    } else {
      paramSupplier = null;
    }
    try
    {
      if (isClosed())
      {
        closeSafely(paramSupplier);
        return;
      }
      DataSource localDataSource = mDataSource;
      mDataSource = paramSupplier;
      if (paramSupplier != null) {
        paramSupplier.subscribe(new InternalDataSubscriber(null), CallerThreadExecutor.getInstance());
      }
      closeSafely(localDataSource);
      return;
    }
    finally {}
  }
  
  public class InternalDataSubscriber
    implements DataSubscriber<T>
  {
    private InternalDataSubscriber() {}
    
    public void onCancellation(DataSource<T> paramDataSource) {}
    
    public void onFailure(DataSource<T> paramDataSource)
    {
      RetainingDataSourceSupplier.RetainingDataSource.access$300(RetainingDataSourceSupplier.RetainingDataSource.this, paramDataSource);
    }
    
    public void onNewResult(DataSource<T> paramDataSource)
    {
      if (paramDataSource.hasResult()) {
        RetainingDataSourceSupplier.RetainingDataSource.access$200(RetainingDataSourceSupplier.RetainingDataSource.this, paramDataSource);
      } else if (paramDataSource.isFinished()) {
        RetainingDataSourceSupplier.RetainingDataSource.access$300(RetainingDataSourceSupplier.RetainingDataSource.this, paramDataSource);
      }
    }
    
    public void onProgressUpdate(DataSource<T> paramDataSource)
    {
      RetainingDataSourceSupplier.RetainingDataSource.access$400(RetainingDataSourceSupplier.RetainingDataSource.this, paramDataSource);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.datasource.RetainingDataSourceSupplier.RetainingDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */