package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundService
  extends LifecycleService
  implements SystemForegroundDispatcher.Callback
{
  private static final String TAG = Logger.tagWithPrefix("SystemFgService");
  @Nullable
  private static SystemForegroundService sForegroundService = null;
  public SystemForegroundDispatcher mDispatcher;
  private Handler mHandler;
  private boolean mIsShutdown;
  public NotificationManager mNotificationManager;
  
  @Nullable
  public static SystemForegroundService getInstance()
  {
    return sForegroundService;
  }
  
  @MainThread
  private void initializeDispatcher()
  {
    mHandler = new Handler(Looper.getMainLooper());
    mNotificationManager = ((NotificationManager)getApplicationContext().getSystemService("notification"));
    SystemForegroundDispatcher localSystemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
    mDispatcher = localSystemForegroundDispatcher;
    localSystemForegroundDispatcher.setCallback(this);
  }
  
  public void cancelNotification(final int paramInt)
  {
    mHandler.post(new Runnable()
    {
      public void run()
      {
        mNotificationManager.cancel(paramInt);
      }
    });
  }
  
  public void notify(final int paramInt, @NonNull final Notification paramNotification)
  {
    mHandler.post(new Runnable()
    {
      public void run()
      {
        mNotificationManager.notify(paramInt, paramNotification);
      }
    });
  }
  
  public void onCreate()
  {
    super.onCreate();
    sForegroundService = this;
    initializeDispatcher();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    mDispatcher.onDestroy();
  }
  
  public int onStartCommand(@Nullable Intent paramIntent, int paramInt1, int paramInt2)
  {
    super.onStartCommand(paramIntent, paramInt1, paramInt2);
    if (mIsShutdown)
    {
      Logger.get().info(TAG, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
      mDispatcher.onDestroy();
      initializeDispatcher();
      mIsShutdown = false;
    }
    if (paramIntent != null) {
      mDispatcher.onStartCommand(paramIntent);
    }
    return 3;
  }
  
  public void startForeground(final int paramInt1, final int paramInt2, @NonNull final Notification paramNotification)
  {
    mHandler.post(new Runnable()
    {
      public void run()
      {
        if (Build.VERSION.SDK_INT >= 29) {
          startForeground(paramInt1, paramNotification, paramInt2);
        } else {
          startForeground(paramInt1, paramNotification);
        }
      }
    });
  }
  
  @MainThread
  public void stop()
  {
    mIsShutdown = true;
    Logger.get().debug(TAG, "All commands completed.", new Throwable[0]);
    if (Build.VERSION.SDK_INT >= 26) {
      stopForeground(true);
    }
    sForegroundService = null;
    stopSelf();
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.foreground.SystemForegroundService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */