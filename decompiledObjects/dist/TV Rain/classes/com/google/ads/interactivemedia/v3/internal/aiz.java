package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class aiz
{
  private static final Map<String, Class<?>> a;
  private static final Map<Class<?>, Class<?>> b;
  private static final Map<Class<?>, Class<?>> c;
  
  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    Object localObject1 = Boolean.TYPE;
    localHashMap.put("boolean", localObject1);
    localHashMap.put("byte", Byte.TYPE);
    localHashMap.put("char", Character.TYPE);
    localHashMap.put("short", Short.TYPE);
    Object localObject2 = Integer.TYPE;
    localHashMap.put("int", localObject2);
    Object localObject3 = Long.TYPE;
    localHashMap.put("long", localObject3);
    localHashMap.put("double", Double.TYPE);
    Object localObject4 = Float.TYPE;
    localHashMap.put("float", localObject4);
    localHashMap.put("void", Void.TYPE);
    localHashMap = new HashMap();
    b = localHashMap;
    localHashMap.put(localObject1, Boolean.class);
    localHashMap.put(Byte.TYPE, Byte.class);
    localHashMap.put(Character.TYPE, Character.class);
    localHashMap.put(Short.TYPE, Short.class);
    localHashMap.put(localObject2, Integer.class);
    localHashMap.put(localObject3, Long.class);
    localHashMap.put(Double.TYPE, Double.class);
    localHashMap.put(localObject4, Float.class);
    localObject1 = Void.TYPE;
    localHashMap.put(localObject1, localObject1);
    c = new HashMap();
    localObject4 = localHashMap.entrySet().iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject4).next();
      localObject1 = (Class)((Map.Entry)localObject2).getKey();
      localObject2 = (Class)((Map.Entry)localObject2).getValue();
      if (!localObject1.equals(localObject2)) {
        c.put(localObject2, localObject1);
      }
    }
    localObject4 = new HashMap();
    ((HashMap)localObject4).put("int", "I");
    ((HashMap)localObject4).put("boolean", "Z");
    ((HashMap)localObject4).put("float", "F");
    ((HashMap)localObject4).put("long", "J");
    ((HashMap)localObject4).put("short", "S");
    ((HashMap)localObject4).put("byte", "B");
    ((HashMap)localObject4).put("double", "D");
    ((HashMap)localObject4).put("char", "C");
    localObject1 = new HashMap();
    localObject3 = ((HashMap)localObject4).entrySet().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject3).next();
      ((HashMap)localObject1).put(((Map.Entry)localObject2).getValue(), ((Map.Entry)localObject2).getKey());
    }
    Collections.unmodifiableMap((Map)localObject4);
    Collections.unmodifiableMap((Map)localObject1);
  }
  
  public static boolean a(Class<?> paramClass)
  {
    if (paramClass == null) {
      return false;
    }
    return (paramClass.isPrimitive()) || (c.containsKey(paramClass));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aiz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */