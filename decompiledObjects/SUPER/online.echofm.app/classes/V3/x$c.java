package V3;

import S3.c;
import X3.e;
import Y3.d;
import a4.a;
import a4.j;
import d4.b;
import d4.g;
import d4.n;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

public class x$c
  implements Callable
{
  public x$c(x paramx, h paramh, boolean paramBoolean) {}
  
  public List a()
  {
    a4.i locali = o.e();
    k localk = locali.e();
    Object localObject1 = x.n(q);
    Object localObject2 = null;
    Object localObject3 = localk;
    Object localObject4;
    Object localObject5;
    int j;
    for (int i = 0; !((d)localObject1).isEmpty(); i = j)
    {
      localObject4 = (v)((d)localObject1).getValue();
      localObject5 = localObject2;
      j = i;
      if (localObject4 != null)
      {
        if (localObject2 == null) {
          localObject2 = ((v)localObject4).d((k)localObject3);
        }
        if ((i == 0) && (!((v)localObject4).h()))
        {
          j = 0;
          localObject5 = localObject2;
        }
        else
        {
          j = 1;
          localObject5 = localObject2;
        }
      }
      if (((k)localObject3).isEmpty()) {
        localObject2 = b.j("");
      } else {
        localObject2 = ((k)localObject3).Z();
      }
      localObject1 = ((d)localObject1).D((b)localObject2);
      localObject3 = ((k)localObject3).c0();
      localObject2 = localObject5;
    }
    localObject3 = (v)x.n(q).s(localk);
    if (localObject3 == null)
    {
      localObject3 = new v(x.c(q));
      localObject1 = q;
      x.o((x)localObject1, x.n((x)localObject1).W(localk, localObject3));
      j = i;
    }
    else
    {
      if ((i == 0) && (!((v)localObject3).h())) {
        j = 0;
      } else {
        j = 1;
      }
      if (localObject2 == null) {
        localObject2 = ((v)localObject3).d(k.Y());
      }
    }
    x.c(q).m(locali);
    if (localObject2 != null)
    {
      localObject2 = new a(d4.i.f((n)localObject2, locali.c()), true, false);
    }
    else
    {
      localObject1 = x.c(q).k(locali);
      if (((a)localObject1).f())
      {
        localObject2 = localObject1;
      }
      else
      {
        localObject2 = g.W();
        localObject5 = x.n(q).Y(localk).M().iterator();
        while (((Iterator)localObject5).hasNext())
        {
          localObject4 = (Map.Entry)((Iterator)localObject5).next();
          Object localObject6 = (v)((d)((Map.Entry)localObject4).getValue()).getValue();
          if (localObject6 != null)
          {
            localObject6 = ((v)localObject6).d(k.Y());
            if (localObject6 != null) {
              localObject2 = ((n)localObject2).N((b)((Map.Entry)localObject4).getKey(), (n)localObject6);
            }
          }
        }
        localObject1 = ((a)localObject1).b().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject5 = (d4.m)((Iterator)localObject1).next();
          if (!((n)localObject2).Q(((d4.m)localObject5).c())) {
            localObject2 = ((n)localObject2).N(((d4.m)localObject5).c(), ((d4.m)localObject5).d());
          }
        }
        localObject2 = new a(d4.i.f((n)localObject2, locali.c()), false, false);
      }
    }
    boolean bool = ((v)localObject3).k(locali);
    if ((!bool) && (!locali.g()))
    {
      Y3.m.g(x.p(q).containsKey(locali) ^ true, "View does not exist but we have a tag");
      localObject1 = x.q(q);
      x.p(q).put(locali, localObject1);
      x.r(q).put(localObject1, locali);
    }
    localObject1 = x.j(q).h(localk);
    localObject2 = ((v)localObject3).a(o, (G)localObject1, (a)localObject2);
    if ((!bool) && (j == 0) && (!p))
    {
      localObject3 = ((v)localObject3).l(locali);
      x.d(q, locali, (j)localObject3);
    }
    return (List)localObject2;
  }
}

/* Location:
 * Qualified Name:     V3.x.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */