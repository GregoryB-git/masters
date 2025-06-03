package ma;

import java.util.Arrays;

public final class i$a
  extends i
{
  public final byte[] e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k = Integer.MAX_VALUE;
  
  public i$a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    e = paramArrayOfByte;
    f = (paramInt2 + paramInt1);
    h = paramInt1;
    i = paramInt1;
  }
  
  public final boolean A(int paramInt)
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
                G(4);
                return true;
              }
              paramInt = b0.c;
              throw new b0.a();
            }
            return false;
          }
          do
          {
            i1 = x();
          } while ((i1 != 0) && (A(i1)));
          a(paramInt >>> 3 << 3 | 0x4);
          return true;
        }
        paramInt = D();
      }
      else
      {
        paramInt = 8;
      }
      G(paramInt);
      return true;
    }
    paramInt = n;
    byte[] arrayOfByte;
    if (f - h >= 10)
    {
      for (paramInt = i1; paramInt < 10; paramInt++)
      {
        arrayOfByte = e;
        i1 = h;
        h = (i1 + 1);
        if (arrayOfByte[i1] >= 0) {
          break label220;
        }
      }
      throw b0.e();
    }
    while (paramInt < 10)
    {
      i1 = h;
      if (i1 != f)
      {
        arrayOfByte = e;
        h = (i1 + 1);
        if (arrayOfByte[i1] >= 0) {
          label220:
          return true;
        }
        paramInt++;
      }
      else
      {
        throw b0.h();
      }
    }
    throw b0.e();
  }
  
  public final int B()
  {
    int m = h;
    if (f - m >= 4)
    {
      byte[] arrayOfByte = e;
      h = (m + 4);
      int n = arrayOfByte[m];
      int i1 = arrayOfByte[(m + 1)];
      int i2 = arrayOfByte[(m + 2)];
      return (arrayOfByte[(m + 3)] & 0xFF) << 24 | n & 0xFF | (i1 & 0xFF) << 8 | (i2 & 0xFF) << 16;
    }
    throw b0.h();
  }
  
  public final long C()
  {
    int m = h;
    if (f - m >= 8)
    {
      byte[] arrayOfByte = e;
      h = (m + 8);
      long l1 = arrayOfByte[m];
      long l2 = arrayOfByte[(m + 1)];
      long l3 = arrayOfByte[(m + 2)];
      long l4 = arrayOfByte[(m + 3)];
      long l5 = arrayOfByte[(m + 4)];
      long l6 = arrayOfByte[(m + 5)];
      long l7 = arrayOfByte[(m + 6)];
      return (arrayOfByte[(m + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
    }
    throw b0.h();
  }
  
  public final int D()
  {
    int m = h;
    int n = f;
    int i1;
    if (n != m)
    {
      byte[] arrayOfByte = e;
      i1 = m + 1;
      m = arrayOfByte[m];
      if (m >= 0)
      {
        h = i1;
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
    h = n;
    return i1;
  }
  
  public final long E()
  {
    int m = h;
    int n = f;
    int i1;
    long l1;
    if (n != m)
    {
      byte[] arrayOfByte = e;
      i1 = m + 1;
      m = arrayOfByte[m];
      if (m >= 0)
      {
        h = i1;
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
          break label359;
          i1 = n + 1;
          m ^= arrayOfByte[n] << 14;
          if (m >= 0)
          {
            l1 = m ^ 0x3F80;
            n = i1;
            break label359;
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
          break label359;
        }
        n = i1 + 1;
        l1 = l2 ^ arrayOfByte[i1] << 35;
        if (l1 < 0L) {}
        for (l2 = -34093383808L;; l2 = -558586000294016L)
        {
          l1 ^= l2;
          break label359;
          i1 = n + 1;
          l2 = l1 ^ arrayOfByte[n] << 42;
          if (l2 >= 0L)
          {
            l1 = 4363953127296L;
            n = i1;
            break;
          }
          n = i1 + 1;
          l1 = l2 ^ arrayOfByte[i1] << 49;
          if (l1 >= 0L) {
            break label308;
          }
        }
        label308:
        i1 = n + 1;
        l1 = l1 ^ arrayOfByte[n] << 56 ^ 0xFE03F80FE03F80;
        if (l1 >= 0L) {
          break label356;
        }
        n = i1 + 1;
        if (arrayOfByte[i1] >= 0L) {
          break label359;
        }
      }
    }
    return F();
    label356:
    n = i1;
    label359:
    h = n;
    return l1;
  }
  
  public final long F()
  {
    long l = 0L;
    int m = 0;
    while (m < 64)
    {
      int n = h;
      if (n != f)
      {
        byte[] arrayOfByte = e;
        h = (n + 1);
        n = arrayOfByte[n];
        l |= (n & 0x7F) << m;
        if ((n & 0x80) == 0) {
          return l;
        }
        m += 7;
      }
      else
      {
        throw b0.h();
      }
    }
    throw b0.e();
  }
  
  public final void G(int paramInt)
  {
    if (paramInt >= 0)
    {
      int m = f;
      int n = h;
      if (paramInt <= m - n)
      {
        h = (n + paramInt);
        return;
      }
    }
    if (paramInt < 0) {
      throw b0.f();
    }
    throw b0.h();
  }
  
  public final void a(int paramInt)
  {
    if (j == paramInt) {
      return;
    }
    throw b0.a();
  }
  
  public final int d()
  {
    return h - i;
  }
  
  public final boolean e()
  {
    boolean bool;
    if (h == f) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void g(int paramInt)
  {
    k = paramInt;
    int m = f + g;
    f = m;
    int n = m - i;
    if (n > paramInt)
    {
      paramInt = n - paramInt;
      g = paramInt;
      f = (m - paramInt);
    }
    else
    {
      g = 0;
    }
  }
  
  public final int h(int paramInt)
  {
    if (paramInt >= 0)
    {
      int m = h;
      int n = i;
      int i1 = m - n + paramInt;
      if (i1 >= 0)
      {
        m = k;
        if (i1 <= m)
        {
          k = i1;
          paramInt = f + g;
          f = paramInt;
          n = paramInt - n;
          if (n > i1)
          {
            n -= i1;
            g = n;
            f = (paramInt - n);
          }
          else
          {
            g = 0;
          }
          return m;
        }
        throw b0.h();
      }
      throw b0.g();
    }
    throw b0.f();
  }
  
  public final boolean i()
  {
    boolean bool;
    if (E() != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final h.h j()
  {
    int m = D();
    int n;
    int i1;
    Object localObject;
    if (m > 0)
    {
      n = f;
      i1 = h;
      if (m <= n - i1)
      {
        localObject = h.m(e, i1, m);
        h += m;
        return (h.h)localObject;
      }
    }
    if (m == 0) {
      return h.b;
    }
    if (m > 0)
    {
      i1 = f;
      n = h;
      if (m <= i1 - n)
      {
        m += n;
        h = m;
        localObject = Arrays.copyOfRange(e, n, m);
        break label115;
      }
    }
    if (m <= 0)
    {
      if (m == 0)
      {
        localObject = a0.b;
        label115:
        h.h localh = h.b;
        return new h.h((byte[])localObject);
      }
      throw b0.f();
    }
    throw b0.h();
  }
  
  public final double k()
  {
    return Double.longBitsToDouble(C());
  }
  
  public final int l()
  {
    return D();
  }
  
  public final int m()
  {
    return B();
  }
  
  public final long n()
  {
    return C();
  }
  
  public final float o()
  {
    return Float.intBitsToFloat(B());
  }
  
  public final int p()
  {
    return D();
  }
  
  public final long q()
  {
    return E();
  }
  
  public final int r()
  {
    return B();
  }
  
  public final long s()
  {
    return C();
  }
  
  public final int t()
  {
    return i.b(D());
  }
  
  public final long u()
  {
    return i.c(E());
  }
  
  public final String v()
  {
    int m = D();
    if (m > 0)
    {
      int n = f;
      int i1 = h;
      if (m <= n - i1)
      {
        String str = new String(e, i1, m, a0.a);
        h += m;
        return str;
      }
    }
    if (m == 0) {
      return "";
    }
    if (m < 0) {
      throw b0.f();
    }
    throw b0.h();
  }
  
  public final String w()
  {
    int m = D();
    if (m > 0)
    {
      int n = f;
      int i1 = h;
      if (m <= n - i1)
      {
        Object localObject = e;
        localObject = u1.a.a((byte[])localObject, i1, m);
        h += m;
        return (String)localObject;
      }
    }
    if (m == 0) {
      return "";
    }
    if (m <= 0) {
      throw b0.f();
    }
    throw b0.h();
  }
  
  public final int x()
  {
    if (e())
    {
      j = 0;
      return 0;
    }
    int m = D();
    j = m;
    if (m >>> 3 != 0) {
      return m;
    }
    throw b0.b();
  }
  
  public final int y()
  {
    return D();
  }
  
  public final long z()
  {
    return E();
  }
}

/* Location:
 * Qualified Name:     ma.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */