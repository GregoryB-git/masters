package com.google.android.gms.internal.auth;

import android.net.Uri;
import r.h;

public final class zzci
{
  private final h zza;
  
  public zzci(h paramh)
  {
    zza = paramh;
  }
  
  public final String zza(Uri paramUri, String paramString1, String paramString2, String paramString3)
  {
    if (paramUri != null)
    {
      paramUri = paramUri.toString();
      paramUri = (h)zza.getOrDefault(paramUri, null);
    }
    else
    {
      paramUri = null;
    }
    if (paramUri == null) {
      return null;
    }
    return (String)paramUri.getOrDefault("".concat(paramString3), null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzci
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */