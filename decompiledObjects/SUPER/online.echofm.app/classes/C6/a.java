package C6;

import B6.f;
import B6.h;
import D6.c;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public abstract class a
{
  public static final byte[] a;
  public static final String[] b;
  public static final h c;
  public static final f d;
  public static final c e;
  public static final c f;
  public static final c g;
  public static final c h;
  public static final c i;
  public static final Charset j;
  public static final Charset k;
  public static final Charset l;
  public static final Charset m;
  public static final Charset n;
  public static final Charset o;
  public static final TimeZone p;
  public static final Comparator q;
  public static final Method r;
  public static final Pattern s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
  
  static
  {
    Object localObject1 = new byte[0];
    a = (byte[])localObject1;
    b = new String[0];
    Object localObject2 = null;
    c = h.b(null, (byte[])localObject1);
    d = f.a(null, (byte[])localObject1);
    e = c.h("efbbbf");
    f = c.h("feff");
    g = c.h("fffe");
    h = c.h("0000ffff");
    i = c.h("ffff0000");
    j = Charset.forName("UTF-8");
    k = Charset.forName("ISO-8859-1");
    l = Charset.forName("UTF-16BE");
    m = Charset.forName("UTF-16LE");
    n = Charset.forName("UTF-32BE");
    o = Charset.forName("UTF-32LE");
    p = TimeZone.getTimeZone("GMT");
    q = new a();
    try
    {
      localObject1 = Throwable.class.getDeclaredMethod("addSuppressed", new Class[] { Throwable.class });
      localObject2 = localObject1;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    r = (Method)localObject2;
  }
  
  public static String a(String paramString)
  {
    if (paramString.contains(":"))
    {
      if ((paramString.startsWith("[")) && (paramString.endsWith("]"))) {
        localObject = g(paramString, 1, paramString.length() - 1);
      } else {
        localObject = g(paramString, 0, paramString.length());
      }
      if (localObject == null) {
        return null;
      }
      Object localObject = ((InetAddress)localObject).getAddress();
      if (localObject.length == 16) {
        return j((byte[])localObject);
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Invalid IPv6 address: '");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("'");
      throw new AssertionError(((StringBuilder)localObject).toString());
    }
    try
    {
      paramString = IDN.toASCII(paramString).toLowerCase(Locale.US);
      if (paramString.isEmpty()) {
        return null;
      }
      boolean bool = d(paramString);
      if (bool) {
        return null;
      }
      return paramString;
    }
    catch (IllegalArgumentException paramString) {}
    return null;
  }
  
  public static void b(long paramLong1, long paramLong2, long paramLong3)
  {
    if (((paramLong2 | paramLong3) >= 0L) && (paramLong2 <= paramLong1) && (paramLong1 - paramLong2 >= paramLong3)) {
      return;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public static void c(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      try
      {
        paramCloseable.close();
      }
      catch (RuntimeException paramCloseable)
      {
        throw paramCloseable;
      }
      return;
    }
    catch (Exception paramCloseable)
    {
      for (;;) {}
    }
  }
  
  public static boolean d(String paramString)
  {
    int i1 = 0;
    while (i1 < paramString.length())
    {
      int i2 = paramString.charAt(i1);
      if ((i2 > 31) && (i2 < 127))
      {
        if (" #%/:?@[\\]".indexOf(i2) != -1) {
          return true;
        }
        i1++;
      }
      else
      {
        return true;
      }
    }
    return false;
  }
  
  public static int e(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9')) {
      return paramChar - '0';
    }
    if ((paramChar >= 'a') && (paramChar <= 'f')) {
      return paramChar - 'W';
    }
    if ((paramChar >= 'A') && (paramChar <= 'F')) {
      return paramChar - '7';
    }
    return -1;
  }
  
  public static boolean f(String paramString, int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3)
  {
    int i1 = paramInt3;
    int i2 = paramInt1;
    while (i2 < paramInt2)
    {
      if (i1 == paramArrayOfByte.length) {
        return false;
      }
      paramInt1 = i2;
      if (i1 != paramInt3)
      {
        if (paramString.charAt(i2) != '.') {
          return false;
        }
        paramInt1 = i2 + 1;
      }
      i2 = paramInt1;
      int i3 = 0;
      while (i2 < paramInt2)
      {
        int i4 = paramString.charAt(i2);
        if ((i4 < 48) || (i4 > 57)) {
          break;
        }
        if ((i3 == 0) && (paramInt1 != i2)) {
          return false;
        }
        i3 = i3 * 10 + i4 - 48;
        if (i3 > 255) {
          return false;
        }
        i2++;
      }
      if (i2 - paramInt1 == 0) {
        return false;
      }
      paramArrayOfByte[i1] = ((byte)(byte)i3);
      i1++;
    }
    return i1 == paramInt3 + 4;
  }
  
  public static InetAddress g(String paramString, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[16];
    int i1 = 0;
    int i2 = -1;
    int i3 = i2;
    int i4;
    int i5;
    for (;;)
    {
      i4 = i1;
      i5 = i2;
      if (paramInt1 >= paramInt2) {
        break label300;
      }
      if (i1 == 16) {
        return null;
      }
      i5 = paramInt1 + 2;
      if ((i5 <= paramInt2) && (paramString.regionMatches(paramInt1, "::", 0, 2)))
      {
        if (i2 != -1) {
          return null;
        }
        i4 = i1 + 2;
        paramInt1 = i4;
        if (i5 == paramInt2)
        {
          i5 = paramInt1;
          break label300;
        }
        i3 = i5;
        i1 = i4;
        i2 = paramInt1;
        paramInt1 = i3;
      }
      else
      {
        i4 = paramInt1;
        if (i1 != 0)
        {
          if (paramString.regionMatches(paramInt1, ":", 0, 1)) {
            i4 = paramInt1 + 1;
          }
        }
        else
        {
          paramInt1 = i4;
          break label183;
        }
        if (paramString.regionMatches(paramInt1, ".", 0, 1))
        {
          if (!f(paramString, i3, paramInt2, arrayOfByte, i1 - 2)) {
            return null;
          }
          i4 = i1 + 2;
          i5 = i2;
          break label300;
        }
        return null;
      }
      label183:
      i3 = 0;
      for (i4 = paramInt1; i4 < paramInt2; i4++)
      {
        i5 = e(paramString.charAt(i4));
        if (i5 == -1) {
          break;
        }
        i3 = (i3 << 4) + i5;
      }
      i5 = i4 - paramInt1;
      if ((i5 == 0) || (i5 > 4)) {
        break;
      }
      arrayOfByte[i1] = ((byte)(byte)(i3 >>> 8 & 0xFF));
      i5 = i1 + 2;
      arrayOfByte[(i1 + 1)] = ((byte)(byte)(i3 & 0xFF));
      i1 = i5;
      i3 = paramInt1;
      paramInt1 = i4;
    }
    return null;
    label300:
    if (i4 != 16)
    {
      if (i5 == -1) {
        return null;
      }
      paramInt1 = i4 - i5;
      System.arraycopy(arrayOfByte, i5, arrayOfByte, 16 - paramInt1, paramInt1);
      Arrays.fill(arrayOfByte, i5, 16 - i4 + i5, (byte)0);
    }
    try
    {
      paramString = InetAddress.getByAddress(arrayOfByte);
      return paramString;
    }
    catch (UnknownHostException paramString)
    {
      throw new AssertionError();
    }
  }
  
  public static int h(String paramString, int paramInt1, int paramInt2, char paramChar)
  {
    while (paramInt1 < paramInt2)
    {
      if (paramString.charAt(paramInt1) == paramChar) {
        return paramInt1;
      }
      paramInt1++;
    }
    return paramInt2;
  }
  
  public static int i(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    while (paramInt1 < paramInt2)
    {
      if (paramString2.indexOf(paramString1.charAt(paramInt1)) != -1) {
        return paramInt1;
      }
      paramInt1++;
    }
    return paramInt2;
  }
  
  public static String j(byte[] paramArrayOfByte)
  {
    int i1 = -1;
    int i2 = 0;
    int i3 = 0;
    int i5;
    int i8;
    for (int i4 = i3; i3 < paramArrayOfByte.length; i4 = i8)
    {
      for (i5 = i3; (i5 < 16) && (paramArrayOfByte[i5] == 0) && (paramArrayOfByte[(i5 + 1)] == 0); i5 += 2) {}
      int i6 = i5 - i3;
      int i7 = i1;
      i8 = i4;
      if (i6 > i4)
      {
        i7 = i1;
        i8 = i4;
        if (i6 >= 4)
        {
          i8 = i6;
          i7 = i3;
        }
      }
      i3 = i5 + 2;
      i1 = i7;
    }
    D6.a locala = new D6.a();
    i3 = i2;
    while (i3 < paramArrayOfByte.length) {
      if (i3 == i1)
      {
        locala.D(58);
        i5 = i3 + i4;
        i3 = i5;
        if (i5 == 16)
        {
          locala.D(58);
          i3 = i5;
        }
      }
      else
      {
        if (i3 > 0) {
          locala.D(58);
        }
        locala.E((paramArrayOfByte[i3] & 0xFF) << 8 | paramArrayOfByte[(i3 + 1)] & 0xFF);
        i3 += 2;
      }
    }
    return locala.u();
  }
  
  public static int k(String paramString, int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2)
    {
      int i1 = paramString.charAt(paramInt1);
      if ((i1 != 9) && (i1 != 10) && (i1 != 12) && (i1 != 13) && (i1 != 32)) {
        return paramInt1;
      }
      paramInt1++;
    }
    return paramInt2;
  }
  
  public static int l(String paramString, int paramInt1, int paramInt2)
  {
    
    while (paramInt2 >= paramInt1)
    {
      int i1 = paramString.charAt(paramInt2);
      if ((i1 != 9) && (i1 != 10) && (i1 != 12) && (i1 != 13) && (i1 != 32)) {
        return paramInt2 + 1;
      }
      paramInt2--;
    }
    return paramInt1;
  }
  
  public class a
    implements Comparator
  {
    public int a(String paramString1, String paramString2)
    {
      return paramString1.compareTo(paramString2);
    }
  }
}

/* Location:
 * Qualified Name:     C6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */