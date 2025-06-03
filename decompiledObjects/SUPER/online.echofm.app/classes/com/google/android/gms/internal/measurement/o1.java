package com.google.android.gms.internal.measurement;

import A2.n;
import H2.b;
import android.app.Activity;
import android.os.BaseBundle;
import android.os.Bundle;

public final class o1
  extends J0.a
{
  public o1(J0.c paramc, Bundle paramBundle, Activity paramActivity)
  {
    super(o);
  }
  
  public final void a()
  {
    Bundle localBundle2;
    if (s != null)
    {
      Bundle localBundle1 = new Bundle();
      localBundle2 = localBundle1;
      if (s.containsKey("com.google.app_measurement.screen_service"))
      {
        Object localObject = s.get("com.google.app_measurement.screen_service");
        localBundle2 = localBundle1;
        if ((localObject instanceof Bundle))
        {
          localBundle1.putBundle("com.google.app_measurement.screen_service", (Bundle)localObject);
          localBundle2 = localBundle1;
        }
      }
    }
    else
    {
      localBundle2 = null;
    }
    ((x0)n.i(J0.d(u.o))).onActivityCreated(b.Z0(t), localBundle2, p);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.o1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */