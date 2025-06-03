package com.google.protobuf;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class W
{
  public static final W c = new W();
  public final a0 a = new C();
  public final ConcurrentMap b = new ConcurrentHashMap();
  
  public static W a()
  {
    return c;
  }
  
  public Z b(Class paramClass, Z paramZ)
  {
    t.b(paramClass, "messageType");
    t.b(paramZ, "schema");
    return (Z)b.putIfAbsent(paramClass, paramZ);
  }
  
  public Z c(Class paramClass)
  {
    t.b(paramClass, "messageType");
    Z localZ = (Z)b.get(paramClass);
    Object localObject = localZ;
    if (localZ == null)
    {
      localObject = a.a(paramClass);
      paramClass = b(paramClass, (Z)localObject);
      if (paramClass != null) {
        localObject = paramClass;
      }
    }
    return (Z)localObject;
  }
  
  public Z d(Object paramObject)
  {
    return c(paramObject.getClass());
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.W
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */