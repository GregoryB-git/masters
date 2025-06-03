package com.facebook.drawee.controller;

import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;

class AbstractDraweeController$1
  extends BaseDataSubscriber<T>
{
  public AbstractDraweeController$1(AbstractDraweeController paramAbstractDraweeController, String paramString, boolean paramBoolean) {}
  
  public void onFailureImpl(DataSource<T> paramDataSource)
  {
    AbstractDraweeController.access$100(this$0, val$id, paramDataSource, paramDataSource.getFailureCause(), true);
  }
  
  public void onNewResultImpl(DataSource<T> paramDataSource)
  {
    boolean bool = paramDataSource.isFinished();
    float f = paramDataSource.getProgress();
    Object localObject = paramDataSource.getResult();
    if (localObject != null) {
      AbstractDraweeController.access$000(this$0, val$id, paramDataSource, localObject, f, bool, val$wasImmediate);
    } else if (bool) {
      AbstractDraweeController.access$100(this$0, val$id, paramDataSource, new NullPointerException(), true);
    }
  }
  
  public void onProgressUpdate(DataSource<T> paramDataSource)
  {
    boolean bool = paramDataSource.isFinished();
    float f = paramDataSource.getProgress();
    AbstractDraweeController.access$200(this$0, val$id, paramDataSource, f, bool);
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.controller.AbstractDraweeController.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */