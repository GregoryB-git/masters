package com.google.android.gms.internal.auth;

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

public final class zzfr
  extends LinkedHashMap
{
  private static final zzfr zza;
  private boolean zzb = true;
  
  static
  {
    zzfr localzzfr = new zzfr();
    zza = localzzfr;
    zzb = false;
  }
  
  private zzfr() {}
  
  private zzfr(Map paramMap)
  {
    super(paramMap);
  }
  
  public static zzfr zza()
  {
    return zza;
  }
  
  private static int zzf(Object paramObject)
  {
    if ((paramObject instanceof byte[]))
    {
      byte[] arrayOfByte = (byte[])paramObject;
      paramObject = zzfa.zza;
      int i = arrayOfByte.length;
      int j = zzfa.zzb(i, arrayOfByte, 0, i);
      i = j;
      if (j == 0) {
        i = 1;
      }
      return i;
    }
    if (!(paramObject instanceof zzex)) {
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
      paramObject = (Map)paramObject;
      if (this != paramObject)
      {
        if (size() == ((Map)paramObject).size())
        {
          Iterator localIterator = entrySet().iterator();
          while (localIterator.hasNext())
          {
            Object localObject1 = (Map.Entry)localIterator.next();
            if (!((Map)paramObject).containsKey(((Map.Entry)localObject1).getKey())) {
              break label153;
            }
            Object localObject2 = ((Map.Entry)localObject1).getValue();
            localObject1 = ((Map)paramObject).get(((Map.Entry)localObject1).getKey());
            boolean bool;
            if (((localObject2 instanceof byte[])) && ((localObject1 instanceof byte[]))) {
              bool = Arrays.equals((byte[])localObject2, (byte[])localObject1);
            } else {
              bool = localObject2.equals(localObject1);
            }
            if (!bool) {
              break label153;
            }
          }
        }
      }
      else {
        return true;
      }
    }
    label153:
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
    Charset localCharset = zzfa.zza;
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
      Charset localCharset = zzfa.zza;
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
  
  public final zzfr zzb()
  {
    zzfr localzzfr;
    if (isEmpty()) {
      localzzfr = new zzfr();
    } else {
      localzzfr = new zzfr(this);
    }
    return localzzfr;
  }
  
  public final void zzc()
  {
    zzb = false;
  }
  
  public final void zzd(zzfr paramzzfr)
  {
    zzg();
    if (!paramzzfr.isEmpty()) {
      putAll(paramzzfr);
    }
  }
  
  public final boolean zze()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzfr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */