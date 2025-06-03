package com.google.android.gms.internal.firebase_auth_api;

public abstract class zzoy<KeyT extends zzbo, PrimitiveT>
{
  private final Class<KeyT> zza;
  private final Class<PrimitiveT> zzb;
  
  private zzoy(Class<KeyT> paramClass, Class<PrimitiveT> paramClass1)
  {
    zza = paramClass;
    zzb = paramClass1;
  }
  
  public static <KeyT extends zzbo, PrimitiveT> zzoy<KeyT, PrimitiveT> zza(zzpa<KeyT, PrimitiveT> paramzzpa, Class<KeyT> paramClass, Class<PrimitiveT> paramClass1)
  {
    return new zzpb(paramClass, paramClass1, paramzzpa);
  }
  
  public final Class<KeyT> zza()
  {
    return zza;
  }
  
  public abstract PrimitiveT zza(KeyT paramKeyT);
  
  public final Class<PrimitiveT> zzb()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzoy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */