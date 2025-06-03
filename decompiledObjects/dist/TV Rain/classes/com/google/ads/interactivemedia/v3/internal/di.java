package com.google.ads.interactivemedia.v3.internal;

import a;
import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(21)
public final class di
{
  private final int[] a;
  private final int b;
  
  static
  {
    new di(new int[] { 2 }, 8);
    new di(new int[] { 2, 5, 6 }, 8);
  }
  
  private di(int[] paramArrayOfInt, int paramInt)
  {
    paramArrayOfInt = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length);
    a = paramArrayOfInt;
    Arrays.sort(paramArrayOfInt);
    b = 8;
  }
  
  public final int a()
  {
    return b;
  }
  
  public final boolean a(int paramInt)
  {
    return Arrays.binarySearch(a, paramInt) >= 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof di)) {
      return false;
    }
    paramObject = (di)paramObject;
    return (Arrays.equals(a, a)) && (b == b);
  }
  
  public final int hashCode()
  {
    int i = b;
    return Arrays.hashCode(a) * 31 + i;
  }
  
  public final String toString()
  {
    int i = b;
    String str = Arrays.toString(a);
    StringBuilder localStringBuilder = new StringBuilder(a.b(str, 67));
    localStringBuilder.append("AudioCapabilities[maxChannelCount=");
    localStringBuilder.append(i);
    localStringBuilder.append(", supportedEncodings=");
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.di
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */