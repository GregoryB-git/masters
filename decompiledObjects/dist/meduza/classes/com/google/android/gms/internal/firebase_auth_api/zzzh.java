package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

final class zzzh
  extends ThreadLocal<Mac>
{
  public zzzh(com.google.android.gms.internal.firebase-auth-api.zzze paramzzze) {}
  
  private final Mac zza()
  {
    try
    {
      Mac localMac = (Mac)zzym.zzb.zza(zzze.zza(zza));
      localMac.init(zzze.zzb(zza));
      return localMac;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new IllegalStateException(localGeneralSecurityException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */