package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Arrays;

public final class oj
{
  public final int a;
  public final int[] b;
  public final long[] c;
  private final Uri[] d;
  
  public oj()
  {
    this(-1, new int[0], new Uri[0], new long[0]);
  }
  
  private oj(int paramInt, int[] paramArrayOfInt, Uri[] paramArrayOfUri, long[] paramArrayOfLong)
  {
    boolean bool;
    if (paramArrayOfInt.length == paramArrayOfUri.length) {
      bool = true;
    } else {
      bool = false;
    }
    rp.b(bool);
    a = -1;
    b = paramArrayOfInt;
    d = paramArrayOfUri;
    c = paramArrayOfLong;
  }
  
  public final int a(int paramInt)
  {
    
    for (;;)
    {
      int[] arrayOfInt = b;
      if (paramInt >= arrayOfInt.length) {
        break;
      }
      int i = arrayOfInt[paramInt];
      if ((i == 0) || (i == 1)) {
        break;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  public final boolean a()
  {
    return (a == -1) || (a(-1) < a);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (oj.class == paramObject.getClass()))
    {
      paramObject = (oj)paramObject;
      if ((a == a) && (Arrays.equals(d, d)) && (Arrays.equals(b, b)) && (Arrays.equals(c, c))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    int j = Arrays.hashCode(d);
    int k = Arrays.hashCode(b);
    return Arrays.hashCode(c) + (k + (i * 31 + j) * 31) * 31;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.oj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */