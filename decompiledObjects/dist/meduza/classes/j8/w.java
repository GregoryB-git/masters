package j8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import u7.f;

public final class w
{
  public final SharedPreferences a;
  public final f b;
  public final Object c;
  public TaskCompletionSource<Void> d;
  public boolean e;
  public boolean f;
  public Boolean g;
  public final TaskCompletionSource<Void> h;
  
  public w(f paramf)
  {
    Object localObject1 = new Object();
    c = localObject1;
    d = new TaskCompletionSource();
    e = false;
    f = false;
    h = new TaskCompletionSource();
    paramf.a();
    Context localContext = a;
    b = paramf;
    paramf = localContext.getSharedPreferences("com.google.firebase.crashlytics", 0);
    a = paramf;
    if (paramf.contains("firebase_crashlytics_collection_enabled"))
    {
      f = false;
      paramf = Boolean.valueOf(paramf.getBoolean("firebase_crashlytics_collection_enabled", true));
    }
    else
    {
      paramf = null;
    }
    Object localObject2 = paramf;
    if (paramf == null) {
      localObject2 = a(localContext);
    }
    g = ((Boolean)localObject2);
    try
    {
      if (b())
      {
        d.trySetResult(null);
        e = true;
      }
      return;
    }
    finally {}
  }
  
  public final Boolean a(Context paramContext)
  {
    try
    {
      Object localObject = paramContext.getPackageManager();
      if (localObject != null)
      {
        paramContext = ((PackageManager)localObject).getApplicationInfo(paramContext.getPackageName(), 128);
        if (paramContext != null)
        {
          localObject = metaData;
          if ((localObject != null) && (((BaseBundle)localObject).containsKey("firebase_crashlytics_collection_enabled"))) {
            paramContext = Boolean.valueOf(metaData.getBoolean("firebase_crashlytics_collection_enabled"));
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", paramContext);
      paramContext = null;
    }
    if (paramContext == null)
    {
      f = false;
      return null;
    }
    f = true;
    return Boolean.valueOf(Boolean.TRUE.equals(paramContext));
  }
  
  public final boolean b()
  {
    try
    {
      Boolean localBoolean = g;
      boolean bool;
      if (localBoolean != null) {
        bool = localBoolean.booleanValue();
      } else {
        try
        {
          bool = b.k();
        }
        catch (IllegalStateException localIllegalStateException)
        {
          bool = false;
        }
      }
      c(bool);
      return bool;
    }
    finally {}
  }
  
  public final void c(boolean paramBoolean)
  {
    String str1;
    if (paramBoolean) {
      str1 = "ENABLED";
    } else {
      str1 = "DISABLED";
    }
    if (g == null) {
      str2 = "global Firebase setting";
    } else if (f) {
      str2 = "firebase_crashlytics_collection_enabled manifest flag";
    } else {
      str2 = "API";
    }
    int i = 0;
    String str2 = String.format("Crashlytics automatic data collection %s by %s.", new Object[] { str1, str2 });
    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
      i = 1;
    }
    if (i != 0) {
      Log.d("FirebaseCrashlytics", str2, null);
    }
  }
}

/* Location:
 * Qualified Name:     j8.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */