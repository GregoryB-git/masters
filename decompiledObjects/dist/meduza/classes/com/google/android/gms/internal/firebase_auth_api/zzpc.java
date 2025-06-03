package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import f;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzpc
{
  private final Map<zzpe, zzoy<?, ?>> zza;
  private final Map<Class<?>, zzpk<?, ?>> zzb;
  
  private zzpc(com.google.android.gms.internal.firebase-auth-api.zzpf paramzzpf)
  {
    zza = new HashMap(zzpf.zza(paramzzpf));
    zzb = new HashMap(zzpf.zzb(paramzzpf));
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzpf zza()
  {
    return new zzpf(null);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzpf zza(com.google.android.gms.internal.firebase-auth-api.zzpc paramzzpc)
  {
    return new zzpf(paramzzpc, null);
  }
  
  public final Class<?> zza(Class<?> paramClass)
  {
    if (zzb.containsKey(paramClass)) {
      return ((zzpk)zzb.get(paramClass)).zza();
    }
    throw new GeneralSecurityException(j.j("No input primitive class for ", String.valueOf(paramClass), " available"));
  }
  
  public final <KeyT extends zzbo, PrimitiveT> PrimitiveT zza(KeyT paramKeyT, Class<PrimitiveT> paramClass)
  {
    paramClass = new zzpe(paramKeyT.getClass(), paramClass, null);
    if (zza.containsKey(paramClass)) {
      return (PrimitiveT)((zzoy)zza.get(paramClass)).zza(paramKeyT);
    }
    throw new GeneralSecurityException(j.j("No PrimitiveConstructor for ", String.valueOf(paramClass), " available"));
  }
  
  public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzpg<InputPrimitiveT> paramzzpg, Class<WrapperPrimitiveT> paramClass)
  {
    if (zzb.containsKey(paramClass))
    {
      paramClass = (zzpk)zzb.get(paramClass);
      if ((paramzzpg.zzc().equals(paramClass.zza())) && (paramClass.zza().equals(paramzzpg.zzc()))) {
        return (WrapperPrimitiveT)paramClass.zza(paramzzpg);
      }
      throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
    throw new GeneralSecurityException(f.j("No wrapper found for ", String.valueOf(paramClass)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzpc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */