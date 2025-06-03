package V3;

import Q3.c;
import X3.e;
import Y3.d;
import Y3.m;
import a4.i;
import a4.j;
import d4.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class x$d
  implements Callable
{
  public x$d(x paramx, i parami, h paramh, c paramc, boolean paramBoolean) {}
  
  public List a()
  {
    Object localObject1 = o.e();
    Object localObject2 = (v)x.n(s).s((k)localObject1);
    Object localObject3 = new ArrayList();
    Object localObject4 = localObject3;
    if (localObject2 != null) {
      if (!o.f())
      {
        localObject4 = localObject3;
        if (!((v)localObject2).k(o)) {}
      }
      else
      {
        localObject4 = ((v)localObject2).j(o, p, q);
        if (((v)localObject2).i())
        {
          localObject3 = s;
          x.o((x)localObject3, x.n((x)localObject3).U((k)localObject1));
        }
        List localList = (List)((Y3.g)localObject4).a();
        localObject3 = (List)((Y3.g)localObject4).b();
        localObject2 = localList.iterator();
        for (int i = 0;; i = 1)
        {
          if (!((Iterator)localObject2).hasNext()) {
            break label190;
          }
          localObject4 = (i)((Iterator)localObject2).next();
          x.c(s).i(o);
          if ((i == 0) && (!((i)localObject4).g())) {
            break;
          }
        }
        label190:
        if (r) {
          return null;
        }
        localObject4 = x.n(s);
        int j;
        if ((((d)localObject4).getValue() != null) && (((v)((d)localObject4).getValue()).h())) {
          j = 1;
        } else {
          j = 0;
        }
        Iterator localIterator = ((k)localObject1).iterator();
        int m;
        do
        {
          k = j;
          if (!localIterator.hasNext()) {
            break;
          }
          localObject2 = ((d)localObject4).D((b)localIterator.next());
          if ((j == 0) && ((((d)localObject2).getValue() == null) || (!((v)((d)localObject2).getValue()).h()))) {
            m = 0;
          } else {
            m = 1;
          }
          k = m;
          if (m != 0) {
            break;
          }
          localObject4 = localObject2;
          j = m;
        } while (!((d)localObject2).isEmpty());
        int k = m;
        if ((i != 0) && (k == 0))
        {
          localObject4 = x.n(s).Y((k)localObject1);
          if (!((d)localObject4).isEmpty())
          {
            localObject2 = x.e(s, (d)localObject4).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject1 = (j)((Iterator)localObject2).next();
              localObject4 = new x.r(s, (j)localObject1);
              localObject1 = ((j)localObject1).h();
              x.g(s).b(x.f(s, (i)localObject1), x.r.e((x.r)localObject4), (T3.g)localObject4, (x.p)localObject4);
            }
          }
        }
        if ((k == 0) && (!localList.isEmpty()) && (q == null)) {
          if (i != 0)
          {
            x.g(s).a(x.f(s, o), null);
          }
          else
          {
            localObject4 = localList.iterator();
            while (((Iterator)localObject4).hasNext())
            {
              localObject1 = (i)((Iterator)localObject4).next();
              localObject2 = s.b0((i)localObject1);
              boolean bool;
              if (localObject2 != null) {
                bool = true;
              } else {
                bool = false;
              }
              m.f(bool);
              x.g(s).a(x.f(s, (i)localObject1), (y)localObject2);
            }
          }
        }
        x.h(s, localList);
        localObject4 = localObject3;
      }
    }
    return (List)localObject4;
  }
}

/* Location:
 * Qualified Name:     V3.x.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */