package com.google.android.gms.internal.auth;

import android.net.Uri;
import r.b;
import r.h;

public final class zzcr
{
  private static final b zza = new b();
  
  public static Uri zza(String paramString)
  {
    try
    {
      paramString = zza;
      Uri localUri = (Uri)paramString.getOrDefault("com.google.android.gms.auth_account", null);
      if (localUri == null)
      {
        localUri = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        paramString.put("com.google.android.gms.auth_account", localUri);
        return localUri;
      }
      return localUri;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzcr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */