package com.google.protobuf;

public final class l0$b
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

/* Location:
 * Qualified Name:     com.google.protobuf.l0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */