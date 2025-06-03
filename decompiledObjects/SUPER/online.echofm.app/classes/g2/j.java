package g2;

import android.content.Context;
import h2.b;

public final class j
  implements b
{
  public final U5.a a;
  public final U5.a b;
  public final U5.a c;
  
  public j(U5.a parama1, U5.a parama2, U5.a parama3)
  {
    a = parama1;
    b = parama2;
    c = parama3;
  }
  
  public static j a(U5.a parama1, U5.a parama2, U5.a parama3)
  {
    return new j(parama1, parama2, parama3);
  }
  
  public static i c(Context paramContext, p2.a parama1, p2.a parama2)
  {
    return new i(paramContext, parama1, parama2);
  }
  
  public i b()
  {
    return c((Context)a.get(), (p2.a)b.get(), (p2.a)c.get());
  }
}

/* Location:
 * Qualified Name:     g2.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */