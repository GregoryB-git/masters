package i0;

import android.content.Context;

public final class l$a
  implements g.a
{
  public final Context a;
  public final g.a b;
  public y c;
  
  public l$a(Context paramContext)
  {
    this(paramContext, new m.b());
  }
  
  public l$a(Context paramContext, g.a parama)
  {
    a = paramContext.getApplicationContext();
    b = parama;
  }
  
  public l b()
  {
    l locall = new l(a, b.a());
    y localy = c;
    if (localy != null) {
      locall.c(localy);
    }
    return locall;
  }
}

/* Location:
 * Qualified Name:     i0.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */