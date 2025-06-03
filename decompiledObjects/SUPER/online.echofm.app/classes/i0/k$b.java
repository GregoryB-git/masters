package i0;

import android.net.Uri;
import g0.a;
import java.util.Collections;
import java.util.Map;

public final class k$b
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
  
  public k$b()
  {
    c = 1;
    e = Collections.emptyMap();
    g = -1L;
  }
  
  public k$b(k paramk)
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

/* Location:
 * Qualified Name:     i0.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */