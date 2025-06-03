package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class U4
{
  public static final U4 c = new U4();
  public final b5 a = new v4();
  public final ConcurrentMap b = new ConcurrentHashMap();
  
  public static U4 a()
  {
    return c;
  }
  
  public final Z4 b(Class paramClass)
  {
    a4.f(paramClass, "messageType");
    Z4 localZ4 = (Z4)b.get(paramClass);
    Object localObject = localZ4;
    if (localZ4 == null)
    {
      localObject = a.a(paramClass);
      a4.f(paramClass, "messageType");
      a4.f(localObject, "schema");
      paramClass = (Z4)b.putIfAbsent(paramClass, localObject);
      if (paramClass != null) {
        localObject = paramClass;
      }
    }
    return (Z4)localObject;
  }
  
  public final Z4 c(Object paramObject)
  {
    return b(paramObject.getClass());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.U4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */