package com.google.android.gms.measurement;

import a1.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;
import e7.a1;
import e7.b1;
import e7.j2;
import e7.u1;
import e7.u1.a;

public final class AppMeasurementReceiver
  extends a
  implements u1.a
{
  public u1 c;
  
  public final void onReceive(Context paramContext, Intent arg2)
  {
    if (c == null) {
      c = new u1(this);
    }
    Object localObject1 = c;
    localObject1.getClass();
    Object localObject2 = j2.a(paramContext, null, null).zzj();
    if (??? == null)
    {
      ??? = r;
      paramContext = "Receiver called with null intent";
    }
    else
    {
      ??? = ???.getAction();
      w.c("Local receiver got", ???);
      if ("com.google.android.gms.measurement.UPLOAD".equals(???))
      {
        Intent localIntent = new Intent().setClassName(paramContext, "com.google.android.gms.measurement.AppMeasurementService");
        localIntent.setAction("com.google.android.gms.measurement.UPLOAD");
        w.b("Starting wakeful intent.");
        ((AppMeasurementReceiver)a).getClass();
        synchronized (a.a)
        {
          int i = a.b;
          int j = i + 1;
          a.b = j;
          if (j <= 0) {
            a.b = 1;
          }
          localIntent.putExtra("androidx.contentpager.content.wakelockid", i);
          localObject1 = paramContext.startService(localIntent);
          if (localObject1 != null)
          {
            paramContext = (PowerManager)paramContext.getSystemService("power");
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((StringBuilder)localObject2).append("androidx.core:wake:");
            ((StringBuilder)localObject2).append(((ComponentName)localObject1).flattenToShortString());
            paramContext = paramContext.newWakeLock(1, ((StringBuilder)localObject2).toString());
            paramContext.setReferenceCounted(false);
            paramContext.acquire(60000L);
            ???.put(i, paramContext);
          }
        }
      }
      if (!"com.android.vending.INSTALL_REFERRER".equals(???)) {
        return;
      }
      ??? = r;
      paramContext = "Install Referrer Broadcasts are deprecated";
    }
    ???.b(paramContext);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.AppMeasurementReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */