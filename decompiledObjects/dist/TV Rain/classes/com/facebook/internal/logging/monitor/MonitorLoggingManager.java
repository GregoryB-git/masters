package com.facebook.internal.logging.monitor;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.logging.ExternalLog;
import com.facebook.internal.logging.LoggingCache;
import com.facebook.internal.logging.LoggingManager;
import com.facebook.internal.logging.LoggingStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class MonitorLoggingManager
  implements LoggingManager
{
  private static final String ENTRIES_KEY = "entries";
  private static final int FLUSH_PERIOD = 5;
  private static final Integer MAX_LOG_NUMBER_PER_REQUEST = Integer.valueOf(100);
  private static final String MONITORING_ENDPOINT = "monitorings";
  private static String deviceModel = Build.MODEL;
  private static String deviceOSVersion = Build.VERSION.RELEASE;
  private static MonitorLoggingManager monitorLoggingManager;
  private final Runnable flushRunnable = new Runnable()
  {
    public void run()
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return;
      }
      try
      {
        flushAndWait();
        return;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, this);
      }
    }
  };
  private ScheduledFuture flushTimer;
  private LoggingCache logQueue;
  private LoggingStore logStore;
  private final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
  
  private MonitorLoggingManager(LoggingCache paramLoggingCache, LoggingStore paramLoggingStore)
  {
    if (logQueue == null) {
      logQueue = paramLoggingCache;
    }
    if (logStore == null) {
      logStore = paramLoggingStore;
    }
  }
  
  @Nullable
  public static GraphRequest buildPostRequestFromLogs(List<? extends ExternalLog> paramList)
  {
    String str = FacebookSdk.getApplicationContext().getPackageName();
    JSONArray localJSONArray = new JSONArray();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localJSONArray.put(((ExternalLog)paramList.next()).convertToJSONObject());
    }
    if (localJSONArray.length() == 0) {
      return null;
    }
    paramList = new JSONObject();
    try
    {
      paramList.put("device_os_version", deviceOSVersion);
      paramList.put("device_model", deviceModel);
      paramList.put("unique_application_identifier", str);
      paramList.put("entries", localJSONArray.toString());
      return GraphRequest.newPostRequest(null, String.format("%s/monitorings", new Object[] { FacebookSdk.getApplicationId() }), paramList, null);
    }
    catch (JSONException paramList) {}
    return null;
  }
  
  public static List<GraphRequest> buildRequests(LoggingCache paramLoggingCache)
  {
    ArrayList localArrayList = new ArrayList();
    if (Utility.isNullOrEmpty(FacebookSdk.getApplicationId())) {
      return localArrayList;
    }
    while (!paramLoggingCache.isEmpty())
    {
      Object localObject = new ArrayList();
      for (int i = 0; (i < MAX_LOG_NUMBER_PER_REQUEST.intValue()) && (!paramLoggingCache.isEmpty()); i++) {
        ((ArrayList)localObject).add(paramLoggingCache.fetchLog());
      }
      localObject = buildPostRequestFromLogs((List)localObject);
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public static MonitorLoggingManager getInstance(LoggingCache paramLoggingCache, LoggingStore paramLoggingStore)
  {
    try
    {
      if (monitorLoggingManager == null)
      {
        MonitorLoggingManager localMonitorLoggingManager = new com/facebook/internal/logging/monitor/MonitorLoggingManager;
        localMonitorLoggingManager.<init>(paramLoggingCache, paramLoggingStore);
        monitorLoggingManager = localMonitorLoggingManager;
      }
      paramLoggingCache = monitorLoggingManager;
      return paramLoggingCache;
    }
    finally {}
  }
  
  public void addLog(final ExternalLog paramExternalLog)
  {
    singleThreadExecutor.execute(new Runnable()
    {
      public void run()
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          if (MonitorLoggingManager.access$000(MonitorLoggingManager.this).addLog(paramExternalLog))
          {
            flushAndWait();
          }
          else if (MonitorLoggingManager.access$100(MonitorLoggingManager.this) == null)
          {
            MonitorLoggingManager localMonitorLoggingManager = MonitorLoggingManager.this;
            MonitorLoggingManager.access$102(localMonitorLoggingManager, MonitorLoggingManager.access$300(localMonitorLoggingManager).schedule(MonitorLoggingManager.access$200(MonitorLoggingManager.this), 5L, TimeUnit.MINUTES));
          }
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(localThrowable, this);
        }
      }
    });
  }
  
  public void flushAndWait()
  {
    Object localObject = flushTimer;
    if (localObject != null) {
      ((Future)localObject).cancel(true);
    }
    List localList = buildRequests(logQueue);
    try
    {
      localObject = new com/facebook/GraphRequestBatch;
      ((GraphRequestBatch)localObject).<init>(localList);
      ((GraphRequestBatch)localObject).executeAsync();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void flushLoggingStore()
  {
    Collection localCollection = logStore.readAndClearStore();
    logQueue.addLogs(localCollection);
    flushAndWait();
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.monitor.MonitorLoggingManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */