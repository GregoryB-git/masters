package W3;

import S3.c;
import V3.k;
import Y3.m;
import d4.b;

public class a
  extends d
{
  public final boolean d;
  public final Y3.d e;
  
  public a(k paramk, Y3.d paramd, boolean paramBoolean)
  {
    super(d.a.q, e.d, paramk);
    e = paramd;
    d = paramBoolean;
  }
  
  public d d(b paramb)
  {
    if (!c.isEmpty())
    {
      m.g(c.Z().equals(paramb), "operationForChild called for unrelated child.");
      return new a(c.c0(), e, d);
    }
    if (e.getValue() != null)
    {
      m.g(e.M().isEmpty(), "affectedTree should not have overlapping affected paths.");
      return this;
    }
    paramb = e.Y(new k(new b[] { paramb }));
    return new a(k.Y(), paramb, d);
  }
  
  public Y3.d e()
  {
    return e;
  }
  
  public boolean f()
  {
    return d;
  }
  
  public String toString()
  {
    return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", new Object[] { a(), Boolean.valueOf(d), e });
  }
}

/* Location:
 * Qualified Name:     W3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */