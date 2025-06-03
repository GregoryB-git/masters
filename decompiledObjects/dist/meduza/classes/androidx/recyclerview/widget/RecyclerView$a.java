package androidx.recyclerview.widget;

import e0.d0;
import java.util.ArrayList;
import java.util.Iterator;

public final class RecyclerView$a
  implements Runnable
{
  public RecyclerView$a(RecyclerView paramRecyclerView) {}
  
  public final void run()
  {
    Object localObject1 = a.O;
    if (localObject1 != null)
    {
      localObject1 = (c)localObject1;
      boolean bool1 = e.isEmpty() ^ true;
      boolean bool2 = g.isEmpty() ^ true;
      boolean bool3 = h.isEmpty() ^ true;
      boolean bool4 = f.isEmpty() ^ true;
      if ((bool1) || (bool2) || (bool4) || (bool3))
      {
        Iterator localIterator = e.iterator();
        if (!localIterator.hasNext())
        {
          e.clear();
          Object localObject2;
          if (bool2)
          {
            localObject2 = new ArrayList();
            ((ArrayList)localObject2).addAll(g);
            j.add(localObject2);
            g.clear();
            if (!bool1)
            {
              localIterator = ((ArrayList)localObject2).iterator();
              if (!localIterator.hasNext())
              {
                ((ArrayList)localObject2).clear();
                j.remove(localObject2);
              }
              else
              {
                ((c.b)localIterator.next()).getClass();
                throw null;
              }
            }
            else
            {
              ((c.b)((ArrayList)localObject2).get(0)).getClass();
              throw null;
            }
          }
          if (bool3)
          {
            ArrayList localArrayList = new ArrayList();
            localArrayList.addAll(h);
            k.add(localArrayList);
            h.clear();
            if (!bool1)
            {
              localIterator = localArrayList.iterator();
              while (localIterator.hasNext()) {
                localObject2 = nexta;
              }
              localArrayList.clear();
              k.remove(localArrayList);
            }
            else
            {
              get0a.getClass();
              localObject1 = d0.a;
              throw null;
            }
          }
          if (bool4)
          {
            localObject2 = new ArrayList();
            ((ArrayList)localObject2).addAll(f);
            i.add(localObject2);
            f.clear();
            if ((!bool1) && (!bool2) && (!bool3))
            {
              localIterator = ((ArrayList)localObject2).iterator();
              if (!localIterator.hasNext())
              {
                ((ArrayList)localObject2).clear();
                i.remove(localObject2);
              }
              else
              {
                ((RecyclerView.v)localIterator.next()).getClass();
                throw null;
              }
            }
            else
            {
              long l1 = 0L;
              long l2;
              if (bool2) {
                l2 = c;
              } else {
                l2 = 0L;
              }
              if (bool3) {
                l1 = d;
              }
              Math.max(l2, l1);
              ((RecyclerView.v)((ArrayList)localObject2).get(0)).getClass();
              localObject1 = d0.a;
              throw null;
            }
          }
        }
        else
        {
          ((RecyclerView.v)localIterator.next()).getClass();
          throw null;
        }
      }
    }
    a.getClass();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */