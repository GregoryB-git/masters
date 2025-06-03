package l2;

import android.content.Context;
import h2.b;
import m2.f;
import m2.x;

public final class i
  implements b
{
  public final U5.a a;
  public final U5.a b;
  public final U5.a c;
  public final U5.a d;
  
  public i(U5.a parama1, U5.a parama2, U5.a parama3, U5.a parama4)
  {
    a = parama1;
    b = parama2;
    c = parama3;
    d = parama4;
  }
  
  public static i a(U5.a parama1, U5.a parama2, U5.a parama3, U5.a parama4)
  {
    return new i(parama1, parama2, parama3, parama4);
  }
  
  public static x c(Context paramContext, n2.d paramd, f paramf, p2.a parama)
  {
    return (x)h2.d.c(h.a(paramContext, paramd, paramf, parama), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public x b()
  {
    return c((Context)a.get(), (n2.d)b.get(), (f)c.get(), (p2.a)d.get());
  }
}

/* Location:
 * Qualified Name:     l2.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */