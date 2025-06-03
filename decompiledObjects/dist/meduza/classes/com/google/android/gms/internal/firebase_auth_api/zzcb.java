package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzcb
{
  private static final CopyOnWriteArrayList<zzcc> zza = new CopyOnWriteArrayList();
  
  public static com.google.android.gms.internal.firebase-auth-api.zzcc zza(String paramString)
  {
    Iterator localIterator = zza.iterator();
    while (localIterator.hasNext())
    {
      zzcc localzzcc = (zzcc)localIterator.next();
      if (localzzcc.zzb(paramString)) {
        return localzzcc;
      }
    }
    throw new GeneralSecurityException(f.j("No KMS client does support: ", paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzcb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */