package com.facebook.internal.logging.monitor;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.internal.logging.ExternalLog;
import com.facebook.internal.logging.LogCategory;
import com.facebook.internal.logging.LogEvent;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class MonitorLog
  implements ExternalLog
{
  private static final int INVALID_TIME = -1;
  private static final long serialVersionUID = 1L;
  private static Set<String> validPerformanceEventNames = new HashSet();
  private int hashCode;
  private LogEvent logEvent;
  private int timeSpent;
  private long timeStart;
  
  static
  {
    for (PerformanceEventName localPerformanceEventName : PerformanceEventName.values()) {
      validPerformanceEventNames.add(localPerformanceEventName.toString());
    }
  }
  
  public MonitorLog(LogBuilder paramLogBuilder)
  {
    logEvent = LogBuilder.access$000(paramLogBuilder);
    timeStart = LogBuilder.access$100(paramLogBuilder);
    timeSpent = LogBuilder.access$200(paramLogBuilder);
  }
  
  public JSONObject convertToJSONObject()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("event_name", logEvent.getEventName());
      localJSONObject.put("category", logEvent.getLogCategory());
      long l = timeStart;
      if (l != 0L) {
        localJSONObject.put("time_start", l);
      }
      int i = timeSpent;
      if (i != 0) {
        localJSONObject.put("time_spent", i);
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (MonitorLog)paramObject;
      if ((!logEvent.getEventName().equals(logEvent.getEventName())) || (!logEvent.getLogCategory().equals(logEvent.getLogCategory())) || (timeStart != timeStart) || (timeSpent != timeSpent)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public String getEventName()
  {
    return logEvent.getEventName();
  }
  
  public LogCategory getLogCategory()
  {
    return logEvent.getLogCategory();
  }
  
  public int getTimeSpent()
  {
    return timeSpent;
  }
  
  public long getTimeStart()
  {
    return timeStart;
  }
  
  public int hashCode()
  {
    if (hashCode == 0)
    {
      int i = logEvent.hashCode();
      long l = timeStart;
      int j = (int)(l ^ l >>> 32);
      int k = timeSpent;
      hashCode = (((i + 527) * 31 + j) * 31 + (k ^ k >>> 32));
    }
    return hashCode;
  }
  
  public boolean isValid()
  {
    boolean bool;
    if ((timeStart >= 0L) && (timeSpent >= 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    return String.format("event_name: %s, category: %s, time_start: %s, time_spent: %s", new Object[] { logEvent.getEventName(), logEvent.getLogCategory(), Long.valueOf(timeStart), Integer.valueOf(timeSpent) });
  }
  
  public static class LogBuilder
  {
    private LogEvent logEvent;
    private int timeSpent;
    private long timeStart;
    
    public LogBuilder(LogEvent paramLogEvent)
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
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.monitor.MonitorLog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */