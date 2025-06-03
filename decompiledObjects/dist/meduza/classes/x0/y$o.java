package x0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class y$o
  implements y.m
{
  public y$o(y paramy) {}
  
  public final boolean a(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    Object localObject1 = a;
    Object localObject2 = d;
    localObject2 = (a)((ArrayList)localObject2).get(((ArrayList)localObject2).size() - 1);
    h = ((a)localObject2);
    Object localObject3 = a.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = nextb;
      if (localObject2 != null) {
        mTransitioning = true;
      }
    }
    boolean bool = ((y)localObject1).S(paramArrayList, paramArrayList1, -1, 0);
    a.getClass();
    if ((!a.n.isEmpty()) && (paramArrayList.size() > 0))
    {
      ((Boolean)paramArrayList1.get(paramArrayList.size() - 1)).booleanValue();
      paramArrayList1 = new LinkedHashSet();
      localObject1 = paramArrayList.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramArrayList = (a)((Iterator)localObject1).next();
        a.getClass();
        paramArrayList1.addAll(y.G(paramArrayList));
      }
      paramArrayList = a.n.iterator();
      while (paramArrayList.hasNext())
      {
        localObject2 = (y.l)paramArrayList.next();
        localObject1 = paramArrayList1.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (i)((Iterator)localObject1).next();
          ((y.l)localObject2).b();
        }
      }
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     x0.y.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */