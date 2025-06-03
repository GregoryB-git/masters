package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import z5.c;

public abstract class zzl
  extends zzb
  implements zzm
{
  public zzl()
  {
    super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 2)
    {
      paramParcel2 = (Status)zzc.zza(paramParcel1, Status.CREATOR);
      c localc = (c)zzc.zza(paramParcel1, c.CREATOR);
      zzc.zzb(paramParcel1);
      zzb(paramParcel2, localc);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */