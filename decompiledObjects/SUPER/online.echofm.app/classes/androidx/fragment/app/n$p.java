package androidx.fragment.app;

import java.util.Iterator;
import java.util.List;

public class n$p
  implements Fragment.k
{
  public final boolean a;
  public final a b;
  public int c;
  
  public n$p(a parama, boolean paramBoolean)
  {
    a = paramBoolean;
    b = parama;
  }
  
  public void a()
  {
    int i = c - 1;
    c = i;
    if (i != 0) {
      return;
    }
    b.t.f1();
  }
  
  public void b()
  {
    c += 1;
  }
  
  public void c()
  {
    a locala = b;
    t.t(locala, a, false, false);
  }
  
  public void d()
  {
    int i;
    if (c > 0) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject = b.t.r0().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Fragment localFragment = (Fragment)((Iterator)localObject).next();
      localFragment.B1(null);
      if ((i != 0) && (localFragment.a0())) {
        localFragment.G1();
      }
    }
    localObject = b;
    t.t((a)localObject, a, i ^ 0x1, true);
  }
  
  public boolean e()
  {
    boolean bool;
    if (c == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.n.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */