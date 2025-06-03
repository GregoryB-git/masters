package xc;

import java.io.Closeable;
import java.io.EOFException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class f
  implements h, g, Cloneable, ByteChannel
{
  public t a;
  public long b;
  
  public final long A0(y paramy)
  {
    ec.i.e(paramy, "source");
    long l2;
    for (long l1 = 0L;; l1 += l2)
    {
      l2 = paramy.e0(this, 8192L);
      if (l2 == -1L) {
        break;
      }
    }
    return l1;
  }
  
  public final void B0(int paramInt)
  {
    t localt = r0(1);
    byte[] arrayOfByte = a;
    int i = c;
    c = (i + 1);
    arrayOfByte[i] = ((byte)(byte)paramInt);
    b += 1L;
  }
  
  public final f C0(long paramLong)
  {
    if (paramLong == 0L)
    {
      B0(48);
    }
    else
    {
      long l = paramLong >>> 1 | paramLong;
      l |= l >>> 2;
      l |= l >>> 4;
      l |= l >>> 8;
      l |= l >>> 16;
      l |= l >>> 32;
      l -= (l >>> 1 & 0x5555555555555555);
      l = (l >>> 2 & 0x3333333333333333) + (l & 0x3333333333333333);
      l = (l >>> 4) + l & 0xF0F0F0F0F0F0F0F;
      l += (l >>> 8);
      l += (l >>> 16);
      int i = (int)(((l & 0x3F) + (l >>> 32 & 0x3F) + 3) / 4);
      t localt = r0(i);
      byte[] arrayOfByte = a;
      int j = c;
      for (int k = j + i - 1; k >= j; k--)
      {
        arrayOfByte[k] = ((byte)yc.a.a[((int)(0xF & paramLong))]);
        paramLong >>>= 4;
      }
      c += i;
      b += i;
    }
    return this;
  }
  
  public final g D()
  {
    return this;
  }
  
  public final void D0(int paramInt)
  {
    t localt = r0(4);
    byte[] arrayOfByte = a;
    int i = c;
    int j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(paramInt >>> 24 & 0xFF));
    i = j + 1;
    arrayOfByte[j] = ((byte)(byte)(paramInt >>> 16 & 0xFF));
    j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(paramInt >>> 8 & 0xFF));
    arrayOfByte[j] = ((byte)(byte)(paramInt & 0xFF));
    c = (j + 1);
    b += 4L;
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
      long l1 = Long.MAX_VALUE;
      if (paramLong != Long.MAX_VALUE) {
        l1 = paramLong + 1L;
      }
      long l2 = M((byte)10, 0L, l1);
      if (l2 != -1L)
      {
        localObject = yc.a.a(this, l2);
      }
      else
      {
        if ((l1 >= b) || (I(l1 - 1L) != 13) || (I(l1) != 10)) {
          break label114;
        }
        localObject = yc.a.a(this, l1);
      }
      return (String)localObject;
      label114:
      Object localObject = new f();
      l1 = b;
      H(0L, Math.min(32, l1), (f)localObject);
      StringBuilder localStringBuilder = f.l("\\n not found: limit=");
      localStringBuilder.append(Math.min(b, paramLong));
      localStringBuilder.append(" content=");
      localStringBuilder.append(((f)localObject).c0().l());
      localStringBuilder.append('…');
      throw new EOFException(localStringBuilder.toString());
    }
    throw new IllegalArgumentException(a0.j.i("limit < 0: ", paramLong).toString());
  }
  
  public final void E0(long paramLong)
  {
    t localt = r0(8);
    byte[] arrayOfByte = a;
    int i = c;
    int j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(int)(paramLong >>> 56 & 0xFF));
    i = j + 1;
    arrayOfByte[j] = ((byte)(byte)(int)(paramLong >>> 48 & 0xFF));
    j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(int)(paramLong >>> 40 & 0xFF));
    i = j + 1;
    arrayOfByte[j] = ((byte)(byte)(int)(paramLong >>> 32 & 0xFF));
    j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(int)(paramLong >>> 24 & 0xFF));
    i = j + 1;
    arrayOfByte[j] = ((byte)(byte)(int)(paramLong >>> 16 & 0xFF));
    j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(int)(paramLong >>> 8 & 0xFF));
    arrayOfByte[j] = ((byte)(byte)(int)(paramLong & 0xFF));
    c = (j + 1);
    b += 8L;
  }
  
  public final void F0(int paramInt)
  {
    t localt = r0(2);
    byte[] arrayOfByte = a;
    int i = c;
    int j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(paramInt >>> 8 & 0xFF));
    arrayOfByte[j] = ((byte)(byte)(paramInt & 0xFF));
    c = (j + 1);
    b += 2L;
  }
  
  public final void G0(int paramInt1, int paramInt2, String paramString)
  {
    ec.i.e(paramString, "string");
    int i;
    if (paramInt1 >= 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (paramInt2 >= paramInt1) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        if (paramInt2 <= paramString.length()) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          while (paramInt1 < paramInt2)
          {
            int j = paramString.charAt(paramInt1);
            Object localObject2;
            int k;
            int m;
            if (j < 128)
            {
              localObject1 = r0(1);
              localObject2 = a;
              k = c - paramInt1;
              m = Math.min(paramInt2, 8192 - k);
              i = paramInt1 + 1;
              localObject2[(paramInt1 + k)] = ((byte)(byte)j);
              for (paramInt1 = i; paramInt1 < m; paramInt1 = i)
              {
                j = paramString.charAt(paramInt1);
                if (j >= 128) {
                  break;
                }
                i = paramInt1 + 1;
                localObject2[(paramInt1 + k)] = ((byte)(byte)j);
              }
              i = c;
              k = k + paramInt1 - i;
              c = (i + k);
              b += k;
            }
            else
            {
              long l1;
              long l2;
              if (j < 2048)
              {
                localObject1 = r0(2);
                localObject2 = a;
                i = c;
                localObject2[i] = ((byte)(byte)(j >> 6 | 0xC0));
                localObject2[(i + 1)] = ((byte)(byte)(j & 0x3F | 0x80));
                c = (i + 2);
                l1 = b;
                l2 = 2L;
              }
              else
              {
                if ((j >= 55296) && (j <= 57343))
                {
                  m = paramInt1 + 1;
                  if (m < paramInt2) {
                    i = paramString.charAt(m);
                  } else {
                    i = 0;
                  }
                  if (j <= 56319)
                  {
                    if ((56320 <= i) && (i < 57344)) {
                      k = 1;
                    } else {
                      k = 0;
                    }
                    if (k != 0)
                    {
                      k = ((j & 0x3FF) << 10 | i & 0x3FF) + 65536;
                      localObject1 = r0(4);
                      localObject2 = a;
                      i = c;
                      localObject2[i] = ((byte)(byte)(k >> 18 | 0xF0));
                      localObject2[(i + 1)] = ((byte)(byte)(k >> 12 & 0x3F | 0x80));
                      localObject2[(i + 2)] = ((byte)(byte)(k >> 6 & 0x3F | 0x80));
                      localObject2[(i + 3)] = ((byte)(byte)(k & 0x3F | 0x80));
                      c = (i + 4);
                      b += 4L;
                      paramInt1 += 2;
                      continue;
                    }
                  }
                  B0(63);
                  paramInt1 = m;
                  continue;
                }
                localObject2 = r0(3);
                localObject1 = a;
                i = c;
                localObject1[i] = ((byte)(byte)(j >> 12 | 0xE0));
                localObject1[(i + 1)] = ((byte)(byte)(0x3F & j >> 6 | 0x80));
                localObject1[(i + 2)] = ((byte)(byte)(j & 0x3F | 0x80));
                c = (i + 3);
                l1 = b;
                l2 = 3L;
              }
              b = (l1 + l2);
              paramInt1++;
            }
          }
          return;
        }
        Object localObject1 = a0.j.n("endIndex > string.length: ", paramInt2, " > ");
        ((StringBuilder)localObject1).append(paramString.length());
        throw new IllegalArgumentException(((StringBuilder)localObject1).toString().toString());
      }
      throw new IllegalArgumentException(f.i("endIndex < beginIndex: ", paramInt2, " < ", paramInt1).toString());
    }
    throw new IllegalArgumentException(f.h("beginIndex < 0: ", paramInt1).toString());
  }
  
  public final void H(long paramLong1, long paramLong2, f paramf)
  {
    ec.i.e(paramf, "out");
    b.b(b, paramLong1, paramLong2);
    if (paramLong2 != 0L)
    {
      b += paramLong2;
      t localt2;
      long l2;
      long l3;
      for (t localt1 = a;; localt1 = f)
      {
        ec.i.b(localt1);
        long l1 = c - b;
        localt2 = localt1;
        l2 = paramLong1;
        l3 = paramLong2;
        if (paramLong1 < l1) {
          break;
        }
        paramLong1 -= l1;
      }
      while (l3 > 0L)
      {
        ec.i.b(localt2);
        localt1 = localt2.c();
        int i = b + (int)l2;
        b = i;
        c = Math.min(i + (int)l3, c);
        t localt3 = a;
        if (localt3 == null)
        {
          g = localt1;
          f = localt1;
          a = localt1;
        }
        else
        {
          localt3 = g;
          ec.i.b(localt3);
          localt3.b(localt1);
        }
        l3 -= c - b;
        localt2 = f;
        l2 = 0L;
      }
    }
  }
  
  public final void H0(String paramString)
  {
    ec.i.e(paramString, "string");
    G0(0, paramString.length(), paramString);
  }
  
  public final byte I(long paramLong)
  {
    b.b(b, paramLong, 1L);
    t localt = a;
    if (localt != null)
    {
      long l1 = b;
      int i;
      int j;
      if (l1 - paramLong < paramLong)
      {
        while (l1 > paramLong)
        {
          localt = g;
          ec.i.b(localt);
          l1 -= c - b;
        }
        i = a[((int)(b + paramLong - l1))];
        j = i;
      }
      else
      {
        int k;
        long l2;
        for (l1 = 0L;; l1 = l2)
        {
          i = c;
          k = b;
          l2 = i - k + l1;
          if (l2 > paramLong) {
            break;
          }
          localt = f;
          ec.i.b(localt);
        }
        i = a[((int)(k + paramLong - l1))];
        j = i;
      }
      return j;
    }
    ec.i.b(null);
    throw null;
  }
  
  public final void I0(int paramInt)
  {
    Object localObject2;
    int j;
    if (paramInt < 128)
    {
      B0(paramInt);
    }
    else
    {
      int i;
      long l1;
      long l2;
      if (paramInt < 2048)
      {
        localObject1 = r0(2);
        localObject2 = a;
        i = c;
        localObject2[i] = ((byte)(byte)(paramInt >> 6 | 0xC0));
        localObject2[(i + 1)] = ((byte)(byte)(paramInt & 0x3F | 0x80));
        c = (i + 2);
        l1 = b;
        l2 = 2L;
      }
      else
      {
        j = 0;
        if ((55296 <= paramInt) && (paramInt < 57344)) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          B0(63);
          break label342;
        }
        if (paramInt < 65536)
        {
          localObject1 = r0(3);
          localObject2 = a;
          i = c;
          localObject2[i] = ((byte)(byte)(paramInt >> 12 | 0xE0));
          localObject2[(i + 1)] = ((byte)(byte)(paramInt >> 6 & 0x3F | 0x80));
          localObject2[(i + 2)] = ((byte)(byte)(paramInt & 0x3F | 0x80));
          c = (i + 3);
          l1 = b;
          l2 = 3L;
        }
        else
        {
          if (paramInt > 1114111) {
            break label343;
          }
          localObject1 = r0(4);
          localObject2 = a;
          i = c;
          localObject2[i] = ((byte)(byte)(paramInt >> 18 | 0xF0));
          localObject2[(i + 1)] = ((byte)(byte)(paramInt >> 12 & 0x3F | 0x80));
          localObject2[(i + 2)] = ((byte)(byte)(paramInt >> 6 & 0x3F | 0x80));
          localObject2[(i + 3)] = ((byte)(byte)(paramInt & 0x3F | 0x80));
          c = (i + 4);
          l1 = b;
          l2 = 4L;
        }
      }
      b = (l1 + l2);
    }
    label342:
    return;
    label343:
    Object localObject1 = f.l("Unexpected code point: 0x");
    if (paramInt != 0)
    {
      localObject2 = new char[8];
      char[] arrayOfChar = yc.b.a;
      localObject2[0] = ((char)arrayOfChar[(paramInt >> 28 & 0xF)]);
      localObject2[1] = ((char)arrayOfChar[(paramInt >> 24 & 0xF)]);
      localObject2[2] = ((char)arrayOfChar[(paramInt >> 20 & 0xF)]);
      localObject2[3] = ((char)arrayOfChar[(paramInt >> 16 & 0xF)]);
      localObject2[4] = ((char)arrayOfChar[(paramInt >> 12 & 0xF)]);
      localObject2[5] = ((char)arrayOfChar[(paramInt >> 8 & 0xF)]);
      localObject2[6] = ((char)arrayOfChar[(paramInt >> 4 & 0xF)]);
      localObject2[7] = ((char)arrayOfChar[(paramInt & 0xF)]);
      for (paramInt = j; (paramInt < 8) && (localObject2[paramInt] == '0'); paramInt++) {}
      if (paramInt >= 0)
      {
        if (paramInt <= 8) {
          localObject2 = new String((char[])localObject2, paramInt, 8 - paramInt);
        } else {
          throw new IllegalArgumentException(f.i("startIndex: ", paramInt, " > endIndex: ", 8));
        }
      }
      else
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("startIndex: ");
        ((StringBuilder)localObject2).append(paramInt);
        ((StringBuilder)localObject2).append(", endIndex: ");
        ((StringBuilder)localObject2).append(8);
        ((StringBuilder)localObject2).append(", size: ");
        ((StringBuilder)localObject2).append(8);
        throw new IndexOutOfBoundsException(((StringBuilder)localObject2).toString());
      }
    }
    else
    {
      localObject2 = "0";
    }
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
  }
  
  public final boolean K(i parami)
  {
    ec.i.e(parami, "bytes");
    byte[] arrayOfByte = a;
    int i = arrayOfByte.length;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i >= 0)
    {
      bool2 = bool1;
      if (b - 0L >= i) {
        if (arrayOfByte.length - 0 < i)
        {
          bool2 = bool1;
        }
        else
        {
          for (int j = 0; j < i; j++) {
            if (I(j + 0L) != a[(0 + j)])
            {
              bool2 = bool1;
              break label103;
            }
          }
          bool2 = true;
        }
      }
    }
    label103:
    return bool2;
  }
  
  public final long M(byte paramByte, long paramLong1, long paramLong2)
  {
    long l1 = 0L;
    int i = 0;
    int j = i;
    if (0L <= paramLong1)
    {
      j = i;
      if (paramLong1 <= paramLong2) {
        j = 1;
      }
    }
    if (j != 0)
    {
      long l2 = b;
      long l3 = paramLong2;
      if (paramLong2 > l2) {
        l3 = l2;
      }
      if (paramLong1 != l3)
      {
        Object localObject1 = a;
        if (localObject1 != null)
        {
          paramLong2 = l1;
          localObject2 = localObject1;
          if (l2 - paramLong1 < paramLong1)
          {
            localObject2 = localObject1;
            for (paramLong2 = l2;; paramLong2 -= c - b)
            {
              l2 = paramLong2;
              localObject1 = localObject2;
              l1 = paramLong1;
              if (paramLong2 <= paramLong1) {
                break;
              }
              localObject2 = g;
              ec.i.b(localObject2);
            }
            while (l2 < l3)
            {
              localObject2 = a;
              i = (int)Math.min(c, b + l3 - l2);
              for (j = (int)(b + l1 - l2); j < i; j++) {
                if (localObject2[j] == paramByte)
                {
                  paramLong1 = j - b + l2;
                  break label466;
                }
              }
              l2 += c - b;
              localObject1 = f;
              ec.i.b(localObject1);
              l1 = l2;
            }
          }
          for (;;)
          {
            l1 = c - b + paramLong2;
            localObject1 = localObject2;
            l2 = paramLong1;
            if (l1 > paramLong1) {
              break;
            }
            localObject2 = f;
            ec.i.b(localObject2);
            paramLong2 = l1;
          }
          while (paramLong2 < l3)
          {
            localObject2 = a;
            i = (int)Math.min(c, b + l3 - paramLong2);
            for (j = (int)(b + l2 - paramLong2); j < i; j++) {
              if (localObject2[j] == paramByte)
              {
                paramLong1 = j - b + paramLong2;
                break label466;
              }
            }
            paramLong2 += c - b;
            localObject1 = f;
            ec.i.b(localObject1);
            l2 = paramLong2;
          }
        }
      }
      paramLong1 = -1L;
      label466:
      return paramLong1;
    }
    Object localObject2 = f.l("size=");
    ((StringBuilder)localObject2).append(b);
    ((StringBuilder)localObject2).append(" fromIndex=");
    ((StringBuilder)localObject2).append(paramLong1);
    ((StringBuilder)localObject2).append(" toIndex=");
    ((StringBuilder)localObject2).append(paramLong2);
    throw new IllegalArgumentException(((StringBuilder)localObject2).toString().toString());
  }
  
  public final void Q(a parama)
  {
    ec.i.e(parama, "unsafeCursor");
    Object localObject = yc.a.a;
    localObject = parama;
    if (parama == b.a) {
      localObject = new a();
    }
    int i;
    if (a == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      a = this;
      b = true;
      return;
    }
    throw new IllegalStateException("already attached to a buffer".toString());
  }
  
  public final String S(Charset paramCharset)
  {
    ec.i.e(paramCharset, "charset");
    return i0(b, paramCharset);
  }
  
  public final byte[] b0(long paramLong)
  {
    int i;
    if ((paramLong >= 0L) && (paramLong <= 2147483647L)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (b >= paramLong)
      {
        byte[] arrayOfByte = new byte[(int)paramLong];
        h0(arrayOfByte);
        return arrayOfByte;
      }
      throw new EOFException();
    }
    throw new IllegalArgumentException(a0.j.i("byteCount: ", paramLong).toString());
  }
  
  public final z c()
  {
    return z.d;
  }
  
  public final i c0()
  {
    return l(b);
  }
  
  public final Object clone()
  {
    f localf = new f();
    if (b != 0L)
    {
      t localt1 = a;
      ec.i.b(localt1);
      t localt2 = localt1.c();
      a = localt2;
      g = localt2;
      f = localt2;
      for (t localt3 = f; localt3 != localt1; localt3 = f)
      {
        t localt4 = g;
        ec.i.b(localt4);
        ec.i.b(localt3);
        localt4.b(localt3.c());
      }
      b = b;
    }
    return localf;
  }
  
  public final void close() {}
  
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
      long l1 = b;
      if (l1 == 0L)
      {
        paramLong = -1L;
      }
      else
      {
        long l2 = paramLong;
        if (paramLong > l1) {
          l2 = l1;
        }
        paramf.g0(this, l2);
        paramLong = l2;
      }
      return paramLong;
    }
    throw new IllegalArgumentException(a0.j.i("byteCount < 0: ", paramLong).toString());
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    if (this == paramObject) {}
    for (;;)
    {
      bool = true;
      break;
      if (!(paramObject instanceof f)) {
        break;
      }
      long l1 = b;
      paramObject = (f)paramObject;
      if (l1 != b) {
        break;
      }
      if (l1 != 0L)
      {
        Object localObject1 = a;
        ec.i.b(localObject1);
        Object localObject2 = a;
        ec.i.b(localObject2);
        int i = b;
        int j = b;
        l1 = 0L;
        while (l1 < b)
        {
          long l2 = Math.min(c - i, c - j);
          long l3 = 0L;
          int k = i;
          while (l3 < l2)
          {
            if (a[k] != a[j]) {
              return bool;
            }
            l3 += 1L;
            k++;
            j++;
          }
          paramObject = localObject1;
          i = k;
          if (k == c)
          {
            paramObject = f;
            ec.i.b(paramObject);
            i = b;
          }
          localObject1 = localObject2;
          k = j;
          if (j == c)
          {
            localObject1 = f;
            ec.i.b(localObject1);
            k = b;
          }
          l1 += l2;
          localObject2 = localObject1;
          localObject1 = paramObject;
          j = k;
        }
      }
    }
    return bool;
  }
  
  public final void f()
  {
    skip(b);
  }
  
  public final String f0()
  {
    return E(Long.MAX_VALUE);
  }
  
  public final void flush() {}
  
  public final long g()
  {
    long l1 = b;
    long l2 = 0L;
    if (l1 != 0L)
    {
      t localt = a;
      ec.i.b(localt);
      localt = g;
      ec.i.b(localt);
      int i = c;
      l2 = l1;
      if (i < 8192)
      {
        l2 = l1;
        if (e) {
          l2 = l1 - (i - b);
        }
      }
    }
    return l2;
  }
  
  public final void g0(f paramf, long paramLong)
  {
    ec.i.e(paramf, "source");
    int i;
    if (paramf != this) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      b.b(b, 0L, paramLong);
      while (paramLong > 0L)
      {
        t localt1 = a;
        ec.i.b(localt1);
        i = c;
        localt1 = a;
        ec.i.b(localt1);
        int j;
        if (paramLong < i - b)
        {
          localt1 = a;
          if (localt1 != null) {
            localt1 = g;
          } else {
            localt1 = null;
          }
          if ((localt1 != null) && (e))
          {
            l = c;
            if (d) {
              i = 0;
            } else {
              i = b;
            }
            if (l + paramLong - i <= 8192L)
            {
              localt2 = a;
              ec.i.b(localt2);
              localt2.d(localt1, (int)paramLong);
              b -= paramLong;
              b += paramLong;
              break;
            }
          }
          localt2 = a;
          ec.i.b(localt2);
          j = (int)paramLong;
          if ((j > 0) && (j <= c - b)) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (j >= 1024)
            {
              localt1 = localt2.c();
            }
            else
            {
              localt1 = u.b();
              byte[] arrayOfByte1 = a;
              byte[] arrayOfByte2 = a;
              i = b;
              sb.j.k(arrayOfByte1, 0, arrayOfByte2, i, i + j);
            }
            c = (b + j);
            b += j;
            localt2 = g;
            ec.i.b(localt2);
            localt2.b(localt1);
            a = localt1;
          }
          else
          {
            throw new IllegalArgumentException("byteCount out of range".toString());
          }
        }
        localt1 = a;
        ec.i.b(localt1);
        long l = c - b;
        a = localt1.a();
        t localt2 = a;
        if (localt2 == null)
        {
          a = localt1;
          g = localt1;
          f = localt1;
        }
        else
        {
          localt2 = g;
          ec.i.b(localt2);
          localt2.b(localt1);
          localt2 = g;
          if (localt2 != localt1) {
            i = 1;
          } else {
            i = 0;
          }
          if (i == 0) {
            break label671;
          }
          ec.i.b(localt2);
          if (e)
          {
            int k = c - b;
            localt2 = g;
            ec.i.b(localt2);
            j = c;
            localt2 = g;
            ec.i.b(localt2);
            if (d)
            {
              i = 0;
            }
            else
            {
              localt2 = g;
              ec.i.b(localt2);
              i = b;
            }
            if (k <= 8192 - j + i)
            {
              localt2 = g;
              ec.i.b(localt2);
              localt1.d(localt2, k);
              localt1.a();
              u.a(localt1);
            }
          }
        }
        b -= l;
        b += l;
        paramLong -= l;
        continue;
        label671:
        throw new IllegalStateException("cannot compact".toString());
      }
      return;
    }
    throw new IllegalArgumentException("source == this".toString());
  }
  
  public final void h0(byte[] paramArrayOfByte)
  {
    ec.i.e(paramArrayOfByte, "sink");
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = read(paramArrayOfByte, i, paramArrayOfByte.length - i);
      if (j != -1) {
        i += j;
      } else {
        throw new EOFException();
      }
    }
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i;
    if (localObject == null)
    {
      i = 0;
    }
    else
    {
      int j = 1;
      t localt;
      do
      {
        int k = b;
        int m = c;
        i = j;
        while (k < m)
        {
          i = i * 31 + a[k];
          k++;
        }
        localt = f;
        ec.i.b(localt);
        localObject = localt;
        j = i;
      } while (localt != a);
    }
    return i;
  }
  
  public final String i0(long paramLong, Charset paramCharset)
  {
    ec.i.e(paramCharset, "charset");
    boolean bool = paramLong < 0L;
    int j;
    if ((!bool) && (paramLong <= 2147483647L)) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      if (b >= paramLong)
      {
        if (!bool) {
          return "";
        }
        t localt = a;
        ec.i.b(localt);
        int i = b;
        if (i + paramLong > c) {
          return new String(b0(paramLong), paramCharset);
        }
        byte[] arrayOfByte = a;
        j = (int)paramLong;
        paramCharset = new String(arrayOfByte, i, j, paramCharset);
        j = b + j;
        b = j;
        b -= paramLong;
        if (j == c)
        {
          a = localt.a();
          u.a(localt);
        }
        return paramCharset;
      }
      throw new EOFException();
    }
    throw new IllegalArgumentException(a0.j.i("byteCount: ", paramLong).toString());
  }
  
  public final boolean isOpen()
  {
    return true;
  }
  
  public final f k()
  {
    return this;
  }
  
  public final String k0()
  {
    return i0(b, lc.a.a);
  }
  
  public final i l(long paramLong)
  {
    int i;
    if ((paramLong >= 0L) && (paramLong <= 2147483647L)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (b >= paramLong)
      {
        i locali;
        if (paramLong >= 4096L)
        {
          locali = q0((int)paramLong);
          skip(paramLong);
        }
        else
        {
          locali = new i(b0(paramLong));
        }
        return locali;
      }
      throw new EOFException();
    }
    throw new IllegalArgumentException(a0.j.i("byteCount: ", paramLong).toString());
  }
  
  public final i l0()
  {
    long l = b;
    int i;
    if (l <= 2147483647L) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return q0((int)l);
    }
    StringBuilder localStringBuilder = f.l("size > Int.MAX_VALUE: ");
    localStringBuilder.append(b);
    throw new IllegalStateException(localStringBuilder.toString().toString());
  }
  
  public final g o()
  {
    return this;
  }
  
  public final i q0(int paramInt)
  {
    Object localObject;
    if (paramInt == 0)
    {
      localObject = i.d;
    }
    else
    {
      b.b(b, 0L, paramInt);
      localObject = a;
      int i = 0;
      int j = 0;
      int k = j;
      while (j < paramInt)
      {
        ec.i.b(localObject);
        int m = c;
        int n = b;
        if (m != n)
        {
          j += m - n;
          k++;
          localObject = f;
        }
        else
        {
          throw new AssertionError("s.limit == s.pos");
        }
      }
      byte[][] arrayOfByte = new byte[k][];
      int[] arrayOfInt = new int[k * 2];
      localObject = a;
      j = 0;
      while (i < paramInt)
      {
        ec.i.b(localObject);
        arrayOfByte[j] = a;
        i += c - b;
        arrayOfInt[j] = Math.min(i, paramInt);
        arrayOfInt[(j + k)] = b;
        d = true;
        j++;
        localObject = f;
      }
      localObject = new v(arrayOfByte, arrayOfInt);
    }
    return (i)localObject;
  }
  
  public final t r0(int paramInt)
  {
    int i = 1;
    if ((paramInt < 1) || (paramInt > 8192)) {
      i = 0;
    }
    if (i != 0)
    {
      Object localObject = a;
      if (localObject == null)
      {
        localObject = u.b();
        a = ((t)localObject);
        g = ((t)localObject);
        f = ((t)localObject);
      }
      else
      {
        t localt = g;
        ec.i.b(localt);
        if ((c + paramInt <= 8192) && (e))
        {
          localObject = localt;
        }
        else
        {
          localObject = u.b();
          localt.b((t)localObject);
        }
      }
      return (t)localObject;
    }
    throw new IllegalArgumentException("unexpected capacity".toString());
  }
  
  public final int read(ByteBuffer paramByteBuffer)
  {
    ec.i.e(paramByteBuffer, "sink");
    t localt = a;
    if (localt == null) {
      return -1;
    }
    int i = Math.min(paramByteBuffer.remaining(), c - b);
    paramByteBuffer.put(a, b, i);
    int j = b + i;
    b = j;
    b -= i;
    if (j == c)
    {
      a = localt.a();
      u.a(localt);
    }
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    ec.i.e(paramArrayOfByte, "sink");
    b.b(paramArrayOfByte.length, paramInt1, paramInt2);
    t localt = a;
    if (localt == null)
    {
      paramInt1 = -1;
    }
    else
    {
      paramInt2 = Math.min(paramInt2, c - b);
      byte[] arrayOfByte = a;
      int i = b;
      sb.j.k(arrayOfByte, paramInt1, paramArrayOfByte, i, i + paramInt2);
      paramInt1 = b + paramInt2;
      b = paramInt1;
      b -= paramInt2;
      if (paramInt1 == c)
      {
        a = localt.a();
        u.a(localt);
      }
      paramInt1 = paramInt2;
    }
    return paramInt1;
  }
  
  public final byte readByte()
  {
    if (b != 0L)
    {
      t localt = a;
      ec.i.b(localt);
      int i = b;
      int j = c;
      byte[] arrayOfByte = a;
      int k = i + 1;
      byte b1 = arrayOfByte[i];
      b -= 1L;
      if (k == j)
      {
        a = localt.a();
        u.a(localt);
      }
      else
      {
        b = k;
      }
      return b1;
    }
    throw new EOFException();
  }
  
  public final int readInt()
  {
    if (b >= 4L)
    {
      t localt = a;
      ec.i.b(localt);
      int i = b;
      int j = c;
      if (j - i < 4L)
      {
        j = (readByte() & 0xFF) << 24 | (readByte() & 0xFF) << 16 | (readByte() & 0xFF) << 8 | readByte() & 0xFF;
      }
      else
      {
        byte[] arrayOfByte = a;
        int k = i + 1;
        i = arrayOfByte[i];
        int m = k + 1;
        k = arrayOfByte[k];
        int n = m + 1;
        m = arrayOfByte[m];
        int i1 = n + 1;
        n = arrayOfByte[n];
        b -= 4L;
        if (i1 == j)
        {
          a = localt.a();
          u.a(localt);
        }
        else
        {
          b = i1;
        }
        j = (i & 0xFF) << 24 | (k & 0xFF) << 16 | (m & 0xFF) << 8 | n & 0xFF;
      }
      return j;
    }
    throw new EOFException();
  }
  
  public final short readShort()
  {
    if (b >= 2L)
    {
      t localt = a;
      ec.i.b(localt);
      int i = b;
      int j = c;
      int k;
      if (j - i < 2)
      {
        j = (short)((readByte() & 0xFF) << 8 | readByte() & 0xFF);
        k = j;
      }
      else
      {
        byte[] arrayOfByte = a;
        int m = i + 1;
        int n = arrayOfByte[i];
        i = m + 1;
        m = arrayOfByte[m];
        b -= 2L;
        if (i == j)
        {
          a = localt.a();
          u.a(localt);
        }
        else
        {
          b = i;
        }
        j = (short)((n & 0xFF) << 8 | m & 0xFF);
        k = j;
      }
      return k;
    }
    throw new EOFException();
  }
  
  public final void skip(long paramLong)
  {
    while (paramLong > 0L)
    {
      t localt = a;
      if (localt != null)
      {
        int i = (int)Math.min(paramLong, c - b);
        long l1 = b;
        long l2 = i;
        b = (l1 - l2);
        l1 = paramLong - l2;
        i = b + i;
        b = i;
        paramLong = l1;
        if (i == c)
        {
          a = localt.a();
          u.a(localt);
          paramLong = l1;
        }
      }
      else
      {
        throw new EOFException();
      }
    }
  }
  
  public final f t()
  {
    return this;
  }
  
  public final String toString()
  {
    return l0().toString();
  }
  
  public final void u0(long paramLong)
  {
    if (b >= paramLong) {
      return;
    }
    throw new EOFException();
  }
  
  public final boolean v()
  {
    boolean bool;
    if (b == 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int write(ByteBuffer paramByteBuffer)
  {
    ec.i.e(paramByteBuffer, "source");
    int i = paramByteBuffer.remaining();
    int j = i;
    while (j > 0)
    {
      t localt = r0(1);
      int k = Math.min(j, 8192 - c);
      paramByteBuffer.get(a, c, k);
      j -= k;
      c += k;
    }
    b += i;
    return i;
  }
  
  public final void write(byte[] paramArrayOfByte)
  {
    ec.i.e(paramArrayOfByte, "source");
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    ec.i.e(paramArrayOfByte, "source");
    long l1 = paramArrayOfByte.length;
    long l2 = paramInt1;
    long l3 = paramInt2;
    b.b(l1, l2, l3);
    int i = paramInt2 + paramInt1;
    while (paramInt1 < i)
    {
      t localt = r0(1);
      int j = Math.min(i - paramInt1, 8192 - c);
      byte[] arrayOfByte = a;
      int k = c;
      paramInt2 = paramInt1 + j;
      sb.j.k(paramArrayOfByte, k, arrayOfByte, paramInt1, paramInt2);
      c += j;
      paramInt1 = paramInt2;
    }
    b += l3;
  }
  
  public final long x0()
  {
    if (b != 0L)
    {
      int i = 0;
      int j = i;
      long l1 = 0L;
      long l2;
      int n;
      label224:
      label301:
      do
      {
        Object localObject1 = a;
        ec.i.b(localObject1);
        Object localObject2 = a;
        int k = b;
        int m = c;
        l2 = l1;
        int i1;
        for (n = i;; n++)
        {
          i1 = j;
          if (k >= m) {
            break label301;
          }
          i1 = localObject2[k];
          if ((i1 >= 48) && (i1 <= 57))
          {
            i = i1 - 48;
          }
          else
          {
            if ((i1 >= 97) && (i1 <= 102))
            {
              i = i1 - 97;
            }
            else
            {
              if ((i1 < 65) || (i1 > 70)) {
                break label224;
              }
              i = i1 - 65;
            }
            i += 10;
          }
          if ((0xF000000000000000 & l2) != 0L) {
            break;
          }
          l2 = l2 << 4 | i;
          k++;
        }
        localObject1 = new f();
        ((f)localObject1).C0(l2);
        ((f)localObject1).B0(i1);
        localObject2 = f.l("Number too large: ");
        ((StringBuilder)localObject2).append(((f)localObject1).k0());
        throw new NumberFormatException(((StringBuilder)localObject2).toString());
        if (n != 0)
        {
          i1 = 1;
        }
        else
        {
          localObject2 = f.l("Expected leading [0-9a-fA-F] character but was 0x");
          localObject1 = yc.b.a;
          ((StringBuilder)localObject2).append(new String(new char[] { localObject1[(i1 >> 4 & 0xF)], localObject1[(i1 & 0xF)] }));
          throw new NumberFormatException(((StringBuilder)localObject2).toString());
        }
        if (k == m)
        {
          a = ((t)localObject1).a();
          u.a((t)localObject1);
        }
        else
        {
          b = k;
        }
        if (i1 != 0) {
          break;
        }
        i = n;
        j = i1;
        l1 = l2;
      } while (a != null);
      b -= n;
      return l2;
    }
    throw new EOFException();
  }
  
  public final void z0(i parami)
  {
    ec.i.e(parami, "byteString");
    parami.u(this, parami.i());
  }
  
  public static final class a
    implements Closeable
  {
    public f a;
    public boolean b;
    public t c;
    public long d = -1L;
    public byte[] e;
    public int f = -1;
    public int o = -1;
    
    public final void close()
    {
      int i;
      if (a != null) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        a = null;
        c = null;
        d = -1L;
        e = null;
        f = -1;
        o = -1;
        return;
      }
      throw new IllegalStateException("not attached to a buffer".toString());
    }
    
    public final int f(long paramLong)
    {
      f localf = a;
      if (localf != null)
      {
        boolean bool1 = paramLong < -1L;
        if (!bool1)
        {
          long l1 = b;
          boolean bool2 = paramLong < l1;
          if (!bool2)
          {
            int j = -1;
            if ((bool1) && (bool2))
            {
              long l2 = 0L;
              Object localObject1 = a;
              t localt = c;
              long l3;
              if (localt != null)
              {
                l3 = d - (f - b);
                if (l3 > paramLong)
                {
                  localObject2 = localt;
                }
                else
                {
                  l2 = l3;
                  localObject2 = localObject1;
                  localObject1 = localt;
                  l3 = l1;
                }
              }
              else
              {
                localObject2 = localObject1;
                l3 = l1;
              }
              l1 = l3;
              if (l3 - paramLong > paramLong - l2) {
                for (;;)
                {
                  ec.i.b(localObject1);
                  l3 = c - b + l2;
                  localObject2 = localObject1;
                  if (paramLong < l3) {
                    break;
                  }
                  localObject1 = f;
                  l2 = l3;
                }
              }
              while (l1 > paramLong)
              {
                ec.i.b(localObject2);
                localObject2 = g;
                ec.i.b(localObject2);
                l1 -= c - b;
              }
              l2 = l1;
              localObject1 = localObject2;
              if (b)
              {
                ec.i.b(localObject2);
                localObject1 = localObject2;
                if (d)
                {
                  localObject1 = a;
                  localObject1 = Arrays.copyOf((byte[])localObject1, localObject1.length);
                  ec.i.d(localObject1, "copyOf(this, size)");
                  localObject1 = new t((byte[])localObject1, b, c, false, true);
                  if (a == localObject2) {
                    a = ((t)localObject1);
                  }
                  ((t)localObject2).b((t)localObject1);
                  localObject2 = g;
                  ec.i.b(localObject2);
                  ((t)localObject2).a();
                }
              }
              c = ((t)localObject1);
              d = paramLong;
              ec.i.b(localObject1);
              e = a;
              j = b + (int)(paramLong - l2);
              f = j;
              int i = c;
              o = i;
              j = i - j;
            }
            else
            {
              c = null;
              d = paramLong;
              e = null;
              f = -1;
              o = -1;
            }
            return j;
          }
        }
        Object localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("offset=");
        ((StringBuilder)localObject2).append(paramLong);
        ((StringBuilder)localObject2).append(" > size=");
        ((StringBuilder)localObject2).append(b);
        throw new ArrayIndexOutOfBoundsException(((StringBuilder)localObject2).toString());
      }
      throw new IllegalStateException("not attached to a buffer".toString());
    }
  }
}

/* Location:
 * Qualified Name:     xc.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */