package com.facebook.imagepipeline.datasource;

import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import javax.annotation.concurrent.GuardedBy;

class ListDataSource$InternalDataSubscriber
  implements DataSubscriber<CloseableReference<T>>
{
  @GuardedBy("InternalDataSubscriber.this")
  public boolean mFinished = false;
  
  private ListDataSource$InternalDataSubscriber(ListDataSource paramListDataSource) {}
  
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
    ListDataSource.access$200(this$0);
  }
  
  public void onFailure(DataSource<CloseableReference<T>> paramDataSource)
  {
    ListDataSource.access$100(this$0, paramDataSource);
  }
  
  public void onNewResult(DataSource<CloseableReference<T>> paramDataSource)
  {
    if ((paramDataSource.isFinished()) && (tryFinish())) {
      ListDataSource.access$300(this$0);
    }
  }
  
  public void onProgressUpdate(DataSource<CloseableReference<T>> paramDataSource)
  {
    ListDataSource.access$400(this$0);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.datasource.ListDataSource.InternalDataSubscriber
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */