package androidx.room;

import java.util.concurrent.Executor;

class MultiInstanceInvalidationClient$1
  extends IMultiInstanceInvalidationCallback.Stub
{
  public MultiInstanceInvalidationClient$1(MultiInstanceInvalidationClient paramMultiInstanceInvalidationClient) {}
  
  public void onInvalidation(final String[] paramArrayOfString)
  {
    this$0.mExecutor.execute(new Runnable()
    {
      public void run()
      {
        this$0.mInvalidationTracker.notifyObserversByTableNames(paramArrayOfString);
      }
    });
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationClient.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */