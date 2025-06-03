package t5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import v5.e0;

public abstract class f
  implements k
{
  public final boolean a;
  public final ArrayList<l0> b;
  public int c;
  public n d;
  
  public f(boolean paramBoolean)
  {
    a = paramBoolean;
    b = new ArrayList(1);
  }
  
  public final void f(l0 paraml0)
  {
    paraml0.getClass();
    if (!b.contains(paraml0))
    {
      b.add(paraml0);
      c += 1;
    }
  }
  
  public Map h()
  {
    return Collections.emptyMap();
  }
  
  public final void o(int paramInt)
  {
    n localn = d;
    int i = e0.a;
    for (i = 0; i < c; i++) {
      ((l0)b.get(i)).a(localn, a, paramInt);
    }
  }
  
  public final void p()
  {
    n localn = d;
    int i = e0.a;
    for (i = 0; i < c; i++) {
      ((l0)b.get(i)).h(localn, a);
    }
    d = null;
  }
  
  public final void q(n paramn)
  {
    for (int i = 0; i < c; i++) {
      ((l0)b.get(i)).d();
    }
  }
  
  public final void r(n paramn)
  {
    d = paramn;
    for (int i = 0; i < c; i++) {
      ((l0)b.get(i)).i(paramn, a);
    }
  }
}

/* Location:
 * Qualified Name:     t5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */