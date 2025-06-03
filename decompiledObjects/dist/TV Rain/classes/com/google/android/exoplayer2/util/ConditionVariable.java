package com.google.android.exoplayer2.util;

import android.os.SystemClock;

public final class ConditionVariable
{
  private boolean isOpen;
  
  public void block()
    throws InterruptedException
  {
    try
    {
      while (!isOpen) {
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
  
  public boolean block(long paramLong)
    throws InterruptedException
  {
    try
    {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = paramLong + l1;
      boolean bool;
      for (paramLong = l1;; paramLong = SystemClock.elapsedRealtime())
      {
        bool = isOpen;
        if ((bool) || (paramLong >= l2)) {
          break;
        }
        wait(l2 - paramLong);
      }
      return bool;
    }
    finally {}
  }
  
  public boolean close()
  {
    try
    {
      boolean bool = isOpen;
      isOpen = false;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean open()
  {
    try
    {
      boolean bool = isOpen;
      if (bool) {
        return false;
      }
      isOpen = true;
      notifyAll();
      return true;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.ConditionVariable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */