package com.google.android.gms.internal.firebase_auth_api;

import java.util.concurrent.atomic.AtomicReference;

public final class zzon
{
  private static com.google.android.gms.internal.firebase-auth-api.zzon zza = new zzon();
  private final AtomicReference<zzpc> zzb = new AtomicReference(zzpc.zza().zza());
  
  public static com.google.android.gms.internal.firebase-auth-api.zzon zza()
  {
    return zza;
  }
  
  public final <WrapperPrimitiveT> Class<?> zza(Class<WrapperPrimitiveT> paramClass)
  {
    return ((zzpc)zzb.get()).zza(paramClass);
  }
  
  public final <KeyT extends zzbo, PrimitiveT> PrimitiveT zza(KeyT paramKeyT, Class<PrimitiveT> paramClass)
  {
    return (PrimitiveT)((zzpc)zzb.get()).zza(paramKeyT, paramClass);
  }
  
  public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzpg<InputPrimitiveT> paramzzpg, Class<WrapperPrimitiveT> paramClass)
  {
    return (WrapperPrimitiveT)((zzpc)zzb.get()).zza(paramzzpg, paramClass);
  }
  
  public final <KeyT extends zzbo, PrimitiveT> void zza(zzoy<KeyT, PrimitiveT> paramzzoy)
  {
    try
    {
      paramzzoy = zzpc.zza((zzpc)zzb.get()).zza(paramzzoy).zza();
      zzb.set(paramzzoy);
      return;
    }
    finally
    {
      paramzzoy = finally;
      throw paramzzoy;
    }
  }
  
  public final <InputPrimitiveT, WrapperPrimitiveT> void zza(zzpk<InputPrimitiveT, WrapperPrimitiveT> paramzzpk)
  {
    try
    {
      paramzzpk = zzpc.zza((zzpc)zzb.get()).zza(paramzzpk).zza();
      zzb.set(paramzzpk);
      return;
    }
    finally
    {
      paramzzpk = finally;
      throw paramzzpk;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzon
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */