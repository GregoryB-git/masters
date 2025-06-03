package androidx.datastore.preferences.protobuf;

import java.util.List;

public final class E$c
  extends E
{
  public E$c()
  {
    super(null);
  }
  
  public static y.b f(Object paramObject, long paramLong)
  {
    return (y.b)p0.A(paramObject, paramLong);
  }
  
  public void c(Object paramObject, long paramLong)
  {
    f(paramObject, paramLong).j();
  }
  
  public void d(Object paramObject1, Object paramObject2, long paramLong)
  {
    Object localObject = f(paramObject1, paramLong);
    y.b localb = f(paramObject2, paramLong);
    int i = ((List)localObject).size();
    int j = localb.size();
    paramObject2 = localObject;
    if (i > 0)
    {
      paramObject2 = localObject;
      if (j > 0)
      {
        paramObject2 = localObject;
        if (!((y.b)localObject).p()) {
          paramObject2 = ((y.b)localObject).h(j + i);
        }
        ((List)paramObject2).addAll(localb);
      }
    }
    localObject = localb;
    if (i > 0) {
      localObject = paramObject2;
    }
    p0.O(paramObject1, paramLong, localObject);
  }
  
  public List e(Object paramObject, long paramLong)
  {
    y.b localb1 = f(paramObject, paramLong);
    y.b localb2 = localb1;
    if (!localb1.p())
    {
      int i = localb1.size();
      if (i == 0) {
        i = 10;
      } else {
        i *= 2;
      }
      localb2 = localb1.h(i);
      p0.O(paramObject, paramLong, localb2);
    }
    return localb2;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.E.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */