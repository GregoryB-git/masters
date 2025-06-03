package n2;

import U5.a;
import android.content.Context;
import h2.b;

public final class V
  implements b
{
  public final a a;
  public final a b;
  public final a c;
  
  public V(a parama1, a parama2, a parama3)
  {
    a = parama1;
    b = parama2;
    c = parama3;
  }
  
  public static V a(a parama1, a parama2, a parama3)
  {
    return new V(parama1, parama2, parama3);
  }
  
  public static U c(Context paramContext, String paramString, int paramInt)
  {
    return new U(paramContext, paramString, paramInt);
  }
  
  public U b()
  {
    return c((Context)a.get(), (String)b.get(), ((Integer)c.get()).intValue());
  }
}

/* Location:
 * Qualified Name:     n2.V
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */