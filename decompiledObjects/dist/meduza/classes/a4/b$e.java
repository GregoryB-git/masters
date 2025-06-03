package a4;

import java.util.HashSet;
import o7.t;
import o7.t.b;

public final class b$e
  implements a.a
{
  public final HashSet a = new HashSet();
  public a b;
  
  public final void a(Exception paramException, boolean paramBoolean)
  {
    b = null;
    Object localObject = t.p(a);
    a.clear();
    t.b localb = ((t)localObject).r(0);
    while (localb.hasNext())
    {
      localObject = (a)localb.next();
      int i;
      if (paramBoolean) {
        i = 1;
      } else {
        i = 3;
      }
      ((a)localObject).c(i, paramException);
    }
  }
}

/* Location:
 * Qualified Name:     a4.b.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */