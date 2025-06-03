package com.google.android.gms.internal.auth_api_phone;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class zzd
  extends zzb
  implements com.google.android.gms.internal.auth-api-phone.zze
{
  public zzd()
  {
    super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      paramParcel2 = (Status)zzc.zza(paramParcel1, Status.CREATOR);
      paramInt1 = paramParcel1.readInt();
      zzc.zzb(paramParcel1);
      zzb(paramParcel2, paramInt1);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */