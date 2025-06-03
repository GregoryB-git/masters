package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzh
{
  private final zzh zza;
  private zzbb zzb;
  private Map<String, zzaq> zzc = new HashMap();
  private Map<String, Boolean> zzd = new HashMap();
  
  public zzh(zzh paramzzh, zzbb paramzzbb)
  {
    zza = paramzzh;
    zzb = paramzzbb;
  }
  
  public final zzaq zza(zzaf paramzzaf)
  {
    Object localObject = zzaq.zzc;
    Iterator localIterator = paramzzaf.zzg();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      zzaq localzzaq = zzb.zza(this, paramzzaf.zza(i));
      localObject = localzzaq;
      if ((localzzaq instanceof zzaj)) {
        localObject = localzzaq;
      }
    }
    return (zzaq)localObject;
  }
  
  public final zzaq zza(zzaq paramzzaq)
  {
    return zzb.zza(this, paramzzaq);
  }
  
  public final zzaq zza(String paramString)
  {
    zzh localzzh = this;
    do
    {
      if (zzc.containsKey(paramString)) {
        return (zzaq)zzc.get(paramString);
      }
      localzzh = zza;
    } while (localzzh != null);
    throw new IllegalArgumentException(String.format("%s is not defined", new Object[] { paramString }));
  }
  
  public final zzh zza()
  {
    return new zzh(this, zzb);
  }
  
  public final void zza(String paramString, zzaq paramzzaq)
  {
    if (!zzd.containsKey(paramString))
    {
      if (paramzzaq == null)
      {
        zzc.remove(paramString);
        return;
      }
      zzc.put(paramString, paramzzaq);
    }
  }
  
  public final void zzb(String paramString, zzaq paramzzaq)
  {
    zza(paramString, paramzzaq);
    zzd.put(paramString, Boolean.TRUE);
  }
  
  public final boolean zzb(String paramString)
  {
    zzh localzzh = this;
    do
    {
      if (zzc.containsKey(paramString)) {
        return true;
      }
      localzzh = zza;
    } while (localzzh != null);
    return false;
  }
  
  public final void zzc(String paramString, zzaq paramzzaq)
  {
    for (zzh localzzh1 = this; !zzc.containsKey(paramString); localzzh1 = zza)
    {
      zzh localzzh2 = zza;
      if ((localzzh2 == null) || (!localzzh2.zzb(paramString))) {
        break;
      }
    }
    if (!zzd.containsKey(paramString))
    {
      if (paramzzaq == null)
      {
        zzc.remove(paramString);
        return;
      }
      zzc.put(paramString, paramzzaq);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */