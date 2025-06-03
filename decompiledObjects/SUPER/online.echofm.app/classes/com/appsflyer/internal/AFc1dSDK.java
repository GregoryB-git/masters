package com.appsflyer.internal;

import V5.h;
import V5.i;
import W5.m;
import g6.a;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFc1dSDK
{
  @NotNull
  public static String AFInAppEventParameterName = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
  @NotNull
  public static String AFKeystoreWrapper = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
  @NotNull
  private static final List<String> afDebugLog = m.i(new String[] { "googleplay", "playstore", "googleplaystore" });
  private static AFc1fSDK afErrorLog;
  @NotNull
  public static final AFa1zSDK values = new AFa1zSDK((byte)0);
  @NotNull
  public final h AFInAppEventType;
  @NotNull
  private final AFb1dSDK AFLogger;
  @NotNull
  private final h afRDLog;
  @NotNull
  private final AFb1gSDK valueOf;
  
  public AFc1dSDK(@NotNull AFb1gSDK paramAFb1gSDK, @NotNull AFb1dSDK paramAFb1dSDK)
  {
    valueOf = paramAFb1gSDK;
    AFLogger = paramAFb1dSDK;
    afRDLog = i.a(new AFa1xSDK(this));
    AFInAppEventType = i.a(new AFa1wSDK(this));
  }
  
  public static boolean AFInAppEventType()
  {
    return afErrorLog == null;
  }
  
  public static final void valueOf(AFc1fSDK paramAFc1fSDK)
  {
    afErrorLog = paramAFc1fSDK;
  }
  
  @NotNull
  public final String AFInAppEventParameterName()
  {
    Object localObject;
    if (AFInAppEventType()) {
      localObject = AFc1aSDK.AFKeystoreWrapper;
    } else {
      localObject = AFc1aSDK.AFInAppEventType;
    }
    int i = AFa1vSDK.values[localObject.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return "";
        }
        throw new V5.l();
      }
      localObject = afErrorLog;
      if (localObject != null) {
        localObject = valueOf;
      } else {
        localObject = null;
      }
      if (localObject == null) {
        return "";
      }
      return (String)localObject;
    }
    return "appsflyersdk.com";
  }
  
  @NotNull
  public final String valueOf()
  {
    Object localObject;
    if (AFInAppEventType()) {
      localObject = AFc1aSDK.AFKeystoreWrapper;
    } else {
      localObject = AFc1aSDK.AFInAppEventType;
    }
    int i = AFa1vSDK.values[localObject.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return "";
        }
        throw new V5.l();
      }
      localObject = afErrorLog;
      if (localObject != null) {
        localObject = AFInAppEventParameterName;
      } else {
        localObject = null;
      }
      if (localObject == null) {
        return "";
      }
      return (String)localObject;
    }
    return (String)AFInAppEventType.getValue();
  }
  
  @Metadata
  public static final class AFa1wSDK
    extends kotlin.jvm.internal.l
    implements a
  {
    public AFa1wSDK(AFc1dSDK paramAFc1dSDK)
    {
      super();
    }
  }
  
  @Metadata
  public static final class AFa1xSDK
    extends kotlin.jvm.internal.l
    implements a
  {
    public AFa1xSDK(AFc1dSDK paramAFc1dSDK)
    {
      super();
    }
  }
  
  @Metadata
  public static final class AFa1zSDK {}
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1dSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */