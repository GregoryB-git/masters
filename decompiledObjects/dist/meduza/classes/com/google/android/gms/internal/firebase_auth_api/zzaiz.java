package com.google.android.gms.internal.firebase_auth_api;

import java.util.NoSuchElementException;

final class zzaiz
  extends zzajb
{
  private int zza = 0;
  private final int zzb;
  
  public zzaiz(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
  {
    zzb = paramzzaiw.zzb();
  }
  
  public final boolean hasNext()
  {
    return zza < zzb;
  }
  
  public final byte zza()
  {
    int i = zza;
    if (i < zzb)
    {
      zza = (i + 1);
      return zzc.zzb(i);
    }
    throw new NoSuchElementException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaiz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */