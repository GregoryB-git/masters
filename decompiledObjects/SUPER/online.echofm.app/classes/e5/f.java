package e5;

import V4.h;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public abstract class f
{
  public static final byte[] a;
  public static final byte[] b;
  public static final byte[] c;
  public static final byte[] d;
  public static final Charset e;
  
  static
  {
    int i = 0;
    a = new byte[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0 };
    b = new byte[] { 59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0 };
    byte[] arrayOfByte = new byte[''];
    c = arrayOfByte;
    d = new byte[''];
    e = StandardCharsets.ISO_8859_1;
    Arrays.fill(arrayOfByte, (byte)-1);
    for (int j = 0;; j++)
    {
      arrayOfByte = a;
      if (j >= arrayOfByte.length) {
        break;
      }
      int k = arrayOfByte[j];
      if (k > 0) {
        c[k] = ((byte)(byte)j);
      }
    }
    Arrays.fill(d, (byte)-1);
    for (j = i;; j++)
    {
      arrayOfByte = b;
      if (j >= arrayOfByte.length) {
        break;
      }
      i = arrayOfByte[j];
      if (i > 0) {
        d[i] = ((byte)(byte)j);
      }
    }
  }
  
  public static int a(String paramString, int paramInt, Charset paramCharset)
  {
    paramCharset = paramCharset.newEncoder();
    int i = paramString.length();
    int j = paramInt;
    while (j < i)
    {
      char c1 = paramString.charAt(j);
      int k = 0;
      for (char c2 = c1;; c2 = c1)
      {
        c1 = k;
        if (k >= 13) {
          break;
        }
        c1 = k;
        if (!k(c2)) {
          break;
        }
        k++;
        int m = j + k;
        c1 = k;
        if (m >= i) {
          break;
        }
        c1 = paramString.charAt(m);
      }
      if (c1 >= '\r') {
        return j - paramInt;
      }
      c2 = paramString.charAt(j);
      if (paramCharset.canEncode(c2))
      {
        j++;
      }
      else
      {
        paramString = new StringBuilder("Non-encodable character detected: ");
        paramString.append(c2);
        paramString.append(" (Unicode: ");
        paramString.append(c2);
        paramString.append(')');
        throw new h(paramString.toString());
      }
    }
    return j - paramInt;
  }
  
  public static int b(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length();
    int j = 0;
    int k = 0;
    if (paramInt < i)
    {
      int m = paramInt;
      paramInt = k;
      for (;;)
      {
        char c1 = paramCharSequence.charAt(m);
        do
        {
          j = paramInt;
          if (!k(c1)) {
            break;
          }
          j = paramInt;
          if (m >= i) {
            break;
          }
          k = paramInt + 1;
          j = m + 1;
          paramInt = k;
          m = j;
        } while (j >= i);
        paramInt = k;
        m = j;
      }
    }
    return j;
  }
  
  public static int c(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length();
    int j = paramInt;
    int k;
    for (;;)
    {
      k = j;
      if (j >= i) {
        break;
      }
      int m = paramCharSequence.charAt(j);
      k = 0;
      int n = m;
      m = j;
      while ((k < 13) && (k(n)) && (m < i))
      {
        j = k + 1;
        int i2 = m + 1;
        m = i2;
        k = j;
        if (i2 < i)
        {
          k = paramCharSequence.charAt(i2);
          m = i2;
          int i1 = k;
          k = j;
        }
      }
      if (k >= 13) {
        return m - paramInt - k;
      }
      j = m;
      if (k <= 0)
      {
        k = m;
        if (!n(paramCharSequence.charAt(m))) {
          break;
        }
        j = m + 1;
      }
    }
    return k - paramInt;
  }
  
  public static void d(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, StringBuilder paramStringBuilder)
  {
    int i;
    if ((paramInt2 == 1) && (paramInt3 == 0))
    {
      paramInt3 = 913;
      i = paramInt3;
    }
    for (;;)
    {
      paramStringBuilder.append(i);
      break;
      int j;
      if (paramInt2 % 6 == 0)
      {
        paramInt3 = 924;
        j = paramInt3;
      }
      else
      {
        paramInt3 = 901;
        j = paramInt3;
      }
    }
    if (paramInt2 >= 6)
    {
      char[] arrayOfChar = new char[5];
      for (paramInt3 = paramInt1;; paramInt3 += 6)
      {
        k = paramInt3;
        if (paramInt1 + paramInt2 - paramInt3 < 6) {
          break;
        }
        int m = 0;
        long l1 = 0L;
        int n;
        long l2;
        for (k = 0;; k++)
        {
          n = m;
          l2 = l1;
          if (k >= 6) {
            break;
          }
          l1 = (l1 << 8) + (paramArrayOfByte[(paramInt3 + k)] & 0xFF);
        }
        while (n < 5)
        {
          arrayOfChar[n] = ((char)(char)(int)(l2 % 900L));
          l2 /= 900L;
          n++;
        }
        for (k = 4; k >= 0; k--) {
          paramStringBuilder.append(arrayOfChar[k]);
        }
      }
    }
    for (int k = paramInt1; k < paramInt1 + paramInt2; k++) {
      paramStringBuilder.append((char)(paramArrayOfByte[k] & 0xFF));
    }
  }
  
  public static String e(String paramString, c paramc, Charset paramCharset)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    Charset localCharset;
    if (paramCharset == null)
    {
      localCharset = e;
    }
    else
    {
      localCharset = paramCharset;
      if (!e.equals(paramCharset))
      {
        Y4.c localc = Y4.c.c(paramCharset.name());
        localCharset = paramCharset;
        if (localc != null)
        {
          h(localc.e(), localStringBuilder);
          localCharset = paramCharset;
        }
      }
    }
    int i = paramString.length();
    int j = a.a[paramc.ordinal()];
    if (j != 1)
    {
      if (j != 2)
      {
        if (j != 3)
        {
          int k = 0;
          j = k;
          int m = j;
          while (k < i)
          {
            int n = b(paramString, k);
            if (n >= 13)
            {
              localStringBuilder.append('Ά');
              f(paramString, k, n, localStringBuilder);
              k += n;
              j = 0;
              m = 2;
            }
            else
            {
              int i1 = c(paramString, k);
              if ((i1 < 5) && (n != i))
              {
                i1 = a(paramString, k, localCharset);
                n = i1;
                if (i1 == 0) {
                  n = 1;
                }
                n += k;
                paramc = paramString.substring(k, n).getBytes(localCharset);
                if ((paramc.length == 1) && (m == 0))
                {
                  d(paramc, 0, 1, 0, localStringBuilder);
                }
                else
                {
                  d(paramc, 0, paramc.length, m, localStringBuilder);
                  m = 1;
                  j = 0;
                }
                k = n;
              }
              else
              {
                n = m;
                if (m != 0)
                {
                  localStringBuilder.append('΄');
                  j = 0;
                  n = j;
                }
                j = g(paramString, k, i1, localStringBuilder, j);
                k += i1;
                m = n;
              }
            }
          }
        }
        localStringBuilder.append('Ά');
        f(paramString, 0, i, localStringBuilder);
      }
      else
      {
        paramString = paramString.getBytes(localCharset);
        d(paramString, 0, paramString.length, 1, localStringBuilder);
      }
    }
    else {
      g(paramString, 0, i, localStringBuilder, 0);
    }
    return localStringBuilder.toString();
  }
  
  public static void f(String paramString, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramInt2 / 3 + 1);
    BigInteger localBigInteger1 = BigInteger.valueOf(900L);
    BigInteger localBigInteger2 = BigInteger.valueOf(0L);
    int i = 0;
    while (i < paramInt2)
    {
      localStringBuilder.setLength(0);
      int j = Math.min(44, paramInt2 - i);
      Object localObject = new StringBuilder("1");
      int k = paramInt1 + i;
      ((StringBuilder)localObject).append(paramString.substring(k, k + j));
      localObject = new BigInteger(((StringBuilder)localObject).toString());
      BigInteger localBigInteger3;
      do
      {
        localStringBuilder.append((char)((BigInteger)localObject).mod(localBigInteger1).intValue());
        localBigInteger3 = ((BigInteger)localObject).divide(localBigInteger1);
        localObject = localBigInteger3;
      } while (!localBigInteger3.equals(localBigInteger2));
      for (k = localStringBuilder.length() - 1; k >= 0; k--) {
        paramStringBuilder.append(localStringBuilder.charAt(k));
      }
      i += j;
    }
  }
  
  public static int g(CharSequence paramCharSequence, int paramInt1, int paramInt2, StringBuilder paramStringBuilder, int paramInt3)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramInt2);
    int i = 0;
    int j = 0;
    label65:
    label137:
    label145:
    label230:
    label276:
    label286:
    label386:
    do
    {
      k = paramInt1 + j;
      char c1 = paramCharSequence.charAt(k);
      if (paramInt3 != 0) {
        if (paramInt3 != 1) {
          if (paramInt3 != 2) {
            if (m(c1)) {
              k = d[c1];
            }
          }
        }
      }
      for (;;)
      {
        k = (char)k;
        int m = k;
        localStringBuilder.append(m);
        break label386;
        localStringBuilder.append('\035');
        for (;;)
        {
          paramInt3 = 0;
          break;
          if (l(m))
          {
            k = c[m];
            break label65;
          }
          if (!j(m)) {
            break label137;
          }
          localStringBuilder.append('\034');
        }
        if (i(m))
        {
          localStringBuilder.append('\033');
          paramInt3 = 1;
          break;
        }
        k++;
        if ((k < paramInt2) && (m(paramCharSequence.charAt(k))))
        {
          localStringBuilder.append('\031');
          paramInt3 = 3;
          break;
        }
        localStringBuilder.append('\035');
        k = d[m];
        continue;
        if (i(m)) {
          if (m == 32)
          {
            localStringBuilder.append('\032');
            break label386;
          }
        }
        int n;
        for (k = m - 97;; k = n - 65)
        {
          k = (char)k;
          n = k;
          break;
          if (!j(n)) {
            break label286;
          }
          localStringBuilder.append('\033');
        }
        if (l(n)) {}
        do
        {
          localStringBuilder.append('\034');
          paramInt3 = 2;
          break;
          localStringBuilder.append('\035');
          k = d[n];
          break label65;
          if (j(n))
          {
            if (n != 32) {
              break label276;
            }
            break label230;
          }
          if (i(n)) {
            break label145;
          }
        } while (l(n));
        localStringBuilder.append('\035');
        k = d[n];
      }
      k = j + 1;
      j = k;
    } while (k < paramInt2);
    int k = localStringBuilder.length();
    paramInt2 = 0;
    for (paramInt1 = i; paramInt1 < k; paramInt1++) {
      if (paramInt1 % 2 != 0)
      {
        int i1 = (char)(paramInt2 * 30 + localStringBuilder.charAt(paramInt1));
        paramStringBuilder.append(i1);
        paramInt2 = i1;
      }
      else
      {
        paramInt2 = localStringBuilder.charAt(paramInt1);
      }
    }
    if (k % 2 != 0) {
      paramStringBuilder.append((char)(paramInt2 * 30 + 29));
    }
    return paramInt3;
  }
  
  public static void h(int paramInt, StringBuilder paramStringBuilder)
  {
    if ((paramInt >= 0) && (paramInt < 900))
    {
      paramStringBuilder.append('Ο');
      paramInt = (char)paramInt;
    }
    int j;
    for (int i = paramInt;; j = paramInt)
    {
      paramStringBuilder.append(i);
      return;
      if (paramInt < 810900)
      {
        paramStringBuilder.append('Ξ');
        paramStringBuilder.append((char)(paramInt / 900 - 1));
        paramInt %= 900;
        break;
      }
      if (paramInt >= 811800) {
        break label92;
      }
      paramStringBuilder.append('Ν');
      paramInt = (char)(810900 - paramInt);
    }
    label92:
    throw new h("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(paramInt)));
  }
  
  public static boolean i(char paramChar)
  {
    return (paramChar == ' ') || ((paramChar >= 'a') && (paramChar <= 'z'));
  }
  
  public static boolean j(char paramChar)
  {
    return (paramChar == ' ') || ((paramChar >= 'A') && (paramChar <= 'Z'));
  }
  
  public static boolean k(char paramChar)
  {
    return (paramChar >= '0') && (paramChar <= '9');
  }
  
  public static boolean l(char paramChar)
  {
    return c[paramChar] != -1;
  }
  
  public static boolean m(char paramChar)
  {
    return d[paramChar] != -1;
  }
  
  public static boolean n(char paramChar)
  {
    return (paramChar == '\t') || (paramChar == '\n') || (paramChar == '\r') || ((paramChar >= ' ') && (paramChar <= '~'));
  }
}

/* Location:
 * Qualified Name:     e5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */