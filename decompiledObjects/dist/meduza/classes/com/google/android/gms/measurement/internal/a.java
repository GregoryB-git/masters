package com.google.android.gms.measurement.internal;

import e7.h3;
import e7.j0;
import e7.j2;
import e7.k3;
import e7.o0;
import m6.j;

public final class a
  implements Runnable
{
  public final void run()
  {
    k3 localk3 = b.a.k();
    AppMeasurementDynamiteService.a locala = a;
    localk3.l();
    localk3.t();
    if (locala != null)
    {
      h3 localh3 = e;
      if (locala != localh3)
      {
        boolean bool;
        if (localh3 == null) {
          bool = true;
        } else {
          bool = false;
        }
        j.k(bool, "EventInterceptor already set.");
      }
    }
    e = locala;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */