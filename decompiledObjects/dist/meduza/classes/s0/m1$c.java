package s0;

public final class m1$c
  extends m1.b
{
  public final String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramInt1 | paramInt2 | paramArrayOfByte.length - paramInt1 - paramInt2) >= 0)
    {
      int i = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      int j;
      for (paramInt2 = 0; paramInt1 < i; paramInt2++)
      {
        j = paramArrayOfByte[paramInt1];
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
        byte b1 = paramArrayOfByte[paramInt2];
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
            paramInt2 = paramArrayOfByte[k];
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
            b2 = paramArrayOfByte[k];
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
              m1.a.b(b1, paramArrayOfByte[k], paramArrayOfByte[paramInt2], arrayOfChar, paramInt1);
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
            paramInt2 = k + 1;
            b2 = paramArrayOfByte[k];
            k = paramInt2 + 1;
            m1.a.a(b1, b2, paramArrayOfByte[paramInt2], paramArrayOfByte[k], arrayOfChar, paramInt1);
            paramInt1 = paramInt1 + 1 + 1;
            paramInt2 = k + 1;
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
    int i = paramCharSequence.length();
    int j = paramInt2 + paramInt1;
    int k;
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
    int m = paramInt1 + paramInt2;
    paramInt1 = paramInt2;
    while (paramInt1 < i)
    {
      int n = paramCharSequence.charAt(paramInt1);
      if ((n < 128) && (m < j))
      {
        paramInt2 = m + 1;
        paramArrayOfByte[m] = ((byte)(byte)n);
      }
      else if ((n < 2048) && (m <= j - 2))
      {
        k = m + 1;
        paramArrayOfByte[m] = ((byte)(byte)(n >>> 6 | 0x3C0));
        paramInt2 = k + 1;
        paramArrayOfByte[k] = ((byte)(byte)(n & 0x3F | 0x80));
      }
      else if (((n < 55296) || (57343 < n)) && (m <= j - 3))
      {
        paramInt2 = m + 1;
        paramArrayOfByte[m] = ((byte)(byte)(n >>> 12 | 0x1E0));
        m = paramInt2 + 1;
        paramArrayOfByte[paramInt2] = ((byte)(byte)(n >>> 6 & 0x3F | 0x80));
        paramInt2 = m + 1;
        paramArrayOfByte[m] = ((byte)(byte)(n & 0x3F | 0x80));
      }
      if (m <= j - 4)
      {
        paramInt2 = paramInt1 + 1;
        if (paramInt2 != paramCharSequence.length())
        {
          char c = paramCharSequence.charAt(paramInt2);
          if (Character.isSurrogatePair(n, c))
          {
            paramInt1 = Character.toCodePoint(n, c);
            k = m + 1;
            paramArrayOfByte[m] = ((byte)(byte)(paramInt1 >>> 18 | 0xF0));
            m = k + 1;
            paramArrayOfByte[k] = ((byte)(byte)(paramInt1 >>> 12 & 0x3F | 0x80));
            k = m + 1;
            paramArrayOfByte[m] = ((byte)(byte)(paramInt1 >>> 6 & 0x3F | 0x80));
            m = k + 1;
            paramArrayOfByte[k] = ((byte)(byte)(paramInt1 & 0x3F | 0x80));
            paramInt1 = paramInt2;
            paramInt2 = m;
            paramInt1++;
            m = paramInt2;
          }
          else
          {
            paramInt1 = paramInt2;
          }
        }
        else
        {
          throw new m1.d(paramInt1 - 1, i);
        }
      }
      else
      {
        if ((55296 <= n) && (n <= 57343))
        {
          paramInt2 = paramInt1 + 1;
          if ((paramInt2 == paramCharSequence.length()) || (!Character.isSurrogatePair(n, paramCharSequence.charAt(paramInt2)))) {
            throw new m1.d(paramInt1, i);
          }
        }
        paramCharSequence = new StringBuilder();
        paramCharSequence.append("Failed writing ");
        paramCharSequence.append(n);
        paramCharSequence.append(" at index ");
        paramCharSequence.append(m);
        throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
      }
    }
    return m;
  }
  
  public final int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    for (int i = paramInt1; (i < paramInt2) && (paramArrayOfByte[i] >= 0); i++) {}
    int j = -1;
    paramInt1 = i;
    if (i < paramInt2) {}
    label216:
    label376:
    label378:
    for (;;)
    {
      if (paramInt1 >= paramInt2)
      {
        paramInt1 = 0;
      }
      else
      {
        i = paramInt1 + 1;
        int k = paramArrayOfByte[paramInt1];
        paramInt1 = i;
        if (k >= 0) {
          break label378;
        }
        if (k < -32) {
          if (i >= paramInt2) {
            paramInt1 = k;
          }
        }
        for (;;)
        {
          break label376;
          paramInt1 = j;
          if (k >= -62)
          {
            paramInt1 = i + 1;
            if (paramArrayOfByte[i] <= -65) {
              break;
            }
            paramInt1 = j;
            break label376;
            int m;
            if (k < -16)
            {
              if (i >= paramInt2 - 1) {
                break label216;
              }
              m = i + 1;
              i = paramArrayOfByte[i];
              paramInt1 = j;
              if (i > -65) {
                break label376;
              }
              if (k == -32)
              {
                paramInt1 = j;
                if (i < -96) {
                  break label376;
                }
              }
              if (k == -19)
              {
                paramInt1 = j;
                if (i >= -96) {
                  break label376;
                }
              }
              paramInt1 = m + 1;
              if (paramArrayOfByte[m] <= -65) {
                break;
              }
              paramInt1 = j;
              break label376;
            }
            if (i >= paramInt2 - 2)
            {
              k = paramArrayOfByte[(i - 1)];
              paramInt1 = paramInt2 - i;
              if (paramInt1 != 0)
              {
                if (paramInt1 != 1)
                {
                  if (paramInt1 == 2) {
                    paramInt1 = m1.c(k, paramArrayOfByte[i], paramArrayOfByte[(i + 1)]);
                  } else {
                    throw new AssertionError();
                  }
                }
                else {
                  paramInt1 = m1.b(k, paramArrayOfByte[i]);
                }
              }
              else
              {
                paramInt1 = k;
                if (k > -12) {
                  paramInt1 = j;
                }
              }
            }
            else
            {
              m = i + 1;
              i = paramArrayOfByte[i];
              paramInt1 = j;
              if (i <= -65)
              {
                paramInt1 = j;
                if (i + 112 + (k << 28) >> 30 == 0)
                {
                  i = m + 1;
                  paramInt1 = j;
                  if (paramArrayOfByte[m] <= -65)
                  {
                    paramInt1 = i + 1;
                    if (paramArrayOfByte[i] <= -65) {
                      break label378;
                    }
                    paramInt1 = j;
                  }
                }
              }
            }
          }
        }
      }
      return paramInt1;
    }
  }
}

/* Location:
 * Qualified Name:     s0.m1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */