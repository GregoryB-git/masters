package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

public final class zzjx
  extends zzks
{
  private final com.google.android.gms.internal.firebase-auth-api.zzkf zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzzo zzb;
  
  private zzjx(com.google.android.gms.internal.firebase-auth-api.zzkf paramzzkf, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo)
  {
    zza = paramzzkf;
    zzb = paramzzzo;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzjx zza(com.google.android.gms.internal.firebase-auth-api.zzkf paramzzkf, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo)
  {
    if (paramzzkf != null)
    {
      if (paramzzzo != null)
      {
        Object localObject1 = paramzzkf.zzb().zze();
        int i = paramzzzo.zza();
        Object localObject2 = String.valueOf(localObject1);
        Object localObject3 = new StringBuilder("Encoded private key byte length for ");
        ((StringBuilder)localObject3).append((String)localObject2);
        ((StringBuilder)localObject3).append(" must be %d, not ");
        ((StringBuilder)localObject3).append(i);
        localObject2 = ((StringBuilder)localObject3).toString();
        localObject3 = zzju.zzd.zza;
        int j = 0;
        if (localObject1 == localObject3)
        {
          if (i != 32) {
            throw new GeneralSecurityException(String.format((String)localObject2, new Object[] { Integer.valueOf(32) }));
          }
        }
        else if (localObject1 == zzju.zzd.zzb)
        {
          if (i != 48) {
            throw new GeneralSecurityException(String.format((String)localObject2, new Object[] { Integer.valueOf(48) }));
          }
        }
        else if (localObject1 == zzju.zzd.zzc)
        {
          if (i != 66) {
            throw new GeneralSecurityException(String.format((String)localObject2, new Object[] { Integer.valueOf(66) }));
          }
        }
        else
        {
          if (localObject1 != zzju.zzd.zzd) {
            break label493;
          }
          if (i != 32) {
            break label468;
          }
        }
        Object localObject4 = paramzzkf.zzb().zze();
        localObject1 = paramzzkf.zzd().zzb();
        localObject2 = paramzzzo.zza(zzbl.zza());
        if ((localObject4 == localObject3) || (localObject4 == zzju.zzd.zzb) || (localObject4 == zzju.zzd.zzc)) {
          j = 1;
        }
        if (j != 0)
        {
          if (localObject4 == localObject3)
          {
            localObject3 = zzmt.zza;
          }
          else if (localObject4 == zzju.zzd.zzb)
          {
            localObject3 = zzmt.zzb;
          }
          else
          {
            if (localObject4 != zzju.zzd.zzc) {
              break label392;
            }
            localObject3 = zzmt.zzc;
          }
          localObject4 = ((ECParameterSpec)localObject3).getOrder();
          localObject2 = zzmo.zza((byte[])localObject2);
          if ((((BigInteger)localObject2).signum() > 0) && (((BigInteger)localObject2).compareTo((BigInteger)localObject4) < 0))
          {
            if (!zzmt.zza((BigInteger)localObject2, (ECParameterSpec)localObject3).equals(zzyi.zza(((ECParameterSpec)localObject3).getCurve(), zzyk.zza, (byte[])localObject1))) {
              throw new GeneralSecurityException("Invalid private key for public key.");
            }
          }
          else
          {
            throw new GeneralSecurityException("Invalid private key.");
            label392:
            throw new IllegalArgumentException(f.j("Unable to determine NIST curve params for ", String.valueOf(localObject4)));
          }
        }
        else
        {
          if (localObject4 != zzju.zzd.zzd) {
            break label450;
          }
          if (!Arrays.equals(zzzl.zza((byte[])localObject2), (byte[])localObject1)) {
            break label440;
          }
        }
        return new zzjx(paramzzkf, paramzzzo);
        label440:
        throw new GeneralSecurityException("Invalid private key for public key.");
        label450:
        throw new IllegalArgumentException(f.j("Unable to validate key pair for ", String.valueOf(localObject4)));
        label468:
        throw new GeneralSecurityException(String.format((String)localObject2, new Object[] { Integer.valueOf(32) }));
        label493:
        throw new GeneralSecurityException(f.j("Unable to validate private key length for ", String.valueOf(localObject1)));
      }
      throw new GeneralSecurityException("HPKE private key cannot be constructed without secret");
    }
    throw new GeneralSecurityException("HPKE private key cannot be constructed without an HPKE public key");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzju zzc()
  {
    return zza.zzb();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzo zze()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzjx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */