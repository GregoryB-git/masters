package b;

import android.os.Build.VERSION;
import b1.k.a;
import b1.m;
import b1.o;
import ec.i;

public final class j$f
  implements m
{
  public j$f(j paramj) {}
  
  public final void a(o paramo, k.a parama)
  {
    if ((parama == k.a.ON_CREATE) && (Build.VERSION.SDK_INT >= 33))
    {
      parama = j.access$100(a);
      paramo = j.g.a((j)paramo);
      parama.getClass();
      i.e(paramo, "invoker");
      f = paramo;
      parama.c(h);
    }
  }
}

/* Location:
 * Qualified Name:     b.j.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */