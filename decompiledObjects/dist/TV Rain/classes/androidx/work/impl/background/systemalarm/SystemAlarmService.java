package androidx.work.impl.background.systemalarm;

import android.app.Service;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.utils.WakeLocks;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmService
  extends LifecycleService
  implements SystemAlarmDispatcher.CommandsCompletedListener
{
  private static final String TAG = Logger.tagWithPrefix("SystemAlarmService");
  private SystemAlarmDispatcher mDispatcher;
  private boolean mIsShutdown;
  
  @MainThread
  private void initializeDispatcher()
  {
    SystemAlarmDispatcher localSystemAlarmDispatcher = new SystemAlarmDispatcher(this);
    mDispatcher = localSystemAlarmDispatcher;
    localSystemAlarmDispatcher.setCompletedListener(this);
  }
  
  @MainThread
  public void onAllCommandsCompleted()
  {
    mIsShutdown = true;
    Logger.get().debug(TAG, "All commands completed in dispatcher", new Throwable[0]);
    WakeLocks.checkWakeLocks();
    stopSelf();
  }
  
  public void onCreate()
  {
    super.onCreate();
    initializeDispatcher();
    mIsShutdown = false;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    mIsShutdown = true;
    mDispatcher.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    super.onStartCommand(paramIntent, paramInt1, paramInt2);
    if (mIsShutdown)
    {
      Logger.get().info(TAG, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
      mDispatcher.onDestroy();
      initializeDispatcher();
      mIsShutdown = false;
    }
    if (paramIntent != null) {
      mDispatcher.add(paramIntent, paramInt2);
    }
    return 3;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.SystemAlarmService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */