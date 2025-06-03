package s0;

import f;

public final class m1
{
  public static final b a;
  
  static
  {
    int i;
    if ((l1.f) && (l1.e)) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject;
    if ((i != 0) && (!d.a())) {
      localObject = new e();
    } else {
      localObject = new c();
    }
    a = (b)localObject;
  }
  
  public static int a(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    int j = 0;
    for (int k = 0; (k < i) && (paramCharSequence.charAt(k) < ''); k++) {}
    int m = i;
    for (;;)
    {
      n = m;
      if (k >= i) {
        break label213;
      }
      n = paramCharSequence.charAt(k);
      if (n >= 2048) {
        break;
      }
      m += (127 - n >>> 31);
      k++;
    }
    int i1 = paramCharSequence.length();
    int n = j;
    while (k < i1)
    {
      int i2 = paramCharSequence.charAt(k);
      if (i2 < 2048)
      {
        n += (127 - i2 >>> 31);
        j = k;
      }
      else
      {
        int i3 = n + 2;
        n = i3;
        j = k;
        if (55296 <= i2)
        {
          n = i3;
          j = k;
          if (i2 <= 57343) {
            if (Character.codePointAt(paramCharSequence, k) >= 65536)
            {
              j = k + 1;
              n = i3;
            }
            else
            {
              throw new d(k, i1);
            }
          }
        }
      }
      k = j + 1;
    }
    n = m + n;
    label213:
    if (n >= i) {
      return n;
    }
    paramCharSequence = f.l("UTF-8 length does not fit in int: ");
    paramCharSequence.append(n + 4294967296L);
    throw new IllegalArgumentException(paramCharSequence.toString());
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= -12) && (paramInt2 <= -65)) {
      paramInt1 ^= paramInt2 << 8;
    } else {
      paramInt1 = -1;
    }
    return paramInt1;
  }
  
  public static int c(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 <= -12) && (paramInt2 <= -65) && (paramInt3 <= -65)) {
      paramInt1 = paramInt1 ^ paramInt2 << 8 ^ paramInt3 << 16;
    } else {
      paramInt1 = -1;
    }
    return paramInt1;
  }
  
  public static final class a
  {
    public static void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, char[] paramArrayOfChar, int paramInt)
    {
      if ((!c(paramByte2)) && (paramByte2 + 112 + (paramByte1 << 28) >> 30 == 0) && (!c(paramByte3)) && (!c(paramByte4)))
      {
        paramByte1 = (paramByte1 & 0x7) << 18 | (paramByte2 & 0x3F) << 12 | (paramByte3 & 0x3F) << 6 | paramByte4 & 0x3F;
        paramArrayOfChar[paramInt] = ((char)(char)((paramByte1 >>> 10) + 55232));
        paramArrayOfChar[(paramInt + 1)] = ((char)(char)((paramByte1 & 0x3FF) + 56320));
        return;
      }
      throw y.a();
    }
    
    public static void b(byte paramByte1, byte paramByte2, byte paramByte3, char[] paramArrayOfChar, int paramInt)
    {
      if ((!c(paramByte2)) && ((paramByte1 != -32) || (paramByte2 >= -96)) && ((paramByte1 != -19) || (paramByte2 < -96)) && (!c(paramByte3)))
      {
        paramArrayOfChar[paramInt] = ((char)(char)((paramByte1 & 0xF) << 12 | (paramByte2 & 0x3F) << 6 | paramByte3 & 0x3F));
        return;
      }
      throw y.a();
    }
    
    public static boolean c(byte paramByte)
    {
      boolean bool;
      if (paramByte > -65) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static abstract class b
  {
    public abstract String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
    
    public abstract int b(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
    
    public abstract int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  }
  
  public static final class c
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
  
  public static final class d
    extends IllegalArgumentException
  {
    public d(int paramInt1, int paramInt2)
    {
      super();
    }
  }
  
  public static final class e
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
}

/* Location:
 * Qualified Name:     s0.m1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */