package e0;

import android.view.WindowInsets.Builder;
import x.b;

public class s0$c
  extends s0.e
{
  public final WindowInsets.Builder a;
  
  public s0$c()
  {
    a = new WindowInsets.Builder();
  }
  
  public s0$c(s0 params0)
  {
    super(params0);
    params0 = params0.b();
    WindowInsets.Builder localBuilder = new android/view/WindowInsets$Builder;
    if (params0 != null) {
      localBuilder.<init>(params0);
    } else {
      localBuilder.<init>();
    }
    a = localBuilder;
  }
  
  public s0 b()
  {
    a();
    s0 locals0 = s0.c(a.build(), null);
    a.k(null);
    return locals0;
  }
  
  public void c(b paramb)
  {
    a.setStableInsets(paramb.b());
  }
  
  public void d(b paramb)
  {
    a.setSystemWindowInsets(paramb.b());
  }
}

/* Location:
 * Qualified Name:     e0.s0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */