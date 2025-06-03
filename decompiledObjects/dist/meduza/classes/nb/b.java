package nb;

import eb.e1;
import eb.k0;
import eb.k0.h;
import n7.g;
import n7.g.a;

public abstract class b
  extends k0
{
  public final boolean b()
  {
    return g().b();
  }
  
  public final void c(e1 parame1)
  {
    g().c(parame1);
  }
  
  public final void d(k0.h paramh)
  {
    g().d(paramh);
  }
  
  public final void e()
  {
    g().e();
  }
  
  public abstract k0 g();
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(g(), "delegate");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     nb.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */