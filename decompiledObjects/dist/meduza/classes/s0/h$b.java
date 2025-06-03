package s0;

import a0.j;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

public final class h$b
  extends h
{
  public final InputStream e;
  public final byte[] f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k;
  public int l = Integer.MAX_VALUE;
  
  public h$b(FileInputStream paramFileInputStream)
  {
    Charset localCharset = x.a;
    e = paramFileInputStream;
    f = new byte['က'];
    g = 0;
    i = 0;
    k = 0;
  }
  
  public final ArrayList A(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    while (paramInt > 0)
    {
      int m = Math.min(paramInt, 4096);
      byte[] arrayOfByte = new byte[m];
      int n = 0;
      while (n < m)
      {
        int i1 = e.read(arrayOfByte, n, m - n);
        if (i1 != -1)
        {
          k += i1;
          n += i1;
        }
        else
        {
          throw y.f();
        }
      }
      paramInt -= m;
      localArrayList.add(arrayOfByte);
    }
    return localArrayList;
  }
  
  public final int B()
  {
    int m = i;
    int n = m;
    if (g - m < 4)
    {
      H(4);
      n = i;
    }
    byte[] arrayOfByte = f;
    i = (n + 4);
    m = arrayOfByte[n];
    int i1 = arrayOfByte[(n + 1)];
    int i2 = arrayOfByte[(n + 2)];
    return (arrayOfByte[(n + 3)] & 0xFF) << 24 | m & 0xFF | (i1 & 0xFF) << 8 | (i2 & 0xFF) << 16;
  }
  
  public final long C()
  {
    int m = i;
    int n = m;
    if (g - m < 8)
    {
      H(8);
      n = i;
    }
    byte[] arrayOfByte = f;
    i = (n + 8);
    long l1 = arrayOfByte[n];
    long l2 = arrayOfByte[(n + 1)];
    long l3 = arrayOfByte[(n + 2)];
    long l4 = arrayOfByte[(n + 3)];
    long l5 = arrayOfByte[(n + 4)];
    long l6 = arrayOfByte[(n + 5)];
    long l7 = arrayOfByte[(n + 6)];
    return (arrayOfByte[(n + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
  }
  
  public final int D()
  {
    int m = i;
    int n = g;
    int i1;
    if (n != m)
    {
      byte[] arrayOfByte = f;
      i1 = m + 1;
      m = arrayOfByte[m];
      if (m >= 0)
      {
        i = i1;
        return m;
      }
      if (n - i1 >= 9)
      {
        n = i1 + 1;
        m ^= arrayOfByte[i1] << 7;
        if (m < 0)
        {
          i1 = m ^ 0xFFFFFF80;
          break label278;
        }
        i1 = n + 1;
        m ^= arrayOfByte[n] << 14;
        if (m >= 0)
        {
          m ^= 0x3F80;
          n = i1;
          i1 = m;
        }
        int i2;
        int i3;
        do
        {
          do
          {
            do
            {
              break;
              n = i1 + 1;
              i1 = m ^ arrayOfByte[i1] << 21;
              if (i1 < 0)
              {
                i1 ^= 0xFFE03F80;
                break;
              }
              i2 = n + 1;
              i3 = arrayOfByte[n];
              m = i1 ^ i3 << 28 ^ 0xFE03F80;
              i1 = m;
              n = i2;
            } while (i3 >= 0);
            i3 = i2 + 1;
            i1 = m;
            n = i3;
            if (arrayOfByte[i2] >= 0) {
              break;
            }
            i2 = i3 + 1;
            i1 = m;
            n = i2;
          } while (arrayOfByte[i3] >= 0);
          i3 = i2 + 1;
          i1 = m;
          n = i3;
          if (arrayOfByte[i2] >= 0) {
            break;
          }
          i2 = i3 + 1;
          i1 = m;
          n = i2;
        } while (arrayOfByte[i3] >= 0);
        n = i2 + 1;
        i1 = m;
        if (arrayOfByte[i2] >= 0) {
          break label278;
        }
      }
    }
    return (int)F();
    label278:
    i = n;
    return i1;
  }
  
  public final long E()
  {
    int m = i;
    int n = g;
    int i1;
    long l1;
    if (n != m)
    {
      byte[] arrayOfByte = f;
      i1 = m + 1;
      m = arrayOfByte[m];
      if (m >= 0)
      {
        i = i1;
        return m;
      }
      if (n - i1 >= 9)
      {
        n = i1 + 1;
        m ^= arrayOfByte[i1] << 7;
        if (m < 0) {
          i1 = m ^ 0xFFFFFF80;
        }
        for (;;)
        {
          l1 = i1;
          break label357;
          i1 = n + 1;
          m ^= arrayOfByte[n] << 14;
          if (m >= 0)
          {
            l1 = m ^ 0x3F80;
            n = i1;
            break label357;
          }
          n = i1 + 1;
          i1 = m ^ arrayOfByte[i1] << 21;
          if (i1 >= 0) {
            break;
          }
          i1 ^= 0xFFE03F80;
        }
        l1 = i1;
        i1 = n + 1;
        long l2 = l1 ^ arrayOfByte[n] << 28;
        if (l2 >= 0L)
        {
          l1 = 266354560L;
          n = i1;
          l1 = l2 ^ l1;
          break label357;
        }
        m = i1 + 1;
        l2 ^= arrayOfByte[i1] << 35;
        if (l2 < 0L) {
          l1 = -34093383808L;
        }
        for (n = m;; n = m)
        {
          l1 = l2 ^ l1;
          break label357;
          n = m + 1;
          l2 ^= arrayOfByte[m] << 42;
          if (l2 >= 0L)
          {
            l1 = 4363953127296L;
            break;
          }
          m = n + 1;
          l2 ^= arrayOfByte[n] << 49;
          if (l2 >= 0L) {
            break label306;
          }
          l1 = -558586000294016L;
        }
        label306:
        i1 = m + 1;
        l1 = l2 ^ arrayOfByte[m] << 56 ^ 0xFE03F80FE03F80;
        if (l1 >= 0L) {
          break label354;
        }
        n = i1 + 1;
        if (arrayOfByte[i1] >= 0L) {
          break label357;
        }
      }
    }
    return F();
    label354:
    n = i1;
    label357:
    i = n;
    return l1;
  }
  
  public final long F()
  {
    long l1 = 0L;
    for (int m = 0; m < 64; m += 7)
    {
      if (i == g) {
        H(1);
      }
      byte[] arrayOfByte = f;
      int n = i;
      i = (n + 1);
      n = arrayOfByte[n];
      l1 |= (n & 0x7F) << m;
      if ((n & 0x80) == 0) {
        return l1;
      }
    }
    throw y.c();
  }
  
  public final void G()
  {
    int m = g + h;
    g = m;
    int n = k + m;
    int i1 = l;
    if (n > i1)
    {
      i1 = n - i1;
      h = i1;
      g = (m - i1);
    }
    else
    {
      h = 0;
    }
  }
  
  public final void H(int paramInt)
  {
    if (!J(paramInt))
    {
      if (paramInt > c - k - i) {
        throw new y("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
      }
      throw y.f();
    }
  }
  
  public final void I(int paramInt)
  {
    int m = g;
    int n = i;
    int i4;
    int i2;
    if ((paramInt <= m - n) && (paramInt >= 0))
    {
      i = (n + paramInt);
    }
    else
    {
      if (paramInt < 0) {
        break label335;
      }
      int i1 = k;
      int i3 = i1 + n;
      i4 = l;
      if (i3 + paramInt > i4) {
        break label320;
      }
      k = i3;
      i3 = m - n;
      g = 0;
      i = 0;
      while (i3 < paramInt) {
        try
        {
          Object localObject1 = e;
          long l1 = paramInt - i3;
          long l2 = ((InputStream)localObject1).skip(l1);
          boolean bool = l2 < 0L;
          if ((!bool) && (l2 <= l1))
          {
            if (bool) {
              i3 += (int)l2;
            }
          }
          else
          {
            IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append(e.getClass());
            ((StringBuilder)localObject1).append("#skip returned invalid result: ");
            ((StringBuilder)localObject1).append(l2);
            ((StringBuilder)localObject1).append("\nThe InputStream implementation is buggy.");
            localIllegalStateException.<init>(((StringBuilder)localObject1).toString());
            throw localIllegalStateException;
          }
        }
        finally
        {
          k += i3;
          G();
        }
      }
      k += i3;
      G();
      if (i3 < paramInt)
      {
        i2 = g;
        i3 = i2 - i;
        for (i = i2;; i = i2)
        {
          H(1);
          n = paramInt - i3;
          i2 = g;
          if (n <= i2) {
            break;
          }
          i3 += i2;
        }
        i = n;
      }
    }
    return;
    label320:
    I(i4 - i2 - n);
    throw y.f();
    label335:
    throw y.d();
  }
  
  public final boolean J(int paramInt)
  {
    int m = i;
    int n = g;
    if (m + paramInt > n)
    {
      int i1 = c;
      int i2 = k;
      if (paramInt > i1 - i2 - m) {
        return false;
      }
      if (i2 + m + paramInt > l) {
        return false;
      }
      if (m > 0)
      {
        if (n > m)
        {
          localObject = f;
          System.arraycopy(localObject, m, localObject, 0, n - m);
        }
        k += m;
        g -= m;
        i = 0;
      }
      InputStream localInputStream = e;
      Object localObject = f;
      i1 = g;
      i1 = localInputStream.read((byte[])localObject, i1, Math.min(localObject.length - i1, c - k - i1));
      if ((i1 != 0) && (i1 >= -1) && (i1 <= f.length))
      {
        if (i1 > 0)
        {
          g += i1;
          G();
          boolean bool;
          if (g >= paramInt) {
            bool = true;
          } else {
            bool = J(paramInt);
          }
          return bool;
        }
        return false;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(e.getClass());
      ((StringBuilder)localObject).append("#read(byte[]) returned invalid result: ");
      ((StringBuilder)localObject).append(i1);
      ((StringBuilder)localObject).append("\nThe InputStream implementation is buggy.");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    throw new IllegalStateException(j.h("refillBuffer() called when ", paramInt, " bytes were already available in buffer"));
  }
  
  public final void a(int paramInt)
  {
    if (j == paramInt) {
      return;
    }
    throw new y("Protocol message end-group tag did not match expected tag.");
  }
  
  public final int b()
  {
    return k + i;
  }
  
  public final boolean c()
  {
    int m = i;
    int n = g;
    boolean bool = true;
    if ((m != n) || (J(1))) {
      bool = false;
    }
    return bool;
  }
  
  public final void d(int paramInt)
  {
    l = paramInt;
    G();
  }
  
  public final int e(int paramInt)
  {
    if (paramInt >= 0)
    {
      int m = k + i + paramInt;
      paramInt = l;
      if (m <= paramInt)
      {
        l = m;
        G();
        return paramInt;
      }
      throw y.f();
    }
    throw y.d();
  }
  
  public final boolean f()
  {
    boolean bool;
    if (E() != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final g.e g()
  {
    int m = D();
    int n = g;
    int i1 = i;
    if ((m <= n - i1) && (m > 0))
    {
      localObject1 = g.i(f, i1, m);
      i += m;
      return (g.e)localObject1;
    }
    if (m == 0) {
      return g.b;
    }
    Object localObject1 = z(m);
    if (localObject1 != null)
    {
      localObject1 = g.i((byte[])localObject1, 0, localObject1.length);
    }
    else
    {
      int i2 = i;
      n = g;
      i1 = n - i2;
      k += n;
      i = 0;
      g = 0;
      Object localObject2 = A(m - i1);
      localObject1 = new byte[m];
      System.arraycopy(f, i2, localObject1, 0, i1);
      localObject2 = ((ArrayList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        byte[] arrayOfByte = (byte[])((Iterator)localObject2).next();
        System.arraycopy(arrayOfByte, 0, localObject1, i1, arrayOfByte.length);
        i1 += arrayOfByte.length;
      }
      localObject2 = g.b;
      localObject1 = new g.e((byte[])localObject1);
    }
    return (g.e)localObject1;
  }
  
  public final double h()
  {
    return Double.longBitsToDouble(C());
  }
  
  public final int i()
  {
    return D();
  }
  
  public final int j()
  {
    return B();
  }
  
  public final long k()
  {
    return C();
  }
  
  public final float l()
  {
    return Float.intBitsToFloat(B());
  }
  
  public final int m()
  {
    return D();
  }
  
  public final long n()
  {
    return E();
  }
  
  public final int o()
  {
    return B();
  }
  
  public final long p()
  {
    return C();
  }
  
  public final int q()
  {
    int m = D();
    return -(m & 0x1) ^ m >>> 1;
  }
  
  public final long r()
  {
    long l1 = E();
    return -(l1 & 1L) ^ l1 >>> 1;
  }
  
  public final String s()
  {
    int m = D();
    String str;
    if (m > 0)
    {
      int n = g;
      int i1 = i;
      if (m <= n - i1)
      {
        str = new String(f, i1, m, x.a);
        i += m;
        return str;
      }
    }
    if (m == 0) {
      return "";
    }
    if (m <= g)
    {
      H(m);
      str = new String(f, i, m, x.a);
      i += m;
      return str;
    }
    return new String(y(m), x.a);
  }
  
  public final String t()
  {
    int m = D();
    int n = i;
    int i1 = g;
    byte[] arrayOfByte;
    if ((m <= i1 - n) && (m > 0))
    {
      arrayOfByte = f;
      i = (n + m);
    }
    else
    {
      if (m == 0) {
        return "";
      }
      if (m <= i1)
      {
        H(m);
        arrayOfByte = f;
        i = (m + 0);
      }
      else
      {
        arrayOfByte = y(m);
      }
      n = 0;
    }
    return m1.a.a(arrayOfByte, n, m);
  }
  
  public final int u()
  {
    if (c())
    {
      j = 0;
      return 0;
    }
    int m = D();
    j = m;
    if (m >>> 3 != 0) {
      return m;
    }
    throw new y("Protocol message contained an invalid tag (zero).");
  }
  
  public final int v()
  {
    return D();
  }
  
  public final long w()
  {
    return E();
  }
  
  public final boolean x(int paramInt)
  {
    int m = paramInt & 0x7;
    int n = 0;
    int i1 = 0;
    if (m != 0)
    {
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3)
          {
            if (m != 4)
            {
              if (m == 5)
              {
                I(4);
                return true;
              }
              paramInt = y.a;
              throw new y.a();
            }
            return false;
          }
          do
          {
            i1 = u();
          } while ((i1 != 0) && (x(i1)));
          a(paramInt >>> 3 << 3 | 0x4);
          return true;
        }
        paramInt = D();
      }
      else
      {
        paramInt = 8;
      }
      I(paramInt);
      return true;
    }
    paramInt = n;
    byte[] arrayOfByte;
    if (g - i >= 10)
    {
      for (paramInt = i1; paramInt < 10; paramInt++)
      {
        arrayOfByte = f;
        i1 = i;
        i = (i1 + 1);
        if (arrayOfByte[i1] >= 0) {
          break label227;
        }
      }
      throw y.c();
    }
    while (paramInt < 10)
    {
      if (i == g) {
        H(1);
      }
      arrayOfByte = f;
      i1 = i;
      i = (i1 + 1);
      if (arrayOfByte[i1] >= 0) {
        label227:
        return true;
      }
      paramInt++;
    }
    throw y.c();
  }
  
  public final byte[] y(int paramInt)
  {
    byte[] arrayOfByte = z(paramInt);
    if (arrayOfByte != null) {
      return arrayOfByte;
    }
    int m = i;
    int n = g;
    int i1 = n - m;
    k += n;
    i = 0;
    g = 0;
    Object localObject = A(paramInt - i1);
    arrayOfByte = new byte[paramInt];
    System.arraycopy(f, m, arrayOfByte, 0, i1);
    Iterator localIterator = ((ArrayList)localObject).iterator();
    paramInt = i1;
    while (localIterator.hasNext())
    {
      localObject = (byte[])localIterator.next();
      System.arraycopy(localObject, 0, arrayOfByte, paramInt, localObject.length);
      paramInt += localObject.length;
    }
    return arrayOfByte;
  }
  
  public final byte[] z(int paramInt)
  {
    if (paramInt == 0) {
      return x.b;
    }
    if (paramInt >= 0)
    {
      int m = k;
      int n = i;
      int i1 = m + n + paramInt;
      if (i1 - c <= 0)
      {
        int i2 = l;
        if (i1 <= i2)
        {
          i1 = g - n;
          m = paramInt - i1;
          if ((m >= 4096) && (m > e.available())) {
            return null;
          }
          byte[] arrayOfByte = new byte[paramInt];
          System.arraycopy(f, i, arrayOfByte, 0, i1);
          k += g;
          i = 0;
          g = 0;
          while (i1 < paramInt)
          {
            m = e.read(arrayOfByte, i1, paramInt - i1);
            if (m != -1)
            {
              k += m;
              i1 += m;
            }
            else
            {
              throw y.f();
            }
          }
          return arrayOfByte;
        }
        I(i2 - m - n);
        throw y.f();
      }
      throw new y("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
    throw y.d();
  }
}

/* Location:
 * Qualified Name:     s0.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */