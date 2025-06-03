package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class B0
  extends b0
  implements y0
{
  public B0()
  {
    super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
  }
  
  public final boolean n(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      Bundle localBundle = (Bundle)a0.a(paramParcel1, Bundle.CREATOR);
      a0.f(paramParcel1);
      l(localBundle);
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.B0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */