package p1;

import java.util.concurrent.CancellationException;
import p6.P;
import u.c.a;

public final class b$a
  extends kotlin.jvm.internal.l
  implements g6.l
{
  public b$a(c.a parama, P paramP)
  {
    super(1);
  }
  
  public final void a(Throwable paramThrowable)
  {
    if (paramThrowable != null)
    {
      if ((paramThrowable instanceof CancellationException)) {
        o.c();
      } else {
        o.e(paramThrowable);
      }
    }
    else {
      o.b(p.c());
    }
  }
}

/* Location:
 * Qualified Name:     p1.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */