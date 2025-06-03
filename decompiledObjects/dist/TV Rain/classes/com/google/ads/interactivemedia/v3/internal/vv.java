package com.google.ads.interactivemedia.v3.internal;

public class vv
{
  public final String a;
  public final String b;
  public final int c;
  private boolean d;
  
  public boolean a()
  {
    try
    {
      boolean bool = d;
      if (bool) {
        return false;
      }
      d = true;
      notifyAll();
      return true;
    }
    finally {}
  }
  
  public boolean b()
  {
    try
    {
      boolean bool = d;
      d = false;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void c()
    throws InterruptedException
  {
    try
    {
      while (!d) {
        wait();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */