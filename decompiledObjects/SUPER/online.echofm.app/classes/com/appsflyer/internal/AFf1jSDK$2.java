package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

final class AFf1jSDK$2
  implements GetAppsReferrerStateListener
{
  public AFf1jSDK$2(AFf1jSDK paramAFf1jSDK, Context paramContext, GetAppsReferrerClient paramGetAppsReferrerClient) {}
  
  public final void onGetAppsReferrerSetupFinished(int paramInt)
  {
    AFKeystoreWrapper.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFa1fSDK.AFInAppEventType(AFInAppEventParameterName, "com.xiaomi.mipicks")));
    AFKeystoreWrapper.AFInAppEventParameterName.put("api_ver_name", AFa1fSDK.AFKeystoreWrapper(AFInAppEventParameterName, "com.xiaomi.mipicks"));
    Object localObject1;
    Object localObject3;
    if (paramInt != -1) {
      if (paramInt != 0) {
        if (paramInt != 1) {
          if (paramInt != 2) {
            if (paramInt != 3)
            {
              if (paramInt != 4)
              {
                localObject1 = "responseCode not found.";
                AFLogger.afWarnLog((String)localObject1);
                break label422;
              }
              AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
              localObject3 = AFKeystoreWrapper.AFInAppEventParameterName;
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
      localObject3 = AFKeystoreWrapper.AFInAppEventParameterName;
      localObject1 = "DEVELOPER_ERROR";
      continue;
      AFLogger.afWarnLog("XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
      localObject3 = AFKeystoreWrapper.AFInAppEventParameterName;
      localObject1 = "FEATURE_NOT_SUPPORTED";
      continue;
      AFKeystoreWrapper.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
      localObject1 = "XiaomiInstallReferrer not supported";
      break;
      localObject1 = AFKeystoreWrapper;
      localObject3 = AFInAppEventType;
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
      localObject3 = AFKeystoreWrapper.AFInAppEventParameterName;
      str = "SERVICE_DISCONNECTED";
    }
    label422:
    AFLogger.afDebugLog("Xiaomi Install Referrer collected locally");
    AFKeystoreWrapper.values();
    AFInAppEventType.endConnection();
  }
  
  public final void onGetAppsServiceDisconnected() {}
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1jSDK.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */