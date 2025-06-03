package com.google.protobuf;

public abstract class l0
{
  public static final a a;
  
  static
  {
    Object localObject;
    if ((d.d()) && (!d.c())) {
      localObject = new d();
    } else {
      localObject = new b();
    }
    a = (a)localObject;
  }
  
  public static int e(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.a(paramCharSequence, paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static int f(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    for (int j = 0; (j < i) && (paramCharSequence.charAt(j) < ''); j++) {}
    int k = i;
    for (;;)
    {
      m = k;
      if (j >= i) {
        break label86;
      }
      m = paramCharSequence.charAt(j);
      if (m >= 2048) {
        break;
      }
      k += (127 - m >>> 31);
      j++;
    }
    int m = k + g(paramCharSequence, j);
    label86:
    if (m >= i) {
      return m;
    }
    paramCharSequence = new StringBuilder();
    paramCharSequence.append("UTF-8 length does not fit in int: ");
    paramCharSequence.append(m + 4294967296L);
    throw new IllegalArgumentException(paramCharSequence.toString());
  }
  
  public static int g(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length();
    int j = 0;
    while (paramInt < i)
    {
      int k = paramCharSequence.charAt(paramInt);
      int m;
      if (k < 2048)
      {
        j += (127 - k >>> 31);
        m = paramInt;
      }
      else
      {
        int n = j + 2;
        j = n;
        m = paramInt;
        if (55296 <= k)
        {
          j = n;
          m = paramInt;
          if (k <= 57343) {
            if (Character.codePointAt(paramCharSequence, paramInt) >= 65536)
            {
              m = paramInt + 1;
              j = n;
            }
            else
            {
              throw new c(paramInt, i);
            }
          }
        }
      }
      paramInt = m + 1;
    }
    return j;
  }
  
  public static int h(int paramInt)
  {
    int i = paramInt;
    if (paramInt > -12) {
      i = -1;
    }
    return i;
  }
  
  public static int i(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= -12) && (paramInt2 <= -65)) {
      paramInt1 ^= paramInt2 << 8;
    } else {
      paramInt1 = -1;
    }
    return paramInt1;
  }
  
  public static int j(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 <= -12) && (paramInt2 <= -65) && (paramInt3 <= -65)) {
      paramInt1 = paramInt1 ^ paramInt2 << 8 ^ paramInt3 << 16;
    } else {
      paramInt1 = -1;
    }
    return paramInt1;
  }
  
  public static int k(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte[(paramInt1 - 1)];
    paramInt2 -= paramInt1;
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2) {
          return j(i, paramArrayOfByte[paramInt1], paramArrayOfByte[(paramInt1 + 1)]);
        }
        throw new AssertionError();
      }
      return i(i, paramArrayOfByte[paramInt1]);
    }
    return h(i);
  }
  
  public static boolean l(byte[] paramArrayOfByte)
  {
    return a.b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static boolean m(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.b(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static abstract class a
  {
    public abstract int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
    
    public final boolean b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      boolean bool = false;
      if (c(0, paramArrayOfByte, paramInt1, paramInt2) == 0) {
        bool = true;
      }
      return bool;
    }
    
    public abstract int c(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);
  }
  
  public static final class b
    extends l0.a
  {
    public static int d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      while ((paramInt1 < paramInt2) && (paramArrayOfByte[paramInt1] >= 0)) {
        paramInt1++;
      }
      if (paramInt1 >= paramInt2) {
        paramInt1 = 0;
      } else {
        paramInt1 = e(paramArrayOfByte, paramInt1, paramInt2);
      }
      return paramInt1;
    }
    
    public static int e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      for (;;)
      {
        int i = paramInt1;
        if (i >= paramInt2) {
          return 0;
        }
        int j = i + 1;
        paramInt1 = paramArrayOfByte[i];
        if (paramInt1 < 0)
        {
          if (paramInt1 < -32)
          {
            if (j >= paramInt2) {
              return paramInt1;
            }
            if (paramInt1 >= -62)
            {
              paramInt1 = i + 2;
              if (paramArrayOfByte[j] <= -65) {}
            }
            else
            {
              return -1;
            }
          }
          else if (paramInt1 < -16)
          {
            if (j >= paramInt2 - 1) {
              return l0.c(paramArrayOfByte, j, paramInt2);
            }
            j = paramArrayOfByte[j];
            if ((j <= -65) && ((paramInt1 != -32) || (j >= -96)) && ((paramInt1 != -19) || (j < -96)))
            {
              paramInt1 = i + 3;
              if (paramArrayOfByte[(i + 2)] <= -65) {}
            }
            else
            {
              return -1;
            }
          }
          else
          {
            if (j >= paramInt2 - 2) {
              return l0.c(paramArrayOfByte, j, paramInt2);
            }
            j = paramArrayOfByte[j];
            if ((j <= -65) && ((paramInt1 << 28) + (j + 112) >> 30 == 0) && (paramArrayOfByte[(i + 2)] <= -65))
            {
              paramInt1 = i + 4;
              if (paramArrayOfByte[(i + 3)] <= -65) {}
            }
            else
            {
              return -1;
            }
          }
        }
        else {
          paramInt1 = j;
        }
      }
    }
    
    public int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      int i = paramCharSequence.length();
      int j = paramInt2 + paramInt1;
      int k;
      int m;
      for (paramInt2 = 0; paramInt2 < i; paramInt2++)
      {
        k = paramInt2 + paramInt1;
        if (k >= j) {
          break;
        }
        m = paramCharSequence.charAt(paramInt2);
        if (m >= 128) {
          break;
        }
        paramArrayOfByte[k] = ((byte)(byte)m);
      }
      if (paramInt2 == i) {
        return paramInt1 + i;
      }
      paramInt1 += paramInt2;
      while (paramInt2 < i)
      {
        int n = paramCharSequence.charAt(paramInt2);
        if ((n < 128) && (paramInt1 < j))
        {
          paramArrayOfByte[paramInt1] = ((byte)(byte)n);
          paramInt1++;
        }
        else if ((n < 2048) && (paramInt1 <= j - 2))
        {
          paramArrayOfByte[paramInt1] = ((byte)(byte)(n >>> 6 | 0x3C0));
          m = paramInt1 + 2;
          paramArrayOfByte[(paramInt1 + 1)] = ((byte)(byte)(n & 0x3F | 0x80));
          paramInt1 = m;
        }
        else if (((n < 55296) || (57343 < n)) && (paramInt1 <= j - 3))
        {
          paramArrayOfByte[paramInt1] = ((byte)(byte)(n >>> 12 | 0x1E0));
          paramArrayOfByte[(paramInt1 + 1)] = ((byte)(byte)(n >>> 6 & 0x3F | 0x80));
          m = paramInt1 + 3;
          paramArrayOfByte[(paramInt1 + 2)] = ((byte)(byte)(n & 0x3F | 0x80));
          paramInt1 = m;
        }
        else
        {
          if (paramInt1 > j - 4) {
            break label427;
          }
          m = paramInt2 + 1;
          if (m == paramCharSequence.length()) {
            break label413;
          }
          char c = paramCharSequence.charAt(m);
          if (!Character.isSurrogatePair(n, c)) {
            break label409;
          }
          paramInt2 = Character.toCodePoint(n, c);
          paramArrayOfByte[paramInt1] = ((byte)(byte)(paramInt2 >>> 18 | 0xF0));
          paramArrayOfByte[(paramInt1 + 1)] = ((byte)(byte)(paramInt2 >>> 12 & 0x3F | 0x80));
          paramArrayOfByte[(paramInt1 + 2)] = ((byte)(byte)(paramInt2 >>> 6 & 0x3F | 0x80));
          k = paramInt1 + 4;
          paramArrayOfByte[(paramInt1 + 3)] = ((byte)(byte)(paramInt2 & 0x3F | 0x80));
          paramInt2 = m;
          paramInt1 = k;
        }
        paramInt2++;
        continue;
        label409:
        paramInt2 = m;
        label413:
        throw new l0.c(paramInt2 - 1, i);
        label427:
        if ((55296 <= n) && (n <= 57343))
        {
          m = paramInt2 + 1;
          if ((m == paramCharSequence.length()) || (!Character.isSurrogatePair(n, paramCharSequence.charAt(m)))) {
            throw new l0.c(paramInt2, i);
          }
        }
        paramCharSequence = new StringBuilder();
        paramCharSequence.append("Failed writing ");
        paramCharSequence.append(n);
        paramCharSequence.append(" at index ");
        paramCharSequence.append(paramInt1);
        throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
      }
      return paramInt1;
    }
    
    public int c(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
    {
      int i = paramInt2;
      if (paramInt1 != 0)
      {
        if (paramInt2 >= paramInt3) {
          return paramInt1;
        }
        int j = (byte)paramInt1;
        if (j < -32) {
          if (j >= -62)
          {
            paramInt1 = paramInt2 + 1;
            if (paramArrayOfByte[paramInt2] > -65) {}
          }
        }
        do
        {
          i = paramInt1;
          break label289;
          return -1;
          if (j >= -16) {
            break label152;
          }
          k = (byte)(paramInt1 >> 8);
          paramInt1 = k;
          i = paramInt2;
          if (k == 0)
          {
            i = paramInt2 + 1;
            paramInt1 = paramArrayOfByte[paramInt2];
            if (i >= paramInt3) {
              return l0.a(j, paramInt1);
            }
          }
          if ((paramInt1 > -65) || ((j == -32) && (paramInt1 < -96)) || ((j == -19) && (paramInt1 >= -96))) {
            break;
          }
          paramInt1 = i + 1;
        } while (paramArrayOfByte[i] <= -65);
        return -1;
        label152:
        i = (byte)(paramInt1 >> 8);
        if (i == 0)
        {
          paramInt1 = paramInt2 + 1;
          i = paramArrayOfByte[paramInt2];
          if (paramInt1 >= paramInt3) {
            return l0.a(j, i);
          }
          paramInt2 = 0;
        }
        else
        {
          k = (byte)(paramInt1 >> 16);
          paramInt1 = paramInt2;
          paramInt2 = k;
        }
        int k = paramInt1;
        int m = paramInt2;
        if (paramInt2 == 0)
        {
          k = paramInt1 + 1;
          m = paramArrayOfByte[paramInt1];
          if (k >= paramInt3) {
            return l0.b(j, i, m);
          }
        }
        if ((i <= -65) && ((j << 28) + (i + 112) >> 30 == 0) && (m <= -65))
        {
          i = k + 1;
          if (paramArrayOfByte[k] <= -65) {}
        }
        else
        {
          return -1;
        }
      }
      label289:
      return d(paramArrayOfByte, i, paramInt3);
    }
  }
  
  public static class c
    extends IllegalArgumentException
  {
    public c(int paramInt1, int paramInt2)
    {
      super();
    }
  }
  
  public static final class d
    extends l0.a
  {
    public static boolean d()
    {
      boolean bool;
      if ((k0.E()) && (k0.F())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public static int e(byte[] paramArrayOfByte, long paramLong, int paramInt)
    {
      int i = f(paramArrayOfByte, paramLong, paramInt);
      paramInt -= i;
      paramLong += i;
      long l;
      label122:
      label213:
      do
      {
        do
        {
          for (;;)
          {
            j = 0;
            i = paramInt;
            paramInt = j;
            for (;;)
            {
              l = paramLong;
              if (i <= 0) {
                break;
              }
              l = paramLong + 1L;
              paramInt = k0.u(paramArrayOfByte, paramLong);
              if (paramInt < 0) {
                break;
              }
              i--;
              paramLong = l;
            }
            if (i == 0) {
              return 0;
            }
            j = i - 1;
            if (paramInt >= -32) {
              break label122;
            }
            if (j == 0) {
              return paramInt;
            }
            i -= 2;
            if ((paramInt < -62) || (k0.u(paramArrayOfByte, l) > -65)) {
              break;
            }
            paramLong = 1L + l;
            paramInt = i;
          }
          return -1;
          if (paramInt >= -16) {
            break label213;
          }
          if (j < 2) {
            return g(paramArrayOfByte, paramInt, l, j);
          }
          i -= 3;
          j = k0.u(paramArrayOfByte, l);
          if ((j > -65) || ((paramInt == -32) && (j < -96)) || ((paramInt == -19) && (j >= -96))) {
            break;
          }
          paramLong = l + 2L;
          paramInt = i;
        } while (k0.u(paramArrayOfByte, 1L + l) <= -65);
        return -1;
        if (j < 3) {
          return g(paramArrayOfByte, paramInt, l, j);
        }
        i -= 4;
        int j = k0.u(paramArrayOfByte, l);
        if ((j > -65) || ((paramInt << 28) + (j + 112) >> 30 != 0) || (k0.u(paramArrayOfByte, 1L + l) > -65)) {
          break;
        }
        paramLong = l + 3L;
        paramInt = i;
      } while (k0.u(paramArrayOfByte, 2L + l) <= -65);
      return -1;
    }
    
    public static int f(byte[] paramArrayOfByte, long paramLong, int paramInt)
    {
      int i = 0;
      if (paramInt < 16) {
        return 0;
      }
      int j = (int)paramLong;
      int k;
      for (long l = paramLong;; l = 1L + l)
      {
        k = i;
        paramLong = l;
        if (i >= 8 - (j & 0x7)) {
          break;
        }
        if (k0.u(paramArrayOfByte, l) < 0) {
          return i;
        }
        i++;
      }
      for (;;)
      {
        j = k + 8;
        i = k;
        l = paramLong;
        if (j > paramInt) {
          break;
        }
        if ((k0.A(paramArrayOfByte, k0.h + paramLong) & 0x8080808080808080) != 0L)
        {
          i = k;
          l = paramLong;
          break;
        }
        paramLong += 8L;
        k = j;
      }
      while (i < paramInt)
      {
        if (k0.u(paramArrayOfByte, l) < 0) {
          return i;
        }
        i++;
        l += 1L;
      }
      return paramInt;
    }
    
    public static int g(byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2)
    {
      if (paramInt2 != 0)
      {
        if (paramInt2 != 1)
        {
          if (paramInt2 == 2) {
            return l0.b(paramInt1, k0.u(paramArrayOfByte, paramLong), k0.u(paramArrayOfByte, paramLong + 1L));
          }
          throw new AssertionError();
        }
        return l0.a(paramInt1, k0.u(paramArrayOfByte, paramLong));
      }
      return l0.d(paramInt1);
    }
    
    public int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      long l1 = paramInt1;
      long l2 = paramInt2 + l1;
      int i = paramCharSequence.length();
      String str1 = " at index ";
      String str2 = "Failed writing ";
      if ((i <= paramInt2) && (paramArrayOfByte.length - paramInt2 >= paramInt1))
      {
        paramInt2 = 0;
        long l3;
        for (;;)
        {
          l3 = 1L;
          if (paramInt2 >= i) {
            break;
          }
          paramInt1 = paramCharSequence.charAt(paramInt2);
          if (paramInt1 >= 128) {
            break;
          }
          k0.K(paramArrayOfByte, l1, (byte)paramInt1);
          paramInt2++;
          l1 = 1L + l1;
        }
        paramInt1 = paramInt2;
        long l4 = l1;
        if (paramInt2 == i) {
          return (int)l1;
        }
        while (paramInt1 < i)
        {
          int j = paramCharSequence.charAt(paramInt1);
          if ((j < 128) && (l4 < l2))
          {
            k0.K(paramArrayOfByte, l4, (byte)j);
            l1 = l3;
            l3 = l4 + l3;
          }
          else
          {
            if ((j < 2048) && (l4 <= l2 - 2L))
            {
              k0.K(paramArrayOfByte, l4, (byte)(j >>> 6 | 0x3C0));
              l1 = l4 + 2L;
              k0.K(paramArrayOfByte, l4 + l3, (byte)(j & 0x3F | 0x80));
              l3 = l1;
            }
            for (;;)
            {
              l1 = 1L;
              break label474;
              if (((j >= 55296) && (57343 >= j)) || (l4 > l2 - 3L)) {
                break;
              }
              k0.K(paramArrayOfByte, l4, (byte)(j >>> 12 | 0x1E0));
              k0.K(paramArrayOfByte, l4 + 1L, (byte)(j >>> 6 & 0x3F | 0x80));
              l3 = l4 + 3L;
              k0.K(paramArrayOfByte, l4 + 2L, (byte)(j & 0x3F | 0x80));
            }
            if (l4 > l2 - 4L) {
              break label504;
            }
            paramInt2 = paramInt1 + 1;
            if (paramInt2 == i) {
              break label491;
            }
            char c = paramCharSequence.charAt(paramInt2);
            if (!Character.isSurrogatePair(j, c)) {
              break label488;
            }
            paramInt1 = Character.toCodePoint(j, c);
            l1 = 1L;
            k0.K(paramArrayOfByte, l4, (byte)(paramInt1 >>> 18 | 0xF0));
            k0.K(paramArrayOfByte, l4 + 1L, (byte)(paramInt1 >>> 12 & 0x3F | 0x80));
            k0.K(paramArrayOfByte, l4 + 2L, (byte)(paramInt1 >>> 6 & 0x3F | 0x80));
            l3 = l4 + 4L;
            k0.K(paramArrayOfByte, l4 + 3L, (byte)(paramInt1 & 0x3F | 0x80));
            paramInt1 = paramInt2;
          }
          label474:
          paramInt1++;
          l4 = l3;
          l3 = l1;
          continue;
          label488:
          paramInt1 = paramInt2;
          label491:
          throw new l0.c(paramInt1 - 1, i);
          label504:
          if ((55296 <= j) && (j <= 57343))
          {
            paramInt2 = paramInt1 + 1;
            if ((paramInt2 == i) || (!Character.isSurrogatePair(j, paramCharSequence.charAt(paramInt2)))) {
              throw new l0.c(paramInt1, i);
            }
          }
          paramCharSequence = new StringBuilder();
          paramCharSequence.append(str2);
          paramCharSequence.append(j);
          paramCharSequence.append(str1);
          paramCharSequence.append(l4);
          throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
        }
        return (int)l4;
      }
      paramArrayOfByte = new StringBuilder();
      paramArrayOfByte.append("Failed writing ");
      paramArrayOfByte.append(paramCharSequence.charAt(i - 1));
      paramArrayOfByte.append(" at index ");
      paramArrayOfByte.append(paramInt1 + paramInt2);
      throw new ArrayIndexOutOfBoundsException(paramArrayOfByte.toString());
    }
    
    public int c(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
    {
      int i = 0;
      if ((paramInt2 | paramInt3 | paramArrayOfByte.length - paramInt3) >= 0)
      {
        long l1 = paramInt2;
        long l2 = paramInt3;
        long l3 = l1;
        if (paramInt1 != 0)
        {
          if (l1 >= l2) {
            return paramInt1;
          }
          int j = (byte)paramInt1;
          if (j < -32)
          {
            if ((j >= -62) && (k0.u(paramArrayOfByte, l1) <= -65)) {
              l3 = 1L + l1;
            } else {
              return -1;
            }
          }
          else
          {
            if (j < -16)
            {
              paramInt2 = (byte)(paramInt1 >> 8);
              l3 = l1;
              paramInt1 = paramInt2;
              if (paramInt2 == 0)
              {
                l3 = l1 + 1L;
                paramInt1 = k0.u(paramArrayOfByte, l1);
                if (l3 >= l2) {
                  return l0.a(j, paramInt1);
                }
              }
              if ((paramInt1 <= -65) && ((j != -32) || (paramInt1 >= -96)) && ((j != -19) || (paramInt1 < -96)))
              {
                l1 = l3 + 1L;
                if (k0.u(paramArrayOfByte, l3) > -65) {}
              }
            }
            do
            {
              l3 = l1;
              break label342;
              return -1;
              paramInt2 = (byte)(paramInt1 >> 8);
              if (paramInt2 == 0)
              {
                l3 = l1 + 1L;
                paramInt2 = k0.u(paramArrayOfByte, l1);
                if (l3 >= l2) {
                  return l0.a(j, paramInt2);
                }
                l1 = l3;
                paramInt1 = i;
              }
              else
              {
                paramInt1 = (byte)(paramInt1 >> 16);
              }
              paramInt3 = paramInt1;
              l3 = l1;
              if (paramInt1 == 0)
              {
                l3 = l1 + 1L;
                paramInt3 = k0.u(paramArrayOfByte, l1);
                if (l3 >= l2) {
                  return l0.b(j, paramInt2, paramInt3);
                }
              }
              if ((paramInt2 > -65) || ((j << 28) + (paramInt2 + 112) >> 30 != 0) || (paramInt3 > -65)) {
                break;
              }
              l1 = l3 + 1L;
            } while (k0.u(paramArrayOfByte, l3) <= -65);
            return -1;
          }
        }
        label342:
        return e(paramArrayOfByte, l3, (int)(l2 - l3));
      }
      throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */