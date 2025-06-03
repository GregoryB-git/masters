package nb;

import eb.k0.d;
import eb.k0.e;
import eb.k0.j;
import eb.l0;
import eb.n;
import f;
import gb.r2;
import java.util.Map;

public final class h$b
{
  public final Object a;
  public final Object b;
  public final e c;
  public final l0 d;
  public n e;
  public k0.j f;
  public boolean g;
  
  public h$b(h paramh, h.c paramc, r2 paramr2, k0.d paramd)
  {
    a = paramc;
    d = paramr2;
    g = false;
    f = paramd;
    b = null;
    paramh = new e(new a());
    c = paramh;
    e = n.a;
    paramh.i(paramr2);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Address = ");
    localStringBuilder.append(a);
    localStringBuilder.append(", state = ");
    localStringBuilder.append(e);
    localStringBuilder.append(", picker type: ");
    localStringBuilder.append(f.getClass());
    localStringBuilder.append(", lb: ");
    localStringBuilder.append(c.g().getClass());
    String str;
    if (g) {
      str = ", deactivated";
    } else {
      str = "";
    }
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public final class a
    extends c
  {
    public a() {}
    
    public final void f(n paramn, k0.j paramj)
    {
      h.b localb = h.b.this;
      if (!h.f.containsKey(a)) {
        return;
      }
      localb = h.b.this;
      e = paramn;
      f = paramj;
      if ((!g) && (!h.h))
      {
        if (paramn == n.d) {
          c.e();
        }
        h.i();
      }
    }
    
    public final k0.e g()
    {
      return h.g;
    }
  }
}

/* Location:
 * Qualified Name:     nb.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */