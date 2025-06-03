package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzpt
{
  private final Map<zzpu, zznh<?, ?>> zza;
  private final Map<zzpv, zznd<?>> zzb;
  private final Map<zzpu, zzou<?, ?>> zzc;
  private final Map<zzpv, zzoq<?>> zzd;
  
  private zzpt(com.google.android.gms.internal.firebase-auth-api.zzps paramzzps)
  {
    zza = new HashMap(zzps.zzb(paramzzps));
    zzb = new HashMap(zzps.zza(paramzzps));
    zzc = new HashMap(zzps.zzd(paramzzps));
    zzd = new HashMap(zzps.zzc(paramzzps));
  }
  
  public final <SerializationT extends zzpq> zzbo zza(SerializationT paramSerializationT, zzcm paramzzcm)
  {
    zzpv localzzpv = new zzpv(paramSerializationT.getClass(), paramSerializationT.zzb(), null);
    if (zzb.containsKey(localzzpv)) {
      return ((zznd)zzb.get(localzzpv)).zza(paramSerializationT, paramzzcm);
    }
    throw new GeneralSecurityException(j.j("No Key Parser for requested key type ", String.valueOf(localzzpv), " available"));
  }
  
  public final <SerializationT extends zzpq> zzcg zza(SerializationT paramSerializationT)
  {
    zzpv localzzpv = new zzpv(paramSerializationT.getClass(), paramSerializationT.zzb(), null);
    if (zzd.containsKey(localzzpv)) {
      return ((zzoq)zzd.get(localzzpv)).zza(paramSerializationT);
    }
    throw new GeneralSecurityException(j.j("No Parameters Parser for requested key type ", String.valueOf(localzzpv), " available"));
  }
  
  public final <KeyT extends zzbo, SerializationT extends zzpq> SerializationT zza(KeyT paramKeyT, Class<SerializationT> paramClass, zzcm paramzzcm)
  {
    paramClass = new zzpu(paramKeyT.getClass(), paramClass, null);
    if (zza.containsKey(paramClass)) {
      return ((zznh)zza.get(paramClass)).zza(paramKeyT, paramzzcm);
    }
    throw new GeneralSecurityException(j.j("No Key serializer for ", String.valueOf(paramClass), " available"));
  }
  
  public final <ParametersT extends zzcg, SerializationT extends zzpq> SerializationT zza(ParametersT paramParametersT, Class<SerializationT> paramClass)
  {
    paramClass = new zzpu(paramParametersT.getClass(), paramClass, null);
    if (zzc.containsKey(paramClass)) {
      return ((zzou)zzc.get(paramClass)).zza(paramParametersT);
    }
    throw new GeneralSecurityException(j.j("No Key Format serializer for ", String.valueOf(paramClass), " available"));
  }
  
  public final <SerializationT extends zzpq> boolean zzb(SerializationT paramSerializationT)
  {
    paramSerializationT = new zzpv(paramSerializationT.getClass(), paramSerializationT.zzb(), null);
    return zzb.containsKey(paramSerializationT);
  }
  
  public final <SerializationT extends zzpq> boolean zzc(SerializationT paramSerializationT)
  {
    paramSerializationT = new zzpv(paramSerializationT.getClass(), paramSerializationT.zzb(), null);
    return zzd.containsKey(paramSerializationT);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzpt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */