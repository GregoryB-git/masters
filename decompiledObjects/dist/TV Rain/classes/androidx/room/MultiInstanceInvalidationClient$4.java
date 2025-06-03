package androidx.room;

class MultiInstanceInvalidationClient$4
  implements Runnable
{
  public MultiInstanceInvalidationClient$4(MultiInstanceInvalidationClient paramMultiInstanceInvalidationClient) {}
  
  public void run()
  {
    MultiInstanceInvalidationClient localMultiInstanceInvalidationClient = this$0;
    mInvalidationTracker.removeObserver(mObserver);
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationClient.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */