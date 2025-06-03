package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbj;
import com.google.android.gms.internal.firebase-auth-api.zzll;
import com.google.android.gms.internal.firebase-auth-api.zzlo;
import com.google.android.gms.internal.firebase-auth-api.zzlp;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzln
  implements zzbj
{
  private static final byte[] zza = new byte[0];
  private final com.google.android.gms.internal.firebase-auth-api.zzlr zzb;
  private final zzlo zzc;
  private final zzlp zzd;
  private final zzll zze;
  private final int zzf;
  private final byte[] zzg;
  
  private zzln(com.google.android.gms.internal.firebase-auth-api.zzlr paramzzlr, zzlo paramzzlo, zzlp paramzzlp, zzll paramzzll, int paramInt, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn)
  {
    zzb = paramzzlr;
    zzc = paramzzlo;
    zzd = paramzzlp;
    zze = paramzzll;
    zzf = paramInt;
    zzg = paramzzzn.zzb();
  }
  
  public static zzbj zza(com.google.android.gms.internal.firebase-auth-api.zzjx paramzzjx)
  {
    Object localObject = paramzzjx.zzc();
    zzlo localzzlo = zzlm.zza(((zzju)localObject).zze());
    zzlp localzzlp = zzlm.zza(((zzju)localObject).zzd());
    zzll localzzll = zzlm.zza(((zzju)localObject).zzb());
    com.google.android.gms.internal.firebase-auth-api.zzju.zzd localzzd = ((zzju)localObject).zze();
    localObject = zzju.zzd.zzd;
    int i;
    if (localzzd.equals(localObject)) {
      i = 32;
    }
    for (;;)
    {
      break;
      if (localzzd.equals(zzju.zzd.zza))
      {
        i = 65;
      }
      else if (localzzd.equals(zzju.zzd.zzb))
      {
        i = 97;
      }
      else
      {
        if (!localzzd.equals(zzju.zzd.zzc)) {
          break label226;
        }
        i = 133;
      }
    }
    localzzd = paramzzjx.zzc().zze();
    if ((!localzzd.equals(localObject)) && (!localzzd.equals(zzju.zzd.zza)) && (!localzzd.equals(zzju.zzd.zzb)) && (!localzzd.equals(zzju.zzd.zzc))) {
      throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }
    return new zzln(new zzlr(zzzn.zza(paramzzjx.zze().zza(zzbl.zza())), ((zzkf)paramzzjx.zzb()).zzd()), localzzlo, localzzlp, localzzll, i, paramzzjx.zzg());
    label226:
    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = zzg;
    int i = arrayOfByte.length + zzf;
    if (paramArrayOfByte1.length >= i)
    {
      if (zzpy.zza(arrayOfByte, paramArrayOfByte1))
      {
        arrayOfByte = paramArrayOfByte2;
        if (paramArrayOfByte2 == null) {
          arrayOfByte = new byte[0];
        }
        return zzlk.zza(Arrays.copyOfRange(paramArrayOfByte1, zzg.length, i), zzb, zzc, zzd, zze, arrayOfByte).zza(paramArrayOfByte1, i, zza);
      }
      throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
    }
    throw new GeneralSecurityException("Ciphertext is too short.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzln
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */