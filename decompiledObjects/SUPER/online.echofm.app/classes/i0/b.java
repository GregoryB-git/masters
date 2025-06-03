package i0;

import g0.M;
import g0.a;
import java.util.ArrayList;

public abstract class b
  implements g
{
  public final boolean a;
  public final ArrayList b;
  public int c;
  public k d;
  
  public b(boolean paramBoolean)
  {
    a = paramBoolean;
    b = new ArrayList(1);
  }
  
  public final void c(y paramy)
  {
    a.e(paramy);
    if (!b.contains(paramy))
    {
      b.add(paramy);
      c += 1;
    }
  }
  
  public final void q(int paramInt)
  {
    k localk = (k)M.i(d);
    for (int i = 0; i < c; i++) {
      ((y)b.get(i)).e(this, localk, a, paramInt);
    }
  }
  
  public final void r()
  {
    k localk = (k)M.i(d);
    for (int i = 0; i < c; i++) {
      ((y)b.get(i)).h(this, localk, a);
    }
    d = null;
  }
  
  public final void s(k paramk)
  {
    for (int i = 0; i < c; i++) {
      ((y)b.get(i)).f(this, paramk, a);
    }
  }
  
  public final void t(k paramk)
  {
    d = paramk;
    for (int i = 0; i < c; i++) {
      ((y)b.get(i)).g(this, paramk, a);
    }
  }
}

/* Location:
 * Qualified Name:     i0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */