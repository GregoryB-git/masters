package xc;

import a0.j;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p2.m0;
import yc.a;

public final class s
  implements h
{
  public final y a;
  public final f b;
  public boolean c;
  
  public s(y paramy)
  {
    a = paramy;
    b = new f();
  }
  
  public final int C()
  {
    u0(4L);
    int i = b.readInt();
    return (i & 0xFF) << 24 | (0xFF000000 & i) >>> 24 | (0xFF0000 & i) >>> 8 | (0xFF00 & i) << 8;
  }
  
  public final String E(long paramLong)
  {
    int i;
    if (paramLong >= 0L) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (paramLong == Long.MAX_VALUE) {
        l1 = Long.MAX_VALUE;
      } else {
        l1 = paramLong + 1L;
      }
      long l2 = f((byte)10, 0L, l1);
      if (l2 != -1L)
      {
        localObject1 = a.a(b, l2);
      }
      else
      {
        if ((l1 >= Long.MAX_VALUE) || (!H(l1)) || (b.I(l1 - 1L) != 13) || (!H(1L + l1)) || (b.I(l1) != 10)) {
          break label145;
        }
        localObject1 = a.a(b, l1);
      }
      return (String)localObject1;
      label145:
      Object localObject1 = new f();
      Object localObject2 = b;
      long l1 = b;
      ((f)localObject2).H(0L, Math.min(32, l1), (f)localObject1);
      localObject2 = f.l("\\n not found: limit=");
      ((StringBuilder)localObject2).append(Math.min(b.b, paramLong));
      ((StringBuilder)localObject2).append(" content=");
      ((StringBuilder)localObject2).append(((f)localObject1).c0().l());
      ((StringBuilder)localObject2).append('…');
      throw new EOFException(((StringBuilder)localObject2).toString());
    }
    throw new IllegalArgumentException(j.i("limit < 0: ", paramLong).toString());
  }
  
  public final boolean H(long paramLong)
  {
    boolean bool = false;
    int i;
    if (paramLong >= 0L) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if ((c ^ true))
      {
        f localf;
        do
        {
          localf = b;
          if (b >= paramLong) {
            break;
          }
        } while (a.e0(localf, 8192L) != -1L);
        break label73;
        bool = true;
        label73:
        return bool;
      }
      throw new IllegalStateException("closed".toString());
    }
    throw new IllegalArgumentException(j.i("byteCount < 0: ", paramLong).toString());
  }
  
  public final boolean K(i parami)
  {
    ec.i.e(parami, "bytes");
    byte[] arrayOfByte = a;
    int i = arrayOfByte.length;
    boolean bool1 = c;
    boolean bool2 = true;
    if ((bool1 ^ true))
    {
      if ((i >= 0) && (arrayOfByte.length - 0 >= i)) {
        for (int j = 0;; j++)
        {
          bool1 = bool2;
          if (j >= i) {
            break label112;
          }
          long l = j + 0L;
          if ((!H(1L + l)) || (b.I(l) != a[(0 + j)])) {
            break;
          }
        }
      }
      bool1 = false;
      label112:
      return bool1;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final String S(Charset paramCharset)
  {
    ec.i.e(paramCharset, "charset");
    b.A0(a);
    return b.S(paramCharset);
  }
  
  public final z c()
  {
    return a.c();
  }
  
  public final void close()
  {
    if (!c)
    {
      c = true;
      a.close();
      b.f();
    }
  }
  
  public final long e0(f paramf, long paramLong)
  {
    ec.i.e(paramf, "sink");
    int i;
    if (paramLong >= 0L) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if ((c ^ true))
      {
        f localf = b;
        long l1 = b;
        long l2 = -1L;
        if ((l1 == 0L) && (a.e0(localf, 8192L) == -1L))
        {
          paramLong = l2;
        }
        else
        {
          paramLong = Math.min(paramLong, b.b);
          paramLong = b.e0(paramf, paramLong);
        }
        return paramLong;
      }
      throw new IllegalStateException("closed".toString());
    }
    throw new IllegalArgumentException(j.i("byteCount < 0: ", paramLong).toString());
  }
  
  public final long f(byte paramByte, long paramLong1, long paramLong2)
  {
    boolean bool = c;
    int i = 1;
    if ((bool ^ true))
    {
      paramLong1 = 0L;
      if (0L > paramLong2) {
        i = 0;
      }
      if (i != 0)
      {
        long l2;
        for (;;)
        {
          long l1 = -1L;
          l2 = l1;
          if (paramLong1 >= paramLong2) {
            break;
          }
          l2 = b.M(paramByte, paramLong1, paramLong2);
          if (l2 != -1L) {
            break;
          }
          localObject = b;
          long l3 = b;
          l2 = l1;
          if (l3 >= paramLong2) {
            break;
          }
          if (a.e0((f)localObject, 8192L) == -1L)
          {
            l2 = l1;
            break;
          }
          paramLong1 = Math.max(paramLong1, l3);
        }
        return l2;
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("fromIndex=");
      ((StringBuilder)localObject).append(0L);
      ((StringBuilder)localObject).append(" toIndex=");
      ((StringBuilder)localObject).append(paramLong2);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString().toString());
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final String f0()
  {
    return E(Long.MAX_VALUE);
  }
  
  public final void g(byte[] paramArrayOfByte)
  {
    ec.i.e(paramArrayOfByte, "sink");
    try
    {
      u0(paramArrayOfByte.length);
      b.h0(paramArrayOfByte);
      return;
    }
    catch (EOFException localEOFException)
    {
      int i = 0;
      for (;;)
      {
        f localf = b;
        long l = b;
        if (l <= 0L) {
          break label79;
        }
        int j = localf.read(paramArrayOfByte, i, (int)l);
        if (j == -1) {
          break;
        }
        i += j;
      }
      throw new AssertionError();
      label79:
      throw localEOFException;
    }
  }
  
  public final boolean isOpen()
  {
    return c ^ true;
  }
  
  public final i l(long paramLong)
  {
    u0(paramLong);
    return b.l(paramLong);
  }
  
  public final int read(ByteBuffer paramByteBuffer)
  {
    ec.i.e(paramByteBuffer, "sink");
    f localf = b;
    if ((b == 0L) && (a.e0(localf, 8192L) == -1L)) {
      return -1;
    }
    return b.read(paramByteBuffer);
  }
  
  public final byte readByte()
  {
    u0(1L);
    return b.readByte();
  }
  
  public final int readInt()
  {
    u0(4L);
    return b.readInt();
  }
  
  public final short readShort()
  {
    u0(2L);
    return b.readShort();
  }
  
  public final void skip(long paramLong)
  {
    if ((c ^ true))
    {
      while (paramLong > 0L)
      {
        f localf = b;
        if ((b == 0L) && (a.e0(localf, 8192L) == -1L)) {
          throw new EOFException();
        }
        long l = Math.min(paramLong, b.b);
        b.skip(l);
        paramLong -= l;
      }
      return;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final f t()
  {
    return b;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("buffer(");
    localStringBuilder.append(a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public final void u0(long paramLong)
  {
    if (H(paramLong)) {
      return;
    }
    throw new EOFException();
  }
  
  public final boolean v()
  {
    boolean bool1 = c;
    boolean bool2 = true;
    if ((bool1 ^ true))
    {
      if ((!b.v()) || (a.e0(b, 8192L) != -1L)) {
        bool2 = false;
      }
      return bool2;
    }
    throw new IllegalStateException("closed".toString());
  }
  
  public final long x0()
  {
    u0(1L);
    int j;
    int k;
    for (int i = 0;; i = j)
    {
      j = i + 1;
      if (!H(j)) {
        break label144;
      }
      k = b.I(i);
      if (((k < 48) || (k > 57)) && ((k < 97) || (k > 102)) && ((k < 65) || (k > 70))) {
        break;
      }
    }
    if (i == 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Expected leading [0-9a-fA-F] character but was 0x");
      m0.q(16);
      m0.q(16);
      String str = Integer.toString(k, 16);
      ec.i.d(str, "toString(this, checkRadix(radix))");
      localStringBuilder.append(str);
      throw new NumberFormatException(localStringBuilder.toString());
    }
    label144:
    return b.x0();
  }
}

/* Location:
 * Qualified Name:     xc.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */