package com.facebook.datasource;

class AbstractDataSource$1
  implements Runnable
{
  public AbstractDataSource$1(AbstractDataSource paramAbstractDataSource, boolean paramBoolean1, DataSubscriber paramDataSubscriber, boolean paramBoolean2) {}
  
  public void run()
  {
    if (val$isFailure) {
      val$dataSubscriber.onFailure(this$0);
    } else if (val$isCancellation) {
      val$dataSubscriber.onCancellation(this$0);
    } else {
      val$dataSubscriber.onNewResult(this$0);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.datasource.AbstractDataSource.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */