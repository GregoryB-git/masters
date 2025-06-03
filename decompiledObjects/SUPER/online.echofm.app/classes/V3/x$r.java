package V3;

import T3.a;
import T3.g;
import Y3.e;
import a4.i;
import a4.j;
import d4.d;
import d4.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class x$r
  implements g, x.p
{
  public final j a;
  public final y b;
  
  public x$r(x paramx, j paramj)
  {
    a = paramj;
    b = paramx.b0(paramj.h());
  }
  
  public List a(Q3.c paramc)
  {
    if (paramc == null)
    {
      paramc = a.h();
      localObject = b;
      if (localObject != null) {
        return c.C((y)localObject);
      }
      return c.v(paramc.e());
    }
    c4.c localc = x.b(c);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Listen at ");
    ((StringBuilder)localObject).append(a.h().e());
    ((StringBuilder)localObject).append(" failed: ");
    ((StringBuilder)localObject).append(paramc.toString());
    localc.i(((StringBuilder)localObject).toString());
    return c.T(a.h(), paramc);
  }
  
  public a b()
  {
    d locald = d.b(a.i());
    Object localObject = locald.e();
    ArrayList localArrayList = new ArrayList(((List)localObject).size());
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.add(((k)((Iterator)localObject).next()).S());
    }
    return new a(localArrayList, locald.d());
  }
  
  public boolean c()
  {
    boolean bool;
    if (e.b(a.i()) > 1024L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String d()
  {
    return a.i().R();
  }
}

/* Location:
 * Qualified Name:     V3.x.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */