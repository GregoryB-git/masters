package com.google.android.datatransport.runtime.synchronization;

import androidx.annotation.WorkerThread;

@WorkerThread
public abstract interface SynchronizationGuard
{
  public abstract <T> T runCriticalSection(CriticalSection<T> paramCriticalSection);
  
  public static abstract interface CriticalSection<T>
  {
    public abstract T execute();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */