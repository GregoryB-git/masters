package com.google.android.gms.internal.firebase_auth_api;

import android.util.Base64;
import f;
import java.io.UnsupportedEncodingException;
import java.util.List;
import m6.j;

public final class zzagy
{
  public static long zza(String paramString)
  {
    paramString = zzb(paramString);
    return paramString.zza().longValue() - paramString.zzb().longValue();
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzagx zzb(String paramString)
  {
    j.e(paramString);
    Object localObject = zzv.zza('.').zza(paramString);
    if (((List)localObject).size() >= 2)
    {
      paramString = (String)((List)localObject).get(1);
      try
      {
        localObject = new java/lang/String;
        if (paramString == null) {
          paramString = null;
        } else {
          paramString = Base64.decode(paramString, 11);
        }
        ((String)localObject).<init>(paramString, "UTF-8");
        paramString = zzagx.zza((String)localObject);
        return paramString;
      }
      catch (UnsupportedEncodingException paramString)
      {
        throw new RuntimeException("Unable to decode token", paramString);
      }
    }
    throw new RuntimeException(f.j("Invalid idToken ", paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */