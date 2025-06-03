package com.facebook.internal.logging.monitor;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class MonitorManager
{
  private static MonitorCreator monitorCreator = new MonitorCreator()
  {
    public void enable() {}
  };
  
  @VisibleForTesting
  public static void setMonitorCreator(MonitorCreator paramMonitorCreator)
  {
    monitorCreator = paramMonitorCreator;
  }
  
  public static void start()
  {
    if (!FacebookSdk.getMonitorEnabled()) {
      return;
    }
    FetchedAppSettings localFetchedAppSettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
    if ((localFetchedAppSettings != null) && (localFetchedAppSettings.getMonitorViaDialogEnabled())) {
      monitorCreator.enable();
    }
  }
  
  @VisibleForTesting
  public static abstract interface MonitorCreator
  {
    public abstract void enable();
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.monitor.MonitorManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */