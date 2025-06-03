package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

final class zzeq
{
  private static final zzeq zzb = new zzeq(true);
  public final zzgv zza;
  private boolean zzc;
  private boolean zzd;
  
  private zzeq()
  {
    zza = new zzgl(16);
  }
  
  private zzeq(boolean paramBoolean)
  {
    zza = localzzgl;
    zzb();
    zzb();
  }
  
  public static zzeq zza()
  {
    throw null;
  }
  
  private static final void zzd(zzep paramzzep, Object paramObject)
  {
    zzho localzzho = paramzzep.zzb();
    Object localObject = zzfa.zza;
    paramObject.getClass();
    localObject = zzho.zza;
    localObject = zzhp.zza;
    boolean bool;
    switch (localzzho.zza().ordinal())
    {
    default: 
      break;
    case 8: 
      if ((paramObject instanceof zzfx)) {
        break label190;
      }
      if (!(paramObject instanceof zzfc)) {
        break label191;
      }
    case 7: 
      if ((goto 190) || ((paramObject instanceof Integer))) {
        break label190;
      }
      if (!(paramObject instanceof zzex)) {
        break label191;
      }
    case 6: 
      if ((goto 190) || ((paramObject instanceof zzef))) {
        break label190;
      }
      if (!(paramObject instanceof byte[])) {
        break label191;
      }
      break;
    case 5: 
      bool = paramObject instanceof String;
      break;
    case 4: 
      bool = paramObject instanceof Boolean;
      break;
    case 3: 
      bool = paramObject instanceof Double;
      break;
    case 2: 
      bool = paramObject instanceof Float;
      break;
    case 1: 
      bool = paramObject instanceof Long;
      break;
    case 0: 
      bool = paramObject instanceof Integer;
    }
    if (bool) {
      label190:
      return;
    }
    label191:
    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[] { Integer.valueOf(paramzzep.zza()), paramzzep.zzb().zza(), paramObject.getClass().getName() }));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzeq)) {
      return false;
    }
    paramObject = (zzeq)paramObject;
    return zza.equals(zza);
  }
  
  public final int hashCode()
  {
    return zza.hashCode();
  }
  
  public final void zzb()
  {
    if (!zzc)
    {
      for (int i = 0; i < zza.zzb(); i++)
      {
        Map.Entry localEntry = zza.zzg(i);
        if ((localEntry.getValue() instanceof zzev)) {
          ((zzev)localEntry.getValue()).zzi();
        }
      }
      zza.zza();
      zzc = true;
    }
  }
  
  public final void zzc(zzep paramzzep, Object paramObject)
  {
    if (paramzzep.zzc())
    {
      if ((paramObject instanceof List))
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll((List)paramObject);
        int i = localArrayList.size();
        for (int j = 0; j < i; j++) {
          zzd(paramzzep, localArrayList.get(j));
        }
        paramObject = localArrayList;
      }
      else
      {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    else {
      zzd(paramzzep, paramObject);
    }
    if ((paramObject instanceof zzfc)) {
      zzd = true;
    }
    zza.zze(paramzzep, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzeq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */