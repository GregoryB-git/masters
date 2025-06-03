package s0;

import java.util.List;

public final class e0$b
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

/* Location:
 * Qualified Name:     s0.e0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */