package aa;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.List;
import u7.f;
import u7.j;
import v6.e;

public final class r
{
  public final Context a;
  public String b;
  public String c;
  public int d;
  public int e = 0;
  
  public r(Context paramContext)
  {
    a = paramContext;
  }
  
  public static String a(f paramf)
  {
    paramf.a();
    String str = c.e;
    if (str != null) {
      return str;
    }
    paramf.a();
    paramf = c.b;
    if (!paramf.startsWith("1:")) {
      return paramf;
    }
    paramf = paramf.split(":");
    if (paramf.length < 2) {
      return null;
    }
    paramf = paramf[1];
    if (paramf.isEmpty()) {
      return null;
    }
    return paramf;
  }
  
  public final PackageInfo b(String paramString)
  {
    try
    {
      paramString = a.getPackageManager().getPackageInfo(paramString, 0);
      return paramString;
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to find package ");
      localStringBuilder.append(paramString);
      Log.w("FirebaseMessaging", localStringBuilder.toString());
    }
    return null;
  }
  
  public final boolean c()
  {
    try
    {
      int i = e;
      boolean bool = true;
      if (i == 0)
      {
        Object localObject1 = a.getPackageManager();
        if (((PackageManager)localObject1).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1)
        {
          Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
          i = 0;
          break label200;
        }
        if (!e.a())
        {
          localObject3 = new android/content/Intent;
          ((Intent)localObject3).<init>("com.google.android.c2dm.intent.REGISTER");
          ((Intent)localObject3).setPackage("com.google.android.gms");
          localObject3 = ((PackageManager)localObject1).queryIntentServices((Intent)localObject3, 0);
          if ((localObject3 != null) && (((List)localObject3).size() > 0))
          {
            e = 1;
            i = 1;
            break label200;
          }
        }
        Object localObject3 = new android/content/Intent;
        ((Intent)localObject3).<init>("com.google.iid.TOKEN_REQUEST");
        ((Intent)localObject3).setPackage("com.google.android.gms");
        localObject1 = ((PackageManager)localObject1).queryBroadcastReceivers((Intent)localObject3, 0);
        i = 2;
        if ((localObject1 != null) && (((List)localObject1).size() > 0))
        {
          e = 2;
          break label200;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (e.a()) {
          e = 2;
        } else {
          e = 1;
        }
        i = e;
      }
      label200:
      if (i == 0) {
        bool = false;
      }
      return bool;
    }
    finally {}
  }
  
  public final void d()
  {
    try
    {
      PackageInfo localPackageInfo = b(a.getPackageName());
      if (localPackageInfo != null)
      {
        b = Integer.toString(versionCode);
        c = versionName;
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     aa.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */