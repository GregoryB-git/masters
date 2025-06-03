package okhttp3.internal;

import g;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import xc.h;
import xc.i;

public final class Util
{
  public static final byte[] a;
  public static final String[] b;
  public static final ResponseBody c;
  public static final i d;
  public static final i e;
  public static final i f;
  public static final i g;
  public static final i h;
  public static final Charset i;
  public static final Charset j;
  public static final Charset k;
  public static final Charset l;
  public static final Charset m;
  public static final TimeZone n;
  public static final Comparator<String> o;
  public static final Method p;
  public static final Pattern q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
  
  static
  {
    Object localObject1 = new byte[0];
    a = (byte[])localObject1;
    b = new String[0];
    c = ResponseBody.C((byte[])localObject1);
    Object localObject2 = null;
    RequestBody.c(null, (byte[])localObject1);
    d = i.g("efbbbf");
    e = i.g("feff");
    f = i.g("fffe");
    g = i.g("0000ffff");
    h = i.g("ffff0000");
    i = Charset.forName("UTF-8");
    Charset.forName("ISO-8859-1");
    j = Charset.forName("UTF-16BE");
    k = Charset.forName("UTF-16LE");
    l = Charset.forName("UTF-32BE");
    m = Charset.forName("UTF-32LE");
    n = TimeZone.getTimeZone("GMT");
    o = new Comparator()
    {
      public final int compare(Object paramAnonymousObject1, Object paramAnonymousObject2)
      {
        return ((String)paramAnonymousObject1).compareTo((String)paramAnonymousObject2);
      }
    };
    try
    {
      localObject1 = Throwable.class.getDeclaredMethod("addSuppressed", new Class[] { Throwable.class });
      localObject2 = localObject1;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    p = (Method)localObject2;
  }
  
  public static AssertionError a(String paramString, Exception paramException)
  {
    paramString = new AssertionError(paramString);
    try
    {
      paramString.initCause(paramException);
      return paramString;
    }
    catch (IllegalStateException paramException)
    {
      for (;;) {}
    }
  }
  
  public static Charset b(h paramh, Charset paramCharset)
  {
    i locali = d;
    if (paramh.K(locali))
    {
      paramh.skip(a.length);
      return i;
    }
    locali = e;
    if (paramh.K(locali))
    {
      paramh.skip(a.length);
      return j;
    }
    locali = f;
    if (paramh.K(locali))
    {
      paramh.skip(a.length);
      return k;
    }
    locali = g;
    if (paramh.K(locali))
    {
      paramh.skip(a.length);
      return l;
    }
    locali = h;
    if (paramh.K(locali))
    {
      paramh.skip(a.length);
      return m;
    }
    return paramCharset;
  }
  
  public static String c(String paramString)
  {
    boolean bool = paramString.contains(":");
    int i1 = 1;
    int i2 = -1;
    int i3 = 0;
    int i4;
    int i8;
    if (bool)
    {
      if ((paramString.startsWith("[")) && (paramString.endsWith("]"))) {
        localObject = h(1, paramString.length() - 1, paramString);
      } else {
        localObject = h(0, paramString.length(), paramString);
      }
      if (localObject == null) {
        return null;
      }
      Object localObject = ((InetAddress)localObject).getAddress();
      if (localObject.length == 16)
      {
        i4 = 0;
        i1 = i4;
        while (i4 < localObject.length)
        {
          for (int i5 = i4; (i5 < 16) && (localObject[i5] == 0) && (localObject[(i5 + 1)] == 0); i5 += 2) {}
          int i6 = i5 - i4;
          int i7 = i1;
          i8 = i2;
          if (i6 > i1)
          {
            i7 = i1;
            i8 = i2;
            if (i6 >= 4)
            {
              i7 = i6;
              i8 = i4;
            }
          }
          i4 = i5 + 2;
          i1 = i7;
          i2 = i8;
        }
        paramString = new xc.f();
        i4 = i3;
        while (i4 < localObject.length) {
          if (i4 == i2)
          {
            paramString.B0(58);
            i8 = i4 + i1;
            i4 = i8;
            if (i8 == 16)
            {
              paramString.B0(58);
              i4 = i8;
            }
          }
          else
          {
            if (i4 > 0) {
              paramString.B0(58);
            }
            paramString.C0((localObject[i4] & 0xFF) << 8 | localObject[(i4 + 1)] & 0xFF);
            i4 += 2;
          }
        }
        return paramString.k0();
      }
      throw new AssertionError(g.e("Invalid IPv6 address: '", paramString, "'"));
    }
    try
    {
      paramString = IDN.toASCII(paramString).toLowerCase(Locale.US);
      if (paramString.isEmpty()) {
        return null;
      }
      for (i4 = 0; i4 < paramString.length(); i4++)
      {
        i8 = paramString.charAt(i4);
        i2 = i1;
        if (i8 <= 31) {
          break label405;
        }
        if (i8 >= 127)
        {
          i2 = i1;
          break label405;
        }
        i2 = " #%/:?@[\\]".indexOf(i8);
        if (i2 != -1)
        {
          i2 = i1;
          break label405;
        }
      }
      i2 = 0;
      label405:
      if (i2 != 0) {
        return null;
      }
      return paramString;
    }
    catch (IllegalArgumentException paramString) {}
    return null;
  }
  
  public static int d(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool = paramLong < 0L;
    if (!bool)
    {
      if (paramTimeUnit != null)
      {
        paramLong = paramTimeUnit.toMillis(paramLong);
        if (paramLong <= 2147483647L)
        {
          if ((paramLong == 0L) && (bool)) {
            throw new IllegalArgumentException("timeout too small.");
          }
          return (int)paramLong;
        }
        throw new IllegalArgumentException("timeout too large.");
      }
      throw new NullPointerException("unit == null");
    }
    throw new IllegalArgumentException("timeout < 0");
  }
  
  public static void e(Closeable paramCloseable)
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
  
  public static void f(Socket paramSocket)
  {
    if (paramSocket != null) {}
    try
    {
      try
      {
        paramSocket.close();
      }
      catch (RuntimeException paramSocket)
      {
        if ("bio == null".equals(paramSocket.getMessage())) {
          return;
        }
        throw paramSocket;
      }
      catch (AssertionError paramSocket)
      {
        if (!q(paramSocket)) {
          throw paramSocket;
        }
      }
      return;
    }
    catch (Exception paramSocket)
    {
      for (;;) {}
    }
  }
  
  public static int g(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9')) {
      return paramChar - '0';
    }
    char c1 = 'a';
    if ((paramChar >= 'a') && (paramChar <= 'f')) {}
    do
    {
      return paramChar - c1 + 10;
      c1 = 'A';
    } while ((paramChar >= 'A') && (paramChar <= 'F'));
    return -1;
  }
  
  public static InetAddress h(int paramInt1, int paramInt2, String paramString)
  {
    byte[] arrayOfByte = new byte[16];
    int i1 = paramInt1;
    int i2 = -1;
    int i3 = i2;
    paramInt1 = 0;
    while (i1 < paramInt2)
    {
      if (paramInt1 == 16) {
        return null;
      }
      int i4 = i1 + 2;
      int i5;
      if ((i4 <= paramInt2) && (paramString.regionMatches(i1, "::", 0, 2)))
      {
        if (i2 != -1) {
          return null;
        }
        paramInt1 += 2;
        if (i4 == paramInt2)
        {
          paramInt2 = 16;
          i2 = paramInt1;
          break label468;
        }
        i2 = paramInt1;
        i3 = i4;
        i1 = paramInt1;
      }
      else
      {
        i4 = i1;
        if (paramInt1 != 0) {
          if (paramString.regionMatches(i1, ":", 0, 1))
          {
            i4 = i1 + 1;
          }
          else
          {
            if (paramString.regionMatches(i1, ".", 0, 1))
            {
              i5 = paramInt1 - 2;
              i4 = i5;
              i1 = i3;
              while (i1 < paramInt2)
              {
                if (i4 == 16) {}
                do
                {
                  paramInt2 = 0;
                  break label326;
                  i3 = i1;
                  if (i4 == i5) {
                    break;
                  }
                } while (paramString.charAt(i1) != '.');
                i3 = i1 + 1;
                i6 = 0;
                for (i1 = i3; i1 < paramInt2; i1++)
                {
                  int i7 = paramString.charAt(i1);
                  if ((i7 < 48) || (i7 > 57)) {
                    break;
                  }
                  if ((i6 == 0) && (i3 != i1)) {
                    break label319;
                  }
                  i6 = i6 * 10 + i7 - 48;
                  if (i6 > 255) {
                    break label319;
                  }
                }
                if (i1 - i3 == 0) {
                  break label319;
                }
                arrayOfByte[i4] = ((byte)(byte)i6);
                i4++;
              }
              if (i4 != i5 + 4) {
                label319:
                paramInt2 = 0;
              } else {
                paramInt2 = 1;
              }
              label326:
              if (paramInt2 == 0) {
                return null;
              }
              paramInt1 += 2;
              paramInt2 = 16;
              break label468;
            }
            return null;
          }
        }
        i3 = i4;
        i1 = paramInt1;
      }
      paramInt1 = i3;
      i4 = 0;
      while (paramInt1 < paramInt2)
      {
        i6 = g(paramString.charAt(paramInt1));
        if (i6 == -1) {
          break;
        }
        i4 = (i4 << 4) + i6;
        paramInt1++;
      }
      int i6 = paramInt1 - i3;
      if ((i6 != 0) && (i6 <= 4))
      {
        i5 = i1 + 1;
        arrayOfByte[i1] = ((byte)(byte)(i4 >>> 8 & 0xFF));
        i6 = i5 + 1;
        arrayOfByte[i5] = ((byte)(byte)(i4 & 0xFF));
        i1 = paramInt1;
        paramInt1 = i6;
      }
      else
      {
        return null;
      }
    }
    paramInt2 = 16;
    label468:
    if (paramInt1 != paramInt2)
    {
      if (i2 == -1) {
        return null;
      }
      paramInt2 = paramInt1 - i2;
      System.arraycopy(arrayOfByte, i2, arrayOfByte, 16 - paramInt2, paramInt2);
      Arrays.fill(arrayOfByte, i2, 16 - paramInt1 + i2, (byte)0);
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
  
  public static int i(String paramString, int paramInt1, int paramInt2, char paramChar)
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
  
  public static int j(String paramString1, int paramInt1, int paramInt2, String paramString2)
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
  
  public static boolean k(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if ((paramObject1 != paramObject2) && ((paramObject1 == null) || (!paramObject1.equals(paramObject2)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static String l(String paramString, Object... paramVarArgs)
  {
    return String.format(Locale.US, paramString, paramVarArgs);
  }
  
  public static String m(HttpUrl paramHttpUrl, boolean paramBoolean)
  {
    Object localObject1;
    if (d.contains(":")) {
      localObject1 = g.f(f.l("["), d, "]");
    } else {
      localObject1 = d;
    }
    Object localObject2;
    if (!paramBoolean)
    {
      localObject2 = localObject1;
      if (e == HttpUrl.c(a)) {}
    }
    else
    {
      localObject1 = g.g((String)localObject1, ":");
      ((StringBuilder)localObject1).append(e);
      localObject2 = ((StringBuilder)localObject1).toString();
    }
    return (String)localObject2;
  }
  
  public static <T> List<T> n(List<T> paramList)
  {
    return Collections.unmodifiableList(new ArrayList(paramList));
  }
  
  public static <T> List<T> o(T... paramVarArgs)
  {
    return Collections.unmodifiableList(Arrays.asList((Object[])paramVarArgs.clone()));
  }
  
  public static String[] p(Comparator<? super String> paramComparator, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = paramArrayOfString1.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      String str = paramArrayOfString1[i2];
      int i3 = paramArrayOfString2.length;
      for (int i4 = 0; i4 < i3; i4++) {
        if (paramComparator.compare(str, paramArrayOfString2[i4]) == 0)
        {
          localArrayList.add(str);
          break;
        }
      }
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }
  
  public static boolean q(AssertionError paramAssertionError)
  {
    boolean bool;
    if ((paramAssertionError.getCause() != null) && (paramAssertionError.getMessage() != null) && (paramAssertionError.getMessage().contains("getsockname failed"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean r(Comparator<String> paramComparator, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    if ((paramArrayOfString1 != null) && (paramArrayOfString2 != null) && (paramArrayOfString1.length != 0) && (paramArrayOfString2.length != 0))
    {
      int i1 = paramArrayOfString1.length;
      for (int i2 = 0; i2 < i1; i2++)
      {
        String str = paramArrayOfString1[i2];
        int i3 = paramArrayOfString2.length;
        for (int i4 = 0; i4 < i3; i4++) {
          if (paramComparator.compare(str, paramArrayOfString2[i4]) == 0) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  /* Error */
  public static boolean s(xc.y paramy, int paramInt, TimeUnit paramTimeUnit)
  {
    // Byte code:
    //   0: invokestatic 439	java/lang/System:nanoTime	()J
    //   3: lstore_3
    //   4: aload_0
    //   5: invokeinterface 444 1 0
    //   10: invokevirtual 448	xc/z:e	()Z
    //   13: ifeq +19 -> 32
    //   16: aload_0
    //   17: invokeinterface 444 1 0
    //   22: invokevirtual 450	xc/z:c	()J
    //   25: lload_3
    //   26: lsub
    //   27: lstore 5
    //   29: goto +8 -> 37
    //   32: ldc2_w 451
    //   35: lstore 5
    //   37: aload_0
    //   38: invokeinterface 444 1 0
    //   43: lload 5
    //   45: aload_2
    //   46: iload_1
    //   47: i2l
    //   48: invokevirtual 455	java/util/concurrent/TimeUnit:toNanos	(J)J
    //   51: invokestatic 461	java/lang/Math:min	(JJ)J
    //   54: lload_3
    //   55: ladd
    //   56: invokevirtual 464	xc/z:d	(J)Lxc/z;
    //   59: pop
    //   60: new 209	xc/f
    //   63: astore_2
    //   64: aload_2
    //   65: invokespecial 210	xc/f:<init>	()V
    //   68: aload_0
    //   69: aload_2
    //   70: ldc2_w 465
    //   73: invokeinterface 470 4 0
    //   78: ldc2_w 471
    //   81: lcmp
    //   82: ifeq +10 -> 92
    //   85: aload_2
    //   86: invokevirtual 474	xc/f:f	()V
    //   89: goto -21 -> 68
    //   92: aload_0
    //   93: invokeinterface 444 1 0
    //   98: astore_0
    //   99: lload 5
    //   101: ldc2_w 451
    //   104: lcmp
    //   105: ifne +11 -> 116
    //   108: aload_0
    //   109: invokevirtual 476	xc/z:a	()Lxc/z;
    //   112: pop
    //   113: goto +12 -> 125
    //   116: aload_0
    //   117: lload_3
    //   118: lload 5
    //   120: ladd
    //   121: invokevirtual 464	xc/z:d	(J)Lxc/z;
    //   124: pop
    //   125: iconst_1
    //   126: ireturn
    //   127: astore_2
    //   128: aload_0
    //   129: invokeinterface 444 1 0
    //   134: astore_0
    //   135: lload 5
    //   137: ldc2_w 451
    //   140: lcmp
    //   141: ifne +11 -> 152
    //   144: aload_0
    //   145: invokevirtual 476	xc/z:a	()Lxc/z;
    //   148: pop
    //   149: goto +12 -> 161
    //   152: aload_0
    //   153: lload_3
    //   154: lload 5
    //   156: ladd
    //   157: invokevirtual 464	xc/z:d	(J)Lxc/z;
    //   160: pop
    //   161: aload_2
    //   162: athrow
    //   163: astore_2
    //   164: aload_0
    //   165: invokeinterface 444 1 0
    //   170: astore_0
    //   171: lload 5
    //   173: ldc2_w 451
    //   176: lcmp
    //   177: ifne +11 -> 188
    //   180: aload_0
    //   181: invokevirtual 476	xc/z:a	()Lxc/z;
    //   184: pop
    //   185: goto +12 -> 197
    //   188: aload_0
    //   189: lload_3
    //   190: lload 5
    //   192: ladd
    //   193: invokevirtual 464	xc/z:d	(J)Lxc/z;
    //   196: pop
    //   197: iconst_0
    //   198: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	199	0	paramy	xc.y
    //   0	199	1	paramInt	int
    //   0	199	2	paramTimeUnit	TimeUnit
    //   3	187	3	l1	long
    //   27	164	5	l2	long
    // Exception table:
    //   from	to	target	type
    //   60	68	127	finally
    //   68	89	127	finally
    //   60	68	163	java/io/InterruptedIOException
    //   68	89	163	java/io/InterruptedIOException
  }
  
  public static int t(int paramInt1, int paramInt2, String paramString)
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
  
  public static int u(int paramInt1, int paramInt2, String paramString)
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
  
  public static ThreadFactory v(String paramString, final boolean paramBoolean)
  {
    new ThreadFactory()
    {
      public final Thread newThread(Runnable paramAnonymousRunnable)
      {
        paramAnonymousRunnable = new Thread(paramAnonymousRunnable, Util.this);
        paramAnonymousRunnable.setDaemon(paramBoolean);
        return paramAnonymousRunnable;
      }
    };
  }
  
  public static Headers w(ArrayList paramArrayList)
  {
    Headers.Builder localBuilder = new Headers.Builder();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      Header localHeader = (Header)paramArrayList.next();
      Internal.a.b(localBuilder, a.t(), b.t());
    }
    return new Headers(localBuilder);
  }
  
  public static String x(int paramInt1, int paramInt2, String paramString)
  {
    paramInt1 = t(paramInt1, paramInt2, paramString);
    return paramString.substring(paramInt1, u(paramInt1, paramInt2, paramString));
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.Util
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */