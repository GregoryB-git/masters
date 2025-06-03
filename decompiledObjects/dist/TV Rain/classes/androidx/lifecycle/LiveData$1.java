package androidx.lifecycle;

class LiveData$1
  implements Runnable
{
  public LiveData$1(LiveData paramLiveData) {}
  
  public void run()
  {
    synchronized (this$0.mDataLock)
    {
      Object localObject2 = this$0.mPendingData;
      this$0.mPendingData = LiveData.NOT_SET;
      this$0.setValue(localObject2);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LiveData.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */