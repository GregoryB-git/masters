package com.google.android.gms.internal.measurement;

import java.util.List;

public final class r4
  extends q4
{
  public r4()
  {
    super(null);
  }
  
  public static h4 e(Object paramObject, long paramLong)
  {
    return (h4)D5.B(paramObject, paramLong);
  }
  
  public final void b(Object paramObject1, Object paramObject2, long paramLong)
  {
    Object localObject = e(paramObject1, paramLong);
    h4 localh4 = e(paramObject2, paramLong);
    int i = ((List)localObject).size();
    int j = localh4.size();
    paramObject2 = localObject;
    if (i > 0)
    {
      paramObject2 = localObject;
      if (j > 0)
      {
        paramObject2 = localObject;
        if (!((h4)localObject).c()) {
          paramObject2 = ((h4)localObject).e(j + i);
        }
        ((List)paramObject2).addAll(localh4);
      }
    }
    localObject = localh4;
    if (i > 0) {
      localObject = paramObject2;
    }
    D5.j(paramObject1, paramLong, localObject);
  }
  
  public final void d(Object paramObject, long paramLong)
  {
    e(paramObject, paramLong).G();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.r4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */