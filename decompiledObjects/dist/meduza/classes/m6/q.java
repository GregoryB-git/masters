package m6;

import a0.f;
import a0.m;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import r.h;
import x6.b;
import x6.c;
import x6.d;

public final class q
{
  public static final h a = new h();
  public static Locale b;
  
  public static String a(Context paramContext)
  {
    String str = paramContext.getPackageName();
    try
    {
      Object localObject = aa;
      localObject = ((Context)localObject).getPackageManager().getApplicationLabel(((Context)localObject).getPackageManager().getApplicationInfo(str, 0)).toString();
      return (String)localObject;
    }
    catch (PackageManager.NameNotFoundException|NullPointerException localNameNotFoundException)
    {
      paramContext = getApplicationInfoname;
      if (TextUtils.isEmpty(paramContext)) {
        return str;
      }
    }
    return paramContext;
  }
  
  public static String b(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    String str = a(paramContext);
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 5)
          {
            if (paramInt != 7)
            {
              if (paramInt != 9)
              {
                if (paramInt != 20)
                {
                  switch (paramInt)
                  {
                  default: 
                    return localResources.getString(2131886131, new Object[] { str });
                  case 18: 
                    return localResources.getString(2131886136, new Object[] { str });
                  case 17: 
                    return d(paramContext, "common_google_play_services_sign_in_failed_text", str);
                  }
                  return d(paramContext, "common_google_play_services_api_unavailable_text", str);
                }
                return d(paramContext, "common_google_play_services_restricted_profile_text", str);
              }
              return localResources.getString(2131886132, new Object[] { str });
            }
            return d(paramContext, "common_google_play_services_network_error_text", str);
          }
          return d(paramContext, "common_google_play_services_invalid_account_text", str);
        }
        return localResources.getString(2131886124, new Object[] { str });
      }
      if (b.f0(paramContext)) {
        return localResources.getString(2131886137);
      }
      return localResources.getString(2131886134, new Object[] { str });
    }
    return localResources.getString(2131886127, new Object[] { str });
  }
  
  public static String c(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 19: 
    default: 
      paramContext = new StringBuilder();
      paramContext.append("Unexpected error code ");
      paramContext.append(paramInt);
      paramContext = paramContext.toString();
    case 20: 
    case 17: 
    case 16: 
    case 11: 
    case 10: 
    case 9: 
    case 8: 
      for (;;)
      {
        Log.e("GoogleApiAvailability", paramContext);
        return null;
        Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
        return e(paramContext, "common_google_play_services_restricted_profile_title");
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        return e(paramContext, "common_google_play_services_sign_in_failed_title");
        paramContext = "One of the API components you attempted to connect to is not available.";
        continue;
        paramContext = "The application is not licensed to the user.";
        continue;
        paramContext = "Developer error occurred. Please see logs for detailed information";
        continue;
        paramContext = "Google Play services is invalid. Cannot recover.";
        continue;
        paramContext = "Internal error occurred. Please see logs for detailed information";
      }
    case 7: 
      Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
      return e(paramContext, "common_google_play_services_network_error_title");
    case 5: 
      Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
      return e(paramContext, "common_google_play_services_invalid_account_title");
    case 4: 
    case 6: 
    case 18: 
      return null;
    case 3: 
      return localResources.getString(2131886125);
    case 2: 
      return localResources.getString(2131886135);
    }
    return localResources.getString(2131886128);
  }
  
  public static String d(Context paramContext, String paramString1, String paramString2)
  {
    Resources localResources = paramContext.getResources();
    paramString1 = e(paramContext, paramString1);
    paramContext = paramString1;
    if (paramString1 == null) {
      paramContext = localResources.getString(2131886131);
    }
    return String.format(getConfigurationlocale, paramContext, new Object[] { paramString2 });
  }
  
  public static String e(Context paramContext, String paramString)
  {
    synchronized (a)
    {
      localObject = paramContext.getResources().getConfiguration();
      if (Build.VERSION.SDK_INT >= 24)
      {
        LocaleList localLocaleList = f.a((Configuration)localObject);
        localObject = new a0/i;
        m localm = new a0/m;
        localm.<init>(localLocaleList);
        ((a0.i)localObject).<init>(localm);
      }
    }
    Object localObject = a0.i.a(new Locale[] { locale });
    localObject = ((a0.i)localObject).c(0);
    if (!((Locale)localObject).equals(b))
    {
      ???.clear();
      b = (Locale)localObject;
    }
    localObject = (String)???.getOrDefault(paramString, null);
    if (localObject != null) {
      return (String)localObject;
    }
    int i = j6.i.e;
    try
    {
      paramContext = paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext = null;
    }
    if (paramContext == null) {
      return null;
    }
    i = paramContext.getIdentifier(paramString, "string", "com.google.android.gms");
    if (i == 0)
    {
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      paramContext.append("Missing resource: ");
      paramContext.append(paramString);
      Log.w("GoogleApiAvailability", paramContext.toString());
      return null;
    }
    paramContext = paramContext.getString(i);
    if (TextUtils.isEmpty(paramContext))
    {
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      paramContext.append("Got empty resource: ");
      paramContext.append(paramString);
      Log.w("GoogleApiAvailability", paramContext.toString());
      return null;
    }
    a.put(paramString, paramContext);
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     m6.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */