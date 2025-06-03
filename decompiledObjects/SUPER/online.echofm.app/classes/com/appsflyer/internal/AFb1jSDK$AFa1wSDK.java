package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AFb1jSDK$AFa1wSDK
  extends TimerTask
{
  public AFb1jSDK$AFa1wSDK(AFb1jSDK paramAFb1jSDK, Context paramContext) {}
  
  public final void run()
  {
    if ((AFb1jSDK.values(AFInAppEventType)) && (AFb1jSDK.AFInAppEventParameterName(AFInAppEventType)))
    {
      Object localObject = AFInAppEventType;
      AFKeystoreWrapper = false;
      try
      {
        localObject = AFInAppEventParameterName;
        Context localContext = AFKeystoreWrapper;
        Intrinsics.checkNotNullExpressionValue(localContext, "");
        ((AFb1iSDK.AFa1wSDK)localObject).AFInAppEventType(localContext);
        return;
      }
      catch (Exception localException)
      {
        AFLogger.afErrorLog("Listener threw exception! ", localException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1jSDK.AFa1wSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */