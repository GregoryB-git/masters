package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzcg;
import com.google.android.gms.internal.firebase-auth-api.zzpq;
import java.io.IOException;
import java.security.GeneralSecurityException;

public final class zzco
{
  public static zzcg zza(byte[] paramArrayOfByte)
  {
    try
    {
      Object localObject = zzwf.zza(paramArrayOfByte, zzajv.zza());
      paramArrayOfByte = zzom.zza();
      localObject = zzpm.zza((com.google.android.gms.internal.firebase-auth-api.zzwf)localObject);
      if (!paramArrayOfByte.zzc((zzpq)localObject)) {
        return new zznp((com.google.android.gms.internal.firebase-auth-api.zzpm)localObject);
      }
      return paramArrayOfByte.zza((zzpq)localObject);
    }
    catch (IOException paramArrayOfByte)
    {
      throw new GeneralSecurityException("Failed to parse proto", paramArrayOfByte);
    }
  }
  
  public static byte[] zza(zzcg paramzzcg)
  {
    if ((paramzzcg instanceof zznp)) {}
    for (paramzzcg = ((zznp)paramzzcg).zzb();; paramzzcg = (zzpm)zzom.zza().zza(paramzzcg, com.google.android.gms.internal.firebase-auth-api.zzpm.class)) {
      return paramzzcg.zza().zzk();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzco
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */