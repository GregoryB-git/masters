package ma;

import java.nio.ByteBuffer;

public final class u1$c
  extends u1.b
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
        if (paramInt2 != 0)
        {
          if (k < i)
          {
            u1.a.b(b1, paramArrayOfByte[k], arrayOfChar, paramInt1);
            paramInt2 = k + 1;
            paramInt1++;
          }
          else
          {
            throw b0.c();
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
              u1.a.c(b1, paramArrayOfByte[k], paramArrayOfByte[paramInt2], arrayOfChar, paramInt1);
              paramInt2++;
              paramInt1++;
            }
            else
            {
              throw b0.c();
            }
          }
          else if (k < i - 2)
          {
            paramInt2 = k + 1;
            byte b2 = paramArrayOfByte[k];
            k = paramInt2 + 1;
            u1.a.a(b1, b2, paramArrayOfByte[paramInt2], paramArrayOfByte[k], arrayOfChar, paramInt1);
            paramInt1 = paramInt1 + 1 + 1;
            paramInt2 = k + 1;
          }
          else
          {
            throw b0.c();
          }
        }
      }
      return new String(arrayOfChar, 0, paramInt1);
    }
    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
  
  public final String c(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2)
  {
    return u1.b.b(paramInt1, paramByteBuffer, paramInt2);
  }
  
  public final int d(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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
          throw new u1.d(paramInt1 - 1, i);
        }
      }
      else
      {
        if ((55296 <= n) && (n <= 57343))
        {
          paramInt2 = paramInt1 + 1;
          if ((paramInt2 == paramCharSequence.length()) || (!Character.isSurrogatePair(n, paramCharSequence.charAt(paramInt2)))) {
            throw new u1.d(paramInt1, i);
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
  
  public final int e(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = -1;
    int j = paramInt2;
    int m;
    if (paramInt1 != 0)
    {
      if (paramInt2 >= paramInt3) {
        return paramInt1;
      }
      int k = (byte)paramInt1;
      if (k < -32) {
        if (k >= -62)
        {
          paramInt1 = paramInt2 + 1;
          if (paramArrayOfByte[paramInt2] > -65) {}
        }
      }
      label155:
      do
      {
        do
        {
          j = paramInt1;
          break label287;
          return -1;
          if (k >= -16) {
            break label155;
          }
          m = (byte)(paramInt1 >> 8);
          paramInt1 = m;
          j = paramInt2;
          if (m == 0)
          {
            j = paramInt2 + 1;
            paramInt1 = paramArrayOfByte[paramInt2];
            if (j >= paramInt3) {
              return u1.c(k, paramInt1);
            }
          }
          if ((paramInt1 > -65) || ((k == -32) && (paramInt1 < -96)) || ((k == -19) && (paramInt1 >= -96))) {
            break;
          }
          paramInt1 = j + 1;
        } while (paramArrayOfByte[j] <= -65);
        return -1;
        j = (byte)(paramInt1 >> 8);
        if (j == 0)
        {
          paramInt1 = paramInt2 + 1;
          j = paramArrayOfByte[paramInt2];
          if (paramInt1 >= paramInt3) {
            return u1.c(k, j);
          }
          paramInt2 = paramInt1;
          paramInt1 = 0;
        }
        else
        {
          paramInt1 = (byte)(paramInt1 >> 16);
        }
        int n = paramInt1;
        m = paramInt2;
        if (paramInt1 == 0)
        {
          m = paramInt2 + 1;
          n = paramArrayOfByte[paramInt2];
          if (m >= paramInt3) {
            return u1.d(k, j, n);
          }
        }
        if ((j > -65) || (j + 112 + (k << 28) >> 30 != 0) || (n > -65)) {
          break;
        }
        paramInt1 = m + 1;
      } while (paramArrayOfByte[m] <= -65);
      return -1;
    }
    label287:
    while ((j < paramInt3) && (paramArrayOfByte[j] >= 0)) {
      j++;
    }
    paramInt1 = j;
    if (j < paramInt3) {}
    for (;;)
    {
      if (paramInt1 >= paramInt3)
      {
        paramInt1 = 0;
      }
      else
      {
        paramInt2 = paramInt1 + 1;
        j = paramArrayOfByte[paramInt1];
        if (j >= 0) {
          break label638;
        }
        if (j < -32) {
          if (paramInt2 >= paramInt3) {
            paramInt1 = j;
          }
        }
        for (;;)
        {
          break label636;
          paramInt1 = i;
          if (j >= -62)
          {
            paramInt1 = paramInt2 + 1;
            if (paramArrayOfByte[paramInt2] <= -65) {
              break;
            }
            paramInt1 = i;
            break label636;
            if (j < -16)
            {
              if (paramInt2 >= paramInt3 - 1) {
                break label488;
              }
              m = paramInt2 + 1;
              paramInt2 = paramArrayOfByte[paramInt2];
              paramInt1 = i;
              if (paramInt2 > -65) {
                break label636;
              }
              if (j == -32)
              {
                paramInt1 = i;
                if (paramInt2 < -96) {
                  break label636;
                }
              }
              if (j == -19)
              {
                paramInt1 = i;
                if (paramInt2 >= -96) {
                  break label636;
                }
              }
              paramInt1 = m + 1;
              if (paramArrayOfByte[m] <= -65) {
                break;
              }
              paramInt1 = i;
              break label636;
            }
            if (paramInt2 >= paramInt3 - 2)
            {
              label488:
              j = paramArrayOfByte[(paramInt2 - 1)];
              paramInt1 = paramInt3 - paramInt2;
              if (paramInt1 != 0)
              {
                if (paramInt1 != 1)
                {
                  if (paramInt1 == 2) {
                    paramInt1 = u1.d(j, paramArrayOfByte[paramInt2], paramArrayOfByte[(paramInt2 + 1)]);
                  } else {
                    throw new AssertionError();
                  }
                }
                else {
                  paramInt1 = u1.c(j, paramArrayOfByte[paramInt2]);
                }
              }
              else
              {
                paramInt1 = j;
                if (j > -12) {
                  paramInt1 = i;
                }
              }
            }
            else
            {
              m = paramInt2 + 1;
              paramInt2 = paramArrayOfByte[paramInt2];
              paramInt1 = i;
              if (paramInt2 <= -65)
              {
                paramInt1 = i;
                if (paramInt2 + 112 + (j << 28) >> 30 == 0)
                {
                  paramInt2 = m + 1;
                  paramInt1 = i;
                  if (paramArrayOfByte[m] <= -65)
                  {
                    paramInt1 = paramInt2 + 1;
                    if (paramArrayOfByte[paramInt2] <= -65) {
                      break;
                    }
                    paramInt1 = i;
                  }
                }
              }
            }
          }
        }
      }
      label636:
      return paramInt1;
      label638:
      paramInt1 = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     ma.u1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */