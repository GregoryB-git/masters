package androidx.datastore.preferences.protobuf;

public abstract class q0
{
  public static final b a;
  
  static
  {
    Object localObject;
    if ((e.e()) && (!d.c())) {
      localObject = new e();
    } else {
      localObject = new c();
    }
    a = (b)localObject;
  }
  
  public static String e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static int f(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.b(paramCharSequence, paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static int g(CharSequence paramCharSequence)
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
    int m = k + h(paramCharSequence, j);
    label86:
    if (m >= i) {
      return m;
    }
    paramCharSequence = new StringBuilder();
    paramCharSequence.append("UTF-8 length does not fit in int: ");
    paramCharSequence.append(m + 4294967296L);
    throw new IllegalArgumentException(paramCharSequence.toString());
  }
  
  public static int h(CharSequence paramCharSequence, int paramInt)
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
              throw new d(paramInt, i);
            }
          }
        }
      }
      paramInt = m + 1;
    }
    return j;
  }
  
  public static int i(int paramInt)
  {
    int i = paramInt;
    if (paramInt > -12) {
      i = -1;
    }
    return i;
  }
  
  public static int j(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= -12) && (paramInt2 <= -65)) {
      paramInt1 ^= paramInt2 << 8;
    } else {
      paramInt1 = -1;
    }
    return paramInt1;
  }
  
  public static int k(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 <= -12) && (paramInt2 <= -65) && (paramInt3 <= -65)) {
      paramInt1 = paramInt1 ^ paramInt2 << 8 ^ paramInt3 << 16;
    } else {
      paramInt1 = -1;
    }
    return paramInt1;
  }
  
  public static int l(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte[(paramInt1 - 1)];
    paramInt2 -= paramInt1;
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2) {
          return k(i, paramArrayOfByte[paramInt1], paramArrayOfByte[(paramInt1 + 1)]);
        }
        throw new AssertionError();
      }
      return j(i, paramArrayOfByte[paramInt1]);
    }
    return i(i);
  }
  
  public static boolean m(byte[] paramArrayOfByte)
  {
    return a.c(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static boolean n(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.c(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static abstract class a
  {
    public static void h(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, char[] paramArrayOfChar, int paramInt)
    {
      if ((!m(paramByte2)) && ((paramByte1 << 28) + (paramByte2 + 112) >> 30 == 0) && (!m(paramByte3)) && (!m(paramByte4)))
      {
        paramByte1 = (paramByte1 & 0x7) << 18 | r(paramByte2) << 12 | r(paramByte3) << 6 | r(paramByte4);
        paramArrayOfChar[paramInt] = l(paramByte1);
        paramArrayOfChar[(paramInt + 1)] = q(paramByte1);
        return;
      }
      throw z.c();
    }
    
    public static void i(byte paramByte, char[] paramArrayOfChar, int paramInt)
    {
      paramArrayOfChar[paramInt] = ((char)(char)paramByte);
    }
    
    public static void j(byte paramByte1, byte paramByte2, byte paramByte3, char[] paramArrayOfChar, int paramInt)
    {
      if ((!m(paramByte2)) && ((paramByte1 != -32) || (paramByte2 >= -96)) && ((paramByte1 != -19) || (paramByte2 < -96)) && (!m(paramByte3)))
      {
        paramArrayOfChar[paramInt] = ((char)(char)((paramByte1 & 0xF) << 12 | r(paramByte2) << 6 | r(paramByte3)));
        return;
      }
      throw z.c();
    }
    
    public static void k(byte paramByte1, byte paramByte2, char[] paramArrayOfChar, int paramInt)
    {
      if ((paramByte1 >= -62) && (!m(paramByte2)))
      {
        paramArrayOfChar[paramInt] = ((char)(char)((paramByte1 & 0x1F) << 6 | r(paramByte2)));
        return;
      }
      throw z.c();
    }
    
    public static char l(int paramInt)
    {
      return (char)((paramInt >>> 10) + 55232);
    }
    
    public static boolean m(byte paramByte)
    {
      boolean bool;
      if (paramByte > -65) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public static boolean n(byte paramByte)
    {
      boolean bool;
      if (paramByte >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public static boolean o(byte paramByte)
    {
      boolean bool;
      if (paramByte < -16) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public static boolean p(byte paramByte)
    {
      boolean bool;
      if (paramByte < -32) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public static char q(int paramInt)
    {
      return (char)((paramInt & 0x3FF) + 56320);
    }
    
    public static int r(byte paramByte)
    {
      return paramByte & 0x3F;
    }
  }
  
  public static abstract class b
  {
    public abstract String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
    
    public abstract int b(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
    
    public final boolean c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      boolean bool = false;
      if (d(0, paramArrayOfByte, paramInt1, paramInt2) == 0) {
        bool = true;
      }
      return bool;
    }
    
    public abstract int d(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);
  }
  
  public static final class c
    extends q0.b
  {
    public static int e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      while ((paramInt1 < paramInt2) && (paramArrayOfByte[paramInt1] >= 0)) {
        paramInt1++;
      }
      if (paramInt1 >= paramInt2) {
        paramInt1 = 0;
      } else {
        paramInt1 = f(paramArrayOfByte, paramInt1, paramInt2);
      }
      return paramInt1;
    }
    
    public static int f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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
              return q0.c(paramArrayOfByte, j, paramInt2);
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
              return q0.c(paramArrayOfByte, j, paramInt2);
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
    
    public String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if ((paramInt1 | paramInt2 | paramArrayOfByte.length - paramInt1 - paramInt2) >= 0)
      {
        int i = paramInt1 + paramInt2;
        char[] arrayOfChar = new char[paramInt2];
        byte b1;
        for (paramInt2 = 0; paramInt1 < i; paramInt2++)
        {
          b1 = paramArrayOfByte[paramInt1];
          if (!q0.a.b(b1)) {
            break;
          }
          paramInt1++;
          q0.a.c(b1, arrayOfChar, paramInt2);
        }
        while (paramInt1 < i)
        {
          int j = paramInt1 + 1;
          b1 = paramArrayOfByte[paramInt1];
          if (q0.a.b(b1))
          {
            paramInt1 = paramInt2 + 1;
            q0.a.c(b1, arrayOfChar, paramInt2);
            paramInt2 = j;
            while (paramInt2 < i)
            {
              b1 = paramArrayOfByte[paramInt2];
              if (!q0.a.b(b1)) {
                break;
              }
              paramInt2++;
              q0.a.c(b1, arrayOfChar, paramInt1);
              paramInt1++;
            }
            j = paramInt1;
            paramInt1 = paramInt2;
            paramInt2 = j;
          }
          else if (q0.a.d(b1))
          {
            if (j < i)
            {
              paramInt1 += 2;
              q0.a.e(b1, paramArrayOfByte[j], arrayOfChar, paramInt2);
              paramInt2++;
            }
            else
            {
              throw z.c();
            }
          }
          else
          {
            byte b2;
            if (q0.a.f(b1))
            {
              if (j < i - 1)
              {
                b2 = paramArrayOfByte[j];
                j = paramInt1 + 3;
                q0.a.g(b1, b2, paramArrayOfByte[(paramInt1 + 2)], arrayOfChar, paramInt2);
                paramInt2++;
                paramInt1 = j;
              }
              else
              {
                throw z.c();
              }
            }
            else if (j < i - 2)
            {
              byte b3 = paramArrayOfByte[j];
              b2 = paramArrayOfByte[(paramInt1 + 2)];
              j = paramInt1 + 4;
              q0.a.a(b1, b3, b2, paramArrayOfByte[(paramInt1 + 3)], arrayOfChar, paramInt2);
              paramInt2 += 2;
              paramInt1 = j;
            }
            else
            {
              throw z.c();
            }
          }
        }
        return new String(arrayOfChar, 0, paramInt2);
      }
      throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
    }
    
    public int b(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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
        throw new q0.d(paramInt2 - 1, i);
        label427:
        if ((55296 <= n) && (n <= 57343))
        {
          k = paramInt2 + 1;
          if ((k == paramCharSequence.length()) || (!Character.isSurrogatePair(n, paramCharSequence.charAt(k)))) {
            throw new q0.d(paramInt2, i);
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
    
    public int d(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
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
              return q0.a(j, paramInt1);
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
            return q0.a(j, i);
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
            return q0.b(j, i, m);
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
      return e(paramArrayOfByte, i, paramInt3);
    }
  }
  
  public static class d
    extends IllegalArgumentException
  {
    public d(int paramInt1, int paramInt2)
    {
      super();
    }
  }
  
  public static final class e
    extends q0.b
  {
    public static boolean e()
    {
      boolean bool;
      if ((p0.C()) && (p0.D())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public static int f(byte[] paramArrayOfByte, long paramLong, int paramInt)
    {
      int i = g(paramArrayOfByte, paramLong, paramInt);
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
              paramInt = p0.s(paramArrayOfByte, paramLong);
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
            if ((paramInt < -62) || (p0.s(paramArrayOfByte, l) > -65)) {
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
            return h(paramArrayOfByte, paramInt, l, j);
          }
          i -= 3;
          j = p0.s(paramArrayOfByte, l);
          if ((j > -65) || ((paramInt == -32) && (j < -96)) || ((paramInt == -19) && (j >= -96))) {
            break;
          }
          paramLong = l + 2L;
          paramInt = i;
        } while (p0.s(paramArrayOfByte, 1L + l) <= -65);
        return -1;
        if (j < 3) {
          return h(paramArrayOfByte, paramInt, l, j);
        }
        i -= 4;
        int j = p0.s(paramArrayOfByte, l);
        if ((j > -65) || ((paramInt << 28) + (j + 112) >> 30 != 0) || (p0.s(paramArrayOfByte, 1L + l) > -65)) {
          break;
        }
        paramLong = l + 3L;
        paramInt = i;
      } while (p0.s(paramArrayOfByte, 2L + l) <= -65);
      return -1;
    }
    
    public static int g(byte[] paramArrayOfByte, long paramLong, int paramInt)
    {
      int i = 0;
      if (paramInt < 16) {
        return 0;
      }
      while (i < paramInt)
      {
        if (p0.s(paramArrayOfByte, paramLong) < 0) {
          return i;
        }
        i++;
        paramLong = 1L + paramLong;
      }
      return paramInt;
    }
    
    public static int h(byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2)
    {
      if (paramInt2 != 0)
      {
        if (paramInt2 != 1)
        {
          if (paramInt2 == 2) {
            return q0.b(paramInt1, p0.s(paramArrayOfByte, paramLong), p0.s(paramArrayOfByte, paramLong + 1L));
          }
          throw new AssertionError();
        }
        return q0.a(paramInt1, p0.s(paramArrayOfByte, paramLong));
      }
      return q0.d(paramInt1);
    }
    
    public String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if ((paramInt1 | paramInt2 | paramArrayOfByte.length - paramInt1 - paramInt2) >= 0)
      {
        int i = paramInt1 + paramInt2;
        char[] arrayOfChar = new char[paramInt2];
        byte b1;
        for (paramInt2 = 0; paramInt1 < i; paramInt2++)
        {
          b1 = p0.s(paramArrayOfByte, paramInt1);
          if (!q0.a.b(b1)) {
            break;
          }
          paramInt1++;
          q0.a.c(b1, arrayOfChar, paramInt2);
        }
        while (paramInt1 < i)
        {
          int j = paramInt1 + 1;
          b1 = p0.s(paramArrayOfByte, paramInt1);
          if (q0.a.b(b1))
          {
            paramInt1 = paramInt2 + 1;
            q0.a.c(b1, arrayOfChar, paramInt2);
            paramInt2 = j;
            while (paramInt2 < i)
            {
              b1 = p0.s(paramArrayOfByte, paramInt2);
              if (!q0.a.b(b1)) {
                break;
              }
              paramInt2++;
              q0.a.c(b1, arrayOfChar, paramInt1);
              paramInt1++;
            }
            j = paramInt2;
            paramInt2 = paramInt1;
            paramInt1 = j;
          }
          else if (q0.a.d(b1))
          {
            if (j < i)
            {
              paramInt1 += 2;
              q0.a.e(b1, p0.s(paramArrayOfByte, j), arrayOfChar, paramInt2);
              paramInt2++;
            }
            else
            {
              throw z.c();
            }
          }
          else
          {
            byte b2;
            if (q0.a.f(b1))
            {
              if (j < i - 1)
              {
                b2 = p0.s(paramArrayOfByte, j);
                j = paramInt1 + 3;
                q0.a.g(b1, b2, p0.s(paramArrayOfByte, paramInt1 + 2), arrayOfChar, paramInt2);
                paramInt2++;
                paramInt1 = j;
              }
              else
              {
                throw z.c();
              }
            }
            else if (j < i - 2)
            {
              byte b3 = p0.s(paramArrayOfByte, j);
              b2 = p0.s(paramArrayOfByte, paramInt1 + 2);
              j = paramInt1 + 4;
              q0.a.a(b1, b3, b2, p0.s(paramArrayOfByte, paramInt1 + 3), arrayOfChar, paramInt2);
              paramInt2 += 2;
              paramInt1 = j;
            }
            else
            {
              throw z.c();
            }
          }
        }
        return new String(arrayOfChar, 0, paramInt2);
      }
      throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
    }
    
    public int b(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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
          p0.H(paramArrayOfByte, l1, (byte)paramInt1);
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
            p0.H(paramArrayOfByte, l4, (byte)j);
            long l5 = l3;
            l1 = l4 + l3;
            l3 = l5;
          }
          else
          {
            if ((j < 2048) && (l4 <= l2 - 2L))
            {
              p0.H(paramArrayOfByte, l4, (byte)(j >>> 6 | 0x3C0));
              l1 = l4 + 2L;
              p0.H(paramArrayOfByte, l4 + l3, (byte)(j & 0x3F | 0x80));
            }
            for (;;)
            {
              l3 = 1L;
              break label474;
              if (((j >= 55296) && (57343 >= j)) || (l4 > l2 - 3L)) {
                break;
              }
              p0.H(paramArrayOfByte, l4, (byte)(j >>> 12 | 0x1E0));
              p0.H(paramArrayOfByte, l4 + 1L, (byte)(j >>> 6 & 0x3F | 0x80));
              l1 = l4 + 3L;
              p0.H(paramArrayOfByte, l4 + 2L, (byte)(j & 0x3F | 0x80));
            }
            if (l4 > l2 - 4L) {
              break label500;
            }
            paramInt2 = paramInt1 + 1;
            if (paramInt2 == i) {
              break label487;
            }
            char c = paramCharSequence.charAt(paramInt2);
            if (!Character.isSurrogatePair(j, c)) {
              break label484;
            }
            paramInt1 = Character.toCodePoint(j, c);
            l3 = 1L;
            p0.H(paramArrayOfByte, l4, (byte)(paramInt1 >>> 18 | 0xF0));
            p0.H(paramArrayOfByte, l4 + 1L, (byte)(paramInt1 >>> 12 & 0x3F | 0x80));
            p0.H(paramArrayOfByte, l4 + 2L, (byte)(paramInt1 >>> 6 & 0x3F | 0x80));
            l1 = l4 + 4L;
            p0.H(paramArrayOfByte, l4 + 3L, (byte)(paramInt1 & 0x3F | 0x80));
            paramInt1 = paramInt2;
          }
          label474:
          paramInt1++;
          l4 = l1;
          continue;
          label484:
          paramInt1 = paramInt2;
          label487:
          throw new q0.d(paramInt1 - 1, i);
          label500:
          if ((55296 <= j) && (j <= 57343))
          {
            paramInt2 = paramInt1 + 1;
            if ((paramInt2 == i) || (!Character.isSurrogatePair(j, paramCharSequence.charAt(paramInt2)))) {
              throw new q0.d(paramInt1, i);
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
    
    public int d(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
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
            if ((j >= -62) && (p0.s(paramArrayOfByte, l1) <= -65)) {
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
                paramInt1 = p0.s(paramArrayOfByte, l1);
                if (l3 >= l2) {
                  return q0.a(j, paramInt1);
                }
              }
              if ((paramInt1 <= -65) && ((j != -32) || (paramInt1 >= -96)) && ((j != -19) || (paramInt1 < -96)))
              {
                l1 = l3 + 1L;
                if (p0.s(paramArrayOfByte, l3) > -65) {}
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
                paramInt2 = p0.s(paramArrayOfByte, l1);
                if (l3 >= l2) {
                  return q0.a(j, paramInt2);
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
                paramInt3 = p0.s(paramArrayOfByte, l1);
                if (l3 >= l2) {
                  return q0.b(j, paramInt2, paramInt3);
                }
              }
              if ((paramInt2 > -65) || ((j << 28) + (paramInt2 + 112) >> 30 != 0) || (paramInt3 > -65)) {
                break;
              }
              l1 = l3 + 1L;
            } while (p0.s(paramArrayOfByte, l3) <= -65);
            return -1;
          }
        }
        label342:
        return f(paramArrayOfByte, l3, (int)(l2 - l3));
      }
      throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */