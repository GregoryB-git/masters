package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.util.Base64;
import java.util.concurrent.Executor;
import k3.j.a;
import k3.s;
import k3.w;
import q3.f;
import q3.k;

public class AlarmManagerSchedulerBroadcastReceiver
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getData().getQueryParameter("backendName");
    Object localObject = paramIntent.getData().getQueryParameter("extras");
    int i = Integer.valueOf(paramIntent.getData().getQueryParameter("priority")).intValue();
    int j = paramIntent.getExtras().getInt("attemptNumber");
    w.b(paramContext);
    paramContext = s.a();
    paramContext.b(str);
    paramContext.c(u3.a.b(i));
    if (localObject != null) {
      b = Base64.decode((String)localObject, 0);
    }
    paramIntent = ad;
    paramContext = paramContext.a();
    localObject = new q3.a();
    e.execute(new f(paramIntent, paramContext, j, localObject, 0));
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */