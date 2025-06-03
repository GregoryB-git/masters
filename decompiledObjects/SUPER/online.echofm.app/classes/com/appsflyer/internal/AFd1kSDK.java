package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class AFd1kSDK
  extends AFd1zSDK<Map<String, Object>>
{
  private static final int afRDLog = (int)TimeUnit.SECONDS.toMillis(2L);
  private final Map<String, Object> AFLogger;
  private final List<String> AFLogger$LogLevel;
  private Map<String, Object> afDebugLog;
  private final Uri afErrorLog;
  private final Context afInfoLog;
  
  public AFd1kSDK(@NonNull Context paramContext, @NonNull Map<String, Object> paramMap, @NonNull Uri paramUri, @NonNull List<String> paramList)
  {
    super(AFd1vSDK.AFLogger, new AFd1vSDK[] { AFd1vSDK.values }, "ResolveEsp");
    afInfoLog = paramContext;
    AFLogger = paramMap;
    afErrorLog = paramUri;
    AFLogger$LogLevel = paramList;
  }
  
  private boolean AFInAppEventParameterName(String paramString)
  {
    if (paramString.contains("af_tranid=")) {
      return false;
    }
    Object localObject = new StringBuilder("Validate if link ");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(" belongs to ESP domains: ");
    ((StringBuilder)localObject).append(AFLogger$LogLevel);
    AFLogger.afRDLog(localObject.toString());
    try
    {
      localObject = AFLogger$LogLevel;
      URL localURL = new java/net/URL;
      localURL.<init>(paramString);
      boolean bool = ((List)localObject).contains(localURL.getHost());
      return bool;
    }
    catch (MalformedURLException paramString)
    {
      AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", paramString);
    }
    return false;
  }
  
  private static Map<String, Object> AFKeystoreWrapper(Uri paramUri)
  {
    HashMap localHashMap = new HashMap();
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("ESP deeplink resolving is started: ");
      ((StringBuilder)localObject).append(paramUri.toString());
      AFLogger.afDebugLog(localObject.toString());
      localObject = new java/net/URL;
      ((URL)localObject).<init>(paramUri.toString());
      paramUri = (HttpURLConnection)FirebasePerfUrlConnection.instrument(((URL)localObject).openConnection());
      paramUri.setInstanceFollowRedirects(false);
      int i = afRDLog;
      paramUri.setReadTimeout(i);
      paramUri.setConnectTimeout(i);
      paramUri.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
      paramUri.setRequestProperty("af-esp", "6.12.2");
      i = paramUri.getResponseCode();
      localHashMap.put("status", Integer.valueOf(i));
      if ((300 <= i) && (i <= 305)) {
        localHashMap.put("res", paramUri.getHeaderField("Location"));
      }
    }
    finally
    {
      break label157;
    }
    paramUri.disconnect();
    AFLogger.afDebugLog("ESP deeplink resolving is finished");
    return localHashMap;
    label157:
    localHashMap.put("error", paramUri.getLocalizedMessage());
    AFLogger.afErrorLog(paramUri.getMessage(), paramUri);
    return localHashMap;
  }
  
  public final boolean AFInAppEventParameterName()
  {
    return false;
  }
  
  public final long AFInAppEventType()
  {
    return 60000L;
  }
  
  @NonNull
  public final AFd1ySDK valueOf()
  {
    if (!AFInAppEventParameterName(afErrorLog.toString())) {
      AFa1eSDK.valueOf().valueOf(afInfoLog, AFLogger, afErrorLog);
    }
    for (;;)
    {
      return AFd1ySDK.AFInAppEventParameterName;
      long l = System.currentTimeMillis();
      ??? = afErrorLog.toString();
      ArrayList localArrayList = new ArrayList();
      Object localObject2 = null;
      int i = 0;
      Object localObject3 = null;
      for (;;)
      {
        localObject4 = ???;
        if (i >= 5) {
          break label167;
        }
        localObject3 = AFKeystoreWrapper(Uri.parse((String)???));
        ??? = (String)((Map)localObject3).get("res");
        localObject4 = (Integer)((Map)localObject3).get("status");
        localObject3 = (String)((Map)localObject3).get("error");
        if ((??? == null) || (!AFInAppEventParameterName((String)???))) {
          break;
        }
        if (i < 4) {
          localArrayList.add(???);
        }
        i++;
        localObject2 = localObject4;
      }
      localObject2 = localObject4;
      Object localObject4 = ???;
      label167:
      HashMap localHashMap = new HashMap();
      if (localObject4 != null) {
        ??? = localObject4;
      } else {
        ??? = "";
      }
      localHashMap.put("res", ???);
      if (localObject2 != null) {
        i = ((Number)localObject2).intValue();
      } else {
        i = -1;
      }
      localHashMap.put("status", Integer.valueOf(i));
      if (localObject3 != null) {
        localHashMap.put("error", localObject3);
      }
      if (!localArrayList.isEmpty()) {
        localHashMap.put("redirects", localArrayList);
      }
      localHashMap.put("latency", Long.valueOf(System.currentTimeMillis() - l));
      synchronized (AFLogger)
      {
        AFLogger.put("af_deeplink_r", localHashMap);
        AFLogger.put("af_deeplink", afErrorLog.toString());
        ??? = AFa1eSDK.valueOf();
        localObject3 = afInfoLog;
        localObject2 = AFLogger;
        if (localObject4 != null) {
          localObject4 = Uri.parse((String)localObject4);
        } else {
          localObject4 = afErrorLog;
        }
        ((AFa1eSDK)???).valueOf((Context)localObject3, (Map)localObject2, (Uri)localObject4);
        afDebugLog = localHashMap;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1kSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */