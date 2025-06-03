package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

public final class zzjt
  extends zzks
{
  private final com.google.android.gms.internal.firebase-auth-api.zzjs zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzzm zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zzzo zzc;
  
  private zzjt(com.google.android.gms.internal.firebase-auth-api.zzjs paramzzjs, com.google.android.gms.internal.firebase-auth-api.zzzm paramzzzm, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo)
  {
    zza = paramzzjs;
    zzb = paramzzzm;
    zzc = paramzzzo;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzjt zza(com.google.android.gms.internal.firebase-auth-api.zzjs paramzzjs, com.google.android.gms.internal.firebase-auth-api.zzzm paramzzzm)
  {
    if (paramzzjs != null)
    {
      if (paramzzjs.zze() != null)
      {
        if (paramzzzm != null)
        {
          BigInteger localBigInteger1 = paramzzzm.zza(zzbl.zza());
          ECPoint localECPoint = paramzzjs.zze();
          com.google.android.gms.internal.firebase-auth-api.zzjq.zza localzza = paramzzjs.zzb().zzd();
          BigInteger localBigInteger2 = zza(localzza).getOrder();
          if ((localBigInteger1.signum() > 0) && (localBigInteger1.compareTo(localBigInteger2) < 0))
          {
            if (zzmt.zza(localBigInteger1, zza(localzza)).equals(localECPoint)) {
              return new zzjt(paramzzjs, paramzzzm, null);
            }
            throw new GeneralSecurityException("Invalid private value");
          }
          throw new GeneralSecurityException("Invalid private value");
        }
        throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
      }
      throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
    }
    throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzjt zza(com.google.android.gms.internal.firebase-auth-api.zzjs paramzzjs, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo)
  {
    if (paramzzjs != null)
    {
      if (paramzzjs.zzd() != null)
      {
        if (paramzzzo != null)
        {
          byte[] arrayOfByte1 = paramzzzo.zza(zzbl.zza());
          byte[] arrayOfByte2 = paramzzjs.zzd().zzb();
          if (arrayOfByte1.length == 32)
          {
            if (Arrays.equals(zzzl.zza(arrayOfByte1), arrayOfByte2)) {
              return new zzjt(paramzzjs, null, paramzzzo);
            }
            throw new GeneralSecurityException("Invalid private key for public key.");
          }
          throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
      }
      throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
    }
    throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
  }
  
  private static ECParameterSpec zza(com.google.android.gms.internal.firebase-auth-api.zzjq.zza paramzza)
  {
    if (paramzza == zzjq.zza.zza) {
      return zzmt.zza;
    }
    if (paramzza == zzjq.zza.zzb) {
      return zzmt.zzb;
    }
    if (paramzza == zzjq.zza.zzc) {
      return zzmt.zzc;
    }
    throw new IllegalArgumentException(f.j("Unable to determine NIST curve type for ", String.valueOf(paramzza)));
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzjq zzc()
  {
    return zza.zzb();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzm zze()
  {
    return zzb;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzo zzf()
  {
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzjt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */