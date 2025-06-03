package com.google.crypto.tink.shaded.protobuf;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class a0
{
  public static final a0 c = new a0();
  public final f0 a = new G();
  public final ConcurrentMap b = new ConcurrentHashMap();
  
  public static a0 a()
  {
    return c;
  }
  
  public e0 b(Class paramClass, e0 parame0)
  {
    z.b(paramClass, "messageType");
    z.b(parame0, "schema");
    return (e0)b.putIfAbsent(paramClass, parame0);
  }
  
  public e0 c(Class paramClass)
  {
    z.b(paramClass, "messageType");
    e0 locale0 = (e0)b.get(paramClass);
    Object localObject = locale0;
    if (locale0 == null)
    {
      localObject = a.a(paramClass);
      paramClass = b(paramClass, (e0)localObject);
      if (paramClass != null) {
        localObject = paramClass;
      }
    }
    return (e0)localObject;
  }
  
  public e0 d(Object paramObject)
  {
    return c(paramObject.getClass());
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */