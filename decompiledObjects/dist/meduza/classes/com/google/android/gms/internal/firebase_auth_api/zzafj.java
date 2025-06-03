package com.google.android.gms.internal.firebase_auth_api;

import java.lang.reflect.Method;

public final class zzafj
{
  public static String zza(String paramString)
  {
    try
    {
      paramString = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] { String.class }).invoke(null, new Object[] { paramString });
      if ((paramString != null) && (String.class.isAssignableFrom(paramString.getClass())))
      {
        paramString = (String)paramString;
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      for (;;) {}
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */