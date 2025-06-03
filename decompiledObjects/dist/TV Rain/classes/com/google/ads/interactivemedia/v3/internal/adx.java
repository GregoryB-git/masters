package com.google.ads.interactivemedia.v3.internal;

import a;

final class adx
  extends adq
{
  private final int appVersion;
  private final String packageName;
  
  public adx(int paramInt, String paramString)
  {
    appVersion = paramInt;
    if (paramString != null)
    {
      packageName = paramString;
      return;
    }
    throw new NullPointerException("Null packageName");
  }
  
  public final int appVersion()
  {
    return appVersion;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof adq))
    {
      paramObject = (adq)paramObject;
      if ((appVersion == ((adq)paramObject).appVersion()) && (packageName.equals(((adq)paramObject).packageName()))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (appVersion ^ 0xF4243) * 1000003 ^ packageName.hashCode();
  }
  
  public final String packageName()
  {
    return packageName;
  }
  
  public final String toString()
  {
    int i = appVersion;
    String str = packageName;
    StringBuilder localStringBuilder = new StringBuilder(a.b(str, 51));
    localStringBuilder.append("MarketAppInfo{appVersion=");
    localStringBuilder.append(i);
    localStringBuilder.append(", packageName=");
    localStringBuilder.append(str);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.adx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */