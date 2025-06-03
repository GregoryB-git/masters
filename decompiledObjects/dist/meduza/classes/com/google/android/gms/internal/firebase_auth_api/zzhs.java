package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzhs
  implements com.google.android.gms.internal.firebase-auth-api.zzbe
{
  private final com.google.android.gms.internal.firebase-auth-api.zzbe zza;
  private final byte[] zzb;
  
  private zzhs(com.google.android.gms.internal.firebase-auth-api.zzbe paramzzbe, byte[] paramArrayOfByte)
  {
    zza = paramzzbe;
    if ((paramArrayOfByte.length != 0) && (paramArrayOfByte.length != 5)) {
      throw new IllegalArgumentException("identifier has an invalid length");
    }
    zzb = paramArrayOfByte;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzbe zza(com.google.android.gms.internal.firebase-auth-api.zzbe paramzzbe, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn)
  {
    return new zzhs(paramzzbe, paramzzzn.zzb());
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzbe zza(com.google.android.gms.internal.firebase-auth-api.zznn paramzznn)
  {
    Object localObject1 = paramzznn.zza(zzbl.zza());
    Object localObject2 = (zzwb)zzwb.zza().zza(((zzpn)localObject1).zzf()).zza(((zzpn)localObject1).zzd()).zza(((zzpn)localObject1).zza()).zze();
    zzpr.zza();
    localObject2 = (zzbe)zzpr.zza((com.google.android.gms.internal.firebase-auth-api.zzwb)localObject2, com.google.android.gms.internal.firebase-auth-api.zzbe.class);
    localObject1 = ((zzpn)localObject1).zzc();
    int i = zzhr.zza[localObject1.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          paramzznn = zzor.zzb(paramzznn.zza().intValue());
        } else {
          throw new GeneralSecurityException(f.j("unknown output prefix type ", String.valueOf(localObject1)));
        }
      }
      else {
        paramzznn = zzor.zza(paramzznn.zza().intValue());
      }
    }
    else {
      paramzznn = zzor.zza;
    }
    return new zzhs((com.google.android.gms.internal.firebase-auth-api.zzbe)localObject2, paramzznn.zzb());
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = zzb;
    if (arrayOfByte.length == 0) {
      return zza.zza(paramArrayOfByte1, paramArrayOfByte2);
    }
    if (zzpy.zza(arrayOfByte, paramArrayOfByte1)) {
      return zza.zza(Arrays.copyOfRange(paramArrayOfByte1, 5, paramArrayOfByte1.length), paramArrayOfByte2);
    }
    throw new GeneralSecurityException("wrong prefix");
  }
  
  public final byte[] zzb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = zzb;
    if (arrayOfByte.length == 0) {
      return zza.zzb(paramArrayOfByte1, paramArrayOfByte2);
    }
    return zzyc.zza(new byte[][] { arrayOfByte, zza.zzb(paramArrayOfByte1, paramArrayOfByte2) });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzhs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */