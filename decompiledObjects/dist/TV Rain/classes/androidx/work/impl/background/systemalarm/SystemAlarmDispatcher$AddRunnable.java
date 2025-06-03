package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.NonNull;

class SystemAlarmDispatcher$AddRunnable
  implements Runnable
{
  private final SystemAlarmDispatcher mDispatcher;
  private final Intent mIntent;
  private final int mStartId;
  
  public SystemAlarmDispatcher$AddRunnable(@NonNull SystemAlarmDispatcher paramSystemAlarmDispatcher, @NonNull Intent paramIntent, int paramInt)
  {
    mDispatcher = paramSystemAlarmDispatcher;
    mIntent = paramIntent;
    mStartId = paramInt;
  }
  
  public void run()
  {
    mDispatcher.add(mIntent, mStartId);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.AddRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */