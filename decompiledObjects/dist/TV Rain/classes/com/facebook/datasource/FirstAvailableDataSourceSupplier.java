package com.facebook.datasource;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Objects.ToStringHelper;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class FirstAvailableDataSourceSupplier<T>
  implements Supplier<DataSource<T>>
{
  private final List<Supplier<DataSource<T>>> mDataSourceSuppliers;
  
  private FirstAvailableDataSourceSupplier(List<Supplier<DataSource<T>>> paramList)
  {
    Preconditions.checkArgument(paramList.isEmpty() ^ true, "List of suppliers is empty!");
    mDataSourceSuppliers = paramList;
  }
  
  public static <T> FirstAvailableDataSourceSupplier<T> create(List<Supplier<DataSource<T>>> paramList)
  {
    return new FirstAvailableDataSourceSupplier(paramList);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof FirstAvailableDataSourceSupplier)) {
      return false;
    }
    paramObject = (FirstAvailableDataSourceSupplier)paramObject;
    return Objects.equal(mDataSourceSuppliers, mDataSourceSuppliers);
  }
  
  public DataSource<T> get()
  {
    return new FirstAvailableDataSource();
  }
  
  public int hashCode()
  {
    return mDataSourceSuppliers.hashCode();
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("list", mDataSourceSuppliers).toString();
  }
  
  @ThreadSafe
  public class FirstAvailableDataSource
    extends AbstractDataSource<T>
  {
    private DataSource<T> mCurrentDataSource = null;
    private DataSource<T> mDataSourceWithResult = null;
    private int mIndex = 0;
    
    public FirstAvailableDataSource()
    {
      if (!startNextDataSource()) {
        setFailure(new RuntimeException("No data source supplier or supplier returned null."));
      }
    }
    
    private boolean clearCurrentDataSource(DataSource<T> paramDataSource)
    {
      try
      {
        if ((!isClosed()) && (paramDataSource == mCurrentDataSource))
        {
          mCurrentDataSource = null;
          return true;
        }
        return false;
      }
      finally {}
    }
    
    private void closeSafely(DataSource<T> paramDataSource)
    {
      if (paramDataSource != null) {
        paramDataSource.close();
      }
    }
    
    @Nullable
    private DataSource<T> getDataSourceWithResult()
    {
      try
      {
        DataSource localDataSource = mDataSourceWithResult;
        return localDataSource;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    @Nullable
    private Supplier<DataSource<T>> getNextSupplier()
    {
      try
      {
        if ((!isClosed()) && (mIndex < FirstAvailableDataSourceSupplier.access$100(FirstAvailableDataSourceSupplier.this).size()))
        {
          Object localObject1 = FirstAvailableDataSourceSupplier.access$100(FirstAvailableDataSourceSupplier.this);
          int i = mIndex;
          mIndex = (i + 1);
          localObject1 = (Supplier)((List)localObject1).get(i);
          return (Supplier<DataSource<T>>)localObject1;
        }
        return null;
      }
      finally
      {
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
    }
    
    private void maybeSetDataSourceWithResult(DataSource<T> paramDataSource, boolean paramBoolean)
    {
      try
      {
        if (paramDataSource == mCurrentDataSource)
        {
          DataSource localDataSource = mDataSourceWithResult;
          if (paramDataSource != localDataSource)
          {
            if ((localDataSource != null) && (!paramBoolean))
            {
              paramDataSource = null;
            }
            else
            {
              mDataSourceWithResult = paramDataSource;
              paramDataSource = localDataSource;
            }
            closeSafely(paramDataSource);
            return;
          }
        }
        return;
      }
      finally {}
    }
    
    private void onDataSourceFailed(DataSource<T> paramDataSource)
    {
      if (!clearCurrentDataSource(paramDataSource)) {
        return;
      }
      if (paramDataSource != getDataSourceWithResult()) {
        closeSafely(paramDataSource);
      }
      if (!startNextDataSource()) {
        setFailure(paramDataSource.getFailureCause());
      }
    }
    
    private void onDataSourceNewResult(DataSource<T> paramDataSource)
    {
      maybeSetDataSourceWithResult(paramDataSource, paramDataSource.isFinished());
      if (paramDataSource == getDataSourceWithResult()) {
        setResult(null, paramDataSource.isFinished());
      }
    }
    
    private boolean setCurrentDataSource(DataSource<T> paramDataSource)
    {
      try
      {
        boolean bool = isClosed();
        if (bool) {
          return false;
        }
        mCurrentDataSource = paramDataSource;
        return true;
      }
      finally {}
    }
    
    private boolean startNextDataSource()
    {
      Object localObject = getNextSupplier();
      if (localObject != null) {
        localObject = (DataSource)((Supplier)localObject).get();
      } else {
        localObject = null;
      }
      if ((setCurrentDataSource((DataSource)localObject)) && (localObject != null))
      {
        ((DataSource)localObject).subscribe(new InternalDataSubscriber(null), CallerThreadExecutor.getInstance());
        return true;
      }
      closeSafely((DataSource)localObject);
      return false;
    }
    
    public boolean close()
    {
      try
      {
        if (!super.close()) {
          return false;
        }
        DataSource localDataSource1 = mCurrentDataSource;
        mCurrentDataSource = null;
        DataSource localDataSource2 = mDataSourceWithResult;
        mDataSourceWithResult = null;
        closeSafely(localDataSource2);
        closeSafely(localDataSource1);
        return true;
      }
      finally {}
    }
    
    @Nullable
    public T getResult()
    {
      try
      {
        Object localObject1 = getDataSourceWithResult();
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
        DataSource localDataSource = getDataSourceWithResult();
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
    
    public class InternalDataSubscriber
      implements DataSubscriber<T>
    {
      private InternalDataSubscriber() {}
      
      public void onCancellation(DataSource<T> paramDataSource) {}
      
      public void onFailure(DataSource<T> paramDataSource)
      {
        FirstAvailableDataSourceSupplier.FirstAvailableDataSource.access$200(FirstAvailableDataSourceSupplier.FirstAvailableDataSource.this, paramDataSource);
      }
      
      public void onNewResult(DataSource<T> paramDataSource)
      {
        if (paramDataSource.hasResult()) {
          FirstAvailableDataSourceSupplier.FirstAvailableDataSource.access$300(FirstAvailableDataSourceSupplier.FirstAvailableDataSource.this, paramDataSource);
        } else if (paramDataSource.isFinished()) {
          FirstAvailableDataSourceSupplier.FirstAvailableDataSource.access$200(FirstAvailableDataSourceSupplier.FirstAvailableDataSource.this, paramDataSource);
        }
      }
      
      public void onProgressUpdate(DataSource<T> paramDataSource)
      {
        float f = getProgress();
        setProgress(Math.max(f, paramDataSource.getProgress()));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.datasource.FirstAvailableDataSourceSupplier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */