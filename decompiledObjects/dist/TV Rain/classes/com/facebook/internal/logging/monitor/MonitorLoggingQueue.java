package com.facebook.internal.logging.monitor;

import androidx.annotation.RestrictTo;
import com.facebook.internal.logging.ExternalLog;
import com.facebook.internal.logging.LoggingCache;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class MonitorLoggingQueue
  implements LoggingCache
{
  private static final Integer FLUSH_LIMIT = Integer.valueOf(100);
  private static MonitorLoggingQueue monitorLoggingQueue;
  private Queue<ExternalLog> logQueue = new LinkedList();
  
  public static MonitorLoggingQueue getInstance()
  {
    try
    {
      if (monitorLoggingQueue == null)
      {
        localMonitorLoggingQueue = new com/facebook/internal/logging/monitor/MonitorLoggingQueue;
        localMonitorLoggingQueue.<init>();
        monitorLoggingQueue = localMonitorLoggingQueue;
      }
      MonitorLoggingQueue localMonitorLoggingQueue = monitorLoggingQueue;
      return localMonitorLoggingQueue;
    }
    finally {}
  }
  
  private boolean hasReachedFlushLimit()
  {
    boolean bool;
    if (logQueue.size() >= FLUSH_LIMIT.intValue()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean addLog(ExternalLog paramExternalLog)
  {
    return addLogs(Arrays.asList(new ExternalLog[] { paramExternalLog }));
  }
  
  public boolean addLogs(Collection<? extends ExternalLog> paramCollection)
  {
    if (paramCollection != null) {
      logQueue.addAll(paramCollection);
    }
    return hasReachedFlushLimit();
  }
  
  public Collection<ExternalLog> fetchAllLogs()
  {
    LinkedList localLinkedList = new LinkedList(logQueue);
    logQueue.clear();
    return localLinkedList;
  }
  
  public ExternalLog fetchLog()
  {
    return (ExternalLog)logQueue.poll();
  }
  
  public boolean isEmpty()
  {
    return logQueue.isEmpty();
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.monitor.MonitorLoggingQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */