package P;

import V5.t;
import g6.p;
import r6.g;
import r6.m;
import r6.n;

public final class l$a
  extends kotlin.jvm.internal.l
  implements g6.l
{
  public l$a(g6.l paraml, l paraml1, p paramp)
  {
    super(1);
  }
  
  public final void a(Throwable paramThrowable)
  {
    o.invoke(paramThrowable);
    l.b(p).b(paramThrowable);
    Object localObject;
    do
    {
      localObject = g.d(l.b(p).c());
      if (localObject == null)
      {
        localObject = null;
      }
      else
      {
        q.invoke(localObject, paramThrowable);
        localObject = t.a;
      }
    } while (localObject != null);
  }
}

/* Location:
 * Qualified Name:     P.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */