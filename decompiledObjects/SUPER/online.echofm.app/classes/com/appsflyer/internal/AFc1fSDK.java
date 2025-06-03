package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFc1fSDK
{
  @NotNull
  final String AFInAppEventParameterName;
  @NotNull
  final String valueOf;
  
  public AFc1fSDK(@NotNull String paramString1, @NotNull String paramString2)
  {
    AFInAppEventParameterName = paramString1;
    valueOf = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof AFc1fSDK)) {
      return false;
    }
    paramObject = (AFc1fSDK)paramObject;
    if (!Intrinsics.a(AFInAppEventParameterName, AFInAppEventParameterName)) {
      return false;
    }
    return Intrinsics.a(valueOf, valueOf);
  }
  
  public final int hashCode()
  {
    return AFInAppEventParameterName.hashCode() * 31 + valueOf.hashCode();
  }
  
  @NotNull
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("HostConfig(prefix=");
    localStringBuilder.append(AFInAppEventParameterName);
    localStringBuilder.append(", host=");
    localStringBuilder.append(valueOf);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1fSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */