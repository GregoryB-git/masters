package o7;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class u0$c<E>
  extends AbstractSet<E>
{
  public boolean removeAll(Collection<?> paramCollection)
  {
    paramCollection.getClass();
    Object localObject = paramCollection;
    if ((paramCollection instanceof i0)) {
      localObject = ((i0)paramCollection).j();
    }
    boolean bool1 = localObject instanceof Set;
    boolean bool2 = false;
    boolean bool3 = false;
    if ((bool1) && (((Collection)localObject).size() > size()))
    {
      paramCollection = iterator();
      for (;;)
      {
        bool2 = bool3;
        if (!paramCollection.hasNext()) {
          break;
        }
        if (((Collection)localObject).contains(paramCollection.next()))
        {
          paramCollection.remove();
          bool3 = true;
        }
      }
    }
    paramCollection = ((Collection)localObject).iterator();
    bool3 = bool2;
    for (;;)
    {
      bool2 = bool3;
      if (!paramCollection.hasNext()) {
        break;
      }
      bool3 |= remove(paramCollection.next());
    }
    return bool2;
  }
  
  public boolean retainAll(Collection<?> paramCollection)
  {
    paramCollection.getClass();
    return super.retainAll(paramCollection);
  }
}

/* Location:
 * Qualified Name:     o7.u0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */