package gb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d0$a
  extends z
{
  public d0$a()
  {
    super(c);
  }
  
  public final void a()
  {
    d0.i locali = b;
    locali.getClass();
    Object localObject1 = new ArrayList();
    for (;;)
    {
      try
      {
        if (c.isEmpty())
        {
          c = null;
          b = true;
          return;
        }
        List localList = c;
        c = ((List)localObject1);
        localObject1 = localList.iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((Runnable)((Iterator)localObject1).next()).run();
        }
        localList.clear();
        localObject1 = localList;
      }
      finally {}
    }
  }
}

/* Location:
 * Qualified Name:     gb.d0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */