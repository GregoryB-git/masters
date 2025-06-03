package g2;

import U5.a;
import android.content.Context;
import h2.b;

public final class l
  implements b
{
  public final a a;
  public final a b;
  
  public l(a parama1, a parama2)
  {
    a = parama1;
    b = parama2;
  }
  
  public static l a(a parama1, a parama2)
  {
    return new l(parama1, parama2);
  }
  
  public static k c(Context paramContext, Object paramObject)
  {
    return new k(paramContext, (i)paramObject);
  }
  
  public k b()
  {
    return c((Context)a.get(), b.get());
  }
}

/* Location:
 * Qualified Name:     g2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */