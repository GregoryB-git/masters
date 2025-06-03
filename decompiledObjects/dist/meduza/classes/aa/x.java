package aa;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import p2.q;

public final class x
{
  public static void a(Context paramContext)
  {
    Object localObject1 = y.a(paramContext);
    int i = 0;
    if (((SharedPreferences)localObject1).getBoolean("proxy_notification_initialized", false)) {
      return;
    }
    try
    {
      localObject1 = paramContext.getApplicationContext();
      Object localObject2 = ((Context)localObject1).getPackageManager();
      if (localObject2 != null)
      {
        localObject1 = ((PackageManager)localObject2).getApplicationInfo(((Context)localObject1).getPackageName(), 128);
        if (localObject1 != null)
        {
          localObject2 = metaData;
          if ((localObject2 != null) && (((BaseBundle)localObject2).containsKey("firebase_messaging_notification_delegation_enabled"))) {
            bool = metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      boolean bool;
      for (;;) {}
    }
    bool = true;
    if (Build.VERSION.SDK_INT >= 29) {
      i = 1;
    }
    if (i == 0)
    {
      Tasks.forResult(null);
    }
    else
    {
      localObject1 = new TaskCompletionSource();
      new q(paramContext, bool, (TaskCompletionSource)localObject1).run();
      ((TaskCompletionSource)localObject1).getTask();
    }
  }
}

/* Location:
 * Qualified Name:     aa.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */