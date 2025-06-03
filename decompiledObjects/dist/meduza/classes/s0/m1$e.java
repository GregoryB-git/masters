package s0;

import f;

public final class m1$e
  extends m1.b
{
  public static int d(byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2) {
          return m1.c(paramInt1, l1.g(paramArrayOfByte, paramLong), l1.g(paramArrayOfByte, paramLong + 1L));
        }
        throw new AssertionError();
      }
      return m1.b(paramInt1, l1.g(paramArrayOfByte, paramLong));
    }
    paramArrayOfByte = m1.a;
    paramInt2 = paramInt1;
    if (paramInt1 > -12) {
      paramInt2 = -1;
    }
    return paramInt2;
  }
  
  public final String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramInt1 | paramInt2 | paramArrayOfByte.length - paramInt1 - paramInt2) >= 0)
    {
      int i = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      int j;
      for (paramInt2 = 0; paramInt1 < i; paramInt2++)
      {
        j = l1.g(paramArrayOfByte, paramInt1);
        if (j >= 0) {
          k = 1;
        } else {
          k = 0;
        }
        if (k == 0) {
          break;
        }
        paramInt1++;
        arrayOfChar[paramInt2] = ((char)(char)j);
      }
      int k = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = k;
      while (paramInt2 < i)
      {
        k = paramInt2 + 1;
        byte b1 = l1.g(paramArrayOfByte, paramInt2);
        if (b1 >= 0) {
          paramInt2 = 1;
        } else {
          paramInt2 = 0;
        }
        if (paramInt2 != 0)
        {
          paramInt2 = paramInt1 + 1;
          arrayOfChar[paramInt1] = ((char)(char)b1);
          paramInt1 = paramInt2;
          for (;;)
          {
            j = paramInt1;
            paramInt1 = j;
            paramInt2 = k;
            if (k >= i) {
              break;
            }
            paramInt2 = l1.g(paramArrayOfByte, k);
            if (paramInt2 >= 0) {
              paramInt1 = 1;
            } else {
              paramInt1 = 0;
            }
            if (paramInt1 == 0)
            {
              paramInt1 = j;
              paramInt2 = k;
              break;
            }
            k++;
            paramInt1 = j + 1;
            arrayOfChar[j] = ((char)(char)paramInt2);
          }
        }
        if (b1 < -32) {
          paramInt2 = 1;
        } else {
          paramInt2 = 0;
        }
        byte b2;
        if (paramInt2 != 0)
        {
          if (k < i)
          {
            b2 = l1.g(paramArrayOfByte, k);
            if ((b1 >= -62) && (!m1.a.c(b2)))
            {
              arrayOfChar[paramInt1] = ((char)(char)((b1 & 0x1F) << 6 | b2 & 0x3F));
              paramInt2 = k + 1;
              paramInt1++;
            }
            else
            {
              throw y.a();
            }
          }
          else
          {
            throw y.a();
          }
        }
        else
        {
          if (b1 < -16) {
            paramInt2 = 1;
          } else {
            paramInt2 = 0;
          }
          if (paramInt2 != 0)
          {
            if (k < i - 1)
            {
              paramInt2 = k + 1;
              m1.a.b(b1, l1.g(paramArrayOfByte, k), l1.g(paramArrayOfByte, paramInt2), arrayOfChar, paramInt1);
              paramInt2++;
              paramInt1++;
            }
            else
            {
              throw y.a();
            }
          }
          else if (k < i - 2)
          {
            j = k + 1;
            b2 = l1.g(paramArrayOfByte, k);
            paramInt2 = j + 1;
            m1.a.a(b1, b2, l1.g(paramArrayOfByte, j), l1.g(paramArrayOfByte, paramInt2), arrayOfChar, paramInt1);
            paramInt1 = paramInt1 + 1 + 1;
            paramInt2++;
          }
          else
          {
            throw y.a();
          }
        }
      }
      return new String(arrayOfChar, 0, paramInt1);
    }
    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
  
  public final int b(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l1 = paramInt1;
    long l2 = paramInt2 + l1;
    int i = paramCharSequence.length();
    if ((i <= paramInt2) && (paramArrayOfByte.length - paramInt2 >= paramInt1))
    {
      paramInt2 = 0;
      long l3;
      int j;
      for (;;)
      {
        l3 = 1L;
        j = 128;
        if (paramInt2 >= i) {
          break;
        }
        paramInt1 = paramCharSequence.charAt(paramInt2);
        if (paramInt1 >= 128) {
          break;
        }
        l1.p(paramArrayOfByte, l1, (byte)paramInt1);
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
        int k = paramCharSequence.charAt(paramInt1);
        if ((k < j) && (l4 < l2))
        {
          l1.p(paramArrayOfByte, l4, (byte)k);
          l1 = l4 + l3;
          paramInt2 = j;
        }
        else
        {
          if ((k < 2048) && (l4 <= l2 - 2L))
          {
            long l5 = l4 + l3;
            l1.p(paramArrayOfByte, l4, (byte)(k >>> 6 | 0x3C0));
            l1 = l5 + l3;
            l1.p(paramArrayOfByte, l5, (byte)(k & 0x3F | 0x80));
          }
          for (;;)
          {
            paramInt2 = 128;
            break label491;
            if (((k >= 55296) && (57343 >= k)) || (l4 > l2 - 3L)) {
              break;
            }
            l1 = l4 + l3;
            l1.p(paramArrayOfByte, l4, (byte)(k >>> 12 | 0x1E0));
            l3 += l1;
            l1.p(paramArrayOfByte, l1, (byte)(k >>> 6 & 0x3F | 0x80));
            l1 = 1L + l3;
            l1.p(paramArrayOfByte, l3, (byte)(k & 0x3F | 0x80));
            l3 = 1L;
          }
          if (l4 > l2 - 4L) {
            break label521;
          }
          paramInt2 = paramInt1 + 1;
          if (paramInt2 == i) {
            break label508;
          }
          char c = paramCharSequence.charAt(paramInt2);
          if (!Character.isSurrogatePair(k, c)) {
            break label505;
          }
          paramInt1 = Character.toCodePoint(k, c);
          l3 = l4 + 1L;
          l1.p(paramArrayOfByte, l4, (byte)(paramInt1 >>> 18 | 0xF0));
          l1 = 1L + l3;
          l1.p(paramArrayOfByte, l3, (byte)(paramInt1 >>> 12 & 0x3F | 0x80));
          l4 = 1L + l1;
          l1.p(paramArrayOfByte, l1, (byte)(paramInt1 >>> 6 & 0x3F | 0x80));
          l3 = 1L;
          l1.p(paramArrayOfByte, l4, (byte)(paramInt1 & 0x3F | 0x80));
          paramInt1 = paramInt2;
          paramInt2 = 128;
          l1 = l4 + 1L;
        }
        label491:
        paramInt1++;
        j = paramInt2;
        l4 = l1;
        continue;
        label505:
        paramInt1 = paramInt2;
        label508:
        throw new m1.d(paramInt1 - 1, i);
        label521:
        if ((55296 <= k) && (k <= 57343))
        {
          paramInt2 = paramInt1 + 1;
          if ((paramInt2 == i) || (!Character.isSurrogatePair(k, paramCharSequence.charAt(paramInt2)))) {
            throw new m1.d(paramInt1, i);
          }
        }
        paramCharSequence = new StringBuilder();
        paramCharSequence.append("Failed writing ");
        paramCharSequence.append(k);
        paramCharSequence.append(" at index ");
        paramCharSequence.append(l4);
        throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
      }
      return (int)l4;
    }
    paramArrayOfByte = f.l("Failed writing ");
    paramArrayOfByte.append(paramCharSequence.charAt(i - 1));
    paramArrayOfByte.append(" at index ");
    paramArrayOfByte.append(paramInt1 + paramInt2);
    throw new ArrayIndexOutOfBoundsException(paramArrayOfByte.toString());
  }
  
  public final int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramInt1 | paramInt2 | paramArrayOfByte.length - paramInt2) >= 0)
    {
      long l1 = paramInt1;
      paramInt2 = (int)(paramInt2 - l1);
      if (paramInt2 < 16)
      {
        paramInt1 = 0;
      }
      else
      {
        l2 = l1;
        paramInt1 = 0;
        while (paramInt1 < paramInt2)
        {
          if (l1.g(paramArrayOfByte, l2) < 0) {
            break label70;
          }
          paramInt1++;
          l2 += 1L;
        }
        paramInt1 = paramInt2;
      }
      label70:
      paramInt2 -= paramInt1;
      long l2 = l1 + paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = 0;
      int i = paramInt1;
      for (;;)
      {
        paramInt1 = paramInt2;
        l1 = l2;
        if (i <= 0) {
          break;
        }
        l1 = l2 + 1L;
        paramInt1 = l1.g(paramArrayOfByte, l2);
        if (paramInt1 < 0) {
          break;
        }
        i--;
        l2 = l1;
        paramInt2 = paramInt1;
      }
      if (i == 0)
      {
        paramInt1 = 0;
      }
      else
      {
        paramInt2 = i - 1;
        if (paramInt1 < -32)
        {
          if (paramInt2 == 0) {
            break label371;
          }
          paramInt2--;
          if (paramInt1 >= -62)
          {
            l2 = l1 + 1L;
            paramInt1 = paramInt2;
            if (l1.g(paramArrayOfByte, l1) > -65) {}
          }
        }
        else
        {
          label281:
          do
          {
            break;
            if (paramInt1 < -16)
            {
              if (paramInt2 < 2) {
                break label281;
              }
              paramInt2 -= 2;
              long l3 = l1 + 1L;
              i = l1.g(paramArrayOfByte, l1);
              if ((i > -65) || ((paramInt1 == -32) && (i < -96)) || ((paramInt1 == -19) && (i >= -96))) {
                break label369;
              }
              l2 = l3 + 1L;
              paramInt1 = paramInt2;
              if (l1.g(paramArrayOfByte, l3) <= -65) {
                break;
              }
              break label369;
            }
            if (paramInt2 < 3)
            {
              paramInt1 = d(paramArrayOfByte, paramInt1, l1, paramInt2);
              break label371;
            }
            paramInt2 -= 3;
            l2 = l1 + 1L;
            i = l1.g(paramArrayOfByte, l1);
            if ((i > -65) || (i + 112 + (paramInt1 << 28) >> 30 != 0)) {
              break label369;
            }
            l1 = l2 + 1L;
            if (l1.g(paramArrayOfByte, l2) > -65) {
              break label369;
            }
            l2 = l1 + 1L;
            paramInt1 = paramInt2;
          } while (l1.g(paramArrayOfByte, l1) <= -65);
        }
        label369:
        paramInt1 = -1;
      }
      label371:
      return paramInt1;
    }
    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
}

/* Location:
 * Qualified Name:     s0.m1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */