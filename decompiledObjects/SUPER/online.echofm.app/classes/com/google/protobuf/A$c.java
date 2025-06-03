package com.google.protobuf;

import java.util.List;

public final class A$c
  extends A
{
  public A$c()
  {
    super(null);
  }
  
  public static t.e e(Object paramObject, long paramLong)
  {
    return (t.e)k0.C(paramObject, paramLong);
  }
  
  public void c(Object paramObject, long paramLong)
  {
    e(paramObject, paramLong).j();
  }
  
  public void d(Object paramObject1, Object paramObject2, long paramLong)
  {
    Object localObject = e(paramObject1, paramLong);
    t.e locale = e(paramObject2, paramLong);
    int i = ((List)localObject).size();
    int j = locale.size();
    paramObject2 = localObject;
    if (i > 0)
    {
      paramObject2 = localObject;
      if (j > 0)
      {
        paramObject2 = localObject;
        if (!((t.e)localObject).p()) {
          paramObject2 = ((t.e)localObject).h(j + i);
        }
        ((List)paramObject2).addAll(locale);
      }
    }
    localObject = locale;
    if (i > 0) {
      localObject = paramObject2;
    }
    k0.R(paramObject1, paramLong, localObject);
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.A.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */