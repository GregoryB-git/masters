package com.appsflyer.internal;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public abstract interface AFb1eSDK
{
  @NotNull
  public abstract AFa1ySDK AFInAppEventType(@NotNull Context paramContext);
  
  @Metadata
  public static final class AFa1ySDK
  {
    public final float AFInAppEventParameterName;
    public final String AFInAppEventType;
    
    public AFa1ySDK(float paramFloat, String paramString)
    {
      AFInAppEventParameterName = paramFloat;
      AFInAppEventType = paramString;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof AFa1ySDK)) {
        return false;
      }
      paramObject = (AFa1ySDK)paramObject;
      if (!Intrinsics.a(Float.valueOf(AFInAppEventParameterName), Float.valueOf(AFInAppEventParameterName))) {
        return false;
      }
      return Intrinsics.a(AFInAppEventType, AFInAppEventType);
    }
    
    public final int hashCode()
    {
      int i = Float.floatToIntBits(AFInAppEventParameterName);
      String str = AFInAppEventType;
      int j;
      if (str == null) {
        j = 0;
      } else {
        j = str.hashCode();
      }
      return i * 31 + j;
    }
    
    @NotNull
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("BatteryData(level=");
      localStringBuilder.append(AFInAppEventParameterName);
      localStringBuilder.append(", charging=");
      localStringBuilder.append(AFInAppEventType);
      localStringBuilder.append(')');
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1eSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */