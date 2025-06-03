package com.google.android.gms.internal.fido;

import f;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class zzba
  implements Map, Serializable
{
  public static final Map.Entry[] zza = new Map.Entry[0];
  private transient zzbc zzb;
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean containsKey(Object paramObject)
  {
    return get(paramObject) != null;
  }
  
  public final boolean containsValue(Object paramObject)
  {
    return zza().contains(paramObject);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject)
    {
      bool = true;
    }
    else
    {
      if ((paramObject instanceof Map)) {
        break label21;
      }
      bool = false;
    }
    return bool;
    label21:
    paramObject = (Map)paramObject;
    return entrySet().equals(((Map)paramObject).entrySet());
  }
  
  public abstract Object get(Object paramObject);
  
  public final Object getOrDefault(Object paramObject1, Object paramObject2)
  {
    paramObject1 = get(paramObject1);
    if (paramObject1 != null) {
      return paramObject1;
    }
    return paramObject2;
  }
  
  public final int hashCode()
  {
    return zzbx.zza(zzc());
  }
  
  public final boolean isEmpty()
  {
    return size() == 0;
  }
  
  @Deprecated
  public final Object put(Object paramObject1, Object paramObject2)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void putAll(Map paramMap)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final Object remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final String toString()
  {
    int i = size();
    if (i >= 0)
    {
      StringBuilder localStringBuilder = new StringBuilder((int)Math.min(i * 8L, 1073741824L));
      localStringBuilder.append('{');
      Iterator localIterator = entrySet().iterator();
      for (i = 1; localIterator.hasNext(); i = 0)
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (i == 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append(localEntry.getKey());
        localStringBuilder.append('=');
        localStringBuilder.append(localEntry.getValue());
      }
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    throw new IllegalArgumentException(f.h("size cannot be negative but was: ", i));
  }
  
  public zzav zza()
  {
    throw null;
  }
  
  public abstract zzbc zzb();
  
  public final zzbc zzc()
  {
    zzbc localzzbc1 = zzb;
    zzbc localzzbc2 = localzzbc1;
    if (localzzbc1 == null)
    {
      localzzbc2 = zzb();
      zzb = localzzbc2;
    }
    return localzzbc2;
  }
  
  public zzbc zzd()
  {
    throw null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzba
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */