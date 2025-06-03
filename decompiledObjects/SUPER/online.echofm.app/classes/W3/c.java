package W3;

import V3.k;

public class c
  extends d
{
  public final V3.b d;
  
  public c(e parame, k paramk, V3.b paramb)
  {
    super(d.a.p, parame, paramk);
    d = paramb;
  }
  
  public d d(d4.b paramb)
  {
    if (c.isEmpty())
    {
      paramb = d.k(new k(new d4.b[] { paramb }));
      if (paramb.isEmpty()) {
        return null;
      }
      if (paramb.X() != null) {
        return new f(b, k.Y(), paramb.X());
      }
      return new c(b, k.Y(), paramb);
    }
    if (c.Z().equals(paramb)) {
      return new c(b, c.c0(), d);
    }
    return null;
  }
  
  public V3.b e()
  {
    return d;
  }
  
  public String toString()
  {
    return String.format("Merge { path=%s, source=%s, children=%s }", new Object[] { a(), b(), d });
  }
}

/* Location:
 * Qualified Name:     W3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */