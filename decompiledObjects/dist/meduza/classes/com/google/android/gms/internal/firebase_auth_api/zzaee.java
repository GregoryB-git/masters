package com.google.android.gms.internal.firebase_auth_api;

import java.util.Locale;

public final class zzaee
{
  public static String zza()
  {
    Locale localLocale1 = Locale.getDefault();
    StringBuilder localStringBuilder = new StringBuilder();
    zza(localStringBuilder, localLocale1);
    Locale localLocale2 = Locale.US;
    if (!localLocale1.equals(localLocale2))
    {
      if (localStringBuilder.length() > 0) {
        localStringBuilder.append(", ");
      }
      zza(localStringBuilder, localLocale2);
    }
    return localStringBuilder.toString();
  }
  
  private static void zza(StringBuilder paramStringBuilder, Locale paramLocale)
  {
    String str = paramLocale.getLanguage();
    if (str != null)
    {
      paramStringBuilder.append(str);
      paramLocale = paramLocale.getCountry();
      if (paramLocale != null)
      {
        paramStringBuilder.append("-");
        paramStringBuilder.append(paramLocale);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaee
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */