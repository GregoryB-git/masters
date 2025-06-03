package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class acu<T extends Enum<T>>
  extends yn<T>
{
  private final Map<String, T> a = new HashMap();
  private final Map<T, String> b = new HashMap();
  
  public acu(Class<T> paramClass)
  {
    try
    {
      for (Enum localEnum : (Enum[])paramClass.getEnumConstants())
      {
        Object localObject1 = localEnum.name();
        Object localObject2 = (yr)paramClass.getField((String)localObject1).getAnnotation(yr.class);
        if (localObject2 != null)
        {
          String str = ((yr)localObject2).a();
          localObject2 = ((yr)localObject2).b();
          int k = localObject2.length;
          for (int m = 0;; m++)
          {
            localObject1 = str;
            if (m >= k) {
              break;
            }
            localObject1 = localObject2[m];
            a.put(localObject1, localEnum);
          }
        }
        a.put(localObject1, localEnum);
        b.put(localEnum, localObject1);
      }
      return;
    }
    catch (NoSuchFieldException paramClass)
    {
      throw new AssertionError(paramClass);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.acu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */