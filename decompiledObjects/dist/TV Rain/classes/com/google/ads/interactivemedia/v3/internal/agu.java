package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

class agu
{
  private aiy a;
  private byte[] b;
  private final int c = 239;
  
  public agu(int paramInt)
  {
    a();
  }
  
  public void a()
  {
    byte[] arrayOfByte = new byte[c];
    b = arrayOfByte;
    a = aiy.a(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public void a(int paramInt, long paramLong)
    throws IOException
  {
    aiy localaiy = a;
    localaiy.a(paramInt, 0);
    for (;;)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        localaiy.a((byte)(int)paramLong);
        return;
      }
      localaiy.a((byte)((int)paramLong & 0x7F | 0x80));
      paramLong >>>= 7;
    }
  }
  
  public void a(int paramInt, String paramString)
    throws IOException
  {
    aiy localaiy = a;
    localaiy.a(paramInt, 2);
    localaiy.a(paramString);
  }
  
  public byte[] b()
    throws IOException
  {
    int i = a.a();
    if (i >= 0)
    {
      if (i == 0) {
        return b;
      }
      byte[] arrayOfByte1 = b;
      i = arrayOfByte1.length - i;
      byte[] arrayOfByte2 = new byte[i];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
      return arrayOfByte2;
    }
    throw new IOException();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.agu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */