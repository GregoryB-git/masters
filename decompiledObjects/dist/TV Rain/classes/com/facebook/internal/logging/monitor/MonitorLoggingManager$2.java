package com.facebook.internal.logging.monitor;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.logging.ExternalLog;
import com.facebook.internal.logging.LoggingCache;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class MonitorLoggingManager$2
  implements Runnable
{
  public MonitorLoggingManager$2(MonitorLoggingManager paramMonitorLoggingManager, ExternalLog paramExternalLog) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (MonitorLoggingManager.access$000(this$0).addLog(val$log))
      {
        this$0.flushAndWait();
      }
      else if (MonitorLoggingManager.access$100(this$0) == null)
      {
        MonitorLoggingManager localMonitorLoggingManager = this$0;
        MonitorLoggingManager.access$102(localMonitorLoggingManager, MonitorLoggingManager.access$300(localMonitorLoggingManager).schedule(MonitorLoggingManager.access$200(this$0), 5L, TimeUnit.MINUTES));
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.monitor.MonitorLoggingManager.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */