package aa;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import u7.f;
import w7.a;
import x0.q0;

public final class k
  implements Application.ActivityLifecycleCallbacks
{
  public final ArrayDeque a = new ArrayDeque(10);
  
  public final void a(Intent paramIntent)
  {
    Object localObject1;
    Object localObject2;
    try
    {
      localObject1 = paramIntent.getExtras();
      if (localObject1 != null)
      {
        localObject2 = ((BaseBundle)localObject1).getString("google.message_id");
        paramIntent = (Intent)localObject2;
        if (localObject2 == null) {
          paramIntent = ((BaseBundle)localObject1).getString("message_id");
        }
        if (!TextUtils.isEmpty(paramIntent))
        {
          if (a.contains(paramIntent)) {
            return;
          }
          a.add(paramIntent);
        }
        paramIntent = ((Bundle)localObject1).getBundle("gcm.n.analytics_data");
      }
    }
    catch (RuntimeException paramIntent)
    {
      Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", paramIntent);
      paramIntent = null;
    }
    boolean bool;
    if (paramIntent == null) {
      bool = false;
    } else {
      bool = "1".equals(paramIntent.getString("google.c.a.e"));
    }
    if (bool)
    {
      if (paramIntent != null) {
        if ("1".equals(paramIntent.getString("google.c.a.tc")))
        {
          a locala = (a)f.e().c(a.class);
          if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
          }
          if (locala != null)
          {
            localObject1 = paramIntent.getString("google.c.a.c_id");
            locala.c((String)localObject1);
            localObject2 = new Bundle();
            ((BaseBundle)localObject2).putString("source", "Firebase");
            ((BaseBundle)localObject2).putString("medium", "notification");
            ((BaseBundle)localObject2).putString("campaign", (String)localObject1);
            locala.b("fcm", "_cmp", (Bundle)localObject2);
          }
          else
          {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
          }
        }
        else if (Log.isLoggable("FirebaseMessaging", 3))
        {
          Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
      }
      q.c(paramIntent, "_no");
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    paramActivity = paramActivity.getIntent();
    if (paramActivity == null) {
      return;
    }
    if (Build.VERSION.SDK_INT <= 25) {
      new Handler(Looper.getMainLooper()).post(new q0(16, this, paramActivity));
    } else {
      a(paramActivity);
    }
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity) {}
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
}

/* Location:
 * Qualified Name:     aa.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */