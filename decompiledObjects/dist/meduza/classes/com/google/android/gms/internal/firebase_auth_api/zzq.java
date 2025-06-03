package com.google.android.gms.internal.firebase_auth_api;

import java.util.regex.Matcher;

final class zzq
  extends zzm
{
  private final Matcher zza;
  
  public zzq(Matcher paramMatcher)
  {
    zza = ((Matcher)zzw.zza(paramMatcher));
  }
  
  public final int zza()
  {
    return zza.end();
  }
  
  public final boolean zza(int paramInt)
  {
    return zza.find(paramInt);
  }
  
  public final int zzb()
  {
    return zza.start();
  }
  
  public final boolean zzc()
  {
    return zza.matches();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */