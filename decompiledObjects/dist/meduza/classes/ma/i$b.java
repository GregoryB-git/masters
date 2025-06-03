package ma;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

public final class i$b
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
  
  public i$b(ArrayList paramArrayList, int paramInt)
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

/* Location:
 * Qualified Name:     ma.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */