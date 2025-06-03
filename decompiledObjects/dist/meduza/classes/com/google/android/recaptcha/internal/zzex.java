package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import java.net.URLConnection;

public final class zzex
{
  private final zzfm zza;
  
  public zzex()
  {
    this(null, 1, null);
  }
  
  public final zzew zza(String paramString)
  {
    try
    {
      paramString = zza.zza(paramString);
      paramString.setRequestMethod("POST");
      paramString.setDoOutput(true);
      paramString.setRequestProperty("Content-Type", "application/x-protobuffer");
      paramString = new zzew(paramString);
      return paramString;
    }
    catch (Exception paramString)
    {
      throw new zzbd(zzbb.zzc, zzba.zzai, paramString.getMessage());
    }
    catch (zzbd paramString)
    {
      throw paramString;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzex
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */