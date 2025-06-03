package e0;

import android.view.WindowInsets;
import x.b;

public class s0$g
  extends s0.f
{
  public b k = null;
  
  public s0$g(s0 params0, WindowInsets paramWindowInsets)
  {
    super(params0, paramWindowInsets);
  }
  
  public s0 b()
  {
    return s0.c(c.consumeStableInsets(), null);
  }
  
  public s0 c()
  {
    return s0.c(c.consumeSystemWindowInsets(), null);
  }
  
  public final b f()
  {
    if (k == null) {
      k = b.a(c.getStableInsetLeft(), c.getStableInsetTop(), c.getStableInsetRight(), c.getStableInsetBottom());
    }
    return k;
  }
  
  public boolean i()
  {
    return c.isConsumed();
  }
  
  public void m(b paramb)
  {
    k = paramb;
  }
}

/* Location:
 * Qualified Name:     e0.s0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */