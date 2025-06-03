package com.google.ads.interactivemedia.v3.internal;

import a;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class tx
{
  public final Uri a;
  public final int b;
  public final byte[] c;
  public final Map<String, String> d;
  public final long e;
  public final long f;
  public final long g;
  private final String h;
  private final int i;
  
  public tx(Uri paramUri, int paramInt)
  {
    this(paramUri, 0L, -1L, null, 1);
  }
  
  private tx(Uri paramUri, int paramInt1, byte[] paramArrayOfByte, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt2)
  {
    this(paramUri, paramInt1, paramArrayOfByte, paramLong1, paramLong2, paramLong3, paramString, paramInt2, Collections.emptyMap());
  }
  
  private tx(Uri paramUri, int paramInt1, byte[] paramArrayOfByte, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt2, Map<String, String> paramMap)
  {
    boolean bool1 = true;
    if (paramLong1 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    rp.b(bool2);
    if (paramLong2 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    rp.b(bool2);
    boolean bool2 = bool1;
    if (paramLong3 <= 0L) {
      if (paramLong3 == -1L) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    rp.b(bool2);
    a = paramUri;
    b = paramInt1;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      paramArrayOfByte = null;
    }
    c = paramArrayOfByte;
    e = paramLong1;
    f = paramLong2;
    g = paramLong3;
    h = paramString;
    i = paramInt2;
    d = Collections.unmodifiableMap(new HashMap(paramMap));
  }
  
  private tx(Uri paramUri, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt)
  {
    this(paramUri, null, paramLong1, paramLong2, paramLong3, paramString, paramInt);
  }
  
  public tx(Uri paramUri, long paramLong1, long paramLong2, String paramString)
  {
    this(paramUri, paramLong1, paramLong1, paramLong2, paramString, 0);
  }
  
  public tx(Uri paramUri, long paramLong1, long paramLong2, String paramString, int paramInt)
  {
    this(paramUri, paramLong1, paramLong1, -1L, paramString, paramInt);
  }
  
  private tx(Uri paramUri, byte[] paramArrayOfByte, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt)
  {
    this(paramUri, 1, null, paramLong1, paramLong2, paramLong3, paramString, paramInt);
  }
  
  public static String b(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt == 3) {
          return "HEAD";
        }
        throw new AssertionError(paramInt);
      }
      return "POST";
    }
    return "GET";
  }
  
  public final tx a(long paramLong)
  {
    long l1 = g;
    long l2 = -1L;
    if (l1 != -1L) {
      l2 = l1 - paramLong;
    }
    if ((paramLong == 0L) && (l1 == l2)) {
      return this;
    }
    return new tx(a, b, c, e + paramLong, f + paramLong, l2, h, i, d);
  }
  
  public final boolean a(int paramInt)
  {
    return (i & paramInt) == paramInt;
  }
  
  public final String toString()
  {
    String str1 = b(b);
    Object localObject = String.valueOf(a);
    String str2 = Arrays.toString(c);
    long l1 = e;
    long l2 = f;
    long l3 = g;
    String str3 = h;
    int j = i;
    int k = a.b(str1, 94);
    localObject = a.q(a.b(str3, a.b(str2, ((String)localObject).length() + k)), "DataSpec[", str1, " ", (String)localObject);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(l1);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(l2);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(l3);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(str3);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(j);
    ((StringBuilder)localObject).append("]");
    return ((StringBuilder)localObject).toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.tx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */