package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class G0
  extends Y
  implements E0
{
  public G0(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
  }
  
  public final void L(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    a0.d(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    v(1, localParcel);
  }
  
  public final int a()
  {
    Parcel localParcel = o(2, n());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.G0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */