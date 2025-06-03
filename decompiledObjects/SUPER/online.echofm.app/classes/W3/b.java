package W3;

import V3.k;
import Y3.m;

public class b
  extends d
{
  public b(e parame, k paramk)
  {
    super(d.a.r, parame, paramk);
    m.g(parame.d() ^ true, "Can't have a listen complete from a user source");
  }
  
  public d d(d4.b paramb)
  {
    if (c.isEmpty()) {
      return new b(b, k.Y());
    }
    return new b(b, c.c0());
  }
  
  public String toString()
  {
    return String.format("ListenComplete { path=%s, source=%s }", new Object[] { a(), b() });
  }
}

/* Location:
 * Qualified Name:     W3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */