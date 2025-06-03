package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

final class qt
  extends ou
{
  private byte[] a;
  
  public qt(tt paramtt, tx paramtx, bw parambw, int paramInt, Object paramObject, byte[] paramArrayOfByte)
  {
    super(paramtt, paramtx, 3, parambw, paramInt, paramObject, paramArrayOfByte);
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt)
  {
    a = Arrays.copyOf(paramArrayOfByte, paramInt);
  }
  
  public final byte[] g()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */