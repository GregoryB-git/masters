package com.appsflyer.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public enum AFc1aSDK
{
  @NotNull
  public final String valueOf;
  
  static
  {
    AFc1aSDK localAFc1aSDK1 = new AFc1aSDK("API", 0, "api");
    AFInAppEventType = localAFc1aSDK1;
    AFc1aSDK localAFc1aSDK2 = new AFc1aSDK("RC", 1, "rc");
    values = localAFc1aSDK2;
    AFc1aSDK localAFc1aSDK3 = new AFc1aSDK("DEFAULT", 2, "");
    AFKeystoreWrapper = localAFc1aSDK3;
    AFInAppEventParameterName = new AFc1aSDK[] { localAFc1aSDK1, localAFc1aSDK2, localAFc1aSDK3 };
  }
  
  private AFc1aSDK(String paramString)
  {
    valueOf = paramString;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1aSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */