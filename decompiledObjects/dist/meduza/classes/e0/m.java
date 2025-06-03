package e0;

import b1.k;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class m
{
  public final Runnable a;
  public final CopyOnWriteArrayList<o> b = new CopyOnWriteArrayList();
  public final HashMap c = new HashMap();
  
  public m(Runnable paramRunnable)
  {
    a = paramRunnable;
  }
  
  public final void a(o paramo)
  {
    b.remove(paramo);
    paramo = (a)c.remove(paramo);
    if (paramo != null)
    {
      a.c(b);
      b = null;
    }
    a.run();
  }
  
  public static final class a
  {
    public final k a;
    public b1.m b;
    
    public a(k paramk, b1.m paramm)
    {
      a = paramk;
      b = paramm;
      paramk.a(paramm);
    }
  }
}

/* Location:
 * Qualified Name:     e0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */