package V3;

import W3.d;
import W3.f;
import a4.i;
import d4.n;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class x$o
  implements Callable
{
  public x$o(x paramx, y paramy, k paramk, n paramn) {}
  
  public List a()
  {
    i locali = x.l(r, o);
    if (locali != null)
    {
      k localk = k.b0(locali.e(), p);
      if (localk.isEmpty()) {
        localObject = locali;
      } else {
        localObject = i.a(p);
      }
      x.c(r).j((i)localObject, q);
      Object localObject = new f(W3.e.a(locali.d()), localk, q);
      return x.m(r, locali, (d)localObject);
    }
    return Collections.emptyList();
  }
}

/* Location:
 * Qualified Name:     V3.x.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */