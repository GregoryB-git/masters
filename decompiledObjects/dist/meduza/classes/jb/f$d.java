package jb;

import c4.x;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import xc.g;
import xc.r;
import xc.w;

public final class f$d
  implements c
{
  public final g a;
  public final boolean b;
  public final xc.f c;
  public final e.b d;
  public int e;
  public boolean f;
  
  public f$d(r paramr)
  {
    a = paramr;
    b = true;
    paramr = new xc.f();
    c = paramr;
    d = new e.b(paramr);
    e = 16384;
  }
  
  public final void A(boolean paramBoolean, int paramInt, List paramList)
  {
    try
    {
      if (!f)
      {
        g(paramInt, paramList, paramBoolean);
        return;
      }
      paramList = new java/io/IOException;
      paramList.<init>("closed");
      throw paramList;
    }
    finally {}
  }
  
  public final void L(x paramx)
  {
    try
    {
      if (!f)
      {
        int i = e;
        if ((a & 0x20) != 0) {
          i = ((int[])d)[5];
        }
        e = i;
        f(0, 0, (byte)4, (byte)1);
        a.flush();
        return;
      }
      paramx = new java/io/IOException;
      paramx.<init>("closed");
      throw paramx;
    }
    finally {}
  }
  
  public final void R(int paramInt, a parama)
  {
    try
    {
      if (!f)
      {
        if (a != -1)
        {
          f(paramInt, 4, (byte)3, (byte)0);
          a.writeInt(a);
          a.flush();
          return;
        }
        parama = new java/lang/IllegalArgumentException;
        parama.<init>();
        throw parama;
      }
      parama = new java/io/IOException;
      parama.<init>("closed");
      throw parama;
    }
    finally {}
  }
  
  public final void a0(x paramx)
  {
    try
    {
      if (!f)
      {
        int i = Integer.bitCount(a);
        int j = 0;
        f(0, i * 6, (byte)4, (byte)0);
        while (j < 10)
        {
          if (paramx.a(j))
          {
            if (j == 4) {
              i = 3;
            } else if (j == 7) {
              i = 4;
            } else {
              i = j;
            }
            a.writeShort(i);
            a.writeInt(((int[])d)[j]);
          }
          j++;
        }
        a.flush();
        return;
      }
      paramx = new java/io/IOException;
      paramx.<init>("closed");
      throw paramx;
    }
    finally {}
  }
  
  public final void close()
  {
    try
    {
      f = true;
      a.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void d(int paramInt, long paramLong)
  {
    try
    {
      if (!f)
      {
        if ((paramLong != 0L) && (paramLong <= 2147483647L))
        {
          f(paramInt, 4, (byte)8, (byte)0);
          a.writeInt((int)paramLong);
          a.flush();
          return;
        }
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>(String.format(Locale.US, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] { Long.valueOf(paramLong) }));
        throw ((Throwable)localObject1);
      }
      Object localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("closed");
      throw ((Throwable)localObject1);
    }
    finally {}
  }
  
  public final void e(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      if (!f)
      {
        byte b1;
        byte b2;
        if (paramBoolean)
        {
          b1 = 1;
          b2 = b1;
        }
        else
        {
          b1 = 0;
          b2 = b1;
        }
        f(0, 8, (byte)6, b2);
        a.writeInt(paramInt1);
        a.writeInt(paramInt2);
        a.flush();
        return;
      }
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("closed");
      throw localIOException;
    }
    finally {}
  }
  
  public final void f(int paramInt1, int paramInt2, byte paramByte1, byte paramByte2)
  {
    Object localObject = f.a;
    if (((Logger)localObject).isLoggable(Level.FINE)) {
      ((Logger)localObject).fine(f.b.a(false, paramInt1, paramInt2, paramByte1, paramByte2));
    }
    int i = e;
    if (paramInt2 <= i)
    {
      if ((0x80000000 & paramInt1) == 0)
      {
        localObject = a;
        ((g)localObject).writeByte(paramInt2 >>> 16 & 0xFF);
        ((g)localObject).writeByte(paramInt2 >>> 8 & 0xFF);
        ((g)localObject).writeByte(paramInt2 & 0xFF);
        a.writeByte(paramByte1 & 0xFF);
        a.writeByte(paramByte2 & 0xFF);
        a.writeInt(paramInt1 & 0x7FFFFFFF);
        return;
      }
      throw new IllegalArgumentException(String.format(Locale.US, "reserved bit set: %s", new Object[] { Integer.valueOf(paramInt1) }));
    }
    throw new IllegalArgumentException(String.format(Locale.US, "FRAME_SIZE_ERROR length > %d: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) }));
  }
  
  public final void flush()
  {
    try
    {
      if (!f)
      {
        a.flush();
        return;
      }
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("closed");
      throw localIOException;
    }
    finally {}
  }
  
  public final void g(int paramInt, List paramList, boolean paramBoolean)
  {
    if (!f)
    {
      e.b localb = d;
      localb.getClass();
      int i = paramList.size();
      int m;
      for (int j = 0; j < i; j++)
      {
        d locald = (d)paramList.get(j);
        Object localObject1 = a.r();
        Object localObject2 = b;
        Object localObject3 = (Integer)e.c.get(localObject1);
        if (localObject3 != null)
        {
          k = ((Integer)localObject3).intValue() + 1;
          if ((k >= 2) && (k <= 7))
          {
            localObject3 = e.b;
            if (1b.equals(localObject2)) {
              break label169;
            }
            if (b.equals(localObject2))
            {
              m = k + 1;
              break label173;
            }
          }
          m = -1;
          break label173;
        }
        else
        {
          k = -1;
        }
        label169:
        m = k;
        label173:
        int n = k;
        int i1 = m;
        int i2;
        if (m == -1) {
          for (n = d;; n = i2)
          {
            i2 = n + 1;
            localObject3 = b;
            n = k;
            i1 = m;
            if (i2 >= localObject3.length) {
              break;
            }
            n = k;
            if (a.equals(localObject1))
            {
              if (b[i2].b.equals(localObject2))
              {
                m = d;
                i1 = e.b.length + (i2 - m);
                n = k;
                break;
              }
              n = k;
              if (k == -1) {
                n = i2 - d + e.b.length;
              }
            }
            k = n;
          }
        }
        if (i1 != -1)
        {
          localb.a(i1, 127, 128);
        }
        else
        {
          if (n == -1)
          {
            a.B0(64);
            localb.a(((xc.i)localObject1).i(), 127, 0);
            a.z0((xc.i)localObject1);
          }
          else
          {
            localObject3 = e.a;
            localObject1.getClass();
            ec.i.e(localObject3, "prefix");
            if ((((xc.i)localObject1).q((xc.i)localObject3, a.length)) && (!d.h.equals(localObject1)))
            {
              localb.a(n, 15, 0);
              localb.a(((xc.i)localObject2).i(), 127, 0);
              a.z0((xc.i)localObject2);
              continue;
            }
            localb.a(n, 63, 64);
          }
          localb.a(((xc.i)localObject2).i(), 127, 0);
          a.z0((xc.i)localObject2);
          i1 = c;
          if (i1 > 4096)
          {
            Arrays.fill(b, null);
            d = (b.length - 1);
            c = 0;
            e = 0;
          }
          else
          {
            n = e + i1 - 4096;
            if (n > 0)
            {
              k = b.length - 1;
              m = 0;
              for (;;)
              {
                i2 = d;
                if ((k < i2) || (n <= 0)) {
                  break;
                }
                i2 = b[k].c;
                n -= i2;
                e -= i2;
                c -= 1;
                m++;
                k--;
              }
              localObject1 = b;
              k = i2 + 1;
              System.arraycopy(localObject1, k, localObject1, k + m, c);
              d += m;
            }
            m = c;
            localObject1 = b;
            if (m + 1 > localObject1.length)
            {
              localObject2 = new d[localObject1.length * 2];
              System.arraycopy(localObject1, 0, localObject2, localObject1.length, localObject1.length);
              d = (b.length - 1);
              b = ((d[])localObject2);
            }
            m = d;
            d = (m - 1);
            b[m] = locald;
            c += 1;
            e += i1;
          }
        }
      }
      long l1 = c.b;
      int k = (int)Math.min(e, l1);
      long l2 = k;
      boolean bool = l1 < l2;
      if (!bool) {
        m = 4;
      } else {
        m = 0;
      }
      int i3 = m;
      if (paramBoolean)
      {
        m = (byte)(m | 0x1);
        i3 = m;
      }
      f(paramInt, k, (byte)1, i3);
      a.g0(c, l2);
      if (bool)
      {
        l1 -= l2;
        while (l1 > 0L)
        {
          m = (int)Math.min(e, l1);
          l2 = m;
          l1 -= l2;
          if (l1 == 0L)
          {
            k = 4;
            i3 = k;
          }
          else
          {
            k = 0;
            i3 = k;
          }
          f(paramInt, m, (byte)9, i3);
          a.g0(c, l2);
        }
      }
      return;
    }
    throw new IOException("closed");
  }
  
  public final void o0(a parama, byte[] paramArrayOfByte)
  {
    try
    {
      if (!f)
      {
        if (a != -1)
        {
          f(0, paramArrayOfByte.length + 8, (byte)7, (byte)0);
          a.writeInt(0);
          a.writeInt(a);
          if (paramArrayOfByte.length > 0) {
            a.write(paramArrayOfByte);
          }
          a.flush();
          return;
        }
        parama = new java/lang/IllegalArgumentException;
        parama.<init>(String.format(Locale.US, "errorCode.httpCode == -1", new Object[0]));
        throw parama;
      }
      parama = new java/io/IOException;
      parama.<init>("closed");
      throw parama;
    }
    finally {}
  }
  
  public final int t0()
  {
    return e;
  }
  
  public final void u(boolean paramBoolean, int paramInt1, xc.f paramf, int paramInt2)
  {
    try
    {
      if (!f)
      {
        byte b1;
        byte b2;
        if (paramBoolean)
        {
          b1 = (byte)1;
          b2 = b1;
        }
        else
        {
          b1 = 0;
          b2 = b1;
        }
        f(paramInt1, paramInt2, (byte)0, b2);
        if (paramInt2 > 0) {
          a.g0(paramf, paramInt2);
        }
        return;
      }
      paramf = new java/io/IOException;
      paramf.<init>("closed");
      throw paramf;
    }
    finally {}
  }
  
  public final void w()
  {
    try
    {
      if (!f)
      {
        boolean bool = b;
        if (!bool) {
          return;
        }
        localObject1 = f.a;
        if (((Logger)localObject1).isLoggable(Level.FINE)) {
          ((Logger)localObject1).fine(String.format(">> CONNECTION %s", new Object[] { f.b.l() }));
        }
        a.write(f.b.s());
        a.flush();
        return;
      }
      Object localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("closed");
      throw ((Throwable)localObject1);
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     jb.f.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */