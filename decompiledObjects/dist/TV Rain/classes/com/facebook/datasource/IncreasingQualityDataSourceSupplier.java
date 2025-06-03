package com.facebook.datasource;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Objects.ToStringHelper;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class IncreasingQualityDataSourceSupplier<T>
  implements Supplier<DataSource<T>>
{
  private final List<Supplier<DataSource<T>>> mDataSourceSuppliers;
  
  private IncreasingQualityDataSourceSupplier(List<Supplier<DataSource<T>>> paramList)
  {
    Preconditions.checkArgument(paramList.isEmpty() ^ true, "List of suppliers is empty!");
    mDataSourceSuppliers = paramList;
  }
  
  public static <T> IncreasingQualityDataSourceSupplier<T> create(List<Supplier<DataSource<T>>> paramList)
  {
    return new IncreasingQualityDataSourceSupplier(paramList);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof IncreasingQualityDataSourceSupplier)) {
      return false;
    }
    paramObject = (IncreasingQualityDataSourceSupplier)paramObject;
    return Objects.equal(mDataSourceSuppliers, mDataSourceSuppliers);
  }
  
  public DataSource<T> get()
  {
    return new IncreasingQualityDataSource();
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
  public class IncreasingQualityDataSource
    extends AbstractDataSource<T>
  {
    @Nullable
    @GuardedBy("IncreasingQualityDataSource.this")
    private ArrayList<DataSource<T>> mDataSources;
    @Nullable
    private Throwable mDelayedError;
    private final AtomicInteger mFinishedDataSources;
    @GuardedBy("IncreasingQualityDataSource.this")
    private int mIndexOfDataSourceWithResult;
    private final int mNumberOfDataSources;
    
    public IncreasingQualityDataSource()
    {
      int i = 0;
      mFinishedDataSources = new AtomicInteger(0);
      int j = IncreasingQualityDataSourceSupplier.access$000(IncreasingQualityDataSourceSupplier.this).size();
      mNumberOfDataSources = j;
      mIndexOfDataSourceWithResult = j;
      mDataSources = new ArrayList(j);
      while (i < j)
      {
        DataSource localDataSource = (DataSource)((Supplier)IncreasingQualityDataSourceSupplier.access$000(IncreasingQualityDataSourceSupplier.this).get(i)).get();
        mDataSources.add(localDataSource);
        localDataSource.subscribe(new InternalDataSubscriber(i), CallerThreadExecutor.getInstance());
        if (localDataSource.hasResult()) {
          break;
        }
        i++;
      }
    }
    
    private void closeSafely(DataSource<T> paramDataSource)
    {
      if (paramDataSource != null) {
        paramDataSource.close();
      }
    }
    
    @Nullable
    private DataSource<T> getAndClearDataSource(int paramInt)
    {
      try
      {
        ArrayList localArrayList = mDataSources;
        Object localObject1 = null;
        Object localObject2 = localObject1;
        if (localArrayList != null)
        {
          localObject2 = localObject1;
          if (paramInt < localArrayList.size()) {
            localObject2 = (DataSource)mDataSources.set(paramInt, null);
          }
        }
        return (DataSource<T>)localObject2;
      }
      finally {}
    }
    
    @Nullable
    private DataSource<T> getDataSource(int paramInt)
    {
      try
      {
        Object localObject1 = mDataSources;
        if ((localObject1 != null) && (paramInt < ((ArrayList)localObject1).size())) {
          localObject1 = (DataSource)mDataSources.get(paramInt);
        } else {
          localObject1 = null;
        }
        return (DataSource<T>)localObject1;
      }
      finally {}
    }
    
    @Nullable
    private DataSource<T> getDataSourceWithResult()
    {
      try
      {
        DataSource localDataSource = getDataSource(mIndexOfDataSourceWithResult);
        return localDataSource;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    private void maybeSetFailure()
    {
      if (mFinishedDataSources.incrementAndGet() == mNumberOfDataSources)
      {
        Throwable localThrowable = mDelayedError;
        if (localThrowable != null) {
          setFailure(localThrowable);
        }
      }
    }
    
    private void maybeSetIndexOfDataSourceWithResult(int paramInt, DataSource<T> paramDataSource, boolean paramBoolean)
    {
      try
      {
        int i = mIndexOfDataSourceWithResult;
        if ((paramDataSource == getDataSource(paramInt)) && (paramInt != mIndexOfDataSourceWithResult))
        {
          if ((getDataSourceWithResult() != null) && ((!paramBoolean) || (paramInt >= mIndexOfDataSourceWithResult))) {
            paramInt = i;
          } else {
            mIndexOfDataSourceWithResult = paramInt;
          }
          while (i > paramInt)
          {
            closeSafely(getAndClearDataSource(i));
            i--;
          }
          return;
        }
        return;
      }
      finally {}
    }
    
    private void onDataSourceFailed(int paramInt, DataSource<T> paramDataSource)
    {
      closeSafely(tryGetAndClearDataSource(paramInt, paramDataSource));
      if (paramInt == 0) {
        mDelayedError = paramDataSource.getFailureCause();
      }
      maybeSetFailure();
    }
    
    private void onDataSourceNewResult(int paramInt, DataSource<T> paramDataSource)
    {
      maybeSetIndexOfDataSourceWithResult(paramInt, paramDataSource, paramDataSource.isFinished());
      if (paramDataSource == getDataSourceWithResult())
      {
        boolean bool;
        if ((paramInt == 0) && (paramDataSource.isFinished())) {
          bool = true;
        } else {
          bool = false;
        }
        setResult(null, bool);
      }
      maybeSetFailure();
    }
    
    @Nullable
    private DataSource<T> tryGetAndClearDataSource(int paramInt, DataSource<T> paramDataSource)
    {
      try
      {
        DataSource localDataSource = getDataSourceWithResult();
        if (paramDataSource == localDataSource) {
          return null;
        }
        if (paramDataSource == getDataSource(paramInt))
        {
          paramDataSource = getAndClearDataSource(paramInt);
          return paramDataSource;
        }
        return paramDataSource;
      }
      finally {}
    }
    
    public boolean close()
    {
      try
      {
        boolean bool = super.close();
        int i = 0;
        if (!bool) {
          return false;
        }
        ArrayList localArrayList = mDataSources;
        mDataSources = null;
        if (localArrayList != null) {
          while (i < localArrayList.size())
          {
            closeSafely((DataSource)localArrayList.get(i));
            i++;
          }
        }
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
      private int mIndex;
      
      public InternalDataSubscriber(int paramInt)
      {
        mIndex = paramInt;
      }
      
      public void onCancellation(DataSource<T> paramDataSource) {}
      
      public void onFailure(DataSource<T> paramDataSource)
      {
        IncreasingQualityDataSourceSupplier.IncreasingQualityDataSource.access$200(IncreasingQualityDataSourceSupplier.IncreasingQualityDataSource.this, mIndex, paramDataSource);
      }
      
      public void onNewResult(DataSource<T> paramDataSource)
      {
        if (paramDataSource.hasResult()) {
          IncreasingQualityDataSourceSupplier.IncreasingQualityDataSource.access$100(IncreasingQualityDataSourceSupplier.IncreasingQualityDataSource.this, mIndex, paramDataSource);
        } else if (paramDataSource.isFinished()) {
          IncreasingQualityDataSourceSupplier.IncreasingQualityDataSource.access$200(IncreasingQualityDataSourceSupplier.IncreasingQualityDataSource.this, mIndex, paramDataSource);
        }
      }
      
      public void onProgressUpdate(DataSource<T> paramDataSource)
      {
        if (mIndex == 0) {
          setProgress(paramDataSource.getProgress());
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.datasource.IncreasingQualityDataSourceSupplier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */