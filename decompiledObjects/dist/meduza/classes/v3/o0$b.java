package v3;

import v5.e0;
import w3.v;

public class o0$b
  implements g
{
  public static final o0.c f = new o0.c(new a());
  public static final String o = e0.E(0);
  public static final String p = e0.E(1);
  public static final String q = e0.E(2);
  public static final String r = e0.E(3);
  public static final String s = e0.E(4);
  public static final v t = new v(4);
  public final long a;
  public final long b;
  public final boolean c;
  public final boolean d;
  public final boolean e;
  
  public o0$b(a parama)
  {
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    if ((a != a) || (b != b) || (c != c) || (d != d) || (e != e)) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    long l = a;
    int i = (int)(l ^ l >>> 32);
    l = b;
    return (((i * 31 + (int)(l >>> 32 ^ l)) * 31 + c) * 31 + d) * 31 + e;
  }
  
  public static final class a
  {
    public long a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    
    public a()
    {
      b = Long.MIN_VALUE;
    }
    
    public a(o0.c paramc)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
    }
  }
}

/* Location:
 * Qualified Name:     v3.o0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */