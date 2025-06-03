package gb;

import eb.a;
import eb.e1;
import java.util.concurrent.atomic.AtomicBoolean;
import x6.b;

public final class r1$g
  implements h2.a
{
  public r1$g(r1 paramr1) {}
  
  public final void a(e1 parame1)
  {
    b.I(a.H.get(), "Channel must have been shut down");
  }
  
  public final void b() {}
  
  public final a c(a parama)
  {
    return parama;
  }
  
  public final void d()
  {
    b.I(a.H.get(), "Channel must have been shut down");
    r1 localr1 = a;
    J = true;
    localr1.Q(false);
    r1.J(a);
    r1.K(a);
  }
  
  public final void e(boolean paramBoolean)
  {
    r1 localr1 = a;
    b0.c(F, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     gb.r1.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */