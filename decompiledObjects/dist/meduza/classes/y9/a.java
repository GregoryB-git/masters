package y9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import c9.c;

public final class a
{
  public final Context a;
  public final SharedPreferences b;
  public final c c;
  public boolean d;
  
  public a(Context paramContext, String paramString, c paramc)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      paramContext = v.a.createDeviceProtectedStorageContext(paramContext);
    }
    a = paramContext;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("com.google.firebase.common.prefs:");
    localStringBuilder.append(paramString);
    paramContext = paramContext.getSharedPreferences(localStringBuilder.toString(), 0);
    b = paramContext;
    c = paramc;
    boolean bool;
    if (paramContext.contains("firebase_data_collection_default_enabled")) {
      bool = paramContext.getBoolean("firebase_data_collection_default_enabled", true);
    } else {
      bool = a();
    }
    d = bool;
  }
  
  public final boolean a()
  {
    try
    {
      Object localObject = a.getPackageManager();
      if (localObject != null)
      {
        localObject = ((PackageManager)localObject).getApplicationInfo(a.getPackageName(), 128);
        if (localObject != null)
        {
          Bundle localBundle = metaData;
          if ((localBundle != null) && (localBundle.containsKey("firebase_data_collection_default_enabled")))
          {
            boolean bool = metaData.getBoolean("firebase_data_collection_default_enabled");
            return bool;
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     y9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */