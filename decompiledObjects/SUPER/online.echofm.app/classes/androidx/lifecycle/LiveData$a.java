package androidx.lifecycle;

public class LiveData$a
  implements Runnable
{
  public LiveData$a(LiveData paramLiveData) {}
  
  public void run()
  {
    synchronized (o.a)
    {
      Object localObject2 = o.f;
      o.f = LiveData.k;
      o.j(localObject2);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LiveData.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */