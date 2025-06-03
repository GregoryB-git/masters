package s0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class e0$a
  extends e0
{
  public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  public static List d(Object paramObject, int paramInt, long paramLong)
  {
    List localList = (List)l1.n(paramObject, paramLong);
    if (localList.isEmpty())
    {
      if ((localList instanceof d0))
      {
        localObject = new c0(paramInt);
        break label169;
      }
      if ((!(localList instanceof x0)) || (!(localList instanceof x.c))) {}
    }
    label169:
    label179:
    x.c localc;
    for (Object localObject = ((x.c)localList).c(paramInt);; localObject = localc.c(localList.size() + paramInt))
    {
      break label169;
      localObject = new ArrayList(paramInt);
      break label169;
      if (c.isAssignableFrom(localList.getClass()))
      {
        localObject = new ArrayList(localList.size() + paramInt);
        ((ArrayList)localObject).addAll(localList);
      }
      for (;;)
      {
        break;
        if (!(localList instanceof k1)) {
          break label179;
        }
        localObject = new c0(localList.size() + paramInt);
        ((c0)localObject).addAll((k1)localList);
      }
      l1.u(paramObject, paramLong, localObject);
      break;
      localObject = localList;
      if (!(localList instanceof x0)) {
        break;
      }
      localObject = localList;
      if (!(localList instanceof x.c)) {
        break;
      }
      localc = (x.c)localList;
      localObject = localList;
      if (localc.g()) {
        break;
      }
    }
    return (List)localObject;
  }
  
  public final void a(Object paramObject, long paramLong)
  {
    Object localObject = (List)l1.n(paramObject, paramLong);
    if ((localObject instanceof d0))
    {
      localObject = ((d0)localObject).e();
    }
    else
    {
      if (c.isAssignableFrom(localObject.getClass())) {
        return;
      }
      if (((localObject instanceof x0)) && ((localObject instanceof x.c)))
      {
        paramObject = (x.c)localObject;
        if (((x.c)paramObject).g()) {
          ((x.c)paramObject).b();
        }
        return;
      }
      localObject = Collections.unmodifiableList((List)localObject);
    }
    l1.u(paramObject, paramLong, localObject);
  }
  
  public final void b(Object paramObject1, long paramLong, Object paramObject2)
  {
    paramObject2 = (List)l1.n(paramObject2, paramLong);
    List localList = d(paramObject1, ((List)paramObject2).size(), paramLong);
    int i = localList.size();
    int j = ((List)paramObject2).size();
    if ((i > 0) && (j > 0)) {
      localList.addAll((Collection)paramObject2);
    }
    if (i > 0) {
      paramObject2 = localList;
    }
    l1.u(paramObject1, paramLong, paramObject2);
  }
  
  public final <L> List<L> c(Object paramObject, long paramLong)
  {
    return d(paramObject, 10, paramLong);
  }
}

/* Location:
 * Qualified Name:     s0.e0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */