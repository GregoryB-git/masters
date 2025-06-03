package A2;

import E.g;
import E2.i;
import G2.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import t.h;
import v2.b;
import x2.m;
import x2.p;

public abstract class y
{
  public static final h a = new h();
  public static Locale b;
  
  public static String a(Context paramContext)
  {
    String str1 = paramContext.getPackageName();
    try
    {
      String str2 = G2.d.a(paramContext).d(str1).toString();
      return str2;
    }
    catch (PackageManager.NameNotFoundException|NullPointerException localNameNotFoundException)
    {
      paramContext = getApplicationInfoname;
      if (TextUtils.isEmpty(paramContext)) {
        return str1;
      }
    }
    return paramContext;
  }
  
  public static String b(Context paramContext)
  {
    return paramContext.getResources().getString(b.g);
  }
  
  public static String c(Context paramContext, int paramInt)
  {
    paramContext = paramContext.getResources();
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          paramInt = 17039370;
        }
      }
    }
    for (;;)
    {
      return paramContext.getString(paramInt);
      paramInt = b.a;
      continue;
      paramInt = b.j;
      continue;
      paramInt = b.d;
    }
  }
  
  public static String d(Context paramContext, int paramInt)
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
                    return localResources.getString(p.a, new Object[] { str });
                  case 18: 
                    return localResources.getString(b.m, new Object[] { str });
                  case 17: 
                    return h(paramContext, "common_google_play_services_sign_in_failed_text", str);
                  }
                  return h(paramContext, "common_google_play_services_api_unavailable_text", str);
                }
                return h(paramContext, "common_google_play_services_restricted_profile_text", str);
              }
              return localResources.getString(b.i, new Object[] { str });
            }
            return h(paramContext, "common_google_play_services_network_error_text", str);
          }
          return h(paramContext, "common_google_play_services_invalid_account_text", str);
        }
        return localResources.getString(b.b, new Object[] { str });
      }
      if (i.d(paramContext)) {
        return localResources.getString(b.n);
      }
      return localResources.getString(b.k, new Object[] { str });
    }
    return localResources.getString(b.e, new Object[] { str });
  }
  
  public static String e(Context paramContext, int paramInt)
  {
    if ((paramInt != 6) && (paramInt != 19)) {
      return d(paramContext, paramInt);
    }
    return h(paramContext, "common_google_play_services_resolution_required_text", a(paramContext));
  }
  
  public static String f(Context paramContext, int paramInt)
  {
    String str;
    if (paramInt == 6) {
      str = i(paramContext, "common_google_play_services_resolution_required_title");
    } else {
      str = g(paramContext, paramInt);
    }
    if (str == null) {
      return paramContext.getResources().getString(b.h);
    }
    return str;
  }
  
  public static String g(Context paramContext, int paramInt)
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
        return i(paramContext, "common_google_play_services_restricted_profile_title");
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        return i(paramContext, "common_google_play_services_sign_in_failed_title");
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
      return i(paramContext, "common_google_play_services_network_error_title");
    case 5: 
      Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
      return i(paramContext, "common_google_play_services_invalid_account_title");
    case 4: 
    case 6: 
    case 18: 
      return null;
    case 3: 
      return localResources.getString(b.c);
    case 2: 
      return localResources.getString(b.l);
    }
    return localResources.getString(b.f);
  }
  
  public static String h(Context paramContext, String paramString1, String paramString2)
  {
    Resources localResources = paramContext.getResources();
    paramString1 = i(paramContext, paramString1);
    paramContext = paramString1;
    if (paramString1 == null) {
      paramContext = localResources.getString(p.a);
    }
    return String.format(getConfigurationlocale, paramContext, new Object[] { paramString2 });
  }
  
  public static String i(Context paramContext, String paramString)
  {
    synchronized (a)
    {
      localObject = E.d.a(paramContext.getResources().getConfiguration()).c(0);
      if (!((Locale)localObject).equals(b))
      {
        ???.clear();
        b = (Locale)localObject;
      }
    }
    Object localObject = (String)???.get(paramString);
    if (localObject != null) {
      return (String)localObject;
    }
    paramContext = m.c(paramContext);
    if (paramContext == null) {
      return null;
    }
    int i = paramContext.getIdentifier(paramString, "string", "com.google.android.gms");
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
    ???.put(paramString, paramContext);
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     A2.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */