package ma;

import java.util.List;

public final class i0$b
  extends i0
{
  public final void a(Object paramObject, long paramLong)
  {
    ((a0.d)t1.p(paramObject, paramLong)).b();
  }
  
  public final void b(Object paramObject1, long paramLong, Object paramObject2)
  {
    Object localObject = (a0.d)t1.p(paramObject1, paramLong);
    a0.d locald = (a0.d)t1.p(paramObject2, paramLong);
    int i = ((List)localObject).size();
    int j = locald.size();
    paramObject2 = localObject;
    if (i > 0)
    {
      paramObject2 = localObject;
      if (j > 0)
      {
        paramObject2 = localObject;
        if (!((a0.d)localObject).g()) {
          paramObject2 = ((a0.d)localObject).c(j + i);
        }
        ((List)paramObject2).addAll(locald);
      }
    }
    localObject = locald;
    if (i > 0) {
      localObject = paramObject2;
    }
    t1.z(paramObject1, paramLong, localObject);
  }
  
  public final <L> List<L> c(Object paramObject, long paramLong)
  {
    a0.d locald1 = (a0.d)t1.p(paramObject, paramLong);
    a0.d locald2 = locald1;
    if (!locald1.g())
    {
      int i = locald1.size();
      if (i == 0) {
        i = 10;
      } else {
        i *= 2;
      }
      locald2 = locald1.c(i);
      t1.z(paramObject, paramLong, locald2);
    }
    return locald2;
  }
}

/* Location:
 * Qualified Name:     ma.i0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */