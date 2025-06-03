package com.google.android.gms.internal.fido;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class zzq
  extends zzb
  implements zzr
{
  public zzq()
  {
    super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      Status localStatus = (Status)zzc.zza(paramParcel1, Status.CREATOR);
      paramParcel2 = (PendingIntent)zzc.zza(paramParcel1, PendingIntent.CREATOR);
      zzc.zzc(paramParcel1);
      zzb(localStatus, paramParcel2);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */