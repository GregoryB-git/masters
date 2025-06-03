package F0;

import d0.i;
import d0.v;
import g0.M;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class j
  implements s
{
  public final byte[] a;
  public final i b;
  public final long c;
  public long d;
  public byte[] e;
  public int f;
  public int g;
  
  static
  {
    v.a("media3.extractor");
  }
  
  public j(i parami, long paramLong1, long paramLong2)
  {
    b = parami;
    d = paramLong1;
    c = paramLong2;
    e = new byte[65536];
    a = new byte['က'];
  }
  
  public long a()
  {
    return c;
  }
  
  public int b(int paramInt)
  {
    int i = u(paramInt);
    int j = i;
    if (i == 0)
    {
      byte[] arrayOfByte = a;
      j = t(arrayOfByte, 0, Math.min(paramInt, arrayOfByte.length), 0, true);
    }
    q(j);
    return j;
  }
  
  public boolean d(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    for (int i = s(paramArrayOfByte, paramInt1, paramInt2); (i < paramInt2) && (i != -1); i = t(paramArrayOfByte, paramInt1, paramInt2, i, paramBoolean)) {}
    q(i);
    if (i != -1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public int f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    r(paramInt2);
    int i = g;
    int j = f;
    i -= j;
    if (i == 0)
    {
      paramInt2 = t(e, j, paramInt2, 0, true);
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
  
  public void h()
  {
    f = 0;
  }
  
  public void i(int paramInt)
  {
    v(paramInt, false);
  }
  
  public boolean j(int paramInt, boolean paramBoolean)
  {
    r(paramInt);
    int i = g - f;
    while (i < paramInt)
    {
      i = t(e, f, paramInt, i, paramBoolean);
      if (i == -1) {
        return false;
      }
      g = (f + i);
    }
    f += paramInt;
    return true;
  }
  
  public boolean l(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (!j(paramInt2, paramBoolean)) {
      return false;
    }
    System.arraycopy(e, f - paramInt2, paramArrayOfByte, paramInt1, paramInt2);
    return true;
  }
  
  public long m()
  {
    return d + f;
  }
  
  public void n(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    l(paramArrayOfByte, paramInt1, paramInt2, false);
  }
  
  public void o(int paramInt)
  {
    j(paramInt, false);
  }
  
  public long p()
  {
    return d;
  }
  
  public final void q(int paramInt)
  {
    if (paramInt != -1) {
      d += paramInt;
    }
  }
  
  public final void r(int paramInt)
  {
    paramInt = f + paramInt;
    byte[] arrayOfByte = e;
    if (paramInt > arrayOfByte.length)
    {
      paramInt = M.p(arrayOfByte.length * 2, 65536 + paramInt, paramInt + 524288);
      e = Arrays.copyOf(e, paramInt);
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = s(paramArrayOfByte, paramInt1, paramInt2);
    int j = i;
    if (i == 0) {
      j = t(paramArrayOfByte, paramInt1, paramInt2, 0, true);
    }
    q(j);
    return j;
  }
  
  public void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    d(paramArrayOfByte, paramInt1, paramInt2, false);
  }
  
  public final int s(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = g;
    if (i == 0) {
      return 0;
    }
    paramInt2 = Math.min(i, paramInt2);
    System.arraycopy(e, 0, paramArrayOfByte, paramInt1, paramInt2);
    w(paramInt2);
    return paramInt2;
  }
  
  public final int t(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
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
  
  public final int u(int paramInt)
  {
    paramInt = Math.min(g, paramInt);
    w(paramInt);
    return paramInt;
  }
  
  public boolean v(int paramInt, boolean paramBoolean)
  {
    int j;
    for (int i = u(paramInt); (i < paramInt) && (i != -1); i = t(a, -i, j, i, paramBoolean)) {
      j = Math.min(paramInt, a.length + i);
    }
    q(i);
    if (i != -1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public final void w(int paramInt)
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
}

/* Location:
 * Qualified Name:     F0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */