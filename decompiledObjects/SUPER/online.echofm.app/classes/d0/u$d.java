package d0;

import g0.M;

public class u$d
{
  public static final d h = new a().f();
  public static final String i = M.w0(0);
  public static final String j = M.w0(1);
  public static final String k = M.w0(2);
  public static final String l = M.w0(3);
  public static final String m = M.w0(4);
  public static final String n = M.w0(5);
  public static final String o = M.w0(6);
  public final long a;
  public final long b;
  public final long c;
  public final long d;
  public final boolean e;
  public final boolean f;
  public final boolean g;
  
  public u$d(a parama)
  {
    a = M.i1(a.a(parama));
    c = M.i1(a.b(parama));
    b = a.a(parama);
    d = a.b(parama);
    e = a.c(parama);
    f = a.d(parama);
    g = a.e(parama);
  }
  
  public a a()
  {
    return new a(this, null);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof d)) {
      return false;
    }
    paramObject = (d)paramObject;
    if ((b != b) || (d != d) || (e != e) || (f != f) || (g != g)) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    long l1 = b;
    int i1 = (int)(l1 ^ l1 >>> 32);
    l1 = d;
    return (((i1 * 31 + (int)(l1 >>> 32 ^ l1)) * 31 + e) * 31 + f) * 31 + g;
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
    
    public a(u.d paramd)
    {
      a = b;
      b = d;
      c = e;
      d = f;
      e = g;
    }
    
    public u.d f()
    {
      return new u.d(this, null);
    }
    
    public u.e g()
    {
      return new u.e(this, null);
    }
  }
}

/* Location:
 * Qualified Name:     d0.u.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */