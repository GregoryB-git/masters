package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzpf
{
  private final Map<zzpe, zzoy<?, ?>> zza;
  private final Map<Class<?>, zzpk<?, ?>> zzb;
  
  private zzpf()
  {
    zza = new HashMap();
    zzb = new HashMap();
  }
  
  private zzpf(com.google.android.gms.internal.firebase-auth-api.zzpc paramzzpc)
  {
    zza = new HashMap(zzpc.zzb(paramzzpc));
    zzb = new HashMap(zzpc.zzc(paramzzpc));
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzpc zza()
  {
    return new zzpc(this, null);
  }
  
  public final <KeyT extends zzbo, PrimitiveT> zzpf zza(zzoy<KeyT, PrimitiveT> paramzzoy)
  {
    if (paramzzoy != null)
    {
      zzpe localzzpe = new zzpe(paramzzoy.zza(), paramzzoy.zzb(), null);
      if (zza.containsKey(localzzpe))
      {
        zzoy localzzoy = (zzoy)zza.get(localzzpe);
        if ((!localzzoy.equals(paramzzoy)) || (!paramzzoy.equals(localzzoy))) {
          throw new GeneralSecurityException(f.j("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ", String.valueOf(localzzpe)));
        }
      }
      else
      {
        zza.put(localzzpe, paramzzoy);
      }
      return this;
    }
    throw new NullPointerException("primitive constructor must be non-null");
  }
  
  public final <InputPrimitiveT, WrapperPrimitiveT> zzpf zza(zzpk<InputPrimitiveT, WrapperPrimitiveT> paramzzpk)
  {
    if (paramzzpk != null)
    {
      Class localClass = paramzzpk.zzb();
      if (zzb.containsKey(localClass))
      {
        zzpk localzzpk = (zzpk)zzb.get(localClass);
        if ((!localzzpk.equals(paramzzpk)) || (!paramzzpk.equals(localzzpk))) {
          throw new GeneralSecurityException(f.j("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type", String.valueOf(localClass)));
        }
      }
      else
      {
        zzb.put(localClass, paramzzpk);
      }
      return this;
    }
    throw new NullPointerException("wrapper must be non-null");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzpf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */