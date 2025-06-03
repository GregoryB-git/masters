package androidx.fragment.app;

import E.c;
import android.content.Context;

public class c$k
  extends c.l
{
  public boolean c = false;
  public f.d d;
  
  public c$k(B.e parame, c paramc)
  {
    super(parame, paramc);
  }
  
  public f.d e(Context paramContext)
  {
    if (c) {
      return d;
    }
    Fragment localFragment = b().f();
    boolean bool;
    if (b().e() == B.e.c.p) {
      bool = true;
    } else {
      bool = false;
    }
    paramContext = f.b(paramContext, localFragment, bool);
    d = paramContext;
    c = true;
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.c.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */