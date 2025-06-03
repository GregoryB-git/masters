package com.google.android.recaptcha.internal;

import b.z;
import ec.i;
import java.net.HttpURLConnection;
import java.net.URL;
import rb.c;

public final class zzfm
{
  private final c zza;
  
  public zzfm()
  {
    int i = zzav.zza;
    zza = z.n(zzfl.zza);
  }
  
  public final HttpURLConnection zza(String paramString)
  {
    if (((zzfk)zza.getValue()).zzb(paramString))
    {
      paramString = new URL(paramString).openConnection();
      i.c(paramString, "null cannot be cast to non-null type java.net.HttpURLConnection");
      return (HttpURLConnection)paramString;
    }
    throw new zzbd(zzbb.zzc, zzba.zzQ, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzfm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */