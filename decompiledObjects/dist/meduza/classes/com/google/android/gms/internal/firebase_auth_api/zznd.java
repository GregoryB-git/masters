package com.google.android.gms.internal.firebase_auth_api;

public abstract class zznd<SerializationT extends zzpq>
{
  private final com.google.android.gms.internal.firebase-auth-api.zzzn zza;
  private final Class<SerializationT> zzb;
  
  private zznd(zzzn paramzzzn, Class<SerializationT> paramClass)
  {
    zza = paramzzzn;
    zzb = paramClass;
  }
  
  public static <SerializationT extends zzpq> zznd<SerializationT> zza(zznf<SerializationT> paramzznf, zzzn paramzzzn, Class<SerializationT> paramClass)
  {
    return new zznc(paramzzzn, paramClass, paramzznf);
  }
  
  public abstract zzbo zza(SerializationT paramSerializationT, zzcm paramzzcm);
  
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zznd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */