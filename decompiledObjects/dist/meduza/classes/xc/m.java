package xc;

import a0.j;
import ec.i;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class m
  implements y
{
  public byte a;
  public final s b;
  public final Inflater c;
  public final n d;
  public final CRC32 e;
  
  public m(y paramy)
  {
    paramy = new s(paramy);
    b = paramy;
    Inflater localInflater = new Inflater(true);
    c = localInflater;
    d = new n(paramy, localInflater);
    e = new CRC32();
  }
  
  public static void f(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt2 == paramInt1) {
      return;
    }
    paramString = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) }, 3));
    i.d(paramString, "format(this, *args)");
    throw new IOException(paramString);
  }
  
  public final z c()
  {
    return b.c();
  }
  
  public final void close()
  {
    d.close();
  }
  
  public final long e0(f paramf, long paramLong)
  {
    i.e(paramf, "sink");
    boolean bool = paramLong < 0L;
    int j = 0;
    int k;
    if (!bool) {
      k = 1;
    } else {
      k = 0;
    }
    if (k != 0)
    {
      if (!bool) {
        return 0L;
      }
      long l;
      if (a == 0)
      {
        b.u0(10L);
        int m = b.b.I(3L);
        if ((m >> 1 & 0x1) == 1) {
          k = 1;
        } else {
          k = 0;
        }
        if (k != 0) {
          g(0L, 10L, b.b);
        }
        f(8075, b.readShort(), "ID1ID2");
        b.skip(8L);
        if ((m >> 2 & 0x1) == 1) {
          bool = true;
        } else {
          bool = false;
        }
        if (bool)
        {
          b.u0(2L);
          if (k != 0) {
            g(0L, 2L, b.b);
          }
          i = b.b.readShort() & 0xFFFF;
          l = (short)((i & 0xFF) << 8 | (i & 0xFF00) >>> 8) & 0xFFFF;
          b.u0(l);
          if (k != 0) {
            g(0L, l, b.b);
          }
          b.skip(l);
        }
        if ((m >> 3 & 0x1) == 1) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          l = b.f((byte)0, 0L, Long.MAX_VALUE);
          if (l != -1L)
          {
            if (k != 0) {
              g(0L, l + 1L, b.b);
            }
            b.skip(l + 1L);
          }
          else
          {
            throw new EOFException();
          }
        }
        int i = j;
        if ((m >> 4 & 0x1) == 1) {
          i = 1;
        }
        if (i != 0)
        {
          l = b.f((byte)0, 0L, Long.MAX_VALUE);
          if (l != -1L)
          {
            if (k != 0) {
              g(0L, l + 1L, b.b);
            }
            b.skip(l + 1L);
          }
          else
          {
            throw new EOFException();
          }
        }
        if (k != 0)
        {
          s locals = b;
          locals.u0(2L);
          k = b.readShort() & 0xFFFF;
          f((short)((k & 0xFF) << 8 | (k & 0xFF00) >>> 8), (short)(int)e.getValue(), "FHCRC");
          e.reset();
        }
        a = ((byte)1);
      }
      if (a == 1)
      {
        l = b;
        paramLong = d.e0(paramf, paramLong);
        if (paramLong != -1L)
        {
          g(l, paramLong, paramf);
          return paramLong;
        }
        a = ((byte)2);
      }
      if (a == 2)
      {
        f(b.C(), (int)e.getValue(), "CRC");
        f(b.C(), (int)c.getBytesWritten(), "ISIZE");
        a = ((byte)3);
        if (!b.v()) {
          throw new IOException("gzip finished without exhausting source");
        }
      }
      return -1L;
    }
    throw new IllegalArgumentException(j.i("byteCount < 0: ", paramLong).toString());
  }
  
  public final void g(long paramLong1, long paramLong2, f paramf)
  {
    int i;
    int j;
    for (paramf = a;; paramf = f)
    {
      i.b(paramf);
      i = c;
      j = b;
      if (paramLong1 < i - j) {
        break;
      }
      paramLong1 -= i - j;
    }
    while (paramLong2 > 0L)
    {
      i = (int)(b + paramLong1);
      j = (int)Math.min(c - i, paramLong2);
      e.update(a, i, j);
      paramLong2 -= j;
      paramf = f;
      i.b(paramf);
      paramLong1 = 0L;
    }
  }
}

/* Location:
 * Qualified Name:     xc.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */