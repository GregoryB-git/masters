package b1;

public final class t$a
  implements Runnable
{
  public t$a(t paramt) {}
  
  public final void run()
  {
    synchronized (a.mDataLock)
    {
      Object localObject2 = a.mPendingData;
      a.mPendingData = t.NOT_SET;
      a.setValue(localObject2);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     b1.t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */