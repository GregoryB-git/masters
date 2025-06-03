package ma;

import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public abstract class i
{
  public int a;
  public int b = 100;
  public int c = Integer.MAX_VALUE;
  public j d;
  
  public static int b(int paramInt)
  {
    return -(paramInt & 0x1) ^ paramInt >>> 1;
  }
  
  public static long c(long paramLong)
  {
    return -(paramLong & 1L) ^ paramLong >>> 1;
  }
  
  public static a f(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramArrayOfByte = new a(paramArrayOfByte, paramInt1, paramInt2, paramBoolean);
    try
    {
      paramArrayOfByte.h(paramInt2);
      return paramArrayOfByte;
    }
    catch (b0 paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
  
  public abstract boolean A(int paramInt);
  
  public abstract void a(int paramInt);
  
  public abstract int d();
  
  public abstract boolean e();
  
  public abstract void g(int paramInt);
  
  public abstract int h(int paramInt);
  
  public abstract boolean i();
  
  public abstract h.h j();
  
  public abstract double k();
  
  public abstract int l();
  
  public abstract int m();
  
  public abstract long n();
  
  public abstract float o();
  
  public abstract int p();
  
  public abstract long q();
  
  public abstract int r();
  
  public abstract long s();
  
  public abstract int t();
  
  public abstract long u();
  
  public abstract String v();
  
  public abstract String w();
  
  public abstract int x();
  
  public abstract int y();
  
  public abstract long z();
  
  public static final class a
    extends i
  {
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;
    
    public a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
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
  
  public static final class b
    extends i
  {
    public final Iterable<ByteBuffer> e;
    public final Iterator<ByteBuffer> f;
    public ByteBuffer g;
    public int h;
    public int i;
    public int j = Integer.MAX_VALUE;
    public int k;
    public int l;
    public long m;
    public long n;
    public long o;
    
    public b(ArrayList paramArrayList, int paramInt)
    {
      h = paramInt;
      e = paramArrayList;
      f = paramArrayList.iterator();
      l = 0;
      if (paramInt == 0)
      {
        g = a0.c;
        m = 0L;
        n = 0L;
        o = 0L;
      }
      else
      {
        L();
      }
    }
    
    public final boolean A(int paramInt)
    {
      int i1 = paramInt & 0x7;
      int i2 = 0;
      if (i1 != 0)
      {
        if (i1 != 1) {
          if (i1 != 2)
          {
            if (i1 != 3)
            {
              if (i1 != 4)
              {
                if (i1 == 5)
                {
                  K(4);
                  return true;
                }
                throw b0.d();
              }
              return false;
            }
            do
            {
              i2 = x();
            } while ((i2 != 0) && (A(i2)));
            a(paramInt >>> 3 << 3 | 0x4);
            return true;
          }
        }
        for (paramInt = G();; paramInt = 8)
        {
          K(paramInt);
          return true;
        }
      }
      while (i2 < 10)
      {
        if (C() >= 0) {
          return true;
        }
        i2++;
      }
      throw b0.e();
    }
    
    public final void B()
    {
      if (f.hasNext())
      {
        L();
        return;
      }
      throw b0.h();
    }
    
    public final byte C()
    {
      if (o - m == 0L) {
        B();
      }
      long l1 = m;
      m = (1L + l1);
      return t1.h(l1);
    }
    
    public final void D(byte[] paramArrayOfByte, int paramInt)
    {
      if ((paramInt >= 0) && (paramInt <= J()))
      {
        int i1 = paramInt;
        while (i1 > 0)
        {
          if (o - m == 0L) {
            B();
          }
          int i2 = Math.min(i1, (int)(o - m));
          long l1 = m;
          long l2 = paramInt - i1 + 0;
          long l3 = i2;
          t1.c.c(l1, paramArrayOfByte, l2, l3);
          i1 -= i2;
          m += l3;
        }
        return;
      }
      if (paramInt <= 0)
      {
        if (paramInt == 0) {
          return;
        }
        throw b0.f();
      }
      throw b0.h();
    }
    
    public final int E()
    {
      long l1 = o;
      long l2 = m;
      int i1;
      if (l1 - l2 >= 4L)
      {
        m = (4L + l2);
        i1 = t1.h(l2) & 0xFF | (t1.h(1L + l2) & 0xFF) << 8 | (t1.h(2L + l2) & 0xFF) << 16;
      }
      for (int i2 = t1.h(l2 + 3L);; i2 = C())
      {
        return i1 | (i2 & 0xFF) << 24;
        i1 = C() & 0xFF | (C() & 0xFF) << 8 | (C() & 0xFF) << 16;
      }
    }
    
    public final long F()
    {
      long l1 = o;
      long l2 = m;
      if (l1 - l2 >= 8L)
      {
        m = (8L + l2);
        l3 = t1.h(l2);
        l4 = t1.h(1L + l2);
        l5 = t1.h(2L + l2);
        l6 = t1.h(3L + l2);
        l7 = t1.h(4L + l2);
        long l8 = t1.h(5L + l2);
        l1 = t1.h(6L + l2);
        return (t1.h(l2 + 7L) & 0xFF) << 56 | l3 & 0xFF | (l4 & 0xFF) << 8 | (l5 & 0xFF) << 16 | (l6 & 0xFF) << 24 | (l7 & 0xFF) << 32 | (l8 & 0xFF) << 40 | (l1 & 0xFF) << 48;
      }
      long l5 = C();
      l2 = C();
      long l4 = C();
      long l6 = C();
      long l7 = C();
      long l3 = C();
      l1 = C();
      return (C() & 0xFF) << 56 | l5 & 0xFF | (l2 & 0xFF) << 8 | (l4 & 0xFF) << 16 | (l6 & 0xFF) << 24 | (l7 & 0xFF) << 32 | (l3 & 0xFF) << 40 | (l1 & 0xFF) << 48;
    }
    
    public final int G()
    {
      long l1 = m;
      int i1;
      if (o != l1)
      {
        long l2 = l1 + 1L;
        i1 = t1.h(l1);
        if (i1 >= 0)
        {
          m += 1L;
          return i1;
        }
        if (o - m >= 10L)
        {
          l1 = l2 + 1L;
          i1 ^= t1.h(l2) << 7;
          if (i1 < 0)
          {
            i1 ^= 0xFFFFFF80;
            break label295;
          }
          l2 = l1 + 1L;
          i1 ^= t1.h(l1) << 14;
          if (i1 >= 0)
          {
            i1 ^= 0x3F80;
            l1 = l2;
          }
          int i3;
          long l4;
          do
          {
            long l3;
            do
            {
              int i2;
              do
              {
                break;
                l1 = l2 + 1L;
                i1 ^= t1.h(l2) << 21;
                if (i1 < 0)
                {
                  i1 ^= 0xFFE03F80;
                  break;
                }
                l2 = l1 + 1L;
                i2 = t1.h(l1);
                i3 = i1 ^ i2 << 28 ^ 0xFE03F80;
                i1 = i3;
                l1 = l2;
              } while (i2 >= 0);
              l3 = l2 + 1L;
              i1 = i3;
              l1 = l3;
              if (t1.h(l2) >= 0) {
                break;
              }
              l4 = l3 + 1L;
              i1 = i3;
              l1 = l4;
            } while (t1.h(l3) >= 0);
            l2 = l4 + 1L;
            i1 = i3;
            l1 = l2;
            if (t1.h(l4) >= 0) {
              break;
            }
            l4 = l2 + 1L;
            i1 = i3;
            l1 = l4;
          } while (t1.h(l2) >= 0);
          l1 = l4 + 1L;
          i1 = i3;
          if (t1.h(l4) >= 0) {
            break label295;
          }
        }
      }
      return (int)I();
      label295:
      m = l1;
      return i1;
    }
    
    public final long H()
    {
      long l1 = m;
      long l3;
      label208:
      label312:
      long l4;
      if (o != l1)
      {
        l2 = l1 + 1L;
        int i1 = t1.h(l1);
        if (i1 >= 0)
        {
          m += 1L;
          return i1;
        }
        if (o - m >= 10L)
        {
          l1 = l2 + 1L;
          i1 ^= t1.h(l2) << 7;
          if (i1 < 0)
          {
            i1 ^= 0xFFFFFF80;
            l2 = l1;
            l1 = i1;
            break label371;
          }
          l2 = l1 + 1L;
          i1 ^= t1.h(l1) << 14;
          if (i1 >= 0) {
            l1 = i1 ^ 0x3F80;
          }
          do
          {
            for (;;)
            {
              break label371;
              l1 = l2 + 1L;
              i1 ^= t1.h(l2) << 21;
              if (i1 < 0)
              {
                i1 ^= 0xFFE03F80;
                l2 = l1;
                break;
              }
              l3 = i1;
              l2 = l1 + 1L;
              l3 ^= t1.h(l1) << 28;
              if (l3 < 0L) {
                break label208;
              }
              l1 = 266354560L;
              l1 = l3 ^ l1;
            }
            l1 = l2 + 1L;
            l3 ^= t1.h(l2) << 35;
            if (l3 < 0L) {}
            for (l2 = -34093383808L;; l2 = -558586000294016L)
            {
              l3 ^= l2;
              l2 = l1;
              l1 = l3;
              break label371;
              l2 = l1 + 1L;
              l3 ^= t1.h(l1) << 42;
              if (l3 >= 0L)
              {
                l1 = 4363953127296L;
                break;
              }
              l1 = l2 + 1L;
              l3 ^= t1.h(l2) << 49;
              if (l3 >= 0L) {
                break label312;
              }
            }
            l4 = l1 + 1L;
            l3 = l3 ^ t1.h(l1) << 56 ^ 0xFE03F80FE03F80;
            l1 = l3;
            l2 = l4;
          } while (l3 >= 0L);
          if (t1.h(l4) >= 0L) {
            break label363;
          }
        }
      }
      return I();
      label363:
      long l2 = 1L + l4;
      l1 = l3;
      label371:
      m = l2;
      return l1;
    }
    
    public final long I()
    {
      long l1 = 0L;
      for (int i1 = 0; i1 < 64; i1 += 7)
      {
        int i2 = C();
        l1 |= (i2 & 0x7F) << i1;
        if ((i2 & 0x80) == 0) {
          return l1;
        }
      }
      throw b0.e();
    }
    
    public final int J()
    {
      return (int)(h - l - m + n);
    }
    
    public final void K(int paramInt)
    {
      if ((paramInt >= 0) && (paramInt <= h - l - m + n))
      {
        while (paramInt > 0)
        {
          if (o - m == 0L) {
            B();
          }
          int i1 = Math.min(paramInt, (int)(o - m));
          paramInt -= i1;
          m += i1;
        }
        return;
      }
      if (paramInt < 0) {
        throw b0.f();
      }
      throw b0.h();
    }
    
    public final void L()
    {
      ByteBuffer localByteBuffer = (ByteBuffer)f.next();
      g = localByteBuffer;
      l += (int)(m - n);
      long l1 = localByteBuffer.position();
      m = l1;
      n = l1;
      o = g.limit();
      localByteBuffer = g;
      l1 = t1.c.j(localByteBuffer, t1.g);
      m += l1;
      n += l1;
      o += l1;
    }
    
    public final void a(int paramInt)
    {
      if (k == paramInt) {
        return;
      }
      throw b0.a();
    }
    
    public final int d()
    {
      return (int)(l + 0 + m - n);
    }
    
    public final boolean e()
    {
      boolean bool;
      if (l + m - n == h) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final void g(int paramInt)
    {
      j = paramInt;
      int i1 = h + i;
      h = i1;
      int i2 = i1 + 0;
      if (i2 > paramInt)
      {
        paramInt = i2 - paramInt;
        i = paramInt;
        h = (i1 - paramInt);
      }
      else
      {
        i = 0;
      }
    }
    
    public final int h(int paramInt)
    {
      if (paramInt >= 0)
      {
        int i1 = d() + paramInt;
        paramInt = j;
        if (i1 <= paramInt)
        {
          j = i1;
          int i2 = h + i;
          h = i2;
          int i3 = i2 + 0;
          if (i3 > i1)
          {
            i3 -= i1;
            i = i3;
            h = (i2 - i3);
          }
          else
          {
            i = 0;
          }
          return paramInt;
        }
        throw b0.h();
      }
      throw b0.f();
    }
    
    public final boolean i()
    {
      boolean bool;
      if (H() != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final h.h j()
    {
      int i1 = G();
      Object localObject1;
      Object localObject2;
      if (i1 > 0)
      {
        long l1 = i1;
        long l2 = o;
        long l3 = m;
        if (l1 <= l2 - l3)
        {
          localObject1 = new byte[i1];
          t1.c.c(l3, (byte[])localObject1, 0L, l1);
          m += l1;
          localObject2 = h.b;
          return new h.h((byte[])localObject1);
        }
      }
      if ((i1 > 0) && (i1 <= J()))
      {
        localObject2 = new byte[i1];
        D((byte[])localObject2, i1);
        localObject1 = h.b;
        return new h.h((byte[])localObject2);
      }
      if (i1 == 0) {
        return h.b;
      }
      if (i1 < 0) {
        throw b0.f();
      }
      throw b0.h();
    }
    
    public final double k()
    {
      return Double.longBitsToDouble(F());
    }
    
    public final int l()
    {
      return G();
    }
    
    public final int m()
    {
      return E();
    }
    
    public final long n()
    {
      return F();
    }
    
    public final float o()
    {
      return Float.intBitsToFloat(E());
    }
    
    public final int p()
    {
      return G();
    }
    
    public final long q()
    {
      return H();
    }
    
    public final int r()
    {
      return E();
    }
    
    public final long s()
    {
      return F();
    }
    
    public final int t()
    {
      return i.b(G());
    }
    
    public final long u()
    {
      return i.c(H());
    }
    
    public final String v()
    {
      int i1 = G();
      Object localObject;
      if (i1 > 0)
      {
        long l1 = i1;
        long l2 = o;
        long l3 = m;
        if (l1 <= l2 - l3)
        {
          localObject = new byte[i1];
          t1.c.c(l3, (byte[])localObject, 0L, l1);
          localObject = new String((byte[])localObject, a0.a);
          m += l1;
          return (String)localObject;
        }
      }
      if ((i1 > 0) && (i1 <= J()))
      {
        localObject = new byte[i1];
        D((byte[])localObject, i1);
        return new String((byte[])localObject, a0.a);
      }
      if (i1 == 0) {
        return "";
      }
      if (i1 < 0) {
        throw b0.f();
      }
      throw b0.h();
    }
    
    public final String w()
    {
      int i1 = G();
      Object localObject;
      if (i1 > 0)
      {
        long l1 = i1;
        long l2 = o;
        long l3 = m;
        if (l1 <= l2 - l3)
        {
          localObject = u1.a((int)(l3 - n), g, i1);
          m += l1;
          return (String)localObject;
        }
      }
      if ((i1 >= 0) && (i1 <= J()))
      {
        localObject = new byte[i1];
        D((byte[])localObject, i1);
        return u1.a.a((byte[])localObject, 0, i1);
      }
      if (i1 == 0) {
        return "";
      }
      if (i1 <= 0) {
        throw b0.f();
      }
      throw b0.h();
    }
    
    public final int x()
    {
      if (e())
      {
        k = 0;
        return 0;
      }
      int i1 = G();
      k = i1;
      if (i1 >>> 3 != 0) {
        return i1;
      }
      throw b0.b();
    }
    
    public final int y()
    {
      return G();
    }
    
    public final long z()
    {
      return H();
    }
  }
  
  public static final class c
    extends i
  {
    public final InputStream e;
    public final byte[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l = Integer.MAX_VALUE;
    
    public c(InputStream paramInputStream)
    {
      Charset localCharset = a0.a;
      e = paramInputStream;
      f = new byte['က'];
      g = 0;
      i = 0;
      k = 0;
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
                  L(4);
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
          paramInt = G();
        }
        else
        {
          paramInt = 8;
        }
        L(paramInt);
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
        throw b0.e();
      }
      while (paramInt < 10)
      {
        if (i == g) {
          K(1);
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
      throw b0.e();
    }
    
    public final byte[] B(int paramInt)
    {
      byte[] arrayOfByte = C(paramInt);
      if (arrayOfByte != null) {
        return arrayOfByte;
      }
      int m = i;
      int n = g;
      int i1 = n - m;
      k += n;
      i = 0;
      g = 0;
      Object localObject = D(paramInt - i1);
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
    
    public final byte[] C(int paramInt)
    {
      if (paramInt == 0) {
        return a0.b;
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
            n = g - n;
            m = paramInt - n;
            if (m >= 4096)
            {
              InputStream localInputStream1 = e;
              try
              {
                i2 = localInputStream1.available();
                if (m > i2) {
                  return null;
                }
              }
              catch (b0 localb01)
              {
                b = true;
                throw localb01;
              }
            }
            byte[] arrayOfByte = new byte[paramInt];
            System.arraycopy(f, i, arrayOfByte, 0, n);
            k += g;
            i = 0;
            g = 0;
            while (n < paramInt)
            {
              InputStream localInputStream2 = e;
              try
              {
                m = localInputStream2.read(arrayOfByte, n, paramInt - n);
                if (m != -1)
                {
                  k += m;
                  n += m;
                }
                else
                {
                  throw b0.h();
                }
              }
              catch (b0 localb02)
              {
                b = true;
                throw localb02;
              }
            }
            return localb02;
          }
          L(i2 - m - n);
          throw b0.h();
        }
        throw new b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
      }
      throw b0.f();
    }
    
    public final ArrayList D(int paramInt)
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
            throw b0.h();
          }
        }
        paramInt -= m;
        localArrayList.add(arrayOfByte);
      }
      return localArrayList;
    }
    
    public final int E()
    {
      int m = i;
      int n = m;
      if (g - m < 4)
      {
        K(4);
        n = i;
      }
      byte[] arrayOfByte = f;
      i = (n + 4);
      int i1 = arrayOfByte[n];
      int i2 = arrayOfByte[(n + 1)];
      m = arrayOfByte[(n + 2)];
      return (arrayOfByte[(n + 3)] & 0xFF) << 24 | i1 & 0xFF | (i2 & 0xFF) << 8 | (m & 0xFF) << 16;
    }
    
    public final long F()
    {
      int m = i;
      int n = m;
      if (g - m < 8)
      {
        K(8);
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
    
    public final int G()
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
            int i4;
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
              i4 = i2 + 1;
              i1 = m;
              n = i4;
              if (arrayOfByte[i2] >= 0) {
                break;
              }
              i3 = i4 + 1;
              i1 = m;
              n = i3;
            } while (arrayOfByte[i4] >= 0);
            i2 = i3 + 1;
            i1 = m;
            n = i2;
            if (arrayOfByte[i3] >= 0) {
              break;
            }
            i3 = i2 + 1;
            i1 = m;
            n = i3;
          } while (arrayOfByte[i2] >= 0);
          n = i3 + 1;
          i1 = m;
          if (arrayOfByte[i3] >= 0) {
            break label278;
          }
        }
      }
      return (int)I();
      label278:
      i = n;
      return i1;
    }
    
    public final long H()
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
          l1 ^= arrayOfByte[n] << 28;
          if (l1 >= 0L)
          {
            l2 = 266354560L;
            n = i1;
            l1 ^= l2;
            break label359;
          }
          n = i1 + 1;
          l1 ^= arrayOfByte[i1] << 35;
          if (l1 < 0L) {}
          for (long l2 = -34093383808L;; l2 = -558586000294016L)
          {
            l1 ^= l2;
            break label359;
            i1 = n + 1;
            l1 ^= arrayOfByte[n] << 42;
            if (l1 >= 0L)
            {
              l2 = 4363953127296L;
              n = i1;
              break;
            }
            n = i1 + 1;
            l1 ^= arrayOfByte[i1] << 49;
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
      return I();
      label356:
      n = i1;
      label359:
      i = n;
      return l1;
    }
    
    public final long I()
    {
      long l1 = 0L;
      for (int m = 0; m < 64; m += 7)
      {
        if (i == g) {
          K(1);
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
      throw b0.e();
    }
    
    public final void J()
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
    
    public final void K(int paramInt)
    {
      if (!M(paramInt))
      {
        if (paramInt > c - k - i) {
          throw new b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw b0.h();
      }
    }
    
    public final void L(int paramInt)
    {
      int m = g;
      int i1 = i;
      int i2;
      int i4;
      if ((paramInt <= m - i1) && (paramInt >= 0))
      {
        i = (i1 + paramInt);
      }
      else
      {
        if (paramInt < 0) {
          break label339;
        }
        i2 = k;
        int i3 = i2 + i1;
        i4 = l;
        if (i3 + paramInt > i4) {
          break label324;
        }
        k = i3;
        i3 = m - i1;
        g = 0;
        i = 0;
        while (i3 < paramInt) {
          try
          {
            Object localObject1 = e;
            long l1 = paramInt - i3;
            try
            {
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
                localObject1 = new java/lang/IllegalStateException;
                StringBuilder localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>();
                localStringBuilder.append(e.getClass());
                localStringBuilder.append("#skip returned invalid result: ");
                localStringBuilder.append(l2);
                localStringBuilder.append("\nThe InputStream implementation is buggy.");
                ((IllegalStateException)localObject1).<init>(localStringBuilder.toString());
                throw ((Throwable)localObject1);
              }
            }
            catch (b0 localb0)
            {
              b = true;
              throw localb0;
            }
            k += i3;
          }
          finally
          {
            k += i3;
            J();
          }
        }
        J();
        if (i3 < paramInt)
        {
          int n = g;
          i3 = n - i;
          for (i = n;; i = n)
          {
            K(1);
            i2 = paramInt - i3;
            n = g;
            if (i2 <= n) {
              break;
            }
            i3 += n;
          }
          i = i2;
        }
      }
      return;
      label324:
      L(i4 - i2 - i1);
      throw b0.h();
      label339:
      throw b0.f();
    }
    
    public final boolean M(int paramInt)
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
        Object localObject = e;
        byte[] arrayOfByte = f;
        n = g;
        i1 = Math.min(arrayOfByte.length - n, c - k - n);
        boolean bool = true;
        try
        {
          n = ((InputStream)localObject).read(arrayOfByte, n, i1);
          if ((n != 0) && (n >= -1) && (n <= f.length))
          {
            if (n > 0)
            {
              g += n;
              J();
              if (g < paramInt) {
                bool = M(paramInt);
              }
              return bool;
            }
            return false;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(e.getClass());
          ((StringBuilder)localObject).append("#read(byte[]) returned invalid result: ");
          ((StringBuilder)localObject).append(n);
          ((StringBuilder)localObject).append("\nThe InputStream implementation is buggy.");
          throw new IllegalStateException(((StringBuilder)localObject).toString());
        }
        catch (b0 localb0)
        {
          b = true;
          throw localb0;
        }
      }
      throw new IllegalStateException(a0.j.h("refillBuffer() called when ", paramInt, " bytes were already available in buffer"));
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
      return k + i;
    }
    
    public final boolean e()
    {
      int m = i;
      int n = g;
      boolean bool = true;
      if ((m != n) || (M(1))) {
        bool = false;
      }
      return bool;
    }
    
    public final void g(int paramInt)
    {
      l = paramInt;
      J();
    }
    
    public final int h(int paramInt)
    {
      if (paramInt >= 0)
      {
        paramInt = k + i + paramInt;
        int m = l;
        if (paramInt <= m)
        {
          l = paramInt;
          J();
          return m;
        }
        throw b0.h();
      }
      throw b0.f();
    }
    
    public final boolean i()
    {
      boolean bool;
      if (H() != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final h.h j()
    {
      int m = G();
      int n = g;
      int i1 = i;
      if ((m <= n - i1) && (m > 0))
      {
        localObject1 = h.m(f, i1, m);
        i += m;
        return (h.h)localObject1;
      }
      if (m == 0) {
        return h.b;
      }
      Object localObject1 = C(m);
      if (localObject1 != null)
      {
        localObject1 = h.m((byte[])localObject1, 0, localObject1.length);
      }
      else
      {
        int i2 = i;
        n = g;
        i1 = n - i2;
        k += n;
        i = 0;
        g = 0;
        Object localObject2 = D(m - i1);
        localObject1 = new byte[m];
        System.arraycopy(f, i2, localObject1, 0, i1);
        localObject2 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          byte[] arrayOfByte = (byte[])((Iterator)localObject2).next();
          System.arraycopy(arrayOfByte, 0, localObject1, i1, arrayOfByte.length);
          i1 += arrayOfByte.length;
        }
        localObject2 = h.b;
        localObject1 = new h.h((byte[])localObject1);
      }
      return (h.h)localObject1;
    }
    
    public final double k()
    {
      return Double.longBitsToDouble(F());
    }
    
    public final int l()
    {
      return G();
    }
    
    public final int m()
    {
      return E();
    }
    
    public final long n()
    {
      return F();
    }
    
    public final float o()
    {
      return Float.intBitsToFloat(E());
    }
    
    public final int p()
    {
      return G();
    }
    
    public final long q()
    {
      return H();
    }
    
    public final int r()
    {
      return E();
    }
    
    public final long s()
    {
      return F();
    }
    
    public final int t()
    {
      return i.b(G());
    }
    
    public final long u()
    {
      return i.c(H());
    }
    
    public final String v()
    {
      int m = G();
      String str;
      if (m > 0)
      {
        int n = g;
        int i1 = i;
        if (m <= n - i1)
        {
          str = new String(f, i1, m, a0.a);
          i += m;
          return str;
        }
      }
      if (m == 0) {
        return "";
      }
      if (m <= g)
      {
        K(m);
        str = new String(f, i, m, a0.a);
        i += m;
        return str;
      }
      return new String(B(m), a0.a);
    }
    
    public final String w()
    {
      int m = G();
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
          K(m);
          arrayOfByte = f;
          i = (m + 0);
        }
        else
        {
          arrayOfByte = B(m);
        }
        n = 0;
      }
      return u1.a.a(arrayOfByte, n, m);
    }
    
    public final int x()
    {
      if (e())
      {
        j = 0;
        return 0;
      }
      int m = G();
      j = m;
      if (m >>> 3 != 0) {
        return m;
      }
      throw b0.b();
    }
    
    public final int y()
    {
      return G();
    }
    
    public final long z()
    {
      return H();
    }
  }
}

/* Location:
 * Qualified Name:     ma.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */