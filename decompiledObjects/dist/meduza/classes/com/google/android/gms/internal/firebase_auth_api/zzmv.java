package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.security.GeneralSecurityException;
import java.util.Map;

public final class zzmv<E extends Enum<E>, O>
{
  private final Map<E, O> zza;
  private final Map<O, E> zzb;
  
  private zzmv(Map<E, O> paramMap, Map<O, E> paramMap1)
  {
    zza = paramMap;
    zzb = paramMap1;
  }
  
  public static <E extends Enum<E>, O> zzmu<E, O> zza()
  {
    return new zzmu(null);
  }
  
  public final E zza(O paramO)
  {
    Enum localEnum = (Enum)zzb.get(paramO);
    if (localEnum != null) {
      return localEnum;
    }
    throw new GeneralSecurityException(f.j("Unable to convert object enum: ", String.valueOf(paramO)));
  }
  
  public final O zza(E paramE)
  {
    Object localObject = zza.get(paramE);
    if (localObject != null) {
      return (O)localObject;
    }
    throw new GeneralSecurityException(f.j("Unable to convert proto enum: ", String.valueOf(paramE)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */