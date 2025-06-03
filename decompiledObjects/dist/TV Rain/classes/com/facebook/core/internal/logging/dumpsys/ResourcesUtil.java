package com.facebook.core.internal.logging.dumpsys;

import a;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import androidx.annotation.Nullable;
import z2;

class ResourcesUtil
{
  private static String getFallbackIdString(int paramInt)
  {
    StringBuilder localStringBuilder = z2.t("#");
    localStringBuilder.append(Integer.toHexString(paramInt));
    return localStringBuilder.toString();
  }
  
  public static String getIdString(@Nullable Resources paramResources, int paramInt)
    throws Resources.NotFoundException
  {
    if (paramResources == null) {
      return getFallbackIdString(paramInt);
    }
    int i = getResourcePackageId(paramInt);
    String str1 = "";
    String str2;
    if (i != 127)
    {
      str1 = paramResources.getResourcePackageName(paramInt);
      str2 = ":";
    }
    else
    {
      str2 = "";
    }
    String str3 = paramResources.getResourceTypeName(paramInt);
    paramResources = paramResources.getResourceEntryName(paramInt);
    i = str1.length();
    paramInt = str2.length();
    int j = str3.length();
    StringBuilder localStringBuilder = new StringBuilder(paramResources.length() + (j + (paramInt + (i + 1)) + 1));
    a.C(localStringBuilder, "@", str1, str2, str3);
    return z2.s(localStringBuilder, "/", paramResources);
  }
  
  public static String getIdStringQuietly(Object paramObject, @Nullable Resources paramResources, int paramInt)
  {
    try
    {
      paramObject = getIdString(paramResources, paramInt);
      return (String)paramObject;
    }
    catch (Resources.NotFoundException paramObject) {}
    return getFallbackIdString(paramInt);
  }
  
  private static int getResourcePackageId(int paramInt)
  {
    return paramInt >>> 24 & 0xFF;
  }
}

/* Location:
 * Qualified Name:     com.facebook.core.internal.logging.dumpsys.ResourcesUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */