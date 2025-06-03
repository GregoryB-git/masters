package b;

import b1.k;
import b1.k.a;
import b1.m;
import b1.o;

public final class w$c
  implements m, c
{
  public final k a;
  public final p b;
  public w.d c;
  
  public w$c(k paramk, p paramp)
  {
    a = paramp;
    b = ((p)localObject);
    paramp.a(this);
  }
  
  public final void a(o paramo, k.a parama)
  {
    if (parama == k.a.ON_START)
    {
      parama = d;
      paramo = b;
      parama.getClass();
      ec.i.e(paramo, "onBackPressedCallback");
      c.addLast(paramo);
      w.d locald = new w.d(parama, paramo);
      paramo.addCancellable(locald);
      parama.d();
      paramo.setEnabledChangedCallback$activity_release(new x(parama));
      c = locald;
    }
    else if (parama == k.a.ON_STOP)
    {
      paramo = c;
      if (paramo != null) {
        paramo.cancel();
      }
    }
    else if (parama == k.a.ON_DESTROY)
    {
      cancel();
    }
  }
  
  public final void cancel()
  {
    a.c(this);
    b.removeCancellable(this);
    w.d locald = c;
    if (locald != null) {
      locald.cancel();
    }
    c = null;
  }
}

/* Location:
 * Qualified Name:     b.w.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */