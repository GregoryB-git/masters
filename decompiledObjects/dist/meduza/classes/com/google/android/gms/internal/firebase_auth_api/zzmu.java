package com.google.android.gms.internal.firebase_auth_api;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzmu<E extends Enum<E>, O>
{
  private Map<E, O> zza = new HashMap();
  private Map<O, E> zzb = new HashMap();
  
  public final zzmu<E, O> zza(E paramE, O paramO)
  {
    zza.put(paramE, paramO);
    zzb.put(paramO, paramE);
    return this;
  }
  
  public final zzmv<E, O> zza()
  {
    return new zzmv(Collections.unmodifiableMap(zza), Collections.unmodifiableMap(zzb), null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */