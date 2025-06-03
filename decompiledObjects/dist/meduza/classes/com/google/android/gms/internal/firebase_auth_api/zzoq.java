package com.google.android.gms.internal.firebase_auth_api;

public abstract class zzoq<SerializationT extends zzpq>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzzn zza;
  private final Class<SerializationT> zzb;
  
  private zzoq(zzzn paramzzzn, Class<SerializationT> paramClass)
  {
    zza = paramzzzn;
    zzb = paramClass;
  }
  
  public static <SerializationT extends zzpq> zzoq<SerializationT> zza(zzos<SerializationT> paramzzos, zzzn paramzzzn, Class<SerializationT> paramClass)
  {
    return new zzot(paramzzzn, paramClass, paramzzos);
  }
  
  public abstract zzcg zza(SerializationT paramSerializationT);
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzn zza()
  {
    return zza;
  }
  
  public final Class<SerializationT> zzb()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzoq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */