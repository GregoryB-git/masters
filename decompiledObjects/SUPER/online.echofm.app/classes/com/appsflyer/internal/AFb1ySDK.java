package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

public final class AFb1ySDK
{
  public AFe1qSDK AFInAppEventParameterName;
  public long AFInAppEventType;
  public final AFb1dSDK AFKeystoreWrapper;
  public long valueOf;
  
  public AFb1ySDK() {}
  
  public AFb1ySDK(AFb1dSDK paramAFb1dSDK)
  {
    AFKeystoreWrapper = paramAFb1dSDK;
    AFInAppEventParameterName = AFInAppEventType();
    valueOf = paramAFb1dSDK.valueOf("af_rc_timestamp", 0L);
    AFInAppEventType = paramAFb1dSDK.valueOf("af_rc_max_age", 0L);
  }
  
  private AFe1qSDK AFInAppEventType()
  {
    Object localObject = AFKeystoreWrapper.values("af_remote_config", null);
    if (localObject == null)
    {
      AFLogger.afDebugLog("CFG: No configuration found in cache");
      return null;
    }
    try
    {
      String str = new java/lang/String;
      str.<init>(Base64.decode((String)localObject, 2), Charset.defaultCharset());
      localObject = new AFe1qSDK(str);
      return (AFe1qSDK)localObject;
    }
    catch (Exception localException)
    {
      AFLogger.afErrorLog("CFG: Error reading malformed configuration from cache, requires fetching from remote again", localException, true);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1ySDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */