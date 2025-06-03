package V3;

import Y3.d.c;
import a4.j;
import java.util.Iterator;
import java.util.List;

public class x$e
  implements d.c
{
  public x$e(x paramx) {}
  
  public Void b(k paramk, v paramv, Void paramVoid)
  {
    if ((!paramk.isEmpty()) && (paramv.h()))
    {
      paramk = paramv.e().h();
      x.g(a).a(x.f(a, paramk), a.b0(paramk));
    }
    else
    {
      paramv = paramv.f().iterator();
      while (paramv.hasNext())
      {
        paramk = ((j)paramv.next()).h();
        x.g(a).a(x.f(a, paramk), a.b0(paramk));
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     V3.x.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */