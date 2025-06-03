package com.facebook.imagepipeline.datasource;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.AbstractDataSource;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class ListDataSource<T>
  extends AbstractDataSource<List<CloseableReference<T>>>
{
  private final DataSource<CloseableReference<T>>[] mDataSources;
  @GuardedBy("this")
  private int mFinishedDataSources;
  
  public ListDataSource(DataSource<CloseableReference<T>>[] paramArrayOfDataSource)
  {
    mDataSources = paramArrayOfDataSource;
    mFinishedDataSources = 0;
  }
  
  public static <T> ListDataSource<T> create(DataSource<CloseableReference<T>>... paramVarArgs)
  {
    Preconditions.checkNotNull(paramVarArgs);
    int i = paramVarArgs.length;
    int j = 0;
    boolean bool;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool);
    ListDataSource localListDataSource = new ListDataSource(paramVarArgs);
    i = paramVarArgs.length;
    while (j < i)
    {
      DataSource<CloseableReference<T>> localDataSource = paramVarArgs[j];
      if (localDataSource != null) {
        localDataSource.subscribe(new InternalDataSubscriber(localListDataSource, null), CallerThreadExecutor.getInstance());
      }
      j++;
    }
    return localListDataSource;
  }
  
  private boolean increaseAndCheckIfLast()
  {
    try
    {
      int i = mFinishedDataSources;
      boolean bool = true;
      i++;
      mFinishedDataSources = i;
      int j = mDataSources.length;
      if (i != j) {
        bool = false;
      }
      return bool;
    }
    finally {}
  }
  
  private void onDataSourceCancelled()
  {
    setFailure(new CancellationException());
  }
  
  private void onDataSourceFailed(DataSource<CloseableReference<T>> paramDataSource)
  {
    setFailure(paramDataSource.getFailureCause());
  }
  
  private void onDataSourceFinished()
  {
    if (increaseAndCheckIfLast()) {
      setResult(null, true);
    }
  }
  
  private void onDataSourceProgress()
  {
    DataSource[] arrayOfDataSource = mDataSources;
    int i = arrayOfDataSource.length;
    float f = 0.0F;
    for (int j = 0; j < i; j++) {
      f += arrayOfDataSource[j].getProgress();
    }
    setProgress(f / mDataSources.length);
  }
  
  public boolean close()
  {
    boolean bool = super.close();
    int i = 0;
    if (!bool) {
      return false;
    }
    DataSource[] arrayOfDataSource = mDataSources;
    int j = arrayOfDataSource.length;
    while (i < j)
    {
      arrayOfDataSource[i].close();
      i++;
    }
    return true;
  }
  
  @Nullable
  public List<CloseableReference<T>> getResult()
  {
    try
    {
      boolean bool = hasResult();
      if (!bool) {
        return null;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(mDataSources.length);
      DataSource[] arrayOfDataSource = mDataSources;
      int i = arrayOfDataSource.length;
      for (int j = 0; j < i; j++) {
        localArrayList.add(arrayOfDataSource[j].getResult());
      }
      return localArrayList;
    }
    finally {}
  }
  
  public boolean hasResult()
  {
    try
    {
      if (!isClosed())
      {
        int i = mFinishedDataSources;
        int j = mDataSources.length;
        if (i == j)
        {
          bool = true;
          break label32;
        }
      }
      boolean bool = false;
      label32:
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public class InternalDataSubscriber
    implements DataSubscriber<CloseableReference<T>>
  {
    @GuardedBy("InternalDataSubscriber.this")
    public boolean mFinished = false;
    
    private InternalDataSubscriber() {}
    
    private boolean tryFinish()
    {
      try
      {
        boolean bool = mFinished;
        if (bool) {
          return false;
        }
        mFinished = true;
        return true;
      }
      finally {}
    }
    
    public void onCancellation(DataSource<CloseableReference<T>> paramDataSource)
    {
      ListDataSource.access$200(ListDataSource.this);
    }
    
    public void onFailure(DataSource<CloseableReference<T>> paramDataSource)
    {
      ListDataSource.access$100(ListDataSource.this, paramDataSource);
    }
    
    public void onNewResult(DataSource<CloseableReference<T>> paramDataSource)
    {
      if ((paramDataSource.isFinished()) && (tryFinish())) {
        ListDataSource.access$300(ListDataSource.this);
      }
    }
    
    public void onProgressUpdate(DataSource<CloseableReference<T>> paramDataSource)
    {
      ListDataSource.access$400(ListDataSource.this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.datasource.ListDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */