package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.os.Handler;
import android.os.Looper;

final class DownloadService$ForegroundNotificationUpdater
  implements Runnable
{
  private final Handler handler;
  private boolean notificationDisplayed;
  private final int notificationId;
  private boolean periodicUpdatesStarted;
  private final long updateInterval;
  
  public DownloadService$ForegroundNotificationUpdater(DownloadService paramDownloadService, int paramInt, long paramLong)
  {
    notificationId = paramInt;
    updateInterval = paramLong;
    handler = new Handler(Looper.getMainLooper());
  }
  
  public void run()
  {
    update();
  }
  
  public void showNotificationIfNotAlready()
  {
    if (!notificationDisplayed) {
      update();
    }
  }
  
  public void startPeriodicUpdates()
  {
    periodicUpdatesStarted = true;
    update();
  }
  
  public void stopPeriodicUpdates()
  {
    periodicUpdatesStarted = false;
    handler.removeCallbacks(this);
  }
  
  public void update()
  {
    DownloadManager.TaskState[] arrayOfTaskState = DownloadService.access$500(this$0).getAllTaskStates();
    DownloadService localDownloadService = this$0;
    localDownloadService.startForeground(notificationId, localDownloadService.getForegroundNotification(arrayOfTaskState));
    notificationDisplayed = true;
    if (periodicUpdatesStarted)
    {
      handler.removeCallbacks(this);
      handler.postDelayed(this, updateInterval);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloadService.ForegroundNotificationUpdater
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */