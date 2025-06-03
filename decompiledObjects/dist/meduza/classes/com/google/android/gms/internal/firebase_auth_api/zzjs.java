package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import f;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

public final class zzjs
  extends zzkv
{
  private final com.google.android.gms.internal.firebase-auth-api.zzjq zza;
  private final ECPoint zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zzzn zzc;
  private final com.google.android.gms.internal.firebase-auth-api.zzzn zzd;
  private final Integer zze;
  
  private zzjs(com.google.android.gms.internal.firebase-auth-api.zzjq paramzzjq, ECPoint paramECPoint, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn1, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn2, Integer paramInteger)
  {
    zza = paramzzjq;
    zzb = paramECPoint;
    zzc = paramzzzn1;
    zzd = paramzzzn2;
    zze = paramInteger;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzjs zza(com.google.android.gms.internal.firebase-auth-api.zzjq paramzzjq, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn, Integer paramInteger)
  {
    if (paramzzjq.zzd().equals(zzjq.zza.zzd))
    {
      zzb(paramzzjq.zzg(), paramInteger);
      if (paramzzzn.zza() == 32) {
        return new zzjs(paramzzjq, null, paramzzzn, zza(paramzzjq.zzg(), paramInteger), paramInteger);
      }
      throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }
    throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzjs zza(com.google.android.gms.internal.firebase-auth-api.zzjq paramzzjq, ECPoint paramECPoint, Integer paramInteger)
  {
    if (!paramzzjq.zzd().equals(zzjq.zza.zzd))
    {
      zzb(paramzzjq.zzg(), paramInteger);
      Object localObject = paramzzjq.zzd();
      if (localObject == zzjq.zza.zza)
      {
        localObject = zzmt.zza;
      }
      else if (localObject == zzjq.zza.zzb)
      {
        localObject = zzmt.zzb;
      }
      else
      {
        if (localObject != zzjq.zza.zzc) {
          break label93;
        }
        localObject = zzmt.zzc;
      }
      zzmt.zza(paramECPoint, ((ECParameterSpec)localObject).getCurve());
      return new zzjs(paramzzjq, paramECPoint, null, zza(paramzzjq.zzg(), paramInteger), paramInteger);
      label93:
      throw new IllegalArgumentException(f.j("Unable to determine NIST curve type for ", String.valueOf(localObject)));
    }
    throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzzn zza(com.google.android.gms.internal.firebase-auth-api.zzjq.zze paramzze, Integer paramInteger)
  {
    if (paramzze == zzjq.zze.zzc) {
      return zzor.zza;
    }
    if (paramInteger != null)
    {
      if (paramzze == zzjq.zze.zzb) {
        return zzor.zza(paramInteger.intValue());
      }
      if (paramzze == zzjq.zze.zza) {
        return zzor.zzb(paramInteger.intValue());
      }
      throw new IllegalStateException(f.j("Unknown EciesParameters.Variant: ", String.valueOf(paramzze)));
    }
    throw new IllegalStateException(f.j("idRequirement must be non-null for EciesParameters.Variant: ", String.valueOf(paramzze)));
  }
  
  private static void zzb(com.google.android.gms.internal.firebase-auth-api.zzjq.zze paramzze, Integer paramInteger)
  {
    com.google.android.gms.internal.firebase-auth-api.zzjq.zze localzze = zzjq.zze.zzc;
    if ((!paramzze.equals(localzze)) && (paramInteger == null)) {
      throw new GeneralSecurityException(j.j("'idRequirement' must be non-null for ", String.valueOf(paramzze), " variant."));
    }
    if ((paramzze.equals(localzze)) && (paramInteger != null)) {
      throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
    }
  }
  
  public final Integer zza()
  {
    return zze;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzjq zzb()
  {
    return zza;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzn zzc()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzn zzd()
  {
    return zzc;
  }
  
  public final ECPoint zze()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzjs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */