package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzcg;
import com.google.android.gms.internal.firebase-auth-api.zzwf;
import f;
import java.security.GeneralSecurityException;

public final class zzbp
{
  private final zzcg zza;
  
  private zzbp(zzcg paramzzcg)
  {
    zza = paramzzcg;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzbp zza(zzcg paramzzcg)
  {
    return new zzbp(paramzzcg);
  }
  
  private final zzwf zzb()
  {
    try
    {
      Object localObject = zza;
      if ((localObject instanceof zznp)) {
        return ((zznp)localObject).zzb().zza();
      }
      localObject = ((zzpm)zzom.zza().zza(zza, com.google.android.gms.internal.firebase-auth-api.zzpm.class)).zza();
      return (zzwf)localObject;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new zzpw(f.j("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ", String.valueOf(zza)), localGeneralSecurityException);
    }
  }
  
  public final zzcg zza()
  {
    zzcg localzzcg = zza;
    if (localzzcg != null) {
      return localzzcg;
    }
    return zzco.zza(zzb().zzk());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzbp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */