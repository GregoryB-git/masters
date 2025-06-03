package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzla;
import f;
import java.security.GeneralSecurityException;

public final class zzkw
{
  private static final byte[] zza = new byte[0];
  
  public static zzla zza(com.google.android.gms.internal.firebase-auth-api.zzjq paramzzjq)
  {
    paramzzjq = paramzzjq.zzb();
    if ((paramzzjq instanceof zzdr)) {
      return new zzky((zzdr)paramzzjq);
    }
    if ((paramzzjq instanceof zzdc)) {
      return new zzkz((zzdc)paramzzjq);
    }
    if ((paramzzjq instanceof zzit)) {
      return new zzlb((zzit)paramzzjq);
    }
    throw new GeneralSecurityException(f.j("Unsupported DEM parameters: ", String.valueOf(paramzzjq)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzkw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */