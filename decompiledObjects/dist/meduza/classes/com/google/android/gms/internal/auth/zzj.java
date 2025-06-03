package com.google.android.gms.internal.auth;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class zzj
  extends zzb
  implements zzk
{
  public zzj()
  {
    super("com.google.android.gms.auth.account.data.IBundleCallback");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 2)
    {
      paramParcel2 = (Status)zzc.zza(paramParcel1, Status.CREATOR);
      Bundle localBundle = (Bundle)zzc.zza(paramParcel1, Bundle.CREATOR);
      zzc.zzb(paramParcel1);
      zzb(paramParcel2, localBundle);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */