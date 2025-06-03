package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

final class AFb1mSDK$3
  implements Observer
{
  public AFb1mSDK$3(AFb1mSDK paramAFb1mSDK, AFf1pSDK paramAFf1pSDK) {}
  
  public final void update(Observable paramObservable, Object paramObject)
  {
    paramObject = new StringBuilder("[DDL] ");
    ((StringBuilder)paramObject).append(AFInAppEventType.AFInAppEventParameterName.get("source"));
    ((StringBuilder)paramObject).append(" referrer collected via observer");
    AFLogger.afDebugLog(paramObject.toString());
    AFb1mSDK.AFInAppEventType(valueOf, (AFf1pSDK)paramObservable);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1mSDK.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */