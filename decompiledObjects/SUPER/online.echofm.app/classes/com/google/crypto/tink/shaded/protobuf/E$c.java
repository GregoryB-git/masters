package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

public final class E$c
  extends E
{
  public E$c()
  {
    super(null);
  }
  
  public static z.d f(Object paramObject, long paramLong)
  {
    return (z.d)o0.C(paramObject, paramLong);
  }
  
  public void c(Object paramObject, long paramLong)
  {
    f(paramObject, paramLong).j();
  }
  
  public void d(Object paramObject1, Object paramObject2, long paramLong)
  {
    Object localObject = f(paramObject1, paramLong);
    z.d locald = f(paramObject2, paramLong);
    int i = ((List)localObject).size();
    int j = locald.size();
    paramObject2 = localObject;
    if (i > 0)
    {
      paramObject2 = localObject;
      if (j > 0)
      {
        paramObject2 = localObject;
        if (!((z.d)localObject).p()) {
          paramObject2 = ((z.d)localObject).h(j + i);
        }
        ((List)paramObject2).addAll(locald);
      }
    }
    localObject = locald;
    if (i > 0) {
      localObject = paramObject2;
    }
    o0.R(paramObject1, paramLong, localObject);
  }
  
  public List e(Object paramObject, long paramLong)
  {
    z.d locald1 = f(paramObject, paramLong);
    z.d locald2 = locald1;
    if (!locald1.p())
    {
      int i = locald1.size();
      if (i == 0) {
        i = 10;
      } else {
        i *= 2;
      }
      locald2 = locald1.h(i);
      o0.R(paramObject, paramLong, locald2);
    }
    return locald2;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.E.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */