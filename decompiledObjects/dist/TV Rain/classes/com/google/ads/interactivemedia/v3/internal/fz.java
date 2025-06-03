package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public class fz
{
  private final byte[] a;
  private final tt b;
  private final long c;
  private long d;
  private byte[] e;
  private int f;
  private int g;
  
  public fz(tt paramtt, long paramLong1, long paramLong2)
  {
    b = paramtt;
    d = paramLong1;
    c = paramLong2;
    e = new byte[65536];
    a = new byte['က'];
  }
  
  private int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws InterruptedException, IOException
  {
    if (!Thread.interrupted())
    {
      paramInt1 = b.a(paramArrayOfByte, paramInt1 + paramInt3, paramInt2 - paramInt3);
      if (paramInt1 == -1)
      {
        if ((paramInt3 == 0) && (paramBoolean)) {
          return -1;
        }
        throw new EOFException();
      }
      return paramInt3 + paramInt1;
    }
    throw new InterruptedException();
  }
  
  private int d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = g;
    if (i == 0) {
      return 0;
    }
    paramInt2 = Math.min(i, paramInt2);
    System.arraycopy(e, 0, paramArrayOfByte, paramInt1, paramInt2);
    f(paramInt2);
    return paramInt2;
  }
  
  private void d(int paramInt)
  {
    paramInt = f + paramInt;
    byte[] arrayOfByte = e;
    if (paramInt > arrayOfByte.length)
    {
      paramInt = wl.a(arrayOfByte.length << 1, 65536 + paramInt, paramInt + 524288);
      e = Arrays.copyOf(e, paramInt);
    }
  }
  
  private int e(int paramInt)
  {
    paramInt = Math.min(g, paramInt);
    f(paramInt);
    return paramInt;
  }
  
  private void f(int paramInt)
  {
    int i = g - paramInt;
    g = i;
    f = 0;
    byte[] arrayOfByte1 = e;
    byte[] arrayOfByte2;
    if (i < arrayOfByte1.length - 524288) {
      arrayOfByte2 = new byte[65536 + i];
    } else {
      arrayOfByte2 = arrayOfByte1;
    }
    System.arraycopy(arrayOfByte1, paramInt, arrayOfByte2, 0, i);
    e = arrayOfByte2;
  }
  
  private void g(int paramInt)
  {
    if (paramInt != -1) {
      d += paramInt;
    }
  }
  
  public int a(int paramInt)
    throws IOException, InterruptedException
  {
    int i = e(paramInt);
    int j = i;
    if (i == 0)
    {
      byte[] arrayOfByte = a;
      j = a(arrayOfByte, 0, Math.min(paramInt, arrayOfByte.length), 0, true);
    }
    g(j);
    return j;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException, InterruptedException
  {
    int i = d(paramArrayOfByte, paramInt1, paramInt2);
    int j = i;
    if (i == 0) {
      j = a(paramArrayOfByte, paramInt1, paramInt2, 0, true);
    }
    g(j);
    return j;
  }
  
  public void a()
  {
    f = 0;
  }
  
  public boolean a(int paramInt, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    d(paramInt);
    int i = g - f;
    while (i < paramInt)
    {
      i = a(e, f, paramInt, i, paramBoolean);
      if (i == -1) {
        return false;
      }
      g = (f + i);
    }
    f += paramInt;
    return true;
  }
  
  public boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    for (int i = d(paramArrayOfByte, paramInt1, paramInt2); (i < paramInt2) && (i != -1); i = a(paramArrayOfByte, paramInt1, paramInt2, i, paramBoolean)) {}
    g(i);
    return i != -1;
  }
  
  public long b()
  {
    return d + f;
  }
  
  public void b(int paramInt)
    throws IOException, InterruptedException
  {
    b(paramInt, false);
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException, InterruptedException
  {
    a(paramArrayOfByte, paramInt1, paramInt2, false);
  }
  
  public boolean b(int paramInt, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    int j;
    for (int i = e(paramInt); (i < paramInt) && (i != -1); i = a(a, -i, j, i, false)) {
      j = Math.min(paramInt, a.length + i);
    }
    g(i);
    return i != -1;
  }
  
  public boolean b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    if (!a(paramInt2, paramBoolean)) {
      return false;
    }
    System.arraycopy(e, f - paramInt2, paramArrayOfByte, paramInt1, paramInt2);
    return true;
  }
  
  public long c()
  {
    return d;
  }
  
  public void c(int paramInt)
    throws IOException, InterruptedException
  {
    a(paramInt, false);
  }
  
  public void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException, InterruptedException
  {
    b(paramArrayOfByte, paramInt1, paramInt2, false);
  }
  
  public long d()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.fz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */