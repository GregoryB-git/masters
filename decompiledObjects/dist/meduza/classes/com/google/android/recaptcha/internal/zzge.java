package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sb.m;

public final class zzge
{
  private final Map zza = new LinkedHashMap();
  private final Set zzb = new LinkedHashSet();
  
  private final List zzh(List paramList)
  {
    ArrayList localArrayList = new ArrayList(m.j(paramList));
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(zza((zzue)paramList.next()));
    }
    return localArrayList;
  }
  
  public final Object zza(zzue paramzzue)
  {
    int i = paramzzue.zzS();
    Object localObject = null;
    if (i != 0)
    {
      switch (i - 1)
      {
      default: 
        throw new zzce(4, 5, null);
      case 11: 
        return paramzzue.zzP();
      case 10: 
        return Double.valueOf(paramzzue.zzf());
      case 9: 
        return Float.valueOf(paramzzue.zzg());
      case 7: 
        return Long.valueOf(paramzzue.zzl());
      case 6: 
      case 8: 
        throw new zzce(4, 6, null);
      case 5: 
        return Integer.valueOf(paramzzue.zzk());
      case 4: 
        i = paramzzue.zzj();
        if ((i >= 32768) && (i <= 32767)) {
          localObject = Short.valueOf((short)i);
        } else {
          throw new zzce(4, 6, null);
        }
      case 3: 
        paramzzue = paramzzue.zzO();
        if (paramzzue.length() == 1) {
          localObject = Character.valueOf(paramzzue.charAt(0));
        } else {
          throw new zzce(4, 6, null);
        }
      case 2: 
        paramzzue = paramzzue.zzM().zzl();
        if (paramzzue.length == 1) {
          localObject = Byte.valueOf(paramzzue[0]);
        }
      case 12: 
        return localObject;
        throw new zzce(4, 6, null);
      case 1: 
        return Boolean.valueOf(paramzzue.zzQ());
      }
      return zza.get(Integer.valueOf(paramzzue.zzi()));
    }
    throw null;
  }
  
  public final Object zzb(int paramInt)
  {
    return zza.remove(Integer.valueOf(paramInt));
  }
  
  public final void zzc()
  {
    zza.clear();
  }
  
  public final void zzd(int paramInt, Object paramObject)
  {
    zze(173, paramObject);
    zzb.add(Integer.valueOf(173));
  }
  
  public final void zze(int paramInt, Object paramObject)
  {
    zza.put(Integer.valueOf(paramInt), paramObject);
  }
  
  public final Class[] zzf(List paramList)
  {
    Object localObject = zzh(paramList);
    paramList = new ArrayList(m.j((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramList.add(zzgc.zza(((Iterator)localObject).next()));
    }
    return (Class[])paramList.toArray(new Class[0]);
  }
  
  public final Object[] zzg(List paramList)
  {
    return zzh(paramList).toArray(new Object[0]);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzge
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */