package androidx.work;

import z2.c;

public final class Worker$a
  implements Runnable
{
  public final void run()
  {
    try
    {
      b.getClass();
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
      throw localIllegalStateException;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     androidx.work.Worker.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */