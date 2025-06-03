package p0;

import X2.v;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class h$g
  implements g.a
{
  public final Set a = new HashSet();
  public g b;
  
  public h$g(h paramh) {}
  
  public void a(g paramg)
  {
    a.add(paramg);
    if (b != null) {
      return;
    }
    b = paramg;
    paramg.H();
  }
  
  public void b()
  {
    b = null;
    Object localObject = v.U(a);
    a.clear();
    localObject = ((v)localObject).q();
    while (((Iterator)localObject).hasNext()) {
      ((g)((Iterator)localObject).next()).C();
    }
  }
  
  public void c(Exception paramException, boolean paramBoolean)
  {
    b = null;
    Object localObject = v.U(a);
    a.clear();
    localObject = ((v)localObject).q();
    while (((Iterator)localObject).hasNext()) {
      ((g)((Iterator)localObject).next()).D(paramException, paramBoolean);
    }
  }
  
  public void d(g paramg)
  {
    a.remove(paramg);
    if (b == paramg)
    {
      b = null;
      if (!a.isEmpty())
      {
        paramg = (g)a.iterator().next();
        b = paramg;
        paramg.H();
      }
    }
  }
}

/* Location:
 * Qualified Name:     p0.h.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */