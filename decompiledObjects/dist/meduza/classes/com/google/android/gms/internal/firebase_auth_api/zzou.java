package com.google.android.gms.internal.firebase_auth_api;

public abstract class zzou<ParametersT extends zzcg, SerializationT extends zzpq>
{
  private final Class<ParametersT> zza;
  private final Class<SerializationT> zzb;
  
  private zzou(Class<ParametersT> paramClass, Class<SerializationT> paramClass1)
  {
    zza = paramClass;
    zzb = paramClass1;
  }
  
  public static <ParametersT extends zzcg, SerializationT extends zzpq> zzou<ParametersT, SerializationT> zza(zzow<ParametersT, SerializationT> paramzzow, Class<ParametersT> paramClass, Class<SerializationT> paramClass1)
  {
    return new zzox(paramClass, paramClass1, paramzzow);
  }
  
  public abstract SerializationT zza(ParametersT paramParametersT);
  
  public final Class<ParametersT> zza()
  {
    return zza;
  }
  
  public final Class<SerializationT> zzb()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzou
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */