package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class zzkm
{
  private static final Map zza;
  
  static
  {
    LinkedHashMap localLinkedHashMap1 = new LinkedHashMap(16);
    LinkedHashMap localLinkedHashMap2 = new LinkedHashMap(16);
    zzb(localLinkedHashMap1, localLinkedHashMap2, Boolean.TYPE, Boolean.class);
    zzb(localLinkedHashMap1, localLinkedHashMap2, Byte.TYPE, Byte.class);
    zzb(localLinkedHashMap1, localLinkedHashMap2, Character.TYPE, Character.class);
    zzb(localLinkedHashMap1, localLinkedHashMap2, Double.TYPE, Double.class);
    zzb(localLinkedHashMap1, localLinkedHashMap2, Float.TYPE, Float.class);
    zzb(localLinkedHashMap1, localLinkedHashMap2, Integer.TYPE, Integer.class);
    zzb(localLinkedHashMap1, localLinkedHashMap2, Long.TYPE, Long.class);
    zzb(localLinkedHashMap1, localLinkedHashMap2, Short.TYPE, Short.class);
    zzb(localLinkedHashMap1, localLinkedHashMap2, Void.TYPE, Void.class);
    zza = Collections.unmodifiableMap(localLinkedHashMap1);
    Collections.unmodifiableMap(localLinkedHashMap2);
  }
  
  public static Class zza(Class paramClass)
  {
    paramClass.getClass();
    Class localClass = (Class)zza.get(paramClass);
    if (localClass == null) {
      return paramClass;
    }
    return localClass;
  }
  
  private static void zzb(Map paramMap1, Map paramMap2, Class paramClass1, Class paramClass2)
  {
    paramMap1.put(paramClass1, paramClass2);
    paramMap2.put(paramClass2, paramClass1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzkm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */