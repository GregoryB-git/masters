package com.google.android.gms.internal.measurement;

import java.util.List;

public abstract class n3
{
  public static double a(byte[] paramArrayOfByte, int paramInt)
  {
    return Double.longBitsToDouble(q(paramArrayOfByte, paramInt));
  }
  
  public static int b(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, h4 paramh4, p3 paramp3)
  {
    paramh4 = (c4)paramh4;
    int i;
    for (paramInt2 = o(paramArrayOfByte, paramInt2, paramp3);; paramInt2 = o(paramArrayOfByte, i, paramp3))
    {
      paramh4.g(a);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = o(paramArrayOfByte, paramInt2, paramp3);
      if (paramInt1 != a) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int c(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, v5 paramv5, p3 paramp3)
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
                paramv5.e(paramInt1, Integer.valueOf(n(paramArrayOfByte, paramInt2)));
                return paramInt2 + 4;
              }
              throw k4.b();
            }
            v5 localv5 = v5.l();
            int j = paramInt1 & 0xFFFFFFF8 | 0x4;
            i = 0;
            for (;;)
            {
              k = i;
              i = paramInt2;
              if (paramInt2 >= paramInt3) {
                break label140;
              }
              k = o(paramArrayOfByte, paramInt2, paramp3);
              i = a;
              paramInt2 = i;
              if (i == j) {
                break;
              }
              paramInt2 = c(paramInt2, paramArrayOfByte, k, paramInt3, localv5, paramp3);
            }
            i = k;
            int k = paramInt2;
            label140:
            if ((i <= paramInt3) && (k == j))
            {
              paramv5.e(paramInt1, localv5);
              return i;
            }
            throw k4.e();
          }
          paramInt3 = o(paramArrayOfByte, paramInt2, paramp3);
          paramInt2 = a;
          if (paramInt2 >= 0)
          {
            if (paramInt2 <= paramArrayOfByte.length - paramInt3)
            {
              if (paramInt2 == 0) {}
              for (paramArrayOfByte = q3.p;; paramArrayOfByte = q3.q(paramArrayOfByte, paramInt3, paramInt2))
              {
                paramv5.e(paramInt1, paramArrayOfByte);
                break;
              }
              return paramInt3 + paramInt2;
            }
            throw k4.f();
          }
          throw k4.d();
        }
        paramv5.e(paramInt1, Long.valueOf(q(paramArrayOfByte, paramInt2)));
        return paramInt2 + 8;
      }
      paramInt2 = p(paramArrayOfByte, paramInt2, paramp3);
      paramv5.e(paramInt1, Long.valueOf(b));
      return paramInt2;
    }
    throw k4.b();
  }
  
  public static int d(int paramInt1, byte[] paramArrayOfByte, int paramInt2, p3 paramp3)
  {
    int i = paramInt1 & 0x7F;
    int j = paramInt2 + 1;
    paramInt1 = paramArrayOfByte[paramInt2];
    if (paramInt1 >= 0)
    {
      paramInt1 <<= 7;
      paramInt2 = j;
    }
    for (;;)
    {
      a = (i | paramInt1);
      return paramInt2;
      paramInt1 = i | (paramInt1 & 0x7F) << 7;
      int k = paramInt2 + 2;
      i = paramArrayOfByte[j];
      if (i >= 0)
      {
        a = (paramInt1 | i << 14);
        return k;
      }
      i = paramInt1 | (i & 0x7F) << 14;
      paramInt1 = paramInt2 + 3;
      j = paramArrayOfByte[k];
      if (j < 0) {
        break;
      }
      j <<= 21;
      paramInt2 = paramInt1;
      paramInt1 = j;
    }
    i |= (j & 0x7F) << 21;
    paramInt2 += 4;
    j = paramArrayOfByte[paramInt1];
    if (j >= 0)
    {
      a = (i | j << 28);
      return paramInt2;
    }
    for (paramInt1 = paramInt2;; paramInt1 = paramInt2)
    {
      paramInt2 = paramInt1 + 1;
      if (paramArrayOfByte[paramInt1] >= 0)
      {
        a = (i | (j & 0x7F) << 28);
        return paramInt2;
      }
    }
  }
  
  public static int e(Z4 paramZ4, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, h4 paramh4, p3 paramp3)
  {
    int i;
    for (paramInt2 = g(paramZ4, paramArrayOfByte, paramInt2, paramInt3, paramp3);; paramInt2 = g(paramZ4, paramArrayOfByte, i, paramInt3, paramp3))
    {
      paramh4.add(c);
      if (paramInt2 >= paramInt3) {
        break;
      }
      i = o(paramArrayOfByte, paramInt2, paramp3);
      if (paramInt1 != a) {
        break;
      }
    }
    return paramInt2;
  }
  
  public static int f(Z4 paramZ4, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, p3 paramp3)
  {
    Object localObject = paramZ4.a();
    paramInt1 = h(localObject, paramZ4, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramp3);
    paramZ4.e(localObject);
    c = localObject;
    return paramInt1;
  }
  
  public static int g(Z4 paramZ4, byte[] paramArrayOfByte, int paramInt1, int paramInt2, p3 paramp3)
  {
    Object localObject = paramZ4.a();
    paramInt1 = i(localObject, paramZ4, paramArrayOfByte, paramInt1, paramInt2, paramp3);
    paramZ4.e(localObject);
    c = localObject;
    return paramInt1;
  }
  
  public static int h(Object paramObject, Z4 paramZ4, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, p3 paramp3)
  {
    paramInt1 = ((M4)paramZ4).m(paramObject, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramp3);
    c = paramObject;
    return paramInt1;
  }
  
  public static int i(Object paramObject, Z4 paramZ4, byte[] paramArrayOfByte, int paramInt1, int paramInt2, p3 paramp3)
  {
    int i = paramInt1 + 1;
    int j = paramArrayOfByte[paramInt1];
    int k = i;
    paramInt1 = j;
    if (j < 0)
    {
      k = d(j, paramArrayOfByte, i, paramp3);
      paramInt1 = a;
    }
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2 - k))
    {
      paramInt1 += k;
      paramZ4.g(paramObject, paramArrayOfByte, k, paramInt1, paramp3);
      c = paramObject;
      return paramInt1;
    }
    throw k4.f();
  }
  
  public static int j(byte[] paramArrayOfByte, int paramInt, p3 paramp3)
  {
    paramInt = o(paramArrayOfByte, paramInt, paramp3);
    int i = a;
    if (i >= 0)
    {
      if (i <= paramArrayOfByte.length - paramInt)
      {
        if (i == 0)
        {
          c = q3.p;
          return paramInt;
        }
        c = q3.q(paramArrayOfByte, paramInt, i);
        return paramInt + i;
      }
      throw k4.f();
    }
    throw k4.d();
  }
  
  public static int k(byte[] paramArrayOfByte, int paramInt, h4 paramh4, p3 paramp3)
  {
    paramh4 = (c4)paramh4;
    paramInt = o(paramArrayOfByte, paramInt, paramp3);
    int i = a + paramInt;
    while (paramInt < i)
    {
      paramInt = o(paramArrayOfByte, paramInt, paramp3);
      paramh4.g(a);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw k4.f();
  }
  
  public static float l(byte[] paramArrayOfByte, int paramInt)
  {
    return Float.intBitsToFloat(n(paramArrayOfByte, paramInt));
  }
  
  public static int m(byte[] paramArrayOfByte, int paramInt, p3 paramp3)
  {
    int i = o(paramArrayOfByte, paramInt, paramp3);
    paramInt = a;
    if (paramInt >= 0)
    {
      if (paramInt == 0)
      {
        c = "";
        return i;
      }
      c = E5.e(paramArrayOfByte, i, paramInt);
      return i + paramInt;
    }
    throw k4.d();
  }
  
  public static int n(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16;
  }
  
  public static int o(byte[] paramArrayOfByte, int paramInt, p3 paramp3)
  {
    int i = paramInt + 1;
    paramInt = paramArrayOfByte[paramInt];
    if (paramInt >= 0)
    {
      a = paramInt;
      return i;
    }
    return d(paramInt, paramArrayOfByte, i, paramp3);
  }
  
  public static int p(byte[] paramArrayOfByte, int paramInt, p3 paramp3)
  {
    int i = paramInt + 1;
    long l = paramArrayOfByte[paramInt];
    if (l >= 0L)
    {
      b = l;
      return i;
    }
    paramInt += 2;
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
  
  public static long q(byte[] paramArrayOfByte, int paramInt)
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
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.n3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */