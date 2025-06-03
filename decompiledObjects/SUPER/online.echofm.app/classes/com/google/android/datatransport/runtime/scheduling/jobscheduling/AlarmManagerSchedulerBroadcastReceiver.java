package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.util.Base64;
import f2.p;
import f2.p.a;
import f2.u;
import m2.r;

public class AlarmManagerSchedulerBroadcastReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str1 = paramIntent.getData().getQueryParameter("backendName");
    String str2 = paramIntent.getData().getQueryParameter("extras");
    int i = Integer.valueOf(paramIntent.getData().getQueryParameter("priority")).intValue();
    int j = paramIntent.getExtras().getInt("attemptNumber");
    u.f(paramContext);
    paramContext = p.a().b(str1).d(q2.a.b(i));
    if (str2 != null) {
      paramContext.c(Base64.decode(str2, 0));
    }
    u.c().e().v(paramContext.a(), j, new m2.a());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */