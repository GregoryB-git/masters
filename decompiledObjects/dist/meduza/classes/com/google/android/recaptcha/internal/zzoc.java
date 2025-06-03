package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzoc
  extends LinkedHashMap
{
  private static final zzoc zza;
  private boolean zzb = true;
  
  static
  {
    zzoc localzzoc = new zzoc();
    zza = localzzoc;
    zzb = false;
  }
  
  private zzoc() {}
  
  private zzoc(Map paramMap)
  {
    super(paramMap);
  }
  
  public static zzoc zza()
  {
    return zza;
  }
  
  private static int zzf(Object paramObject)
  {
    if ((paramObject instanceof byte[]))
    {
      paramObject = (byte[])paramObject;
      Charset localCharset = zznl.zza;
      int i = paramObject.length;
      int j = zznl.zzb(i, (byte[])paramObject, 0, i);
      i = j;
      if (j == 0) {
        i = 1;
      }
      return i;
    }
    if (!(paramObject instanceof zznf)) {
      return paramObject.hashCode();
    }
    throw new UnsupportedOperationException();
  }
  
  private final void zzg()
  {
    if (zzb) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    zzg();
    super.clear();
  }
  
  public final Set entrySet()
  {
    Set localSet;
    if (isEmpty()) {
      localSet = Collections.emptySet();
    } else {
      localSet = super.entrySet();
    }
    return localSet;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Map))
    {
      Map localMap = (Map)paramObject;
      if (this != localMap)
      {
        if (size() == localMap.size())
        {
          Iterator localIterator = entrySet().iterator();
          while (localIterator.hasNext())
          {
            Object localObject = (Map.Entry)localIterator.next();
            if (!localMap.containsKey(((Map.Entry)localObject).getKey())) {
              break label157;
            }
            paramObject = ((Map.Entry)localObject).getValue();
            localObject = localMap.get(((Map.Entry)localObject).getKey());
            boolean bool;
            if (((paramObject instanceof byte[])) && ((localObject instanceof byte[]))) {
              bool = Arrays.equals((byte[])paramObject, (byte[])localObject);
            } else {
              bool = paramObject.equals(localObject);
            }
            if (!bool) {
              break label157;
            }
          }
        }
      }
      else {
        return true;
      }
    }
    label157:
    return false;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = entrySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int j = zzf(localEntry.getKey());
      i += (zzf(localEntry.getValue()) ^ j);
    }
    return i;
  }
  
  public final Object put(Object paramObject1, Object paramObject2)
  {
    zzg();
    Charset localCharset = zznl.zza;
    paramObject1.getClass();
    paramObject2.getClass();
    return super.put(paramObject1, paramObject2);
  }
  
  public final void putAll(Map paramMap)
  {
    zzg();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      Charset localCharset = zznl.zza;
      localObject.getClass();
      paramMap.get(localObject).getClass();
    }
    super.putAll(paramMap);
  }
  
  public final Object remove(Object paramObject)
  {
    zzg();
    return super.remove(paramObject);
  }
  
  public final zzoc zzb()
  {
    zzoc localzzoc;
    if (isEmpty()) {
      localzzoc = new zzoc();
    } else {
      localzzoc = new zzoc(this);
    }
    return localzzoc;
  }
  
  public final void zzc()
  {
    zzb = false;
  }
  
  public final void zzd(zzoc paramzzoc)
  {
    zzg();
    if (!paramzzoc.isEmpty()) {
      putAll(paramzzoc);
    }
  }
  
  public final boolean zze()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzoc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */