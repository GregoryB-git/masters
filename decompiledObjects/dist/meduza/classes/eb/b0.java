package eb;

import java.util.Arrays;
import n7.g;
import n7.g.a;
import x6.b;

public final class b0
{
  public final String a;
  public final a b;
  public final long c;
  public final e0 d;
  public final e0 e;
  
  public b0(String paramString, a parama, long paramLong, e0 parame0)
  {
    a = paramString;
    b.y(parama, "severity");
    b = parama;
    c = paramLong;
    d = null;
    e = parame0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof b0;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (b0)paramObject;
      bool3 = bool2;
      if (b.Q(a, a))
      {
        bool3 = bool2;
        if (b.Q(b, b))
        {
          bool3 = bool2;
          if (c == c)
          {
            bool3 = bool2;
            if (b.Q(d, d))
            {
              bool3 = bool2;
              if (b.Q(e, e)) {
                bool3 = true;
              }
            }
          }
        }
      }
    }
    return bool3;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, Long.valueOf(c), d, e });
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(a, "description");
    locala.a(b, "severity");
    locala.b("timestampNanos", c);
    locala.a(d, "channelRef");
    locala.a(e, "subchannelRef");
    return locala.toString();
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("CT_UNKNOWN", 0);
      a locala2 = new a("CT_INFO", 1);
      a = locala2;
      a locala3 = new a("CT_WARNING", 2);
      b = locala3;
      a locala4 = new a("CT_ERROR", 3);
      c = locala4;
      d = new a[] { locala1, locala2, locala3, locala4 };
    }
    
    public a() {}
  }
}

/* Location:
 * Qualified Name:     eb.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */