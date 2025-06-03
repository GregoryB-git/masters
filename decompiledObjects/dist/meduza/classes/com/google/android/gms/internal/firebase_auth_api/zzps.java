package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzps
{
  private final Map<zzpu, zznh<?, ?>> zza;
  private final Map<zzpv, zznd<?>> zzb;
  private final Map<zzpu, zzou<?, ?>> zzc;
  private final Map<zzpv, zzoq<?>> zzd;
  
  public zzps()
  {
    zza = new HashMap();
    zzb = new HashMap();
    zzc = new HashMap();
    zzd = new HashMap();
  }
  
  public zzps(com.google.android.gms.internal.firebase-auth-api.zzpt paramzzpt)
  {
    zza = new HashMap(zzpt.zzb(paramzzpt));
    zzb = new HashMap(zzpt.zza(paramzzpt));
    zzc = new HashMap(zzpt.zzd(paramzzpt));
    zzd = new HashMap(zzpt.zzc(paramzzpt));
  }
  
  public final <SerializationT extends zzpq> zzps zza(zznd<SerializationT> paramzznd)
  {
    zzpv localzzpv = new zzpv(paramzznd.zzb(), paramzznd.zza(), null);
    if (zzb.containsKey(localzzpv))
    {
      zznd localzznd = (zznd)zzb.get(localzzpv);
      if ((!localzznd.equals(paramzznd)) || (!paramzznd.equals(localzznd))) {
        throw new GeneralSecurityException(f.j("Attempt to register non-equal parser for already existing object of type: ", String.valueOf(localzzpv)));
      }
    }
    else
    {
      zzb.put(localzzpv, paramzznd);
    }
    return this;
  }
  
  public final <KeyT extends zzbo, SerializationT extends zzpq> zzps zza(zznh<KeyT, SerializationT> paramzznh)
  {
    zzpu localzzpu = new zzpu(paramzznh.zza(), paramzznh.zzb(), null);
    if (zza.containsKey(localzzpu))
    {
      zznh localzznh = (zznh)zza.get(localzzpu);
      if ((!localzznh.equals(paramzznh)) || (!paramzznh.equals(localzznh))) {
        throw new GeneralSecurityException(f.j("Attempt to register non-equal serializer for already existing object of type: ", String.valueOf(localzzpu)));
      }
    }
    else
    {
      zza.put(localzzpu, paramzznh);
    }
    return this;
  }
  
  public final <SerializationT extends zzpq> zzps zza(zzoq<SerializationT> paramzzoq)
  {
    zzpv localzzpv = new zzpv(paramzzoq.zzb(), paramzzoq.zza(), null);
    if (zzd.containsKey(localzzpv))
    {
      zzoq localzzoq = (zzoq)zzd.get(localzzpv);
      if ((!localzzoq.equals(paramzzoq)) || (!paramzzoq.equals(localzzoq))) {
        throw new GeneralSecurityException(f.j("Attempt to register non-equal parser for already existing object of type: ", String.valueOf(localzzpv)));
      }
    }
    else
    {
      zzd.put(localzzpv, paramzzoq);
    }
    return this;
  }
  
  public final <ParametersT extends zzcg, SerializationT extends zzpq> zzps zza(zzou<ParametersT, SerializationT> paramzzou)
  {
    zzpu localzzpu = new zzpu(paramzzou.zza(), paramzzou.zzb(), null);
    if (zzc.containsKey(localzzpu))
    {
      zzou localzzou = (zzou)zzc.get(localzzpu);
      if ((!localzzou.equals(paramzzou)) || (!paramzzou.equals(localzzou))) {
        throw new GeneralSecurityException(f.j("Attempt to register non-equal serializer for already existing object of type: ", String.valueOf(localzzpu)));
      }
    }
    else
    {
      zzc.put(localzzpu, paramzzou);
    }
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzpt zza()
  {
    return new zzpt(this, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzps
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */