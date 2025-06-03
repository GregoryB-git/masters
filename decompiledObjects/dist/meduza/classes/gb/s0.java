package gb;

import eb.u0;
import eb.u0.d;
import n7.g;
import n7.g.a;

public abstract class s0
  extends u0
{
  public final u0 a;
  
  public s0(u0 paramu0)
  {
    a = paramu0;
  }
  
  public String a()
  {
    return a.a();
  }
  
  public final void b()
  {
    a.b();
  }
  
  public void c()
  {
    a.c();
  }
  
  public void d(u0.d paramd)
  {
    a.d(paramd);
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(a, "delegate");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     gb.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */