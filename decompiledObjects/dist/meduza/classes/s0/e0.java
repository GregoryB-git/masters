package s0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class e0
{
  public static final a a = new a();
  public static final b b = new b();
  
  public abstract void a(Object paramObject, long paramLong);
  
  public abstract void b(Object paramObject1, long paramLong, Object paramObject2);
  
  public abstract <L> List<L> c(Object paramObject, long paramLong);
  
  public static final class a
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
  
  public static final class b
    extends e0
  {
    public final void a(Object paramObject, long paramLong)
    {
      ((x.c)l1.n(paramObject, paramLong)).b();
    }
    
    public final void b(Object paramObject1, long paramLong, Object paramObject2)
    {
      Object localObject = (x.c)l1.n(paramObject1, paramLong);
      x.c localc = (x.c)l1.n(paramObject2, paramLong);
      int i = ((List)localObject).size();
      int j = localc.size();
      paramObject2 = localObject;
      if (i > 0)
      {
        paramObject2 = localObject;
        if (j > 0)
        {
          paramObject2 = localObject;
          if (!((x.c)localObject).g()) {
            paramObject2 = ((x.c)localObject).c(j + i);
          }
          ((List)paramObject2).addAll(localc);
        }
      }
      localObject = localc;
      if (i > 0) {
        localObject = paramObject2;
      }
      l1.u(paramObject1, paramLong, localObject);
    }
    
    public final <L> List<L> c(Object paramObject, long paramLong)
    {
      x.c localc1 = (x.c)l1.n(paramObject, paramLong);
      x.c localc2 = localc1;
      if (!localc1.g())
      {
        int i = localc1.size();
        if (i == 0) {
          i = 10;
        } else {
          i *= 2;
        }
        localc2 = localc1.c(i);
        l1.u(paramObject, paramLong, localc2);
      }
      return localc2;
    }
  }
}

/* Location:
 * Qualified Name:     s0.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */