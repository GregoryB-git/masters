package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import f;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;

public final class zzkf
  extends zzkv
{
  private final com.google.android.gms.internal.firebase-auth-api.zzju zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzzn zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zzzn zzc;
  private final Integer zzd;
  
  private zzkf(com.google.android.gms.internal.firebase-auth-api.zzju paramzzju, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn1, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn2, Integer paramInteger)
  {
    zza = paramzzju;
    zzb = paramzzzn1;
    zzc = paramzzzn2;
    zzd = paramInteger;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzkf zza(com.google.android.gms.internal.firebase-auth-api.zzju paramzzju, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn, Integer paramInteger)
  {
    Object localObject1 = paramzzju.zzf();
    com.google.android.gms.internal.firebase-auth-api.zzju.zzf localzzf = zzju.zzf.zzc;
    if ((!localObject1.equals(localzzf)) && (paramInteger == null)) {
      throw new GeneralSecurityException(j.j("'idRequirement' must be non-null for ", String.valueOf(localObject1), " variant."));
    }
    if ((localObject1.equals(localzzf)) && (paramInteger != null)) {
      throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
    }
    localObject1 = paramzzju.zze();
    int i = paramzzzn.zza();
    Object localObject2 = String.valueOf(localObject1);
    Object localObject3 = new StringBuilder("Encoded public key byte length for ");
    ((StringBuilder)localObject3).append((String)localObject2);
    ((StringBuilder)localObject3).append(" must be %d, not ");
    ((StringBuilder)localObject3).append(i);
    localObject3 = ((StringBuilder)localObject3).toString();
    localObject2 = zzju.zzd.zza;
    int j = 0;
    if (localObject1 == localObject2)
    {
      if (i != 65) {
        throw new GeneralSecurityException(String.format((String)localObject3, new Object[] { Integer.valueOf(65) }));
      }
    }
    else if (localObject1 == zzju.zzd.zzb)
    {
      if (i != 97) {
        throw new GeneralSecurityException(String.format((String)localObject3, new Object[] { Integer.valueOf(97) }));
      }
    }
    else if (localObject1 == zzju.zzd.zzc)
    {
      if (i != 133) {
        throw new GeneralSecurityException(String.format((String)localObject3, new Object[] { Integer.valueOf(133) }));
      }
    }
    else
    {
      if (localObject1 != zzju.zzd.zzd) {
        break label511;
      }
      if (i != 32) {
        break label486;
      }
    }
    if ((localObject1 == localObject2) || (localObject1 == zzju.zzd.zzb) || (localObject1 == zzju.zzd.zzc)) {
      j = 1;
    }
    if (j != 0)
    {
      if (localObject1 == localObject2)
      {
        localObject1 = zzmt.zza;
      }
      else if (localObject1 == zzju.zzd.zzb)
      {
        localObject1 = zzmt.zzb;
      }
      else
      {
        if (localObject1 != zzju.zzd.zzc) {
          break label368;
        }
        localObject1 = zzmt.zzc;
      }
      localObject1 = ((ECParameterSpec)localObject1).getCurve();
      zzmt.zza(zzyi.zza((EllipticCurve)localObject1, zzyk.zza, paramzzzn.zzb()), (EllipticCurve)localObject1);
      break label385;
      label368:
      throw new IllegalArgumentException(f.j("Unable to determine NIST curve type for ", String.valueOf(localObject1)));
    }
    label385:
    localObject1 = paramzzju.zzf();
    if (localObject1 == localzzf)
    {
      localObject1 = zzor.zza;
    }
    else
    {
      if (paramInteger == null) {
        break label469;
      }
      if (localObject1 == zzju.zzf.zzb)
      {
        localObject1 = zzor.zza(paramInteger.intValue());
      }
      else
      {
        if (localObject1 != zzju.zzf.zza) {
          break label452;
        }
        localObject1 = zzor.zzb(paramInteger.intValue());
      }
    }
    return new zzkf(paramzzju, paramzzzn, (com.google.android.gms.internal.firebase-auth-api.zzzn)localObject1, paramInteger);
    label452:
    throw new IllegalStateException(f.j("Unknown HpkeParameters.Variant: ", String.valueOf(localObject1)));
    label469:
    throw new IllegalStateException(f.j("idRequirement must be non-null for HpkeParameters.Variant ", String.valueOf(localObject1)));
    label486:
    throw new GeneralSecurityException(String.format((String)localObject3, new Object[] { Integer.valueOf(32) }));
    label511:
    throw new GeneralSecurityException(f.j("Unable to validate public key length for ", String.valueOf(localObject1)));
  }
  
  public final Integer zza()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzju zzb()
  {
    return zza;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzn zzc()
  {
    return zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzn zzd()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzkf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */