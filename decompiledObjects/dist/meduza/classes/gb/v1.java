package gb;

import eb.e1;
import eb.k0.f;
import eb.k0.g;
import eb.k0.j;
import n7.g.a;
import x6.b;

public final class v1
  extends k0.j
{
  public final k0.f a;
  
  public v1(Throwable paramThrowable)
  {
    paramThrowable = e1.m.g("Panic! This is a bug!").f(paramThrowable);
    k0.f localf = k0.f.e;
    b.s("drop status shouldn't be OK", paramThrowable.e() ^ true);
    a = new k0.f(null, null, paramThrowable, true);
  }
  
  public final k0.f a(k0.g paramg)
  {
    return a;
  }
  
  public final String toString()
  {
    g.a locala = new g.a(v1.class.getSimpleName());
    locala.a(a, "panicPickResult");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     gb.v1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */