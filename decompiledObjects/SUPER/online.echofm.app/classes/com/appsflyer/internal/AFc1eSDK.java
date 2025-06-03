package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFc1eSDK
{
  @NotNull
  public final String AFInAppEventType;
  @NotNull
  public final AFc1aSDK valueOf;
  public final String values;
  
  public AFc1eSDK(@NotNull String paramString1, String paramString2, @NotNull AFc1aSDK paramAFc1aSDK)
  {
    AFInAppEventType = paramString1;
    values = paramString2;
    valueOf = paramAFc1aSDK;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof AFc1eSDK)) {
      return false;
    }
    paramObject = (AFc1eSDK)paramObject;
    if (!Intrinsics.a(AFInAppEventType, AFInAppEventType)) {
      return false;
    }
    if (!Intrinsics.a(values, values)) {
      return false;
    }
    return valueOf == valueOf;
  }
  
  public final int hashCode()
  {
    int i = AFInAppEventType.hashCode();
    String str = values;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    return (i * 31 + j) * 31 + valueOf.hashCode();
  }
  
  @NotNull
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("HostMeta(name=");
    localStringBuilder.append(AFInAppEventType);
    localStringBuilder.append(", prefix=");
    localStringBuilder.append(values);
    localStringBuilder.append(", method=");
    localStringBuilder.append(valueOf);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1eSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */