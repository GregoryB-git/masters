package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;

public final class bt
{
  private static final HashSet<String> a = new HashSet();
  private static String b = "goog.exo.core";
  
  public static String a()
  {
    try
    {
      String str = b;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void a(String paramString)
  {
    try
    {
      if (a.add(paramString))
      {
        String str = b;
        int i = String.valueOf(str).length();
        int j = String.valueOf(paramString).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 2 + j);
        localStringBuilder.append(str);
        localStringBuilder.append(", ");
        localStringBuilder.append(paramString);
        b = localStringBuilder.toString();
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.bt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */