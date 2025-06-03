package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbm;
import com.google.android.gms.internal.firebase-auth-api.zzla;
import f;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.KeySpec;

public final class zzyh
  implements zzbm
{
  public static final zzmv<zzyl, zzjq.zza> zza = zzmv.zza().zza(zzyl.zza, zzjq.zza.zza).zza(zzyl.zzb, zzjq.zza.zzb).zza(zzyl.zzc, zzjq.zza.zzc).zza();
  public static final zzmv<zzyk, zzjq.zzc> zzb = zzmv.zza().zza(zzyk.zza, zzjq.zzc.zzb).zza(zzyk.zzb, zzjq.zzc.zza).zza(zzyk.zzc, zzjq.zzc.zzc).zza();
  
  private zzyh(ECPublicKey paramECPublicKey, byte[] paramArrayOfByte1, String paramString, com.google.android.gms.internal.firebase-auth-api.zzyk paramzzyk, zzla paramzzla, byte[] paramArrayOfByte2)
  {
    zzmt.zza(paramECPublicKey.getW(), paramECPublicKey.getParams().getCurve());
    new zzyj(paramECPublicKey);
  }
  
  public static zzbm zza(com.google.android.gms.internal.firebase-auth-api.zzjs paramzzjs)
  {
    Object localObject1 = (zzyl)zza.zza(paramzzjs.zzb().zzd());
    Object localObject2 = paramzzjs.zze().getAffineX().toByteArray();
    Object localObject3 = paramzzjs.zze().getAffineY().toByteArray();
    localObject1 = zzyi.zza((com.google.android.gms.internal.firebase-auth-api.zzyl)localObject1);
    localObject2 = new ECPoint(new BigInteger(1, (byte[])localObject2), new BigInteger(1, (byte[])localObject3));
    zzmt.zza((ECPoint)localObject2, ((ECParameterSpec)localObject1).getCurve());
    localObject2 = new ECPublicKeySpec((ECPoint)localObject2, (ECParameterSpec)localObject1);
    localObject3 = (ECPublicKey)((KeyFactory)zzym.zze.zza("EC")).generatePublic((KeySpec)localObject2);
    localObject2 = new byte[0];
    if (paramzzjs.zzb().zzh() != null) {
      localObject2 = paramzzjs.zzb().zzh().zzb();
    }
    return new zzyh((ECPublicKey)localObject3, (byte[])localObject2, zza(paramzzjs.zzb().zze()), (zzyk)zzb.zza(paramzzjs.zzb().zzf()), zzkw.zza(paramzzjs.zzb()), paramzzjs.zzc().zzb());
  }
  
  public static final String zza(com.google.android.gms.internal.firebase-auth-api.zzjq.zzd paramzzd)
  {
    if (paramzzd.equals(zzjq.zzd.zza)) {
      return "HmacSha1";
    }
    if (paramzzd.equals(zzjq.zzd.zzb)) {
      return "HmacSha224";
    }
    if (paramzzd.equals(zzjq.zzd.zzc)) {
      return "HmacSha256";
    }
    if (paramzzd.equals(zzjq.zzd.zzd)) {
      return "HmacSha384";
    }
    if (paramzzd.equals(zzjq.zzd.zze)) {
      return "HmacSha512";
    }
    throw new GeneralSecurityException(f.j("hash unsupported for EciesAeadHkdf: ", String.valueOf(paramzzd)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzyh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */