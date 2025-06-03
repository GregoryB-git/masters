package com.facebook.internal.logging.monitor;

import com.facebook.internal.logging.LogCategory;
import com.facebook.internal.logging.LogEvent;
import java.util.Set;
import z2;

public class MonitorLog$LogBuilder
{
  private LogEvent logEvent;
  private int timeSpent;
  private long timeStart;
  
  public MonitorLog$LogBuilder(LogEvent paramLogEvent)
  {
    logEvent = paramLogEvent;
    if (paramLogEvent.getLogCategory() == LogCategory.PERFORMANCE) {
      paramLogEvent.upperCaseEventName();
    }
  }
  
  private void validateMonitorLog(MonitorLog paramMonitorLog)
  {
    if (timeSpent < 0) {
      MonitorLog.access$302(paramMonitorLog, -1);
    }
    if (timeStart < 0L) {
      MonitorLog.access$402(paramMonitorLog, -1L);
    }
    if ((logEvent.getLogCategory() == LogCategory.PERFORMANCE) && (!MonitorLog.access$500().contains(logEvent.getEventName())))
    {
      paramMonitorLog = z2.t("Invalid event name: ");
      paramMonitorLog.append(logEvent.getEventName());
      paramMonitorLog.append("\nIt should be one of ");
      paramMonitorLog.append(MonitorLog.access$500());
      paramMonitorLog.append(".");
      throw new IllegalArgumentException(paramMonitorLog.toString());
    }
  }
  
  public MonitorLog build()
  {
    MonitorLog localMonitorLog = new MonitorLog(this);
    validateMonitorLog(localMonitorLog);
    return localMonitorLog;
  }
  
  public LogBuilder timeSpent(int paramInt)
  {
    timeSpent = paramInt;
    return this;
  }
  
  public LogBuilder timeStart(long paramLong)
  {
    timeStart = paramLong;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.monitor.MonitorLog.LogBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */