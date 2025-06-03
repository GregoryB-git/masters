package gb;

import eb.e1;
import java.util.HashSet;

public final class r1$p
{
  public final Object a = new Object();
  public HashSet b = new HashSet();
  public e1 c;
  
  public r1$p(r1 paramr1) {}
  
  public final void a(e1 parame1)
  {
    synchronized (a)
    {
      if (c != null) {
        return;
      }
      c = parame1;
      boolean bool = b.isEmpty();
      if (bool) {
        d.F.c(parame1);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     gb.r1.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */