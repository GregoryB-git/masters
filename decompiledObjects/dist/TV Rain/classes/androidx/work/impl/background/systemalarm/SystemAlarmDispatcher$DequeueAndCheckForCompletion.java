package androidx.work.impl.background.systemalarm;

import androidx.annotation.NonNull;

class SystemAlarmDispatcher$DequeueAndCheckForCompletion
  implements Runnable
{
  private final SystemAlarmDispatcher mDispatcher;
  
  public SystemAlarmDispatcher$DequeueAndCheckForCompletion(@NonNull SystemAlarmDispatcher paramSystemAlarmDispatcher)
  {
    mDispatcher = paramSystemAlarmDispatcher;
  }
  
  public void run()
  {
    mDispatcher.dequeueAndCheckForCompletion();
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.DequeueAndCheckForCompletion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */