package t5;

import a0.j;
import android.net.Uri;
import f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v3.h0;
import x6.b;

public final class n
{
  public final Uri a;
  public final long b;
  public final int c;
  public final byte[] d;
  public final Map<String, String> e;
  public final long f;
  public final long g;
  public final String h;
  public final int i;
  public final Object j;
  
  static
  {
    h0.a("goog.exo.datasource");
  }
  
  public n(Uri paramUri, long paramLong1, int paramInt1, byte[] paramArrayOfByte, Map<String, String> paramMap, long paramLong2, long paramLong3, String paramString, int paramInt2, Object paramObject)
  {
    boolean bool1 = true;
    if (paramLong1 + paramLong2 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.q(bool2);
    if (paramLong2 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.q(bool2);
    boolean bool2 = bool1;
    if (paramLong3 <= 0L) {
      if (paramLong3 == -1L) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    b.q(bool2);
    a = paramUri;
    b = paramLong1;
    c = paramInt1;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      paramArrayOfByte = null;
    }
    d = paramArrayOfByte;
    e = Collections.unmodifiableMap(new HashMap(paramMap));
    f = paramLong2;
    g = paramLong3;
    h = paramString;
    i = paramInt2;
    j = paramObject;
  }
  
  public n(Uri paramUri, long paramLong1, long paramLong2)
  {
    this(paramUri, 0L, 1, null, Collections.emptyMap(), paramLong1, paramLong2, null, 0, null);
  }
  
  public final n a(long paramLong)
  {
    long l1 = g;
    long l2 = -1L;
    if (l1 != -1L) {
      l2 = l1 - paramLong;
    }
    return b(paramLong, l2);
  }
  
  public final n b(long paramLong1, long paramLong2)
  {
    if ((paramLong1 == 0L) && (g == paramLong2)) {
      return this;
    }
    return new n(a, b, c, d, e, f + paramLong1, paramLong2, h, i, j);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DataSpec[");
    int m = c;
    String str;
    if (m != 1)
    {
      if (m != 2)
      {
        if (m == 3) {
          str = "HEAD";
        } else {
          throw new IllegalStateException();
        }
      }
      else {
        str = "POST";
      }
    }
    else {
      str = "GET";
    }
    localStringBuilder.append(str);
    localStringBuilder.append(" ");
    localStringBuilder.append(a);
    localStringBuilder.append(", ");
    localStringBuilder.append(f);
    localStringBuilder.append(", ");
    localStringBuilder.append(g);
    localStringBuilder.append(", ");
    localStringBuilder.append(h);
    localStringBuilder.append(", ");
    return j.m(localStringBuilder, i, "]");
  }
}

/* Location:
 * Qualified Name:     t5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */