package com.google.android.gms.measurement;

import R2.v2;
import R2.v2.a;
import V.a;
import android.content.Context;
import android.content.Intent;

public final class AppMeasurementReceiver
  extends a
  implements v2.a
{
  public v2 q;
  
  public final void a(Context paramContext, Intent paramIntent)
  {
    a.c(paramContext, paramIntent);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (q == null) {
      q = new v2(this);
    }
    q.a(paramContext, paramIntent);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.AppMeasurementReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */