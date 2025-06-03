package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class A0
  extends Y
  implements y0
{
  public A0(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
  }
  
  public final void l(Bundle paramBundle)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramBundle);
    v(1, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.A0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */