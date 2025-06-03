package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

public final class gl
{
  public final int a;
  public final byte[] b;
  public final int c;
  public final int d;
  
  public gl(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    a = paramInt1;
    b = paramArrayOfByte;
    c = paramInt2;
    d = paramInt3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (gl.class == paramObject.getClass()))
    {
      paramObject = (gl)paramObject;
      if ((a == a) && (c == c) && (d == d) && (Arrays.equals(b, b))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    return ((Arrays.hashCode(b) + i * 31) * 31 + c) * 31 + d;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */