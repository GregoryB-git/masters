package com.google.android.gms.internal.firebase_auth_api;

import java.util.Collections;
import java.util.HashMap;

public final class zznq
{
  private HashMap<String, String> zza = new HashMap();
  
  public final com.google.android.gms.internal.firebase-auth-api.zznr zza()
  {
    if (zza != null)
    {
      zznr localzznr = new zznr(Collections.unmodifiableMap(zza), null);
      zza = null;
      return localzznr;
    }
    throw new IllegalStateException("cannot call build() twice");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zznq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */