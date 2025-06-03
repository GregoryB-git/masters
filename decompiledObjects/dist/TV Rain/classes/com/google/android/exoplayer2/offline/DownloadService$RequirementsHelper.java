package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.util.Log;

final class DownloadService$RequirementsHelper
  implements RequirementsWatcher.Listener
{
  private final Context context;
  private final Requirements requirements;
  private final RequirementsWatcher requirementsWatcher;
  @Nullable
  private final Scheduler scheduler;
  private final Class<? extends DownloadService> serviceClass;
  
  private DownloadService$RequirementsHelper(Context paramContext, Requirements paramRequirements, @Nullable Scheduler paramScheduler, Class<? extends DownloadService> paramClass)
  {
    context = paramContext;
    requirements = paramRequirements;
    scheduler = paramScheduler;
    serviceClass = paramClass;
    requirementsWatcher = new RequirementsWatcher(paramContext, this, paramRequirements);
  }
  
  private void notifyService()
    throws Exception
  {
    Intent localIntent = DownloadService.access$600(context, serviceClass, "com.google.android.exoplayer.downloadService.action.INIT");
    try
    {
      context.startService(localIntent);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      throw new Exception(localIllegalStateException);
    }
  }
  
  public void requirementsMet(RequirementsWatcher paramRequirementsWatcher)
  {
    try
    {
      notifyService();
      paramRequirementsWatcher = scheduler;
      if (paramRequirementsWatcher != null) {
        paramRequirementsWatcher.cancel();
      }
      return;
    }
    catch (Exception paramRequirementsWatcher)
    {
      for (;;) {}
    }
  }
  
  public void requirementsNotMet(RequirementsWatcher paramRequirementsWatcher)
  {
    try
    {
      notifyService();
      if (scheduler != null)
      {
        paramRequirementsWatcher = context.getPackageName();
        if (!scheduler.schedule(requirements, paramRequirementsWatcher, "com.google.android.exoplayer.downloadService.action.RESTART")) {
          Log.e("DownloadService", "Scheduling downloads failed.");
        }
      }
      return;
    }
    catch (Exception paramRequirementsWatcher)
    {
      for (;;) {}
    }
  }
  
  public void start()
  {
    requirementsWatcher.start();
  }
  
  public void stop()
  {
    requirementsWatcher.stop();
    Scheduler localScheduler = scheduler;
    if (localScheduler != null) {
      localScheduler.cancel();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloadService.RequirementsHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */