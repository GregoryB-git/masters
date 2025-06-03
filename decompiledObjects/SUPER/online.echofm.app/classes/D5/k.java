package D5;

import E5.r;
import java.util.Locale;
import t5.b;

public class k
{
  public b a = null;
  public b b = null;
  public boolean c = true;
  public final E5.a d;
  
  public k(E5.a parama)
  {
    d = parama;
  }
  
  public k(w5.a parama)
  {
    this(new E5.a(parama, "flutter/lifecycle", r.b));
  }
  
  public void a()
  {
    g(a, true);
  }
  
  public void b()
  {
    g(b.o, c);
  }
  
  public void c()
  {
    g(b.q, c);
  }
  
  public void d()
  {
    g(b.s, c);
  }
  
  public void e()
  {
    g(b.p, c);
  }
  
  public void f()
  {
    g(a, false);
  }
  
  public final void g(b paramb, boolean paramBoolean)
  {
    b localb = a;
    if ((localb == paramb) && (paramBoolean == c)) {
      return;
    }
    if ((paramb == null) && (localb == null))
    {
      c = paramBoolean;
      return;
    }
    int i = a.a[paramb.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3) && (i != 4) && (i != 5)) {
        localb = null;
      } else {
        localb = paramb;
      }
    }
    else if (paramBoolean) {
      localb = b.p;
    } else {
      localb = b.q;
    }
    a = paramb;
    c = paramBoolean;
    if (localb == b) {
      return;
    }
    paramb = new StringBuilder();
    paramb.append("AppLifecycleState.");
    paramb.append(localb.name().toLowerCase(Locale.ROOT));
    String str = paramb.toString();
    paramb = new StringBuilder();
    paramb.append("Sending ");
    paramb.append(str);
    paramb.append(" message.");
    b.f("LifecycleChannel", paramb.toString());
    d.c(str);
    b = localb;
  }
  
  public static enum b {}
}

/* Location:
 * Qualified Name:     D5.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */