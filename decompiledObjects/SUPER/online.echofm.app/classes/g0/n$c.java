package g0;

import d0.p;
import d0.p.b;

public final class n$c
{
  public final Object a;
  public p.b b;
  public boolean c;
  public boolean d;
  
  public n$c(Object paramObject)
  {
    a = paramObject;
    b = new p.b();
  }
  
  public void a(int paramInt, n.a parama)
  {
    if (!d)
    {
      if (paramInt != -1) {
        b.a(paramInt);
      }
      c = true;
      parama.invoke(a);
    }
  }
  
  public void b(n.b paramb)
  {
    if ((!d) && (c))
    {
      p localp = b.e();
      b = new p.b();
      c = false;
      paramb.a(a, localp);
    }
  }
  
  public void c(n.b paramb)
  {
    d = true;
    if (c)
    {
      c = false;
      paramb.a(a, b.e());
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (c.class == paramObject.getClass())) {
      return a.equals(a);
    }
    return false;
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
}

/* Location:
 * Qualified Name:     g0.n.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */