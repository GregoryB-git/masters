package ma;

import java.util.List;
import java.util.Map;

public final class f
{
  public static int A(byte[] paramArrayOfByte, int paramInt, a parama)
  {
    int i = G(paramArrayOfByte, paramInt, parama);
    paramInt = a;
    if (paramInt >= 0)
    {
      if (paramInt == 0)
      {
        c = "";
        return i;
      }
      c = new String(paramArrayOfByte, i, paramInt, a0.a);
      return i + paramInt;
    }
    throw b0.f();
  }
  
  public static int B(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    paramInt2 = G(paramArrayOfByte, paramInt2, parama);
    int i = a;
    if (i >= 0)
    {
      String str;
      int j;
      if (i != 0)
      {
        str = new String(paramArrayOfByte, paramInt2, i, a0.a);
        j = paramInt2;
        paramInt2 = i;
      }
      for (;;)
      {
        paramd.add(str);
        paramInt2 = j + paramInt2;
        for (;;)
        {
          if (paramInt2 >= paramInt3) {
            break label154;
          }
          j = G(paramArrayOfByte, paramInt2, parama);
          if (paramInt1 != a) {
            break label154;
          }
          j = G(paramArrayOfByte, j, parama);
          paramInt2 = a;
          if (paramInt2 < 0) {
            break label150;
          }
          if (paramInt2 != 0) {
            break;
          }
          paramInt2 = j;
          paramd.add("");
        }
        str = new String(paramArrayOfByte, j, paramInt2, a0.a);
      }
      label150:
      throw b0.f();
      label154:
      return paramInt2;
    }
    throw b0.f();
  }
  
  public static int C(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    paramInt2 = G(paramArrayOfByte, paramInt2, parama);
    int i = a;
    if (i >= 0)
    {
      int j;
      String str;
      if (i != 0)
      {
        j = paramInt2 + i;
        if (u1.e(paramArrayOfByte, paramInt2, j))
        {
          str = new String(paramArrayOfByte, paramInt2, i, a0.a);
          paramInt2 = j;
        }
      }
      else
      {
        for (;;)
        {
          paramd.add(str);
          for (;;)
          {
            if (paramInt2 >= paramInt3) {
              break label189;
            }
            j = G(paramArrayOfByte, paramInt2, parama);
            if (paramInt1 != a) {
              break label189;
            }
            j = G(paramArrayOfByte, j, parama);
            i = a;
            if (i < 0) {
              break label185;
            }
            if (i != 0) {
              break label145;
            }
            paramInt2 = j;
            break;
            paramd.add("");
          }
          label145:
          paramInt2 = j + i;
          if (!u1.e(paramArrayOfByte, j, paramInt2)) {
            break label181;
          }
          str = new String(paramArrayOfByte, j, i, a0.a);
        }
        label181:
        throw b0.c();
        label185:
        throw b0.f();
        label189:
        return paramInt2;
      }
      throw b0.c();
    }
    throw b0.f();
  }
  
  public static int D(byte[] paramArrayOfByte, int paramInt, a parama)
  {
    paramInt = G(paramArrayOfByte, paramInt, parama);
    int i = a;
    if (i >= 0)
    {
      if (i == 0)
      {
        c = "";
        return paramInt;
      }
      c = u1.a.a(paramArrayOfByte, paramInt, i);
      return paramInt + i;
    }
    throw b0.f();
  }
  
  public static int E(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, q1 paramq1, a parama)
  {
    if (paramInt1 >>> 3 != 0)
    {
      int i = paramInt1 & 0x7;
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
                paramq1.c(paramInt1, Integer.valueOf(g(paramArrayOfByte, paramInt2)));
                return paramInt2 + 4;
              }
              throw b0.b();
            }
            q1 localq1 = new q1();
            int j = paramInt1 & 0xFFFFFFF8 | 0x4;
            i = 0;
            int k;
            for (;;)
            {
              k = paramInt2;
              if (paramInt2 >= paramInt3) {
                break;
              }
              k = G(paramArrayOfByte, paramInt2, parama);
              paramInt2 = a;
              i = paramInt2;
              if (paramInt2 == j) {
                break;
              }
              k = E(i, paramArrayOfByte, k, paramInt3, localq1, parama);
              i = paramInt2;
              paramInt2 = k;
            }
            if ((k <= paramInt3) && (i == j))
            {
              paramq1.c(paramInt1, localq1);
              return k;
            }
            throw b0.g();
          }
          paramInt2 = G(paramArrayOfByte, paramInt2, parama);
          paramInt3 = a;
          if (paramInt3 >= 0)
          {
            if (paramInt3 <= paramArrayOfByte.length - paramInt2)
            {
              if (paramInt3 == 0) {
                paramArrayOfByte = h.b;
              } else {
                paramArrayOfByte = h.m(paramArrayOfByte, paramInt2, paramInt3);
              }
              paramq1.c(paramInt1, paramArrayOfByte);
              return paramInt2 + paramInt3;
            }
            throw b0.h();
          }
          throw b0.f();
        }
        paramq1.c(paramInt1, Long.valueOf(i(paramArrayOfByte, paramInt2)));
        return paramInt2 + 8;
      }
      paramInt2 = I(paramArrayOfByte, paramInt2, parama);
      paramq1.c(paramInt1, Long.valueOf(b));
      return paramInt2;
    }
    throw b0.b();
  }
  
  public static int F(int paramInt1, byte[] paramArrayOfByte, int paramInt2, a parama)
  {
    paramInt1 &= 0x7F;
    int i = paramInt2 + 1;
    paramInt2 = paramArrayOfByte[paramInt2];
    if (paramInt2 >= 0)
    {
      paramInt2 <<= 7;
      a = (paramInt1 | paramInt2);
      return i;
    }
    paramInt2 = paramInt1 | (paramInt2 & 0x7F) << 7;
    paramInt1 = i + 1;
    i = paramArrayOfByte[i];
    if (i >= 0) {
      i <<= 14;
    }
    int j;
    for (;;)
    {
      a = (paramInt2 | i);
      return paramInt1;
      paramInt2 |= (i & 0x7F) << 14;
      i = paramInt1 + 1;
      paramInt1 = paramArrayOfByte[paramInt1];
      if (paramInt1 >= 0)
      {
        j = paramInt1 << 21;
        paramInt1 = paramInt2;
        paramInt2 = j;
        break;
      }
      paramInt2 |= (paramInt1 & 0x7F) << 21;
      paramInt1 = i + 1;
      j = paramArrayOfByte[i];
      if (j < 0) {
        break label150;
      }
      i = j << 28;
    }
    for (;;)
    {
      label150:
      i = paramInt1 + 1;
      if (paramArrayOfByte[paramInt1] >= 0) {
        break;
      }
      paramInt1 = i;
    }
    a = (paramInt2 | (j & 0x7F) << 28);
    return i;
  }
  
  public static int G(byte[] paramArrayOfByte, int paramInt, a parama)
  {
    int i = paramInt + 1;
    paramInt = paramArrayOfByte[paramInt];
    if (paramInt >= 0)
    {
      a = paramInt;
      return i;
    }
    return F(paramInt, paramArrayOfByte, i, parama);
  }
  
  public static int H(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    paramd = (z)paramd;
    int i;
    for (paramInt2 = G(paramArrayOfByte, paramInt2, parama);; paramInt2 = G(paramArrayOfByte, i, parama))
    {
      paramd.h(a);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = G(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int I(byte[] paramArrayOfByte, int paramInt, a parama)
  {
    int i = paramInt + 1;
    long l = paramArrayOfByte[paramInt];
    if (l >= 0L)
    {
      b = l;
      return i;
    }
    paramInt = i + 1;
    int j = paramArrayOfByte[i];
    l = l & 0x7F | (j & 0x7F) << 7;
    i = 7;
    while (j < 0)
    {
      j = paramArrayOfByte[paramInt];
      i += 7;
      l |= (j & 0x7F) << i;
      paramInt++;
    }
    b = l;
    return paramInt;
  }
  
  public static int J(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    paramd = (j0)paramd;
    int i;
    for (paramInt2 = I(paramArrayOfByte, paramInt2, parama);; paramInt2 = I(paramArrayOfByte, i, parama))
    {
      paramd.h(b);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = G(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int K(Object paramObject, i1 parami1, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, a parama)
  {
    paramInt1 = ((v0)parami1).G(paramObject, paramArrayOfByte, paramInt1, paramInt2, paramInt3, parama);
    c = paramObject;
    return paramInt1;
  }
  
  public static int L(Object paramObject, i1 parami1, byte[] paramArrayOfByte, int paramInt1, int paramInt2, a parama)
  {
    int i = paramInt1 + 1;
    int j = paramArrayOfByte[paramInt1];
    paramInt1 = i;
    int k = j;
    if (j < 0)
    {
      paramInt1 = F(j, paramArrayOfByte, i, parama);
      k = a;
    }
    if ((k >= 0) && (k <= paramInt2 - paramInt1))
    {
      paramInt2 = k + paramInt1;
      parami1.j(paramObject, paramArrayOfByte, paramInt1, paramInt2, parama);
      c = paramObject;
      return paramInt2;
    }
    throw b0.h();
  }
  
  public static int M(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a parama)
  {
    if (paramInt1 >>> 3 != 0)
    {
      int i = paramInt1 & 0x7;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i == 5) {
                return paramInt2 + 4;
              }
              throw b0.b();
            }
            int j = paramInt1 & 0xFFFFFFF8 | 0x4;
            paramInt1 = 0;
            for (;;)
            {
              i = paramInt2;
              if (paramInt2 >= paramInt3) {
                break;
              }
              i = G(paramArrayOfByte, paramInt2, parama);
              paramInt1 = a;
              if (paramInt1 == j) {
                break;
              }
              paramInt2 = M(paramInt1, paramArrayOfByte, i, paramInt3, parama);
            }
            if ((i <= paramInt3) && (paramInt1 == j)) {
              return i;
            }
            throw b0.g();
          }
          return G(paramArrayOfByte, paramInt2, parama) + a;
        }
        return paramInt2 + 8;
      }
      return I(paramArrayOfByte, paramInt2, parama);
    }
    throw b0.b();
  }
  
  public static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    paramd = (g)paramd;
    int i = I(paramArrayOfByte, paramInt2, parama);
    paramInt2 = i;
    if (b != 0L) {
      paramInt2 = i;
    }
    for (boolean bool = false;; bool = true)
    {
      paramd.h(bool);
      if (paramInt2 >= paramInt3) {
        return paramInt2;
      }
      i = G(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        return paramInt2;
      }
      i = I(paramArrayOfByte, i, parama);
      paramInt2 = i;
      if (b == 0L) {
        break;
      }
      paramInt2 = i;
    }
    return paramInt2;
  }
  
  public static int b(byte[] paramArrayOfByte, int paramInt, a parama)
  {
    paramInt = G(paramArrayOfByte, paramInt, parama);
    int i = a;
    if (i >= 0)
    {
      if (i <= paramArrayOfByte.length - paramInt)
      {
        if (i == 0)
        {
          c = h.b;
          return paramInt;
        }
        c = h.m(paramArrayOfByte, paramInt, i);
        return paramInt + i;
      }
      throw b0.h();
    }
    throw b0.f();
  }
  
  public static int c(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    int i = G(paramArrayOfByte, paramInt2, parama);
    int j = a;
    if (j >= 0)
    {
      if (j <= paramArrayOfByte.length - i)
      {
        paramInt2 = j;
        int k = i;
        if (j == 0)
        {
          paramInt2 = i;
        }
        else
        {
          paramd.add(h.m(paramArrayOfByte, k, paramInt2));
          paramInt2 = k + paramInt2;
        }
        for (;;)
        {
          if (paramInt2 < paramInt3)
          {
            k = G(paramArrayOfByte, paramInt2, parama);
            if (paramInt1 == a)
            {
              i = G(paramArrayOfByte, k, parama);
              j = a;
              if (j >= 0)
              {
                if (j <= paramArrayOfByte.length - i)
                {
                  paramInt2 = j;
                  k = i;
                  if (j != 0) {
                    break;
                  }
                  paramInt2 = i;
                  paramd.add(h.b);
                  continue;
                }
                throw b0.h();
              }
              throw b0.f();
            }
          }
        }
        return paramInt2;
      }
      throw b0.h();
    }
    throw b0.f();
  }
  
  public static double d(byte[] paramArrayOfByte, int paramInt)
  {
    return Double.longBitsToDouble(i(paramArrayOfByte, paramInt));
  }
  
  public static int e(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    paramd = (m)paramd;
    paramd.h(Double.longBitsToDouble(i(paramArrayOfByte, paramInt2)));
    paramInt2 += 8;
    while (paramInt2 < paramInt3)
    {
      int i = G(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
      paramd.h(Double.longBitsToDouble(i(paramArrayOfByte, i)));
      paramInt2 = i + 8;
    }
    return paramInt2;
  }
  
  public static int f(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, Object paramObject, s0 params0, a parama)
  {
    if ((w.e)d.a.get(new o.a(params0, paramInt1 >>> 3)) == null) {
      return E(paramInt1, paramArrayOfByte, paramInt2, paramInt3, v0.r(paramObject), parama);
    }
    paramObject = (w.c)paramObject;
    paramArrayOfByte = extensions;
    if (b) {
      extensions = paramArrayOfByte.a();
    }
    throw null;
  }
  
  public static int g(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16;
  }
  
  public static int h(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    paramd = (z)paramd;
    paramd.h(g(paramArrayOfByte, paramInt2));
    paramInt2 += 4;
    while (paramInt2 < paramInt3)
    {
      int i = G(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
      paramd.h(g(paramArrayOfByte, i));
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
  
  public static int j(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    paramd = (j0)paramd;
    paramd.h(i(paramArrayOfByte, paramInt2));
    paramInt2 += 8;
    while (paramInt2 < paramInt3)
    {
      int i = G(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
      paramd.h(i(paramArrayOfByte, i));
      paramInt2 = i + 8;
    }
    return paramInt2;
  }
  
  public static float k(byte[] paramArrayOfByte, int paramInt)
  {
    return Float.intBitsToFloat(g(paramArrayOfByte, paramInt));
  }
  
  public static int l(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    paramd = (u)paramd;
    paramd.h(Float.intBitsToFloat(g(paramArrayOfByte, paramInt2)));
    paramInt2 += 4;
    while (paramInt2 < paramInt3)
    {
      int i = G(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
      paramd.h(Float.intBitsToFloat(g(paramArrayOfByte, i)));
      paramInt2 = i + 4;
    }
    return paramInt2;
  }
  
  public static int m(i1 parami1, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    int i = paramInt1 & 0xFFFFFFF8 | 0x4;
    Object localObject = parami1.f();
    paramInt2 = K(localObject, parami1, paramArrayOfByte, paramInt2, paramInt3, i, parama);
    parami1.b(localObject);
    for (c = localObject;; c = localObject)
    {
      paramd.add(c);
      if (paramInt2 >= paramInt3) {
        break;
      }
      int j = G(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
      localObject = parami1.f();
      paramInt2 = K(localObject, parami1, paramArrayOfByte, j, paramInt3, i, parama);
      parami1.b(localObject);
    }
    return paramInt2;
  }
  
  public static int n(i1 parami1, byte[] paramArrayOfByte, int paramInt1, int paramInt2, a parama)
  {
    Object localObject = parami1.f();
    paramInt1 = L(localObject, parami1, paramArrayOfByte, paramInt1, paramInt2, parama);
    parami1.b(localObject);
    c = localObject;
    return paramInt1;
  }
  
  public static int o(i1<?> parami1, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    int i;
    for (paramInt2 = n(parami1, paramArrayOfByte, paramInt2, paramInt3, parama);; paramInt2 = n(parami1, paramArrayOfByte, i, paramInt3, parama))
    {
      paramd.add(c);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = G(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int p(byte[] paramArrayOfByte, int paramInt, a0.d<?> paramd, a parama)
  {
    paramd = (g)paramd;
    paramInt = G(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramInt = I(paramArrayOfByte, paramInt, parama);
      boolean bool;
      if (b != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      paramd.h(bool);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw b0.h();
  }
  
  public static int q(byte[] paramArrayOfByte, int paramInt, a0.d<?> paramd, a parama)
  {
    paramd = (m)paramd;
    paramInt = G(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramd.h(Double.longBitsToDouble(i(paramArrayOfByte, paramInt)));
      paramInt += 8;
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw b0.h();
  }
  
  public static int r(byte[] paramArrayOfByte, int paramInt, a0.d<?> paramd, a parama)
  {
    paramd = (z)paramd;
    paramInt = G(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramd.h(g(paramArrayOfByte, paramInt));
      paramInt += 4;
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw b0.h();
  }
  
  public static int s(byte[] paramArrayOfByte, int paramInt, a0.d<?> paramd, a parama)
  {
    paramd = (j0)paramd;
    paramInt = G(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramd.h(i(paramArrayOfByte, paramInt));
      paramInt += 8;
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw b0.h();
  }
  
  public static int t(byte[] paramArrayOfByte, int paramInt, a0.d<?> paramd, a parama)
  {
    paramd = (u)paramd;
    paramInt = G(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramd.h(Float.intBitsToFloat(g(paramArrayOfByte, paramInt)));
      paramInt += 4;
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw b0.h();
  }
  
  public static int u(byte[] paramArrayOfByte, int paramInt, a0.d<?> paramd, a parama)
  {
    paramd = (z)paramd;
    paramInt = G(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramInt = G(paramArrayOfByte, paramInt, parama);
      paramd.h(i.b(a));
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw b0.h();
  }
  
  public static int v(byte[] paramArrayOfByte, int paramInt, a0.d<?> paramd, a parama)
  {
    paramd = (j0)paramd;
    paramInt = G(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramInt = I(paramArrayOfByte, paramInt, parama);
      paramd.h(i.c(b));
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw b0.h();
  }
  
  public static int w(byte[] paramArrayOfByte, int paramInt, a0.d<?> paramd, a parama)
  {
    paramd = (z)paramd;
    paramInt = G(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramInt = G(paramArrayOfByte, paramInt, parama);
      paramd.h(a);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw b0.h();
  }
  
  public static int x(byte[] paramArrayOfByte, int paramInt, a0.d<?> paramd, a parama)
  {
    paramd = (j0)paramd;
    paramInt = G(paramArrayOfByte, paramInt, parama);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramInt = I(paramArrayOfByte, paramInt, parama);
      paramd.h(b);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw b0.h();
  }
  
  public static int y(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    paramd = (z)paramd;
    int i;
    for (paramInt2 = G(paramArrayOfByte, paramInt2, parama);; paramInt2 = G(paramArrayOfByte, i, parama))
    {
      paramd.h(i.b(a));
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = G(paramArrayOfByte, paramInt2, parama);
      if (paramInt1 != a) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int z(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, a0.d<?> paramd, a parama)
  {
    paramd = (j0)paramd;
    int i;
    for (paramInt2 = I(paramArrayOfByte, paramInt2, parama);; paramInt2 = I(paramArrayOfByte, i, parama))
    {
      paramd.h(i.c(b));
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = G(paramArrayOfByte, paramInt2, parama);
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
    public final o d;
    
    public a(o paramo)
    {
      paramo.getClass();
      d = paramo;
    }
  }
}

/* Location:
 * Qualified Name:     ma.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */