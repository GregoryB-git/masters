package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

public final class td
{
  public final int a;
  private final sy[] b;
  private int c;
  
  public td(sy... paramVarArgs)
  {
    b = paramVarArgs;
    a = paramVarArgs.length;
  }
  
  public final sy a(int paramInt)
  {
    return b[paramInt];
  }
  
  public final sy[] a()
  {
    return (sy[])b.clone();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (td.class == paramObject.getClass()))
    {
      paramObject = (td)paramObject;
      return Arrays.equals(b, b);
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (c == 0) {
      c = (Arrays.hashCode(b) + 527);
    }
    return c;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.td
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */