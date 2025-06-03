package ma;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class i0$a
  extends i0
{
  public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  public static List d(Object paramObject, int paramInt, long paramLong)
  {
    List localList = (List)t1.p(paramObject, paramLong);
    if (localList.isEmpty())
    {
      if ((localList instanceof h0))
      {
        localObject = new g0(paramInt);
        break label169;
      }
      if ((!(localList instanceof c1)) || (!(localList instanceof a0.d))) {}
    }
    label169:
    label179:
    a0.d locald;
    for (Object localObject = ((a0.d)localList).c(paramInt);; localObject = locald.c(localList.size() + paramInt))
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
        if (!(localList instanceof s1)) {
          break label179;
        }
        localObject = new g0(localList.size() + paramInt);
        ((g0)localObject).addAll((s1)localList);
      }
      t1.z(paramObject, paramLong, localObject);
      break;
      localObject = localList;
      if (!(localList instanceof c1)) {
        break;
      }
      localObject = localList;
      if (!(localList instanceof a0.d)) {
        break;
      }
      locald = (a0.d)localList;
      localObject = localList;
      if (locald.g()) {
        break;
      }
    }
    return (List)localObject;
  }
  
  public final void a(Object paramObject, long paramLong)
  {
    Object localObject = (List)t1.p(paramObject, paramLong);
    if ((localObject instanceof h0))
    {
      localObject = ((h0)localObject).e();
    }
    else
    {
      if (c.isAssignableFrom(localObject.getClass())) {
        return;
      }
      if (((localObject instanceof c1)) && ((localObject instanceof a0.d)))
      {
        paramObject = (a0.d)localObject;
        if (((a0.d)paramObject).g()) {
          ((a0.d)paramObject).b();
        }
        return;
      }
      localObject = Collections.unmodifiableList((List)localObject);
    }
    t1.z(paramObject, paramLong, localObject);
  }
  
  public final void b(Object paramObject1, long paramLong, Object paramObject2)
  {
    paramObject2 = (List)t1.p(paramObject2, paramLong);
    List localList = d(paramObject1, ((List)paramObject2).size(), paramLong);
    int i = localList.size();
    int j = ((List)paramObject2).size();
    if ((i > 0) && (j > 0)) {
      localList.addAll((Collection)paramObject2);
    }
    if (i > 0) {
      paramObject2 = localList;
    }
    t1.z(paramObject1, paramLong, paramObject2);
  }
  
  public final <L> List<L> c(Object paramObject, long paramLong)
  {
    return d(paramObject, 10, paramLong);
  }
}

/* Location:
 * Qualified Name:     ma.i0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */