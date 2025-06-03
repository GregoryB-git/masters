package androidx.room;

class MultiInstanceInvalidationClient$1$1
  implements Runnable
{
  public MultiInstanceInvalidationClient$1$1(MultiInstanceInvalidationClient.1 param1, String[] paramArrayOfString) {}
  
  public void run()
  {
    this$1.this$0.mInvalidationTracker.notifyObserversByTableNames(val$tables);
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationClient.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */