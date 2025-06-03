package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzbe;
import com.google.android.gms.internal.firebase-auth-api.zzbj;
import com.google.android.gms.internal.firebase-auth-api.zzbk;
import com.google.android.gms.internal.firebase-auth-api.zzbm;
import com.google.android.gms.internal.firebase-auth-api.zzcd;
import com.google.android.gms.internal.firebase-auth-api.zzch;
import com.google.android.gms.internal.firebase-auth-api.zzck;
import com.google.android.gms.internal.firebase-auth-api.zzcl;
import com.google.android.gms.internal.firebase-auth-api.zzrx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

public final class zzcj
{
  static
  {
    Logger.getLogger(com.google.android.gms.internal.firebase-auth-api.zzcj.class.getName());
    new ConcurrentHashMap();
    HashSet localHashSet = new HashSet();
    localHashSet.add(zzbe.class);
    localHashSet.add(zzbk.class);
    localHashSet.add(zzcl.class);
    localHashSet.add(zzbm.class);
    localHashSet.add(zzbj.class);
    localHashSet.add(zzcd.class);
    localHashSet.add(zzrx.class);
    localHashSet.add(zzch.class);
    localHashSet.add(zzck.class);
    Collections.unmodifiableSet(localHashSet);
  }
  
  @Deprecated
  public static com.google.android.gms.internal.firebase-auth-api.zzwb zza(String paramString, zzaiw paramzzaiw)
  {
    com.google.android.gms.internal.firebase-auth-api.zzbn localzzbn = zzna.zza().zza(paramString);
    if ((localzzbn instanceof zzci)) {
      return ((zzci)localzzbn).zzc(paramzzaiw);
    }
    throw new GeneralSecurityException(j.j("manager for key type ", paramString, " is not a PrivateKeyManager"));
  }
  
  public static Class<?> zza(Class<?> paramClass)
  {
    try
    {
      paramClass = zzon.zza().zza(paramClass);
      return paramClass;
    }
    catch (GeneralSecurityException paramClass) {}
    return null;
  }
  
  public static <B, P> P zza(zzpg<B> paramzzpg, Class<P> paramClass)
  {
    return (P)zzon.zza().zza(paramzzpg, paramClass);
  }
  
  public static <P> P zza(zzwb paramzzwb, Class<P> paramClass)
  {
    String str = paramzzwb.zzf();
    paramzzwb = paramzzwb.zze();
    return (P)zzna.zza().zza(str, paramClass).zzb(paramzzwb);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzcj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */