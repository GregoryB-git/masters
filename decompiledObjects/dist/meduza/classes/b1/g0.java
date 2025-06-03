package b1;

import ec.i;
import s1.c;

public final class g0
  implements m
{
  public final String a;
  public final e0 b;
  public boolean c;
  
  public g0(String paramString, e0 parame0)
  {
    a = paramString;
    b = parame0;
  }
  
  public final void a(o paramo, k.a parama)
  {
    if (parama == k.a.ON_DESTROY)
    {
      c = false;
      paramo.getLifecycle().c(this);
    }
  }
  
  public final void b(k paramk, c paramc)
  {
    i.e(paramc, "registry");
    i.e(paramk, "lifecycle");
    if ((c ^ true))
    {
      c = true;
      paramk.a(this);
      paramc.c(a, b.e);
      return;
    }
    throw new IllegalStateException("Already attached to lifecycleOwner".toString());
  }
}

/* Location:
 * Qualified Name:     b1.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */