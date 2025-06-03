package c4;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import t5.h;
import v3.h0;
import v5.e0;

public final class e
  implements i
{
  public final byte[] a;
  public final h b;
  public final long c;
  public long d;
  public byte[] e;
  public int f;
  public int g;
  
  static
  {
    h0.a("goog.exo.extractor");
  }
  
  public e(h paramh, long paramLong1, long paramLong2)
  {
    b = paramh;
    d = paramLong1;
    c = paramLong2;
    e = new byte[65536];
    a = new byte['က'];
  }
  
  public final boolean b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = g;
    boolean bool = false;
    if (i == 0)
    {
      i = 0;
    }
    else
    {
      i = Math.min(i, paramInt2);
      System.arraycopy(e, 0, paramArrayOfByte, paramInt1, i);
      q(i);
    }
    while ((i < paramInt2) && (i != -1)) {
      i = p(paramArrayOfByte, paramInt1, paramInt2, i, paramBoolean);
    }
    if (i != -1) {
      d += i;
    }
    paramBoolean = bool;
    if (i != -1) {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public final boolean c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (!k(paramInt2, paramBoolean)) {
      return false;
    }
    System.arraycopy(e, f - paramInt2, paramArrayOfByte, paramInt1, paramInt2);
    return true;
  }
  
  public final long d()
  {
    return d + f;
  }
  
  public final void e(int paramInt)
  {
    k(paramInt, false);
  }
  
  public final int g(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    o(paramInt2);
    int i = g;
    int j = f;
    i -= j;
    if (i == 0)
    {
      paramInt2 = p(e, j, paramInt2, 0, true);
      if (paramInt2 == -1) {
        return -1;
      }
      g += paramInt2;
    }
    else
    {
      paramInt2 = Math.min(paramInt2, i);
    }
    System.arraycopy(e, f, paramArrayOfByte, paramInt1, paramInt2);
    f += paramInt2;
    return paramInt2;
  }
  
  public final long getLength()
  {
    return c;
  }
  
  public final long getPosition()
  {
    return d;
  }
  
  public final void i()
  {
    f = 0;
  }
  
  public final void j(int paramInt)
  {
    int i = Math.min(g, paramInt);
    q(i);
    while ((i < paramInt) && (i != -1))
    {
      int j = Math.min(paramInt, a.length + i);
      i = p(a, -i, j, i, false);
    }
    if (i != -1) {
      d += i;
    }
  }
  
  public final boolean k(int paramInt, boolean paramBoolean)
  {
    o(paramInt);
    int i = g - f;
    while (i < paramInt)
    {
      i = p(e, f, paramInt, i, paramBoolean);
      if (i == -1) {
        return false;
      }
      g = (f + i);
    }
    f += paramInt;
    return true;
  }
  
  public final void m(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    c(paramArrayOfByte, paramInt1, paramInt2, false);
  }
  
  public final int n()
  {
    int i = Math.min(g, 1);
    q(i);
    int j = i;
    if (i == 0)
    {
      byte[] arrayOfByte = a;
      j = p(arrayOfByte, 0, Math.min(1, arrayOfByte.length), 0, true);
    }
    if (j != -1) {
      d += j;
    }
    return j;
  }
  
  public final void o(int paramInt)
  {
    paramInt = f + paramInt;
    byte[] arrayOfByte = e;
    if (paramInt > arrayOfByte.length)
    {
      paramInt = e0.i(arrayOfByte.length * 2, 65536 + paramInt, paramInt + 524288);
      e = Arrays.copyOf(e, paramInt);
    }
  }
  
  public final int p(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (!Thread.interrupted())
    {
      paramInt1 = b.read(paramArrayOfByte, paramInt1 + paramInt3, paramInt2 - paramInt3);
      if (paramInt1 == -1)
      {
        if ((paramInt3 == 0) && (paramBoolean)) {
          return -1;
        }
        throw new EOFException();
      }
      return paramInt3 + paramInt1;
    }
    throw new InterruptedIOException();
  }
  
  public final void q(int paramInt)
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
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = g;
    int j = 0;
    if (i != 0)
    {
      j = Math.min(i, paramInt2);
      System.arraycopy(e, 0, paramArrayOfByte, paramInt1, j);
      q(j);
    }
    i = j;
    if (j == 0) {
      i = p(paramArrayOfByte, paramInt1, paramInt2, 0, true);
    }
    if (i != -1) {
      d += i;
    }
    return i;
  }
  
  public final void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    b(paramArrayOfByte, paramInt1, paramInt2, false);
  }
}

/* Location:
 * Qualified Name:     c4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */