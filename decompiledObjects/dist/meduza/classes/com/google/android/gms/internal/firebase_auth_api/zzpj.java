package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzpj<P>
{
  private final Class<P> zza;
  private Map<zzzn, List<zzpi<P>>> zzb = new HashMap();
  private final List<zzpi<P>> zzc = new ArrayList();
  private zzpi<P> zzd;
  private com.google.android.gms.internal.firebase-auth-api.zznr zze;
  
  private zzpj(Class<P> paramClass)
  {
    zza = paramClass;
    zze = zznr.zza;
  }
  
  private final zzpj<P> zza(P paramP, zzbo paramzzbo, zzwl.zza paramzza, boolean paramBoolean)
  {
    if (zzb != null)
    {
      if (paramP != null)
      {
        if (paramzza.zzc() == zzwc.zzb)
        {
          paramP = new zzpi(paramP, zzzn.zza(zzbi.zza(paramzza)), paramzza.zzc(), paramzza.zzf(), paramzza.zza(), paramzza.zzb().zzf(), paramzzbo, null);
          paramzza = zzb;
          paramzzbo = zzc;
          ArrayList localArrayList = new ArrayList();
          localArrayList.add(paramP);
          List localList = (List)paramzza.put(zzpi.zza(paramP), Collections.unmodifiableList(localArrayList));
          if (localList != null)
          {
            localArrayList = new ArrayList();
            localArrayList.addAll(localList);
            localArrayList.add(paramP);
            paramzza.put(zzpi.zza(paramP), Collections.unmodifiableList(localArrayList));
          }
          paramzzbo.add(paramP);
          if (paramBoolean) {
            if (zzd == null) {
              zzd = paramP;
            } else {
              throw new IllegalStateException("you cannot set two primary primitives");
            }
          }
          return this;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
      }
      throw new NullPointerException("`fullPrimitive` must not be null");
    }
    throw new IllegalStateException("addEntry cannot be called after build");
  }
  
  public final zzpg<P> zza()
  {
    Object localObject = zzb;
    if (localObject != null)
    {
      localObject = new zzpg((Map)localObject, zzc, zzd, zze, zza, null);
      zzb = null;
      return (zzpg<P>)localObject;
    }
    throw new IllegalStateException("build cannot be called twice");
  }
  
  public final zzpj<P> zza(zznr paramzznr)
  {
    if (zzb != null)
    {
      zze = paramzznr;
      return this;
    }
    throw new IllegalStateException("setAnnotations cannot be called after build");
  }
  
  public final zzpj<P> zza(P paramP, zzbo paramzzbo, zzwl.zza paramzza)
  {
    return zza(paramP, paramzzbo, paramzza, false);
  }
  
  public final zzpj<P> zzb(P paramP, zzbo paramzzbo, zzwl.zza paramzza)
  {
    return zza(paramP, paramzzbo, paramzza, true);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzpj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */