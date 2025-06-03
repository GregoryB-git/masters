package jb;

import xc.i;
import xc.i.a;

public final class d
{
  public static final i d;
  public static final i e;
  public static final i f;
  public static final i g;
  public static final i h;
  public final i a;
  public final i b;
  public final int c;
  
  static
  {
    i locali = i.d;
    d = i.a.a(":status");
    e = i.a.a(":method");
    f = i.a.a(":path");
    g = i.a.a(":scheme");
    h = i.a.a(":authority");
    i.a.a(":host");
    i.a.a(":version");
  }
  
  public d(String paramString1, String paramString2)
  {
    this(i.a.a(paramString1), i.a.a(paramString2));
  }
  
  public d(i parami, String paramString)
  {
    this(parami, i.a.a(paramString));
  }
  
  public d(i parami1, i parami2)
  {
    a = parami1;
    b = parami2;
    int i = parami1.i();
    c = (parami2.i() + (i + 32));
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof d;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (d)paramObject;
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
    int i = a.hashCode();
    return b.hashCode() + (i + 527) * 31;
  }
  
  public final String toString()
  {
    return String.format("%s: %s", new Object[] { a.t(), b.t() });
  }
}

/* Location:
 * Qualified Name:     jb.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */