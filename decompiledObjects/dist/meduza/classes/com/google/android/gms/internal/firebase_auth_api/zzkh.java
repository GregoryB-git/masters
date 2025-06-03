package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbf;
import com.google.android.gms.internal.firebase-auth-api.zzbj;
import com.google.android.gms.internal.firebase-auth-api.zzbm;
import com.google.android.gms.internal.firebase-auth-api.zzjs;
import com.google.android.gms.internal.firebase-auth-api.zzjt;
import com.google.android.gms.internal.firebase-auth-api.zzjx;
import com.google.android.gms.internal.firebase-auth-api.zzkf;
import com.google.android.gms.internal.firebase-auth-api.zzpa;
import java.security.GeneralSecurityException;

public final class zzkh
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzmz zza = ;
  
  public static zzbf zza()
  {
    if (!zzij.zzb()) {
      return zza;
    }
    throw new GeneralSecurityException("Cannot use non-FIPS-compliant HybridConfigurationV0 in FIPS mode");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzmz zzb()
  {
    try
    {
      Object localObject1 = zzpc.zza();
      zzkp.zza((com.google.android.gms.internal.firebase-auth-api.zzpf)localObject1);
      Object localObject2 = new com/google/android/gms/internal/firebase_auth_api/zzkg;
      ((zzkg)localObject2).<init>();
      ((zzpf)localObject1).zza(zzoy.zza((zzpa)localObject2, zzjs.class, zzbm.class));
      localObject2 = new com/google/android/gms/internal/firebase_auth_api/zzkj;
      ((zzkj)localObject2).<init>();
      ((zzpf)localObject1).zza(zzoy.zza((zzpa)localObject2, zzkf.class, zzbm.class));
      zzkk.zza((com.google.android.gms.internal.firebase-auth-api.zzpf)localObject1);
      localObject2 = new com/google/android/gms/internal/firebase_auth_api/zzki;
      ((zzki)localObject2).<init>();
      ((zzpf)localObject1).zza(zzoy.zza((zzpa)localObject2, zzjt.class, zzbj.class));
      localObject2 = new com/google/android/gms/internal/firebase_auth_api/zzkl;
      ((zzkl)localObject2).<init>();
      ((zzpf)localObject1).zza(zzoy.zza((zzpa)localObject2, zzjx.class, zzbj.class));
      localObject1 = zzmz.zza(((zzpf)localObject1).zza());
      return (com.google.android.gms.internal.firebase-auth-api.zzmz)localObject1;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new IllegalStateException(localGeneralSecurityException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzkh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */