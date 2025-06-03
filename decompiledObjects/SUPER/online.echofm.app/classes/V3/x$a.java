package V3;

import W3.c;
import W3.d;
import a4.i;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class x$a
  implements Callable
{
  public x$a(x paramx, y paramy, k paramk, Map paramMap) {}
  
  public List a()
  {
    i locali = x.l(r, o);
    if (locali != null)
    {
      k localk = k.b0(locali.e(), p);
      Object localObject = b.D(q);
      x.c(r).f(p, (b)localObject);
      localObject = new c(W3.e.a(locali.d()), localk, (b)localObject);
      return x.m(r, locali, (d)localObject);
    }
    return Collections.emptyList();
  }
}

/* Location:
 * Qualified Name:     V3.x.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */