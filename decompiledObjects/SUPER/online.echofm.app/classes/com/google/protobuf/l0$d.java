package com.google.protobuf;

public final class l0$d
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

/* Location:
 * Qualified Name:     com.google.protobuf.l0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */