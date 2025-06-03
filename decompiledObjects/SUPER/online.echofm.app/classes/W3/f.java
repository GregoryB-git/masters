package W3;

import V3.k;
import d4.b;
import d4.n;

public class f
  extends d
{
  public final n d;
  
  public f(e parame, k paramk, n paramn)
  {
    super(d.a.o, parame, paramk);
    d = paramn;
  }
  
  public d d(b paramb)
  {
    if (c.isEmpty()) {
      return new f(b, k.Y(), d.v(paramb));
    }
    return new f(b, c.c0(), d);
  }
  
  public n e()
  {
    return d;
  }
  
  public String toString()
  {
    return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", new Object[] { a(), b(), d });
  }
}

/* Location:
 * Qualified Name:     W3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */