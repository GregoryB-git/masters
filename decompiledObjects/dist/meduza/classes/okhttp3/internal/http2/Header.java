package okhttp3.internal.http2;

import okhttp3.internal.Util;
import xc.i;
import xc.i.a;

public final class Header
{
  public static final i d = i.a.a(":");
  public static final i e = i.a.a(":status");
  public static final i f = i.a.a(":method");
  public static final i g = i.a.a(":path");
  public static final i h = i.a.a(":scheme");
  public static final i i = i.a.a(":authority");
  public final i a;
  public final i b;
  public final int c;
  
  static
  {
    i locali = i.d;
  }
  
  public Header(String paramString1, String paramString2)
  {
    this(i.a.a(paramString1), i.a.a(paramString2));
  }
  
  public Header(i parami, String paramString)
  {
    this(parami, i.a.a(paramString));
  }
  
  public Header(i parami1, i parami2)
  {
    a = parami1;
    b = parami2;
    int j = parami1.i();
    c = (parami2.i() + (j + 32));
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Header;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (Header)paramObject;
      bool3 = bool2;
      if (a.equals(a))
      {
        bool3 = bool2;
        if (b.equals(b)) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public final int hashCode()
  {
    int j = a.hashCode();
    return b.hashCode() + (j + 527) * 31;
  }
  
  public final String toString()
  {
    return Util.l("%s: %s", new Object[] { a.t(), b.t() });
  }
  
  public static abstract interface Listener {}
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Header
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */