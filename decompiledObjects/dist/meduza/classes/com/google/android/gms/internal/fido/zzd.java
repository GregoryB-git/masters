package com.google.android.gms.internal.fido;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class zzd
  extends zzb
  implements zze
{
  public zzd()
  {
    super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = false;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      Status localStatus = (Status)zzc.zza(paramParcel1, Status.CREATOR);
      zzc.zzc(paramParcel1);
      zzc(localStatus);
    }
    else
    {
      paramInt1 = zzc.zza;
      paramInt1 = paramParcel1.readInt();
      zzc.zzc(paramParcel1);
      if (paramInt1 != 0) {
        bool = true;
      }
      zzb(bool);
    }
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */