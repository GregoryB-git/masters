package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

public final class i$b
  extends i
{
  public final byte[] g;
  public final boolean h;
  public int i;
  public int j;
  public int k;
  public int l;
  public int m;
  public boolean n;
  public int o = Integer.MAX_VALUE;
  
  public i$b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(null);
    g = paramArrayOfByte;
    i = (paramInt2 + paramInt1);
    k = paramInt1;
    l = paramInt1;
    h = paramBoolean;
  }
  
  public String A()
  {
    int i1 = J();
    if (i1 > 0)
    {
      int i2 = i;
      int i3 = k;
      if (i1 <= i2 - i3)
      {
        String str = p0.e(g, i3, i1);
        k += i1;
        return str;
      }
    }
    if (i1 == 0) {
      return "";
    }
    if (i1 <= 0) {
      throw A.g();
    }
    throw A.m();
  }
  
  public int B()
  {
    if (e())
    {
      m = 0;
      return 0;
    }
    int i1 = J();
    m = i1;
    if (q0.a(i1) != 0) {
      return m;
    }
    throw A.c();
  }
  
  public int C()
  {
    return J();
  }
  
  public long D()
  {
    return K();
  }
  
  public boolean E(int paramInt)
  {
    int i1 = q0.b(paramInt);
    if (i1 != 0)
    {
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            if (i1 != 4)
            {
              if (i1 == 5)
              {
                O(4);
                return true;
              }
              throw A.e();
            }
            return false;
          }
          N();
          a(q0.c(q0.a(paramInt), 4));
          return true;
        }
        O(J());
        return true;
      }
      O(8);
      return true;
    }
    P();
    return true;
  }
  
  public byte F()
  {
    int i1 = k;
    if (i1 != i)
    {
      byte[] arrayOfByte = g;
      k = (i1 + 1);
      return arrayOfByte[i1];
    }
    throw A.m();
  }
  
  public byte[] G(int paramInt)
  {
    if (paramInt > 0)
    {
      int i1 = i;
      int i2 = k;
      if (paramInt <= i1 - i2)
      {
        paramInt += i2;
        k = paramInt;
        return Arrays.copyOfRange(g, i2, paramInt);
      }
    }
    if (paramInt <= 0)
    {
      if (paramInt == 0) {
        return z.d;
      }
      throw A.g();
    }
    throw A.m();
  }
  
  public int H()
  {
    int i1 = k;
    if (i - i1 >= 4)
    {
      byte[] arrayOfByte = g;
      k = (i1 + 4);
      int i2 = arrayOfByte[i1];
      int i3 = arrayOfByte[(i1 + 1)];
      int i4 = arrayOfByte[(i1 + 2)];
      return (arrayOfByte[(i1 + 3)] & 0xFF) << 24 | i2 & 0xFF | (i3 & 0xFF) << 8 | (i4 & 0xFF) << 16;
    }
    throw A.m();
  }
  
  public long I()
  {
    int i1 = k;
    if (i - i1 >= 8)
    {
      byte[] arrayOfByte = g;
      k = (i1 + 8);
      long l1 = arrayOfByte[i1];
      long l2 = arrayOfByte[(i1 + 1)];
      long l3 = arrayOfByte[(i1 + 2)];
      long l4 = arrayOfByte[(i1 + 3)];
      long l5 = arrayOfByte[(i1 + 4)];
      long l6 = arrayOfByte[(i1 + 5)];
      long l7 = arrayOfByte[(i1 + 6)];
      return (arrayOfByte[(i1 + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
    }
    throw A.m();
  }
  
  public int J()
  {
    int i1 = k;
    int i2 = i;
    byte[] arrayOfByte;
    int i3;
    int i4;
    if (i2 != i1)
    {
      arrayOfByte = g;
      i3 = i1 + 1;
      i4 = arrayOfByte[i1];
      if (i4 >= 0)
      {
        k = i3;
        return i4;
      }
      if (i2 - i3 >= 9)
      {
        i2 = i1 + 2;
        i4 = arrayOfByte[i3] << 7 ^ i4;
        if (i4 < 0)
        {
          i4 ^= 0xFFFFFF80;
          break label302;
        }
        i3 = i1 + 3;
        i2 = arrayOfByte[i2] << 14 ^ i4;
        if (i2 >= 0)
        {
          i2 ^= 0x3F80;
          i4 = i3;
          i3 = i4;
          i4 = i2;
          i2 = i3;
          break label302;
        }
        i4 = i1 + 4;
        i2 ^= arrayOfByte[i3] << 21;
        if (i2 < 0) {
          i2 = 0xFFE03F80 ^ i2;
        }
      }
    }
    label299:
    for (;;)
    {
      i3 = i4;
      i4 = i2;
      i2 = i3;
      break label302;
      i3 = i1 + 5;
      int i5 = arrayOfByte[i4];
      i2 = i2 ^ i5 << 28 ^ 0xFE03F80;
      i4 = i3;
      if (i5 < 0)
      {
        i5 = i1 + 6;
        i4 = i5;
        if (arrayOfByte[i3] >= 0) {
          break label299;
        }
        i3 = i1 + 7;
        i4 = i3;
        if (arrayOfByte[i5] < 0)
        {
          i5 = i1 + 8;
          i4 = i5;
          if (arrayOfByte[i3] >= 0) {
            break label299;
          }
          i3 = i1 + 9;
          i4 = i3;
          if (arrayOfByte[i5] < 0)
          {
            if (arrayOfByte[i3] < 0) {
              return (int)L();
            }
            i3 = i1 + 10;
            i4 = i2;
            i2 = i3;
            break label302;
          }
        }
      }
      break;
    }
    label302:
    k = i2;
    return i4;
  }
  
  public long K()
  {
    int i1 = k;
    int i2 = i;
    long l1;
    if (i2 != i1)
    {
      byte[] arrayOfByte = g;
      int i3 = i1 + 1;
      int i4 = arrayOfByte[i1];
      if (i4 >= 0)
      {
        k = i3;
        return i4;
      }
      if (i2 - i3 >= 9)
      {
        i2 = i1 + 2;
        i3 = arrayOfByte[i3] << 7 ^ i4;
        if (i3 < 0)
        {
          l1 = i3 ^ 0xFFFFFF80;
          break label373;
        }
        i4 = i1 + 3;
        i3 = arrayOfByte[i2] << 14 ^ i3;
        if (i3 >= 0)
        {
          l1 = i3 ^ 0x3F80;
          i2 = i4;
          break label373;
        }
        i2 = i1 + 4;
        i4 = i3 ^ arrayOfByte[i4] << 21;
        if (i4 < 0)
        {
          l1 = 0xFFE03F80 ^ i4;
          break label373;
        }
        l1 = i4;
        i4 = i1 + 5;
        long l2 = l1 ^ arrayOfByte[i2] << 28;
        if (l2 >= 0L)
        {
          l1 = 266354560L;
          i2 = i4;
          l1 = l2 ^ l1;
          break label373;
        }
        i3 = i1 + 6;
        l2 ^= arrayOfByte[i4] << 35;
        if (l2 < 0L) {
          l1 = -34093383808L;
        }
        for (i2 = i3;; i2 = i4)
        {
          l1 = l2 ^ l1;
          break label373;
          i2 = i1 + 7;
          l2 ^= arrayOfByte[i3] << 42;
          if (l2 >= 0L)
          {
            l1 = 4363953127296L;
            break;
          }
          i4 = i1 + 8;
          l2 ^= arrayOfByte[i2] << 49;
          if (l2 >= 0L) {
            break label320;
          }
          l1 = -558586000294016L;
        }
        label320:
        i3 = i1 + 9;
        l1 = l2 ^ arrayOfByte[i4] << 56 ^ 0xFE03F80FE03F80;
        i2 = i3;
        if (l1 >= 0L) {
          break label373;
        }
        if (arrayOfByte[i3] >= 0L) {
          break label368;
        }
      }
    }
    return L();
    label368:
    i2 = i1 + 10;
    label373:
    k = i2;
    return l1;
  }
  
  public long L()
  {
    long l1 = 0L;
    for (int i1 = 0; i1 < 64; i1 += 7)
    {
      int i2 = F();
      l1 |= (i2 & 0x7F) << i1;
      if ((i2 & 0x80) == 0) {
        return l1;
      }
    }
    throw A.f();
  }
  
  public final void M()
  {
    int i1 = i + j;
    i = i1;
    int i2 = i1 - l;
    int i3 = o;
    if (i2 > i3)
    {
      i3 = i2 - i3;
      j = i3;
      i = (i1 - i3);
    }
    else
    {
      j = 0;
    }
  }
  
  public void N()
  {
    int i1;
    do
    {
      i1 = B();
    } while ((i1 != 0) && (E(i1)));
  }
  
  public void O(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i1 = i;
      int i2 = k;
      if (paramInt <= i1 - i2)
      {
        k = (i2 + paramInt);
        return;
      }
    }
    if (paramInt < 0) {
      throw A.g();
    }
    throw A.m();
  }
  
  public final void P()
  {
    if (i - k >= 10) {
      Q();
    } else {
      R();
    }
  }
  
  public final void Q()
  {
    for (int i1 = 0; i1 < 10; i1++)
    {
      byte[] arrayOfByte = g;
      int i2 = k;
      k = (i2 + 1);
      if (arrayOfByte[i2] >= 0) {
        return;
      }
    }
    throw A.f();
  }
  
  public final void R()
  {
    for (int i1 = 0; i1 < 10; i1++) {
      if (F() >= 0) {
        return;
      }
    }
    throw A.f();
  }
  
  public void a(int paramInt)
  {
    if (m == paramInt) {
      return;
    }
    throw A.b();
  }
  
  public int d()
  {
    return k - l;
  }
  
  public boolean e()
  {
    boolean bool;
    if (k == i) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void k(int paramInt)
  {
    o = paramInt;
    M();
  }
  
  public int l(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i1 = paramInt + d();
      if (i1 >= 0)
      {
        paramInt = o;
        if (i1 <= paramInt)
        {
          o = i1;
          M();
          return paramInt;
        }
        throw A.m();
      }
      throw A.h();
    }
    throw A.g();
  }
  
  public boolean m()
  {
    boolean bool;
    if (K() != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public h n()
  {
    int i1 = J();
    if (i1 > 0)
    {
      int i2 = i;
      int i3 = k;
      if (i1 <= i2 - i3)
      {
        h localh;
        if ((h) && (n)) {
          localh = h.f0(g, i3, i1);
        } else {
          localh = h.k(g, i3, i1);
        }
        k += i1;
        return localh;
      }
    }
    if (i1 == 0) {
      return h.p;
    }
    return h.e0(G(i1));
  }
  
  public double o()
  {
    return Double.longBitsToDouble(I());
  }
  
  public int p()
  {
    return J();
  }
  
  public int q()
  {
    return H();
  }
  
  public long r()
  {
    return I();
  }
  
  public float s()
  {
    return Float.intBitsToFloat(H());
  }
  
  public int t()
  {
    return J();
  }
  
  public long u()
  {
    return K();
  }
  
  public int v()
  {
    return H();
  }
  
  public long w()
  {
    return I();
  }
  
  public int x()
  {
    return i.b(J());
  }
  
  public long y()
  {
    return i.c(K());
  }
  
  public String z()
  {
    int i1 = J();
    if (i1 > 0)
    {
      int i2 = i;
      int i3 = k;
      if (i1 <= i2 - i3)
      {
        String str = new String(g, i3, i1, z.b);
        k += i1;
        return str;
      }
    }
    if (i1 == 0) {
      return "";
    }
    if (i1 < 0) {
      throw A.g();
    }
    throw A.m();
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */