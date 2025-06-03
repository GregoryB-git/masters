package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzds
  extends zzbu
  implements zzdq
{
  public zzds(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
  }
  
  public final void zza(Bundle paramBundle)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramBundle);
    zzb(1, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzds
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */