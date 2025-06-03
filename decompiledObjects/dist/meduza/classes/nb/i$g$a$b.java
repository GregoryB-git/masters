package nb;

import eb.e1;
import eb.h;
import java.util.concurrent.atomic.AtomicLong;

public final class i$g$a$b
  extends h
{
  public i$g$a$b(i.g.a parama) {}
  
  public final void o(e1 parame1)
  {
    i.a locala = c.a;
    boolean bool = parame1.e();
    parame1 = a;
    if ((e != null) || (f != null))
    {
      if (bool) {
        parame1 = b.a;
      } else {
        parame1 = b.b;
      }
      parame1.getAndIncrement();
    }
  }
}

/* Location:
 * Qualified Name:     nb.i.g.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */