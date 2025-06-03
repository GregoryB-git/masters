package m0;

import android.content.Context;
import e0.b;
import e0.c;
import g0.a;
import k0.w.a;

public final class N$f
{
  public final Context a;
  public e b;
  public c c;
  public boolean d;
  public boolean e;
  public boolean f;
  public N.e g;
  public N.d h;
  public w.a i;
  
  public N$f(Context paramContext)
  {
    a = paramContext;
    b = e.c;
    g = N.e.a;
  }
  
  public N i()
  {
    a.f(f ^ true);
    f = true;
    if (c == null) {
      c = new N.h(new b[0]);
    }
    if (h == null) {
      h = new E(a);
    }
    return new N(this, null);
  }
  
  public f j(boolean paramBoolean)
  {
    e = paramBoolean;
    return this;
  }
  
  public f k(boolean paramBoolean)
  {
    d = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     m0.N.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */