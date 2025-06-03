package D6;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

public final class a
  implements b, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel
{
  public static final byte[] q = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  public d o;
  public long p;
  
  public a B(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      return C(paramArrayOfByte, 0, paramArrayOfByte.length);
    }
    throw new IllegalArgumentException("source == null");
  }
  
  public a C(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte != null)
    {
      long l1 = paramArrayOfByte.length;
      long l2 = paramInt1;
      long l3 = paramInt2;
      g.b(l1, l2, l3);
      paramInt2 += paramInt1;
      while (paramInt1 < paramInt2)
      {
        d locald = x(1);
        int i = Math.min(paramInt2 - paramInt1, 8192 - c);
        System.arraycopy(paramArrayOfByte, paramInt1, a, c, i);
        paramInt1 += i;
        c += i;
      }
      p += l3;
      return this;
    }
    throw new IllegalArgumentException("source == null");
  }
  
  public a D(int paramInt)
  {
    d locald = x(1);
    byte[] arrayOfByte = a;
    int i = c;
    c = (i + 1);
    arrayOfByte[i] = ((byte)(byte)paramInt);
    p += 1L;
    return this;
  }
  
  public a E(long paramLong)
  {
    if (paramLong == 0L) {
      return D(48);
    }
    int i = Long.numberOfTrailingZeros(Long.highestOneBit(paramLong)) / 4 + 1;
    d locald = x(i);
    byte[] arrayOfByte = a;
    int j = c;
    for (int k = j + i - 1; k >= j; k--)
    {
      arrayOfByte[k] = ((byte)q[((int)(0xF & paramLong))]);
      paramLong >>>= 4;
    }
    c += i;
    p += i;
    return this;
  }
  
  public a F(String paramString, int paramInt1, int paramInt2, Charset paramCharset)
  {
    if (paramString != null)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 >= paramInt1)
        {
          if (paramInt2 <= paramString.length())
          {
            if (paramCharset != null)
            {
              if (paramCharset.equals(g.a)) {
                return H(paramString, paramInt1, paramInt2);
              }
              paramString = paramString.substring(paramInt1, paramInt2).getBytes(paramCharset);
              return C(paramString, 0, paramString.length);
            }
            throw new IllegalArgumentException("charset == null");
          }
          paramCharset = new StringBuilder();
          paramCharset.append("endIndex > string.length: ");
          paramCharset.append(paramInt2);
          paramCharset.append(" > ");
          paramCharset.append(paramString.length());
          throw new IllegalArgumentException(paramCharset.toString());
        }
        paramString = new StringBuilder();
        paramString.append("endIndex < beginIndex: ");
        paramString.append(paramInt2);
        paramString.append(" < ");
        paramString.append(paramInt1);
        throw new IllegalArgumentException(paramString.toString());
      }
      paramString = new StringBuilder();
      paramString.append("beginIndex < 0: ");
      paramString.append(paramInt1);
      throw new IllegalAccessError(paramString.toString());
    }
    throw new IllegalArgumentException("string == null");
  }
  
  public a G(String paramString)
  {
    return H(paramString, 0, paramString.length());
  }
  
  public a H(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString != null)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 >= paramInt1)
        {
          if (paramInt2 <= paramString.length())
          {
            while (paramInt1 < paramInt2)
            {
              int i = paramString.charAt(paramInt1);
              int j;
              int m;
              if (i < 128)
              {
                d locald = x(1);
                localObject = a;
                j = c - paramInt1;
                int k = Math.min(paramInt2, 8192 - j);
                m = paramInt1 + 1;
                localObject[(paramInt1 + j)] = ((byte)(byte)i);
                for (paramInt1 = m; paramInt1 < k; paramInt1++)
                {
                  m = paramString.charAt(paramInt1);
                  if (m >= 128) {
                    break;
                  }
                  localObject[(paramInt1 + j)] = ((byte)(byte)m);
                }
                m = c;
                j = j + paramInt1 - m;
                c = (m + j);
                p += j;
              }
              else
              {
                if (i < 2048) {}
                for (m = i >> 6 | 0xC0;; m = i >> 6 & 0x3F | 0x80)
                {
                  D(m);
                  D(i & 0x3F | 0x80);
                  paramInt1++;
                  break;
                  if ((i >= 55296) && (i <= 57343))
                  {
                    j = paramInt1 + 1;
                    if (j < paramInt2) {
                      m = paramString.charAt(j);
                    } else {
                      m = 0;
                    }
                    if ((i <= 56319) && (m >= 56320) && (m <= 57343))
                    {
                      m = ((i & 0xFFFF27FF) << 10 | 0xFFFF23FF & m) + 65536;
                      D(m >> 18 | 0xF0);
                      D(m >> 12 & 0x3F | 0x80);
                      D(m >> 6 & 0x3F | 0x80);
                      D(m & 0x3F | 0x80);
                      paramInt1 += 2;
                      break;
                    }
                    D(63);
                    paramInt1 = j;
                    break;
                  }
                  D(i >> 12 | 0xE0);
                }
              }
            }
            return this;
          }
          Object localObject = new StringBuilder();
          ((StringBuilder)localObject).append("endIndex > string.length: ");
          ((StringBuilder)localObject).append(paramInt2);
          ((StringBuilder)localObject).append(" > ");
          ((StringBuilder)localObject).append(paramString.length());
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
        paramString = new StringBuilder();
        paramString.append("endIndex < beginIndex: ");
        paramString.append(paramInt2);
        paramString.append(" < ");
        paramString.append(paramInt1);
        throw new IllegalArgumentException(paramString.toString());
      }
      paramString = new StringBuilder();
      paramString.append("beginIndex < 0: ");
      paramString.append(paramInt1);
      throw new IllegalArgumentException(paramString.toString());
    }
    throw new IllegalArgumentException("string == null");
  }
  
  public a I(int paramInt)
  {
    if (paramInt < 128) {}
    for (;;)
    {
      D(paramInt);
      break label142;
      if (paramInt >= 2048) {
        break;
      }
      i = paramInt >> 6 | 0xC0;
      D(i);
      paramInt = paramInt & 0x3F | 0x80;
    }
    if (paramInt < 65536) {
      if ((paramInt >= 55296) && (paramInt <= 57343))
      {
        D(63);
        break label142;
      }
    }
    for (int i = paramInt >> 12 | 0xE0;; i = paramInt >> 12 & 0x3F | 0x80)
    {
      D(i);
      i = paramInt >> 6 & 0x3F | 0x80;
      break;
      if (paramInt > 1114111) {
        break label144;
      }
      D(paramInt >> 18 | 0xF0);
    }
    label142:
    return this;
    label144:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unexpected code point: ");
    localStringBuilder.append(Integer.toHexString(paramInt));
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public a a()
  {
    a locala = new a();
    if (p == 0L) {
      return locala;
    }
    d locald = o.c();
    o = locald;
    g = locald;
    f = locald;
    locald = o;
    for (;;)
    {
      locald = f;
      if (locald == o) {
        break;
      }
      o.g.b(locald.c());
    }
    p = p;
    return locala;
  }
  
  public boolean b()
  {
    boolean bool;
    if (p == 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void close() {}
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    long l1 = p;
    if (l1 != p) {
      return false;
    }
    long l2 = 0L;
    if (l1 == 0L) {
      return true;
    }
    Object localObject1 = o;
    paramObject = o;
    int i = b;
    int j = b;
    while (l2 < p)
    {
      l1 = Math.min(c - i, c - j);
      int k = 0;
      while (k < l1)
      {
        if (a[i] != a[j]) {
          return false;
        }
        k++;
        i++;
        j++;
      }
      Object localObject2 = localObject1;
      k = i;
      if (i == c)
      {
        localObject2 = f;
        k = b;
      }
      int m = j;
      Object localObject3 = paramObject;
      if (j == c)
      {
        localObject3 = f;
        m = b;
      }
      l2 += l1;
      localObject1 = localObject2;
      i = k;
      j = m;
      paramObject = localObject3;
    }
    return true;
  }
  
  public void flush() {}
  
  public int hashCode()
  {
    Object localObject = o;
    if (localObject == null) {
      return 0;
    }
    int i = 1;
    int m;
    d locald;
    do
    {
      int j = b;
      int k = c;
      m = i;
      while (j < k)
      {
        m = m * 31 + a[j];
        j++;
      }
      locald = f;
      localObject = locald;
      i = m;
    } while (locald != o);
    return m;
  }
  
  public boolean isOpen()
  {
    return true;
  }
  
  public byte l()
  {
    long l = p;
    if (l != 0L)
    {
      d locald = o;
      int i = b;
      int j = c;
      byte[] arrayOfByte = a;
      int k = i + 1;
      byte b = arrayOfByte[i];
      p = (l - 1L);
      if (k == j)
      {
        o = locald.a();
        e.a(locald);
      }
      else
      {
        b = k;
      }
      return b;
    }
    throw new IllegalStateException("size == 0");
  }
  
  public byte[] n(long paramLong)
  {
    g.b(p, 0L, paramLong);
    if (paramLong <= 2147483647L)
    {
      localObject = new byte[(int)paramLong];
      s((byte[])localObject);
      return (byte[])localObject;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("byteCount > Integer.MAX_VALUE: ");
    ((StringBuilder)localObject).append(paramLong);
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public int read(ByteBuffer paramByteBuffer)
  {
    d locald = o;
    if (locald == null) {
      return -1;
    }
    int i = Math.min(paramByteBuffer.remaining(), c - b);
    paramByteBuffer.put(a, b, i);
    int j = b + i;
    b = j;
    p -= i;
    if (j == c)
    {
      o = locald.a();
      e.a(locald);
    }
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    g.b(paramArrayOfByte.length, paramInt1, paramInt2);
    d locald = o;
    if (locald == null) {
      return -1;
    }
    paramInt2 = Math.min(paramInt2, c - b);
    System.arraycopy(a, b, paramArrayOfByte, paramInt1, paramInt2);
    paramInt1 = b + paramInt2;
    b = paramInt1;
    p -= paramInt2;
    if (paramInt1 == c)
    {
      o = locald.a();
      e.a(locald);
    }
    return paramInt2;
  }
  
  public void s(byte[] paramArrayOfByte)
  {
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
  
  public String t(long paramLong, Charset paramCharset)
  {
    g.b(p, 0L, paramLong);
    if (paramCharset != null)
    {
      if (paramLong <= 2147483647L)
      {
        if (paramLong == 0L) {
          return "";
        }
        d locald = o;
        int i = b;
        if (i + paramLong > c) {
          return new String(n(paramLong), paramCharset);
        }
        paramCharset = new String(a, i, (int)paramLong, paramCharset);
        i = (int)(b + paramLong);
        b = i;
        p -= paramLong;
        if (i == c)
        {
          o = locald.a();
          e.a(locald);
        }
        return paramCharset;
      }
      paramCharset = new StringBuilder();
      paramCharset.append("byteCount > Integer.MAX_VALUE: ");
      paramCharset.append(paramLong);
      throw new IllegalArgumentException(paramCharset.toString());
    }
    throw new IllegalArgumentException("charset == null");
  }
  
  public String toString()
  {
    return v().toString();
  }
  
  public String u()
  {
    try
    {
      String str = t(p, g.a);
      return str;
    }
    catch (EOFException localEOFException)
    {
      throw new AssertionError(localEOFException);
    }
  }
  
  public final c v()
  {
    long l = p;
    if (l <= 2147483647L) {
      return w((int)l);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("size > Integer.MAX_VALUE: ");
    localStringBuilder.append(p);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public final c w(int paramInt)
  {
    if (paramInt == 0) {
      return c.s;
    }
    return new f(this, paramInt);
  }
  
  public int write(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer != null)
    {
      int i = paramByteBuffer.remaining();
      int j = i;
      while (j > 0)
      {
        d locald = x(1);
        int k = Math.min(j, 8192 - c);
        paramByteBuffer.get(a, c, k);
        j -= k;
        c += k;
      }
      p += i;
      return i;
    }
    throw new IllegalArgumentException("source == null");
  }
  
  public d x(int paramInt)
  {
    if ((paramInt >= 1) && (paramInt <= 8192))
    {
      Object localObject = o;
      if (localObject == null)
      {
        localObject = e.b();
        o = ((d)localObject);
        g = ((d)localObject);
        f = ((d)localObject);
        return (d)localObject;
      }
      d locald = g;
      if (c + paramInt <= 8192)
      {
        localObject = locald;
        if (e) {}
      }
      else
      {
        localObject = locald.b(e.b());
      }
      return (d)localObject;
    }
    throw new IllegalArgumentException();
  }
}

/* Location:
 * Qualified Name:     D6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */