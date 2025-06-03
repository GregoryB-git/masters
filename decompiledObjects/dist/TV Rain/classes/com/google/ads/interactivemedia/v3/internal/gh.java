package com.google.ads.interactivemedia.v3.internal;

import a;

public final class gh
{
  public final gj a;
  public final gj b;
  
  public gh(gj paramgj)
  {
    this(paramgj, paramgj);
  }
  
  public gh(gj paramgj1, gj paramgj2)
  {
    a = ((gj)rp.a(paramgj1));
    b = ((gj)rp.a(paramgj2));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (gh.class == paramObject.getClass()))
    {
      paramObject = (gh)paramObject;
      if ((a.equals(a)) && (b.equals(b))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return b.hashCode() + i * 31;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(a);
    String str2;
    if (a.equals(b))
    {
      str2 = "";
    }
    else
    {
      str2 = String.valueOf(b);
      localStringBuilder = new StringBuilder(str2.length() + 2);
      localStringBuilder.append(", ");
      localStringBuilder.append(str2);
      str2 = localStringBuilder.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder(a.b(str2, str1.length() + 2));
    localStringBuilder.append("[");
    localStringBuilder.append(str1);
    localStringBuilder.append(str2);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */