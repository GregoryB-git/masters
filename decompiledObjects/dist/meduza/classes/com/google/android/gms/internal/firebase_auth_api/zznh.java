package com.google.android.gms.internal.firebase_auth_api;

public abstract class zznh<KeyT extends zzbo, SerializationT extends zzpq>
{
  private final Class<KeyT> zza;
  private final Class<SerializationT> zzb;
  
  private zznh(Class<KeyT> paramClass, Class<SerializationT> paramClass1)
  {
    zza = paramClass;
    zzb = paramClass1;
  }
  
  public static <KeyT extends zzbo, SerializationT extends zzpq> zznh<KeyT, SerializationT> zza(zznj<KeyT, SerializationT> paramzznj, Class<KeyT> paramClass, Class<SerializationT> paramClass1)
  {
    return new zzng(paramClass, paramClass1, paramzznj);
  }
  
  public abstract SerializationT zza(KeyT paramKeyT, zzcm paramzzcm);
  
  public final Class<KeyT> zza()
  {
    return zza;
  }
  
  public final Class<SerializationT> zzb()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zznh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */