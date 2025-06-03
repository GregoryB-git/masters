package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class e0
  extends Y
  implements c0
{
  public e0(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
  }
  
  public final Bundle l(Bundle paramBundle)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramBundle);
    localParcel = o(1, localParcel);
    paramBundle = (Bundle)a0.a(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return paramBundle;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */