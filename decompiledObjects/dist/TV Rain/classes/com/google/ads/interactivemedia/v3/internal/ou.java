package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Arrays;

public abstract class ou
  extends ok
{
  private byte[] a;
  private volatile boolean b;
  
  public ou(tt paramtt, tx paramtx, int paramInt1, bw parambw, int paramInt2, Object paramObject, byte[] paramArrayOfByte)
  {
    super(paramtt, paramtx, 3, parambw, paramInt2, paramObject, -9223372036854775807L, -9223372036854775807L);
    a = paramArrayOfByte;
  }
  
  public final void a()
  {
    b = true;
  }
  
  public abstract void a(byte[] paramArrayOfByte, int paramInt)
    throws IOException;
  
  public final void b()
    throws IOException, InterruptedException
  {
    try
    {
      this.j.a(c);
      int i = 0;
      int j = 0;
      while ((i != -1) && (!b))
      {
        byte[] arrayOfByte = a;
        if (arrayOfByte == null) {
          a = new byte['䀀'];
        } else if (arrayOfByte.length < j + 16384) {
          a = Arrays.copyOf(arrayOfByte, arrayOfByte.length + 16384);
        }
        int k = this.j.a(a, j, 16384);
        i = k;
        if (k != -1)
        {
          j += k;
          i = k;
        }
      }
      if (!b) {
        a(a, j);
      }
      return;
    }
    finally
    {
      wl.a(this.j);
    }
  }
  
  public final byte[] c()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ou
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */