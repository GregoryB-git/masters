package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerClient.Builder;
import com.miui.referrer.api.GetAppsReferrerClient.Companion;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public final class AFf1jSDK
  extends AFf1uSDK
{
  public AFf1jSDK(Runnable paramRunnable)
  {
    super("store", "xiaomi", paramRunnable);
  }
  
  /* Error */
  private static boolean AFKeystoreWrapper()
  {
    // Byte code:
    //   0: invokestatic 23	com/appsflyer/internal/AFf1uSDK:valueOf	()Z
    //   3: ifne +5 -> 8
    //   6: iconst_0
    //   7: ireturn
    //   8: ldc 25
    //   10: invokestatic 31	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   13: pop
    //   14: ldc 33
    //   16: invokestatic 39	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   19: iconst_1
    //   20: ireturn
    //   21: astore_0
    //   22: ldc 41
    //   24: aload_0
    //   25: invokestatic 45	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   28: iconst_0
    //   29: ireturn
    //   30: astore_0
    //   31: new 47	java/lang/StringBuilder
    //   34: dup
    //   35: ldc 49
    //   37: invokespecial 51	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   40: astore_0
    //   41: aload_0
    //   42: ldc 25
    //   44: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: aload_0
    //   49: ldc 57
    //   51: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload_0
    //   56: invokevirtual 63	java/lang/Object:toString	()Ljava/lang/String;
    //   59: invokestatic 66	com/appsflyer/AFLogger:afRDLog	(Ljava/lang/String;)V
    //   62: iconst_0
    //   63: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   21	4	0	localThrowable	Throwable
    //   30	1	0	localClassNotFoundException	ClassNotFoundException
    //   40	16	0	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   8	14	21	finally
    //   8	14	30	java/lang/ClassNotFoundException
  }
  
  public final void valueOf(final Context paramContext)
  {
    if (!AFKeystoreWrapper()) {
      return;
    }
    afInfoLog = System.currentTimeMillis();
    afDebugLog = AFf1pSDK.AFa1zSDK.AFInAppEventType;
    addObserver(new AFf1pSDK.1(this));
    final GetAppsReferrerClient localGetAppsReferrerClient = GetAppsReferrerClient.Companion.newBuilder(paramContext).build();
    localGetAppsReferrerClient.startConnection(new GetAppsReferrerStateListener()
    {
      public final void onGetAppsReferrerSetupFinished(int paramAnonymousInt)
      {
        AFInAppEventParameterName.put("api_ver", Long.valueOf(AFa1fSDK.AFInAppEventType(paramContext, "com.xiaomi.mipicks")));
        AFInAppEventParameterName.put("api_ver_name", AFa1fSDK.AFKeystoreWrapper(paramContext, "com.xiaomi.mipicks"));
        Object localObject1;
        Object localObject3;
        if (paramAnonymousInt != -1) {
          if (paramAnonymousInt != 0) {
            if (paramAnonymousInt != 1) {
              if (paramAnonymousInt != 2) {
                if (paramAnonymousInt != 3)
                {
                  if (paramAnonymousInt != 4)
                  {
                    localObject1 = "responseCode not found.";
                    AFLogger.afWarnLog((String)localObject1);
                    break label422;
                  }
                  AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                  localObject3 = AFInAppEventParameterName;
                  localObject1 = "PERMISSION_ERROR";
                }
              }
            }
          }
        }
        for (;;)
        {
          ((Map)localObject3).put("response", localObject1);
          break label422;
          AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
          localObject3 = AFInAppEventParameterName;
          localObject1 = "DEVELOPER_ERROR";
          continue;
          AFLogger.afWarnLog("XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
          localObject3 = AFInAppEventParameterName;
          localObject1 = "FEATURE_NOT_SUPPORTED";
          continue;
          AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
          localObject1 = "XiaomiInstallReferrer not supported";
          break;
          localObject1 = AFf1jSDK.this;
          localObject3 = localGetAppsReferrerClient;
          AFInAppEventParameterName.put("response", "OK");
          try
          {
            AFLogger.afDebugLog("XiaomiInstallReferrer connected");
            if (!((GetAppsReferrerClient)localObject3).isReady()) {
              break label368;
            }
            localObject3 = ((GetAppsReferrerClient)localObject3).getInstallReferrer();
            localObject4 = ((GetAppsReferrerDetails)localObject3).getInstallReferrer();
            if (localObject4 != null) {
              AFInAppEventParameterName.put("referrer", localObject4);
            }
          }
          finally
          {
            break label376;
          }
          long l = ((GetAppsReferrerDetails)localObject3).getReferrerClickTimestampSeconds();
          AFInAppEventParameterName.put("click_ts", Long.valueOf(l));
          l = ((GetAppsReferrerDetails)localObject3).getInstallBeginTimestampSeconds();
          AFInAppEventParameterName.put("install_begin_ts", Long.valueOf(l));
          Object localObject4 = new java/util/HashMap;
          ((HashMap)localObject4).<init>();
          ((AbstractMap)localObject4).put("click_server_ts", Long.valueOf(((GetAppsReferrerDetails)localObject3).getReferrerClickTimestampServerSeconds()));
          ((AbstractMap)localObject4).put("install_begin_server_ts", Long.valueOf(((GetAppsReferrerDetails)localObject3).getInstallBeginTimestampServerSeconds()));
          ((AbstractMap)localObject4).put("install_version", ((GetAppsReferrerDetails)localObject3).getInstallVersion());
          AFInAppEventParameterName.put("xiaomi_custom", localObject4);
          break label422;
          label368:
          AFLogger.afWarnLog("XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
          break label422;
          label376:
          localObject3 = new StringBuilder("Failed to get Xiaomi install referrer: ");
          ((StringBuilder)localObject3).append(((Throwable)localObject2).getMessage());
          String str = localObject3.toString();
          break;
          AFLogger.afWarnLog("XiaomiInstallReferrer SERVICE_DISCONNECTED");
          localObject3 = AFInAppEventParameterName;
          str = "SERVICE_DISCONNECTED";
        }
        label422:
        AFLogger.afDebugLog("Xiaomi Install Referrer collected locally");
        values();
        localGetAppsReferrerClient.endConnection();
      }
      
      public final void onGetAppsServiceDisconnected() {}
    });
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1jSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */