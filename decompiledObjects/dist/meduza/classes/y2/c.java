package y2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import p1.j;
import p2.k0;
import p2.w;
import x2.t;

public final class c
  extends e
{
  public c(k0 paramk0, String paramString) {}
  
  public final void b()
  {
    Object localObject1 = b.c;
    ((j)localObject1).c();
    try
    {
      Iterator localIterator = ((WorkDatabase)localObject1).u().x(c).iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        e.a(b, str);
      }
      ((j)localObject1).n();
      ((j)localObject1).j();
      localObject1 = b;
      w.b(b, c, e);
      return;
    }
    finally
    {
      ((j)localObject1).j();
    }
  }
}

/* Location:
 * Qualified Name:     y2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */