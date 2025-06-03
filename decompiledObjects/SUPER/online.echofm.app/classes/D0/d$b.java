package D0;

import android.content.Context;
import d0.F.a;
import d0.N.a;
import g0.a;
import g0.c;

public final class d$b
{
  public final Context a;
  public final q b;
  public N.a c;
  public F.a d;
  public c e;
  public boolean f;
  
  public d$b(Context paramContext, q paramq)
  {
    a = paramContext.getApplicationContext();
    b = paramq;
    e = c.a;
  }
  
  public d e()
  {
    a.f(f ^ true);
    if (d == null)
    {
      if (c == null) {
        c = new d.e(null);
      }
      d = new d.f(c);
    }
    d locald = new d(this, null);
    f = true;
    return locald;
  }
  
  public b f(c paramc)
  {
    e = paramc;
    return this;
  }
}

/* Location:
 * Qualified Name:     D0.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */