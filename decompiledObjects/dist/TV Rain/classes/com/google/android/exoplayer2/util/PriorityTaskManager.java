package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.PriorityQueue;

public final class PriorityTaskManager
{
  private int highestPriority = Integer.MIN_VALUE;
  private final Object lock = new Object();
  private final PriorityQueue<Integer> queue = new PriorityQueue(10, Collections.reverseOrder());
  
  public void add(int paramInt)
  {
    synchronized (lock)
    {
      queue.add(Integer.valueOf(paramInt));
      highestPriority = Math.max(highestPriority, paramInt);
      return;
    }
  }
  
  public void proceed(int paramInt)
    throws InterruptedException
  {
    synchronized (lock)
    {
      while (highestPriority != paramInt) {
        lock.wait();
      }
      return;
    }
  }
  
  public boolean proceedNonBlocking(int paramInt)
  {
    synchronized (lock)
    {
      boolean bool;
      if (highestPriority == paramInt) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public void proceedOrThrow(int paramInt)
    throws PriorityTaskManager.PriorityTooLowException
  {
    synchronized (lock)
    {
      if (highestPriority == paramInt) {
        return;
      }
      PriorityTooLowException localPriorityTooLowException = new com/google/android/exoplayer2/util/PriorityTaskManager$PriorityTooLowException;
      localPriorityTooLowException.<init>(paramInt, highestPriority);
      throw localPriorityTooLowException;
    }
  }
  
  public void remove(int paramInt)
  {
    synchronized (lock)
    {
      queue.remove(Integer.valueOf(paramInt));
      if (queue.isEmpty()) {
        paramInt = Integer.MIN_VALUE;
      } else {
        paramInt = ((Integer)Util.castNonNull(queue.peek())).intValue();
      }
      highestPriority = paramInt;
      lock.notifyAll();
      return;
    }
  }
  
  public static class PriorityTooLowException
    extends IOException
  {
    public PriorityTooLowException(int paramInt1, int paramInt2)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.PriorityTaskManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */