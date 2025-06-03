package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.ref.Reference;

public final class AFd1sSDK
  extends AFd1oSDK<String>
{
  @NonNull
  private final String afInfoLog;
  private final AFf1cSDK getLevel;
  
  public AFd1sSDK(@NonNull AFc1xSDK paramAFc1xSDK, @NonNull String paramString, AFf1cSDK paramAFf1cSDK)
  {
    super(AFd1vSDK.onAppOpenAttributionNative, new AFd1vSDK[] { AFd1vSDK.values }, paramAFc1xSDK, paramString);
    afInfoLog = paramString;
    getLevel = paramAFf1cSDK;
  }
  
  public final boolean AFInAppEventParameterName()
  {
    return false;
  }
  
  public final boolean afInfoLog()
  {
    return false;
  }
  
  public final AppsFlyerRequestListener afRDLog()
  {
    return null;
  }
  
  public final AFc1qSDK<String> values(@NonNull String paramString)
  {
    return AFLogger.AFInAppEventParameterName(afInfoLog);
  }
  
  public final void values()
  {
    super.values();
    Object localObject1 = afErrorLog;
    if (localObject1 != null)
    {
      int i = ((AFc1gSDK)localObject1).getStatusCode();
      if (i != 200)
      {
        if ((i != 301) && (i != 302))
        {
          localObject1 = new StringBuilder("call to ");
          ((StringBuilder)localObject1).append(afInfoLog);
          ((StringBuilder)localObject1).append(" failed: ");
          ((StringBuilder)localObject1).append(i);
          AFLogger.afInfoLog(localObject1.toString());
        }
        else
        {
          Object localObject2 = new StringBuilder("Cross promotion redirection success: ");
          ((StringBuilder)localObject2).append(afInfoLog);
          AFLogger.afInfoLog(localObject2.toString(), false);
          localObject2 = ((AFc1gSDK)localObject1).AFInAppEventType("Location");
          localObject1 = getLevel;
          if ((localObject1 != null) && (localObject2 != null))
          {
            AFInAppEventType = ((String)localObject2);
            localObject2 = (Context)AFKeystoreWrapper.get();
            if (localObject2 != null) {
              try
              {
                if (AFInAppEventType != null)
                {
                  Intent localIntent = new android/content/Intent;
                  localIntent.<init>("android.intent.action.VIEW", Uri.parse(AFInAppEventType));
                  ((Context)localObject2).startActivity(localIntent.setFlags(268435456));
                }
              }
              catch (Exception localException)
              {
                AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(localException)), localException);
              }
            }
          }
        }
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder("Cross promotion impressions success: ");
        localStringBuilder.append(afInfoLog);
        AFLogger.afInfoLog(localStringBuilder.toString(), false);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1sSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */