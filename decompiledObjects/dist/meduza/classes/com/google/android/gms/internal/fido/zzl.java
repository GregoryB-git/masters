package com.google.android.gms.internal.fido;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class zzl
  extends zzb
  implements zzm
{
  public zzl()
  {
    super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      paramParcel2 = (Status)zzc.zza(paramParcel1, Status.CREATOR);
      PendingIntent localPendingIntent = (PendingIntent)zzc.zza(paramParcel1, PendingIntent.CREATOR);
      zzc.zzc(paramParcel1);
      zzb(paramParcel2, localPendingIntent);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */