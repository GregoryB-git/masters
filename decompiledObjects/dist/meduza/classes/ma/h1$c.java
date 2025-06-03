package ma;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class h1$c
  implements Iterator<h.g>
{
  public final ArrayDeque<h1> a;
  public h.g b;
  
  public h1$c(h paramh)
  {
    if ((paramh instanceof h1))
    {
      h1 localh1 = (h1)paramh;
      paramh = new ArrayDeque(p);
      a = paramh;
      paramh.push(localh1);
      for (paramh = e; (paramh instanceof h1); paramh = e)
      {
        paramh = (h1)paramh;
        a.push(paramh);
      }
      paramh = (h.g)paramh;
    }
    else
    {
      a = null;
      paramh = (h.g)paramh;
    }
    b = paramh;
  }
  
  public final h.g a()
  {
    h.g localg = b;
    if (localg != null)
    {
      do
      {
        localObject = a;
        if ((localObject == null) || (((ArrayDeque)localObject).isEmpty())) {
          break;
        }
        for (localObject = a.pop()).f; (localObject instanceof h1); localObject = e)
        {
          localObject = (h1)localObject;
          a.push(localObject);
        }
        localObject = (h.g)localObject;
      } while (((h)localObject).isEmpty());
      break label87;
      Object localObject = null;
      label87:
      b = ((h.g)localObject);
      return localg;
    }
    throw new NoSuchElementException();
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     ma.h1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */