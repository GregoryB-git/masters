package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

public abstract class e
{
  public static int A(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    paramd = (F)paramd;
    int i;
    for (paramInt2 = K(paramArrayOfByte, paramInt2, parama);; paramInt2 = K(paramArrayOfByte, i, parama))
    {
      paramd.d(i.c(b));
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = H(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int B(byte[] paramArrayOfByte, int paramInt, a parama)
  {
    int i = H(paramArrayOfByte, paramInt, parama);
    paramInt = a;
    if (paramInt >= 0)
    {
      if (paramInt == 0)
      {
        c = "";
        return i;
      }
      c = new String(paramArrayOfByte, i, paramInt, z.b);
      return i + paramInt;
    }
    throw A.g();
  }
  
  public static int C(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    paramInt2 = H(paramArrayOfByte, paramInt2, parama);
    int i = a;
    if (i >= 0)
    {
      String str;
      int j;
      if (i == 0)
      {
        paramd.add("");
      }
      else
      {
        str = new String(paramArrayOfByte, paramInt2, i, z.b);
        j = paramInt2;
        paramInt2 = i;
      }
      for (;;)
      {
        paramd.add(str);
        paramInt2 = j + paramInt2;
        if (paramInt2 >= paramInt3) {
          break label154;
        }
        j = H(paramArrayOfByte, paramInt2, parama);
        if (paramInt1 != a) {
          break label154;
        }
        j = H(paramArrayOfByte, j, parama);
        paramInt2 = a;
        if (paramInt2 < 0) {
          break label150;
        }
        if (paramInt2 == 0)
        {
          paramInt2 = j;
          break;
        }
        str = new String(paramArrayOfByte, j, paramInt2, z.b);
      }
      label150:
      throw A.g();
      label154:
      return paramInt2;
    }
    throw A.g();
  }
  
  public static int D(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    paramInt2 = H(paramArrayOfByte, paramInt2, parama);
    int i = a;
    if (i >= 0)
    {
      int j;
      String str;
      if (i == 0)
      {
        paramd.add("");
      }
      else
      {
        j = paramInt2 + i;
        if (!p0.n(paramArrayOfByte, paramInt2, j)) {
          break label186;
        }
        str = new String(paramArrayOfByte, paramInt2, i, z.b);
      }
      for (paramInt2 = j;; paramInt2 = j)
      {
        paramd.add(str);
        if (paramInt2 >= paramInt3) {
          break label184;
        }
        j = H(paramArrayOfByte, paramInt2, parama);
        if (paramInt1 != a) {
          break label184;
        }
        paramInt2 = H(paramArrayOfByte, j, parama);
        i = a;
        if (i < 0) {
          break label180;
        }
        if (i == 0) {
          break;
        }
        j = paramInt2 + i;
        if (!p0.n(paramArrayOfByte, paramInt2, j)) {
          break label176;
        }
        str = new String(paramArrayOfByte, paramInt2, i, z.b);
      }
      label176:
      throw A.d();
      label180:
      throw A.g();
      label184:
      return paramInt2;
      label186:
      throw A.d();
    }
    throw A.g();
  }
  
  public static int E(byte[] paramArrayOfByte, int paramInt, a parama)
  {
    paramInt = H(paramArrayOfByte, paramInt, parama);
    int i = a;
    if (i >= 0)
    {
      if (i == 0)
      {
        c = "";
        return paramInt;
      }
      c = p0.e(paramArrayOfByte, paramInt, i);
      return paramInt + i;
    }
    throw A.g();
  }
  
  public static int F(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, l0 paraml0, a parama)
  {
    if (q0.a(paramInt1) != 0)
    {
      int i = q0.b(paramInt1);
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i == 5)
              {
                paraml0.n(paramInt1, Integer.valueOf(g(paramArrayOfByte, paramInt2)));
                return paramInt2 + 4;
              }
              throw A.c();
            }
            l0 locall0 = l0.k();
            int j = paramInt1 & 0xFFFFFFF8 | 0x4;
            i = 0;
            int k;
            for (;;)
            {
              k = paramInt2;
              if (paramInt2 >= paramInt3) {
                break;
              }
              k = H(paramArrayOfByte, paramInt2, parama);
              paramInt2 = a;
              i = paramInt2;
              if (paramInt2 == j) {
                break;
              }
              k = F(i, paramArrayOfByte, k, paramInt3, locall0, parama);
              i = paramInt2;
              paramInt2 = k;
            }
            if ((k <= paramInt3) && (i == j))
            {
              paraml0.n(paramInt1, locall0);
              return k;
            }
            throw A.h();
          }
          paramInt2 = H(paramArrayOfByte, paramInt2, parama);
          paramInt3 = a;
          if (paramInt3 >= 0)
          {
            if (paramInt3 <= paramArrayOfByte.length - paramInt2)
            {
              if (paramInt3 == 0) {}
              for (paramArrayOfByte = h.p;; paramArrayOfByte = h.k(paramArrayOfByte, paramInt2, paramInt3))
              {
                paraml0.n(paramInt1, paramArrayOfByte);
                break;
              }
              return paramInt2 + paramInt3;
            }
            throw A.m();
          }
          throw A.g();
        }
        paraml0.n(paramInt1, Long.valueOf(i(paramArrayOfByte, paramInt2)));
        return paramInt2 + 8;
      }
      paramInt2 = K(paramArrayOfByte, paramInt2, parama);
      paraml0.n(paramInt1, Long.valueOf(b));
      return paramInt2;
    }
    throw A.c();
  }
  
  public static int G(int paramInt1, byte[] paramArrayOfByte, int paramInt2, a parama)
  {
    paramInt1 &= 0x7F;
    int i = paramInt2 + 1;
    int j = paramArrayOfByte[paramInt2];
    if (j >= 0)
    {
      j <<= 7;
      paramInt2 = i;
    }
    for (;;)
    {
      a = (paramInt1 | j);
      return paramInt2;
      paramInt1 |= (j & 0x7F) << 7;
      int k = paramInt2 + 2;
      j = paramArrayOfByte[i];
      if (j >= 0)
      {
        a = (paramInt1 | j << 14);
        return k;
      }
      j = paramInt1 | (j & 0x7F) << 14;
      paramInt1 = paramInt2 + 3;
      i = paramArrayOfByte[k];
      if (i < 0) {
        break;
      }
      i <<= 21;
      paramInt2 = paramInt1;
      paramInt1 = j;
      j = i;
    }
    j |= (i & 0x7F) << 21;
    paramInt2 += 4;
    i = paramArrayOfByte[paramInt1];
    if (i >= 0)
    {
      a = (j | i << 28);
      return paramInt2;
    }
    for (paramInt1 = paramInt2;; paramInt1 = paramInt2)
    {
      paramInt2 = paramInt1 + 1;
      if (paramArrayOfByte[paramInt1] >= 0) {
        break;
      }
    }
    a = (j | (i & 0x7F) << 28);
    return paramInt2;
  }
  
  public static int H(byte[] paramArrayOfByte, int paramInt, a parama)
  {
    int i = paramInt + 1;
    paramInt = paramArrayOfByte[paramInt];
    if (paramInt >= 0)
    {
      a = paramInt;
      return i;
    }
    return G(paramInt, paramArrayOfByte, i, parama);
  }
  
  public static int I(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    paramd = (y)paramd;
    int i;
    for (paramInt2 = H(paramArrayOfByte, paramInt2, parama);; paramInt2 = H(paramArrayOfByte, i, parama))
    {
      paramd.z(a);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = H(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int J(long paramLong, byte[] paramArrayOfByte, int paramInt, a parama)
  {
    int i = paramInt + 1;
    int j = paramArrayOfByte[paramInt];
    paramLong = paramLong & 0x7F | (j & 0x7F) << 7;
    paramInt = 7;
    while (j < 0)
    {
      j = paramArrayOfByte[i];
      paramInt += 7;
      paramLong |= (j & 0x7F) << paramInt;
      i++;
    }
    b = paramLong;
    return i;
  }
  
  public static int K(byte[] paramArrayOfByte, int paramInt, a parama)
  {
    int i = paramInt + 1;
    long l = paramArrayOfByte[paramInt];
    if (l >= 0L)
    {
      b = l;
      return i;
    }
    return J(l, paramArrayOfByte, i, parama);
  }
  
  public static int L(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    paramd = (F)paramd;
    int i;
    for (paramInt2 = K(paramArrayOfByte, paramInt2, parama);; paramInt2 = K(paramArrayOfByte, i, parama))
    {
      paramd.d(b);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = H(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int M(Object paramObject, e0 parame0, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, a parama)
  {
    paramInt1 = ((S)parame0).f0(paramObject, paramArrayOfByte, paramInt1, paramInt2, paramInt3, parama);
    c = paramObject;
    return paramInt1;
  }
  
  public static int N(Object paramObject, e0 parame0, byte[] paramArrayOfByte, int paramInt1, int paramInt2, a parama)
  {
    int i = paramInt1 + 1;
    int j = paramArrayOfByte[paramInt1];
    paramInt1 = i;
    int k = j;
    if (j < 0)
    {
      paramInt1 = G(j, paramArrayOfByte, i, parama);
      k = a;
    }
    if ((k >= 0) && (k <= paramInt2 - paramInt1))
    {
      paramInt2 = k + paramInt1;
      parame0.h(paramObject, paramArrayOfByte, paramInt1, paramInt2, parama);
      c = paramObject;
      return paramInt2;
    }
    throw A.m();
  }
  
  public static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    paramd = (f)paramd;
    int i = K(paramArrayOfByte, paramInt2, parama);
    paramInt2 = i;
    if (b != 0L) {}
    for (paramInt2 = i;; paramInt2 = i)
    {
      boolean bool = true;
      do
      {
        bool = false;
        paramd.d(bool);
        if (paramInt2 >= paramInt3) {
          break;
        }
        i = H(paramArrayOfByte, paramInt2, parama);
        if (paramInt1 != a) {
          break;
        }
        i = K(paramArrayOfByte, i, parama);
        paramInt2 = i;
      } while (b == 0L);
    }
    return paramInt2;
  }
  
  public static int b(byte[] paramArrayOfByte, int paramInt, a parama)
  {
    int i = H(paramArrayOfByte, paramInt, parama);
    paramInt = a;
    if (paramInt >= 0)
    {
      if (paramInt <= paramArrayOfByte.length - i)
      {
        if (paramInt == 0)
        {
          c = h.p;
          return i;
        }
        c = h.k(paramArrayOfByte, i, paramInt);
        return i + paramInt;
      }
      throw A.m();
    }
    throw A.g();
  }
  
  public static int c(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    int i = H(paramArrayOfByte, paramInt2, parama);
    int j = a;
    if (j >= 0)
    {
      if (j <= paramArrayOfByte.length - i)
      {
        int k = j;
        paramInt2 = i;
        if (j == 0) {}
        for (paramInt2 = i;; paramInt2 = i)
        {
          paramd.add(h.p);
          do
          {
            paramd.add(h.k(paramArrayOfByte, paramInt2, k));
            paramInt2 += k;
            if (paramInt2 >= paramInt3) {
              break label164;
            }
            k = H(paramArrayOfByte, paramInt2, parama);
            if (paramInt1 != a) {
              break label164;
            }
            i = H(paramArrayOfByte, k, parama);
            j = a;
            if (j < 0) {
              break label160;
            }
            if (j > paramArrayOfByte.length - i) {
              break;
            }
            k = j;
            paramInt2 = i;
          } while (j != 0);
        }
        throw A.m();
        label160:
        throw A.g();
        label164:
        return paramInt2;
      }
      throw A.m();
    }
    throw A.g();
  }
  
  public static double d(byte[] paramArrayOfByte, int paramInt)
  {
    return Double.longBitsToDouble(i(paramArrayOfByte, paramInt));
  }
  
  public static int e(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    paramd = (m)paramd;
    paramd.d(d(paramArrayOfByte, paramInt2));
    paramInt2 += 8;
    while (paramInt2 < paramInt3)
    {
      int i = H(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
      paramd.d(d(paramArrayOfByte, i));
      paramInt2 = i + 8;
    }
    return paramInt2;
  }
  
  public static int f(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, Object paramObject, O paramO, k0 paramk0, a parama)
  {
    d.a(paramO, paramInt1 >>> 3);
    return F(paramInt1, paramArrayOfByte, paramInt2, paramInt3, S.v(paramObject), parama);
  }
  
  public static int g(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16;
  }
  
  public static int h(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    paramd = (y)paramd;
    paramd.z(g(paramArrayOfByte, paramInt2));
    paramInt2 += 4;
    while (paramInt2 < paramInt3)
    {
      int i = H(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
      paramd.z(g(paramArrayOfByte, i));
      paramInt2 = i + 4;
    }
    return paramInt2;
  }
  
  public static long i(byte[] paramArrayOfByte, int paramInt)
  {
    long l1 = paramArrayOfByte[paramInt];
    long l2 = paramArrayOfByte[(paramInt + 1)];
    long l3 = paramArrayOfByte[(paramInt + 2)];
    long l4 = paramArrayOfByte[(paramInt + 3)];
    long l5 = paramArrayOfByte[(paramInt + 4)];
    long l6 = paramArrayOfByte[(paramInt + 5)];
    long l7 = paramArrayOfByte[(paramInt + 6)];
    return (paramArrayOfByte[(paramInt + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
  }
  
  public static int j(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    paramd = (F)paramd;
    paramd.d(i(paramArrayOfByte, paramInt2));
    paramInt2 += 8;
    while (paramInt2 < paramInt3)
    {
      int i = H(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
      paramd.d(i(paramArrayOfByte, i));
      paramInt2 = i + 8;
    }
    return paramInt2;
  }
  
  public static float k(byte[] paramArrayOfByte, int paramInt)
  {
    return Float.intBitsToFloat(g(paramArrayOfByte, paramInt));
  }
  
  public static int l(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    paramd = (v)paramd;
    paramd.d(k(paramArrayOfByte, paramInt2));
    paramInt2 += 4;
    while (paramInt2 < paramInt3)
    {
      int i = H(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
      paramd.d(k(paramArrayOfByte, i));
      paramInt2 = i + 4;
    }
    return paramInt2;
  }
  
  public static int m(e0 parame0, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, a parama)
  {
    Object localObject = parame0.f();
    paramInt1 = M(localObject, parame0, paramArrayOfByte, paramInt1, paramInt2, paramInt3, parama);
    parame0.b(localObject);
    c = localObject;
    return paramInt1;
  }
  
  public static int n(e0 parame0, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    int i = paramInt1 & 0xFFFFFFF8 | 0x4;
    int j;
    for (paramInt2 = m(parame0, paramArrayOfByte, paramInt2, paramInt3, i, parama);; paramInt2 = m(parame0, paramArrayOfByte, j, paramInt3, i, parama))
    {
      paramd.add(c);
      if (paramInt2 >= paramInt3) {
        break;
      }
      j = H(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int o(e0 parame0, byte[] paramArrayOfByte, int paramInt1, int paramInt2, a parama)
  {
    Object localObject = parame0.f();
    paramInt1 = N(localObject, parame0, paramArrayOfByte, paramInt1, paramInt2, parama);
    parame0.b(localObject);
    c = localObject;
    return paramInt1;
  }
  
  public static int p(e0 parame0, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    int i;
    for (paramInt2 = o(parame0, paramArrayOfByte, paramInt2, paramInt3, parama);; paramInt2 = o(parame0, paramArrayOfByte, i, paramInt3, parama))
    {
      paramd.add(c);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = H(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int q(byte[] paramArrayOfByte, int paramInt, z.d paramd, a parama)
  {
    paramd = (f)paramd;
    paramInt = H(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramInt = K(paramArrayOfByte, paramInt, parama);
      boolean bool;
      if (b != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      paramd.d(bool);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw A.m();
  }
  
  public static int r(byte[] paramArrayOfByte, int paramInt, z.d paramd, a parama)
  {
    paramd = (m)paramd;
    paramInt = H(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramd.d(d(paramArrayOfByte, paramInt));
      paramInt += 8;
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw A.m();
  }
  
  public static int s(byte[] paramArrayOfByte, int paramInt, z.d paramd, a parama)
  {
    paramd = (y)paramd;
    paramInt = H(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramd.z(g(paramArrayOfByte, paramInt));
      paramInt += 4;
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw A.m();
  }
  
  public static int t(byte[] paramArrayOfByte, int paramInt, z.d paramd, a parama)
  {
    paramd = (F)paramd;
    paramInt = H(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramd.d(i(paramArrayOfByte, paramInt));
      paramInt += 8;
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw A.m();
  }
  
  public static int u(byte[] paramArrayOfByte, int paramInt, z.d paramd, a parama)
  {
    paramd = (v)paramd;
    paramInt = H(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramd.d(k(paramArrayOfByte, paramInt));
      paramInt += 4;
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw A.m();
  }
  
  public static int v(byte[] paramArrayOfByte, int paramInt, z.d paramd, a parama)
  {
    paramd = (y)paramd;
    paramInt = H(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramInt = H(paramArrayOfByte, paramInt, parama);
      paramd.z(i.b(a));
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw A.m();
  }
  
  public static int w(byte[] paramArrayOfByte, int paramInt, z.d paramd, a parama)
  {
    paramd = (F)paramd;
    paramInt = H(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramInt = K(paramArrayOfByte, paramInt, parama);
      paramd.d(i.c(b));
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw A.m();
  }
  
  public static int x(byte[] paramArrayOfByte, int paramInt, z.d paramd, a parama)
  {
    paramd = (y)paramd;
    paramInt = H(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramInt = H(paramArrayOfByte, paramInt, parama);
      paramd.z(a);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw A.m();
  }
  
  public static int y(byte[] paramArrayOfByte, int paramInt, z.d paramd, a parama)
  {
    paramd = (F)paramd;
    paramInt = H(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramInt = K(paramArrayOfByte, paramInt, parama);
      paramd.d(b);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw A.m();
  }
  
  public static int z(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, z.d paramd, a parama)
  {
    paramd = (y)paramd;
    int i;
    for (paramInt2 = H(paramArrayOfByte, paramInt2, parama);; paramInt2 = H(paramArrayOfByte, i, parama))
    {
      paramd.z(i.b(a));
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = H(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static final class a
  {
    public int a;
    public long b;
    public Object c;
    public final p d;
    
    public a(p paramp)
    {
      paramp.getClass();
      d = paramp;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */