package i0;

import android.net.Uri;
import d0.v;
import g0.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class k
{
  public final Uri a;
  public final long b;
  public final int c;
  public final byte[] d;
  public final Map e;
  public final long f;
  public final long g;
  public final long h;
  public final String i;
  public final int j;
  public final Object k;
  
  static
  {
    v.a("media3.datasource");
  }
  
  public k(Uri paramUri, long paramLong1, int paramInt1, byte[] paramArrayOfByte, Map paramMap, long paramLong2, long paramLong3, String paramString, int paramInt2, Object paramObject)
  {
    long l = paramLong1 + paramLong2;
    boolean bool1 = true;
    if (l >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a.a(bool2);
    if (paramLong2 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a.a(bool2);
    boolean bool2 = bool1;
    if (paramLong3 <= 0L) {
      if (paramLong3 == -1L) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    a.a(bool2);
    a = ((Uri)a.e(paramUri));
    b = paramLong1;
    c = paramInt1;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      paramArrayOfByte = null;
    }
    d = paramArrayOfByte;
    e = Collections.unmodifiableMap(new HashMap(paramMap));
    g = paramLong2;
    f = l;
    h = paramLong3;
    i = paramString;
    j = paramInt2;
    k = paramObject;
  }
  
  public static String c(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt == 3) {
          return "HEAD";
        }
        throw new IllegalStateException();
      }
      return "POST";
    }
    return "GET";
  }
  
  public b a()
  {
    return new b(this, null);
  }
  
  public final String b()
  {
    return c(c);
  }
  
  public boolean d(int paramInt)
  {
    boolean bool;
    if ((j & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public k e(long paramLong)
  {
    long l1 = h;
    long l2 = -1L;
    if (l1 != -1L) {
      l2 = l1 - paramLong;
    }
    return f(paramLong, l2);
  }
  
  public k f(long paramLong1, long paramLong2)
  {
    if ((paramLong1 == 0L) && (h == paramLong2)) {
      return this;
    }
    return new k(a, b, c, d, e, g + paramLong1, paramLong2, i, j, k);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataSpec[");
    localStringBuilder.append(b());
    localStringBuilder.append(" ");
    localStringBuilder.append(a);
    localStringBuilder.append(", ");
    localStringBuilder.append(g);
    localStringBuilder.append(", ");
    localStringBuilder.append(h);
    localStringBuilder.append(", ");
    localStringBuilder.append(i);
    localStringBuilder.append(", ");
    localStringBuilder.append(j);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static final class b
  {
    public Uri a;
    public long b;
    public int c;
    public byte[] d;
    public Map e;
    public long f;
    public long g;
    public String h;
    public int i;
    public Object j;
    
    public b()
    {
      c = 1;
      e = Collections.emptyMap();
      g = -1L;
    }
    
    public b(k paramk)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
      f = g;
      g = h;
      h = i;
      i = j;
      j = k;
    }
    
    public k a()
    {
      a.i(a, "The uri must be set.");
      return new k(a, b, c, d, e, f, g, h, i, j, null);
    }
    
    public b b(int paramInt)
    {
      i = paramInt;
      return this;
    }
    
    public b c(byte[] paramArrayOfByte)
    {
      d = paramArrayOfByte;
      return this;
    }
    
    public b d(int paramInt)
    {
      c = paramInt;
      return this;
    }
    
    public b e(Map paramMap)
    {
      e = paramMap;
      return this;
    }
    
    public b f(String paramString)
    {
      h = paramString;
      return this;
    }
    
    public b g(long paramLong)
    {
      g = paramLong;
      return this;
    }
    
    public b h(long paramLong)
    {
      f = paramLong;
      return this;
    }
    
    public b i(Uri paramUri)
    {
      a = paramUri;
      return this;
    }
    
    public b j(String paramString)
    {
      a = Uri.parse(paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     i0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */