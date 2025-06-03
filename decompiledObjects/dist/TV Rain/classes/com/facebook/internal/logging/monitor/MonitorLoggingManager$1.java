package com.facebook.internal.logging.monitor;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class MonitorLoggingManager$1
  implements Runnable
{
  public MonitorLoggingManager$1(MonitorLoggingManager paramMonitorLoggingManager) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      this$0.flushAndWait();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.monitor.MonitorLoggingManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */