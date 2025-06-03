package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InputStream;

public final class tu
  extends InputStream
{
  private final tt a;
  private final tx b;
  private final byte[] c;
  private boolean d = false;
  private boolean e = false;
  private long f;
  
  public tu(tt paramtt, tx paramtx)
  {
    a = paramtt;
    b = paramtx;
    c = new byte[1];
  }
  
  private final void b()
    throws IOException
  {
    if (!d)
    {
      a.a(b);
      d = true;
    }
  }
  
  public final void a()
    throws IOException
  {
    b();
  }
  
  public final void close()
    throws IOException
  {
    if (!e)
    {
      a.c();
      e = true;
    }
  }
  
  public final int read()
    throws IOException
  {
    if (read(c) == -1) {
      return -1;
    }
    return c[0] & 0xFF;
  }
  
  public final int read(byte[] paramArrayOfByte)
    throws IOException
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    rp.c(e ^ true);
    b();
    paramInt1 = a.a(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 == -1) {
      return -1;
    }
    f += paramInt1;
    return paramInt1;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.tu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */