package t5;

import android.content.Context;

public final class r$a
  implements k.a
{
  public final Context a;
  public final k.a b;
  public l0 c;
  
  public r$a(Context paramContext)
  {
    this(paramContext, new s.a());
  }
  
  public r$a(Context paramContext, k.a parama)
  {
    a = paramContext.getApplicationContext();
    b = parama;
  }
  
  public final r b()
  {
    r localr = new r(a, b.a());
    l0 locall0 = c;
    if (locall0 != null) {
      localr.f(locall0);
    }
    return localr;
  }
}

/* Location:
 * Qualified Name:     t5.r.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */