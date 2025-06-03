package t2;

import dc.l;
import ec.i;
import f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sb.q;
import u2.d;
import v2.g;
import v2.n;
import x2.s;

public final class e
{
  public final List<d<?>> a;
  
  public e(n paramn)
  {
    a = paramn;
  }
  
  public final boolean a(s params)
  {
    Object localObject1 = a;
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = ((Iterable)localObject1).iterator();
    Object localObject3;
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      int i = 1;
      if (!bool) {
        break;
      }
      localObject3 = ((Iterator)localObject2).next();
      localObject1 = (d)localObject3;
      localObject1.getClass();
      if ((!((d)localObject1).b(params)) || (!((d)localObject1).c(a.a()))) {
        i = 0;
      }
      if (i != 0) {
        localArrayList.add(localObject3);
      }
    }
    if ((localArrayList.isEmpty() ^ true))
    {
      localObject3 = o2.j.d();
      localObject1 = h.a;
      localObject2 = f.l("Work ");
      ((StringBuilder)localObject2).append(a);
      ((StringBuilder)localObject2).append(" constrained by ");
      ((StringBuilder)localObject2).append(q.p(localArrayList, null, null, null, a.a, 31));
      ((o2.j)localObject3).a((String)localObject1, ((StringBuilder)localObject2).toString());
    }
    return localArrayList.isEmpty();
  }
  
  public static final class a
    extends ec.j
    implements l<d<?>, CharSequence>
  {
    public static final a a = new a();
    
    public a()
    {
      super();
    }
    
    public final Object invoke(Object paramObject)
    {
      paramObject = (d)paramObject;
      i.e(paramObject, "it");
      return paramObject.getClass().getSimpleName();
    }
  }
}

/* Location:
 * Qualified Name:     t2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */