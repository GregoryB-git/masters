package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzdp
  extends zzbx
  implements zzdq
{
  public zzdp()
  {
    super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      Bundle localBundle = (Bundle)zzbw.zza(paramParcel1, Bundle.CREATOR);
      zzbw.zzb(paramParcel1);
      zza(localBundle);
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzdp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */