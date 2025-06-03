package nb;

import eb.e1;
import eb.h;
import java.util.concurrent.atomic.AtomicLong;
import m.e;

public final class i$g$a$a
  extends a
{
  public i$g$a$a(i.g.a parama, h paramh) {}
  
  public final void o(e1 parame1)
  {
    i.a locala = d.a;
    boolean bool = parame1.e();
    Object localObject = a;
    if ((e != null) || (f != null))
    {
      localObject = b;
      if (bool) {
        localObject = a;
      } else {
        localObject = b;
      }
      ((AtomicLong)localObject).getAndIncrement();
    }
    c.o(parame1);
  }
}

/* Location:
 * Qualified Name:     nb.i.g.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */