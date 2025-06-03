package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaln;

public final class zzamw
  extends RuntimeException
{
  public zzamw(zzaln paramzzaln)
  {
    super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzakm zza()
  {
    return new zzakm(getMessage());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzamw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */