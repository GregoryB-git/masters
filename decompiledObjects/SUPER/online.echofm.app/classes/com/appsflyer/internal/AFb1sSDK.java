package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.deeplink.DeepLinkResult.Error;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFb1sSDK
{
  public static Intent valueOf;
  public DeepLinkListener AFInAppEventParameterName;
  @NonNull
  public List<List<String>> AFInAppEventType = new ArrayList();
  public String AFKeystoreWrapper;
  @NonNull
  public final List<String> AFLogger = new ArrayList();
  public String[] afDebugLog;
  public long afInfoLog;
  private final AFc1xSDK afRDLog;
  public Map<String, String> values;
  
  public AFb1sSDK(@NonNull AFc1xSDK paramAFc1xSDK)
  {
    afRDLog = paramAFc1xSDK;
  }
  
  private boolean AFInAppEventParameterName(Intent paramIntent, Context paramContext, Map<String, Object> paramMap)
  {
    StringBuilder localStringBuilder = null;
    Uri localUri1;
    if ((paramIntent != null) && ("android.intent.action.VIEW".equals(paramIntent.getAction()))) {
      localUri1 = paramIntent.getData();
    } else {
      localUri1 = null;
    }
    Object localObject = valueOf;
    Uri localUri2;
    if ((localObject != null) && ("android.intent.action.VIEW".equals(((Intent)localObject).getAction()))) {
      localUri2 = ((Intent)localObject).getData();
    } else {
      localUri2 = null;
    }
    if (paramIntent == null)
    {
      AFLogger.afDebugLog("Could not extract deeplink from null intent");
      localObject = localStringBuilder;
    }
    else
    {
      Bundle localBundle = paramIntent.getExtras();
      localObject = localStringBuilder;
      if (!AFInAppEventType.isEmpty()) {
        if (localBundle == null)
        {
          localObject = localStringBuilder;
        }
        else
        {
          Iterator localIterator1 = AFInAppEventType.iterator();
          List localList;
          do
          {
            localObject = localStringBuilder;
            if (!localIterator1.hasNext()) {
              break;
            }
            localList = (List)localIterator1.next();
            if (localList == null) {}
            Iterator localIterator2;
            do
            {
              do
              {
                localObject = null;
                break;
                localIterator2 = localList.iterator();
              } while (!localIterator2.hasNext());
              localObject = localBundle.getString((String)localIterator2.next());
            } while (localObject == null);
            localObject = values(localObject, localIterator2);
          } while (localObject == null);
          localStringBuilder = new StringBuilder("Found deeplink in push payload at ");
          localStringBuilder.append(localList.toString());
          AFLogger.afDebugLog(localStringBuilder.toString());
          AFa1eSDK.values(paramMap).put("payloadKey", AFInAppEventType);
        }
      }
    }
    if (localUri1 != null)
    {
      if (!paramIntent.hasExtra("af_consumed"))
      {
        paramIntent.putExtra("af_consumed", System.currentTimeMillis());
        valueOf(paramContext, paramMap, localUri1);
        return true;
      }
      paramIntent = new StringBuilder("skipping re-use of previously consumed deep link: ");
      paramIntent.append(localUri1.toString());
      paramIntent.append(" w/af_consumed");
      AFLogger.afInfoLog(paramIntent.toString());
      return false;
    }
    if (localUri2 != null)
    {
      if (!valueOf.hasExtra("af_consumed"))
      {
        valueOf.putExtra("af_consumed", System.currentTimeMillis());
        valueOf(paramContext, paramMap, localUri2);
        return true;
      }
      paramIntent = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
      paramIntent.append(localUri2.toString());
      paramIntent.append(" w/af_consumed");
      AFLogger.afInfoLog(paramIntent.toString());
      return false;
    }
    if (localObject != null)
    {
      if (!paramIntent.hasExtra("af_consumed"))
      {
        paramIntent.putExtra("af_consumed", System.currentTimeMillis());
        valueOf(paramContext, paramMap, (Uri)localObject);
        return true;
      }
      paramIntent = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
      paramIntent.append(localObject.toString());
      paramIntent.append(" w/af_consumed");
      AFLogger.afInfoLog(paramIntent.toString());
      return false;
    }
    AFLogger.afDebugLog("No deep link detected");
    return false;
  }
  
  private static void AFKeystoreWrapper(String paramString)
  {
    AppsFlyerConversionListener localAppsFlyerConversionListener = valueOfAFInAppEventParameterName;
    if (localAppsFlyerConversionListener != null) {
      try
      {
        AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(paramString)));
        localAppsFlyerConversionListener.onAttributionFailure(paramString);
        return;
      }
      finally
      {
        AFLogger.afErrorLog(paramString.getLocalizedMessage(), paramString);
      }
    }
  }
  
  private static void AFKeystoreWrapper(Map<String, String> paramMap)
  {
    AppsFlyerConversionListener localAppsFlyerConversionListener = valueOfAFInAppEventParameterName;
    if (localAppsFlyerConversionListener != null) {
      try
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Calling onAppOpenAttribution with:\n");
        localStringBuilder.append(paramMap.toString());
        AFLogger.afDebugLog(localStringBuilder.toString());
        localAppsFlyerConversionListener.onAppOpenAttribution(paramMap);
        return;
      }
      finally
      {
        AFLogger.afErrorLog(paramMap.getLocalizedMessage(), paramMap);
      }
    }
  }
  
  private Uri values(Object paramObject, Iterator<String> paramIterator)
  {
    for (;;)
    {
      if (paramObject == JSONObject.NULL) {
        return null;
      }
      if (!paramIterator.hasNext())
      {
        paramObject = Uri.parse(paramObject.toString());
        if ((paramObject != null) && (((Uri)paramObject).getScheme() != null) && (((Uri)paramObject).getHost() != null)) {
          return (Uri)paramObject;
        }
        return null;
      }
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramObject.toString());
        paramObject = localJSONObject.get((String)paramIterator.next());
      }
      catch (JSONException paramObject)
      {
        AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", (Throwable)paramObject);
      }
    }
    return null;
  }
  
  public final void AFInAppEventType(DeepLinkResult paramDeepLinkResult)
  {
    if (AFInAppEventParameterName != null)
    {
      StringBuilder localStringBuilder = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
      localStringBuilder.append(paramDeepLinkResult.toString());
      AFLogger.afDebugLog(localStringBuilder.toString());
      try
      {
        AFInAppEventParameterName.onDeepLinking(paramDeepLinkResult);
        return;
      }
      finally
      {
        AFLogger.afErrorLog(paramDeepLinkResult.getLocalizedMessage(), paramDeepLinkResult);
        return;
      }
    }
    AFLogger.afDebugLog("[DDL] skipping, no callback registered");
  }
  
  /* Error */
  public final void AFInAppEventType(Map<String, String> paramMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 229	com/appsflyer/internal/AFb1sSDK:AFInAppEventParameterName	Lcom/appsflyer/deeplink/DeepLinkListener;
    //   4: ifnull +80 -> 84
    //   7: aload_1
    //   8: invokestatic 243	com/appsflyer/deeplink/DeepLink:AFKeystoreWrapper	(Ljava/util/Map;)Lcom/appsflyer/deeplink/DeepLink;
    //   11: astore_1
    //   12: aload_1
    //   13: getfield 246	com/appsflyer/deeplink/DeepLink:valueOf	Lorg/json/JSONObject;
    //   16: ldc -8
    //   18: iconst_0
    //   19: invokevirtual 251	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   22: pop
    //   23: new 253	com/appsflyer/deeplink/DeepLinkResult
    //   26: dup
    //   27: aload_1
    //   28: aconst_null
    //   29: invokespecial 256	com/appsflyer/deeplink/DeepLinkResult:<init>	(Lcom/appsflyer/deeplink/DeepLink;Lcom/appsflyer/deeplink/DeepLinkResult$Error;)V
    //   32: astore_1
    //   33: aload_0
    //   34: aload_1
    //   35: invokevirtual 258	com/appsflyer/internal/AFb1sSDK:AFInAppEventType	(Lcom/appsflyer/deeplink/DeepLinkResult;)V
    //   38: return
    //   39: astore_1
    //   40: goto +29 -> 69
    //   43: astore_1
    //   44: ldc_w 260
    //   47: aload_1
    //   48: iconst_1
    //   49: invokestatic 263	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    //   52: getstatic 269	com/appsflyer/deeplink/DeepLinkResult$Error:UNEXPECTED	Lcom/appsflyer/deeplink/DeepLinkResult$Error;
    //   55: astore_1
    //   56: new 253	com/appsflyer/deeplink/DeepLinkResult
    //   59: dup
    //   60: aconst_null
    //   61: aload_1
    //   62: invokespecial 256	com/appsflyer/deeplink/DeepLinkResult:<init>	(Lcom/appsflyer/deeplink/DeepLink;Lcom/appsflyer/deeplink/DeepLinkResult$Error;)V
    //   65: astore_1
    //   66: goto -33 -> 33
    //   69: aload_0
    //   70: new 253	com/appsflyer/deeplink/DeepLinkResult
    //   73: dup
    //   74: aconst_null
    //   75: aconst_null
    //   76: invokespecial 256	com/appsflyer/deeplink/DeepLinkResult:<init>	(Lcom/appsflyer/deeplink/DeepLink;Lcom/appsflyer/deeplink/DeepLinkResult$Error;)V
    //   79: invokevirtual 258	com/appsflyer/internal/AFb1sSDK:AFInAppEventType	(Lcom/appsflyer/deeplink/DeepLinkResult;)V
    //   82: aload_1
    //   83: athrow
    //   84: aload_1
    //   85: invokestatic 271	com/appsflyer/internal/AFb1sSDK:AFKeystoreWrapper	(Ljava/util/Map;)V
    //   88: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	AFb1sSDK
    //   0	89	1	paramMap	Map<String, String>
    // Exception table:
    //   from	to	target	type
    //   7	23	39	finally
    //   44	56	39	finally
    //   7	23	43	org/json/JSONException
  }
  
  public final void AFKeystoreWrapper(String paramString, DeepLinkResult.Error paramError)
  {
    if (AFInAppEventParameterName != null)
    {
      AFLogger.afDebugLog("[DDL] Error occurred: ".concat(String.valueOf(paramString)));
      AFInAppEventType(new DeepLinkResult(null, paramError));
      return;
    }
    AFKeystoreWrapper(paramString);
  }
  
  public final void valueOf(Context paramContext, Map<String, Object> paramMap, Uri paramUri)
  {
    paramMap = new AFd1kSDK(paramContext, paramMap, paramUri, AFLogger);
    AFa1eSDK.valueOf().AFKeystoreWrapper(paramContext);
    paramContext = afRDLog.AFVersionDeclaration();
    AFKeystoreWrapper.execute(new AFc1bSDK.4(paramContext, paramMap));
    valueOf = null;
  }
  
  public final void valueOf(Map<String, Object> paramMap, Intent paramIntent, Context paramContext)
  {
    AFc1ySDK localAFc1ySDK = (AFc1ySDK)afRDLog;
    if (paramContext != null) {
      valueOf.AFInAppEventType = paramContext.getApplicationContext();
    }
    if ((!AFInAppEventParameterName(paramIntent, paramContext, paramMap)) && (AFInAppEventParameterName != null) && (afRDLog.AFInAppEventParameterName().AFInAppEventType.values("appsFlyerCount", 0) == 0) && (!afRDLog.values().valueOf("ddl_sent")))
    {
      paramIntent = new AFb1mSDK(afRDLog);
      paramMap = afRDLog.AFVersionDeclaration();
      paramIntent = new AFd1mSDK(paramIntent);
      AFKeystoreWrapper.execute(new AFc1bSDK.4(paramMap, paramIntent));
    }
    afRDLog.values().values("ddl_sent", true);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1sSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */