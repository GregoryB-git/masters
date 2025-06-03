package com.google.android.gms.internal.measurement;

public final class I5
  extends F5
{
  public final int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    while ((paramInt2 < paramInt3) && (paramArrayOfByte[paramInt2] >= 0)) {
      paramInt2++;
    }
    paramInt1 = paramInt2;
    if (paramInt2 >= paramInt3) {
      return 0;
    }
    for (;;)
    {
      paramInt2 = paramInt1;
      if (paramInt2 >= paramInt3) {
        return 0;
      }
      int i = paramInt2 + 1;
      paramInt1 = paramArrayOfByte[paramInt2];
      if (paramInt1 < 0)
      {
        if (paramInt1 < -32)
        {
          if (i >= paramInt3) {
            return paramInt1;
          }
          if (paramInt1 >= -62)
          {
            paramInt1 = paramInt2 + 2;
            if (paramArrayOfByte[i] <= -65) {}
          }
          else
          {
            return -1;
          }
        }
        else if (paramInt1 < -16)
        {
          if (i >= paramInt3 - 1) {
            return E5.c(paramArrayOfByte, i, paramInt3);
          }
          i = paramArrayOfByte[i];
          if ((i <= -65) && ((paramInt1 != -32) || (i >= -96)) && ((paramInt1 != -19) || (i < -96)))
          {
            paramInt1 = paramInt2 + 3;
            if (paramArrayOfByte[(paramInt2 + 2)] <= -65) {}
          }
          else
          {
            return -1;
          }
        }
        else
        {
          if (i >= paramInt3 - 2) {
            return E5.c(paramArrayOfByte, i, paramInt3);
          }
          i = paramArrayOfByte[i];
          if ((i <= -65) && ((paramInt1 << 28) + (i + 112) >> 30 == 0) && (paramArrayOfByte[(paramInt2 + 2)] <= -65))
          {
            paramInt1 = paramInt2 + 4;
            if (paramArrayOfByte[(paramInt2 + 3)] <= -65) {}
          }
          else
          {
            return -1;
          }
        }
      }
      else {
        paramInt1 = i;
      }
    }
  }
  
  public final int b(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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
        k = paramInt1 + 2;
        paramArrayOfByte[(paramInt1 + 1)] = ((byte)(byte)(n & 0x3F | 0x80));
        paramInt1 = k;
      }
      else if (((n < 55296) || (57343 < n)) && (paramInt1 <= j - 3))
      {
        paramArrayOfByte[paramInt1] = ((byte)(byte)(n >>> 12 | 0x1E0));
        paramArrayOfByte[(paramInt1 + 1)] = ((byte)(byte)(n >>> 6 & 0x3F | 0x80));
        k = paramInt1 + 3;
        paramArrayOfByte[(paramInt1 + 2)] = ((byte)(byte)(n & 0x3F | 0x80));
        paramInt1 = k;
      }
      else
      {
        if (paramInt1 > j - 4) {
          break label427;
        }
        k = paramInt2 + 1;
        if (k == paramCharSequence.length()) {
          break label413;
        }
        char c = paramCharSequence.charAt(k);
        if (!Character.isSurrogatePair(n, c)) {
          break label409;
        }
        paramInt2 = Character.toCodePoint(n, c);
        paramArrayOfByte[paramInt1] = ((byte)(byte)(paramInt2 >>> 18 | 0xF0));
        paramArrayOfByte[(paramInt1 + 1)] = ((byte)(byte)(paramInt2 >>> 12 & 0x3F | 0x80));
        paramArrayOfByte[(paramInt1 + 2)] = ((byte)(byte)(paramInt2 >>> 6 & 0x3F | 0x80));
        m = paramInt1 + 4;
        paramArrayOfByte[(paramInt1 + 3)] = ((byte)(byte)(paramInt2 & 0x3F | 0x80));
        paramInt2 = k;
        paramInt1 = m;
      }
      paramInt2++;
      continue;
      label409:
      paramInt2 = k;
      label413:
      throw new H5(paramInt2 - 1, i);
      label427:
      if ((55296 <= n) && (n <= 57343))
      {
        k = paramInt2 + 1;
        if ((k == paramCharSequence.length()) || (!Character.isSurrogatePair(n, paramCharSequence.charAt(k)))) {
          throw new H5(paramInt2, i);
        }
      }
      paramCharSequence = new StringBuilder("Failed writing ");
      paramCharSequence.append(n);
      paramCharSequence.append(" at index ");
      paramCharSequence.append(paramInt1);
      throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
    }
    return paramInt1;
  }
  
  public final String c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramInt1 | paramInt2 | paramArrayOfByte.length - paramInt1 - paramInt2) >= 0)
    {
      int i = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      byte b1;
      for (paramInt2 = 0; paramInt1 < i; paramInt2++)
      {
        b1 = paramArrayOfByte[paramInt1];
        if (b1 < 0) {
          break;
        }
        paramInt1++;
        G5.d(b1, arrayOfChar, paramInt2);
      }
      for (;;)
      {
        int j = paramInt1;
        if (j >= i) {
          break label281;
        }
        paramInt1 = j + 1;
        b1 = paramArrayOfByte[j];
        if (b1 >= 0)
        {
          j = paramInt2 + 1;
          G5.d(b1, arrayOfChar, paramInt2);
          for (paramInt2 = j; paramInt1 < i; paramInt2++)
          {
            b1 = paramArrayOfByte[paramInt1];
            if (b1 < 0) {
              break;
            }
            paramInt1++;
            G5.d(b1, arrayOfChar, paramInt2);
          }
        }
        else if (b1 < -32)
        {
          if (paramInt1 < i)
          {
            j += 2;
            G5.c(b1, paramArrayOfByte[paramInt1], arrayOfChar, paramInt2);
            paramInt2++;
            paramInt1 = j;
          }
          else
          {
            throw k4.c();
          }
        }
        else
        {
          byte b2;
          if (b1 < -16)
          {
            if (paramInt1 < i - 1)
            {
              b2 = paramArrayOfByte[paramInt1];
              paramInt1 = j + 3;
              G5.b(b1, b2, paramArrayOfByte[(j + 2)], arrayOfChar, paramInt2);
              paramInt2++;
            }
            else
            {
              throw k4.c();
            }
          }
          else
          {
            if (paramInt1 >= i - 2) {
              break;
            }
            byte b3 = paramArrayOfByte[paramInt1];
            b2 = paramArrayOfByte[(j + 2)];
            paramInt1 = j + 4;
            G5.a(b1, b3, b2, paramArrayOfByte[(j + 3)], arrayOfChar, paramInt2);
            paramInt2 += 2;
          }
        }
      }
      throw k4.c();
      label281:
      return new String(arrayOfChar, 0, paramInt2);
    }
    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.I5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */