package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzdy
  extends zzbu
  implements zzdw
{
  public zzdy(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
  }
  
  public final int zza()
  {
    Parcel localParcel = zza(2, b_());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final void zza(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbw.zza(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    zzb(1, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzdy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */