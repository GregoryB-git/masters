package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzca
  extends zzbu
  implements zzbz
{
  public zzca(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
  }
  
  public final Bundle zza(Bundle paramBundle)
  {
    Object localObject = b_();
    zzbw.zza((Parcel)localObject, paramBundle);
    paramBundle = zza(1, (Parcel)localObject);
    localObject = (Bundle)zzbw.zza(paramBundle, Bundle.CREATOR);
    paramBundle.recycle();
    return (Bundle)localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzca
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */