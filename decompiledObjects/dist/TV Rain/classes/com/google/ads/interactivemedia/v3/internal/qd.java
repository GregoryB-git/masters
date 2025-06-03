package com.google.ads.interactivemedia.v3.internal;

import a;
import android.net.Uri;

public final class qd
{
  public final long a;
  public final long b;
  private final String c;
  private int d;
  
  public qd(String paramString, long paramLong1, long paramLong2)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    c = str;
    a = paramLong1;
    b = paramLong2;
  }
  
  private final String b(String paramString)
  {
    return rp.b(paramString, c);
  }
  
  public final Uri a(String paramString)
  {
    return rp.a(paramString, c);
  }
  
  public final qd a(qd paramqd, String paramString)
  {
    String str = b(paramString);
    if ((paramqd != null) && (str.equals(paramqd.b(paramString))))
    {
      long l1 = b;
      long l2 = -1L;
      long l3;
      if (l1 != -1L)
      {
        l3 = a;
        if (l3 + l1 == a)
        {
          l4 = b;
          if (l4 != -1L) {
            l2 = l1 + l4;
          }
          return new qd(str, l3, l2);
        }
      }
      long l4 = b;
      if (l4 != -1L)
      {
        l3 = a;
        if (l3 + l4 == a)
        {
          if (l1 != -1L) {
            l2 = l4 + l1;
          }
          return new qd(str, l3, l2);
        }
      }
    }
    return null;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (qd.class == paramObject.getClass()))
    {
      paramObject = (qd)paramObject;
      if ((a == a) && (b == b) && (c.equals(c))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (d == 0)
    {
      int i = (int)a;
      int j = (int)b;
      d = (c.hashCode() + ((i + 527) * 31 + j) * 31);
    }
    return d;
  }
  
  public final String toString()
  {
    String str = c;
    long l1 = a;
    long l2 = b;
    StringBuilder localStringBuilder = new StringBuilder(a.b(str, 81));
    localStringBuilder.append("RangedUri(referenceUri=");
    localStringBuilder.append(str);
    localStringBuilder.append(", start=");
    localStringBuilder.append(l1);
    localStringBuilder.append(", length=");
    localStringBuilder.append(l2);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */