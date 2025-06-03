package com.google.android.gms.internal.fido;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

public abstract class zzf
  extends zzb
  implements zzg
{
  public zzf()
  {
    super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      localObject = (Status)zzc.zza(paramParcel1, Status.CREATOR);
      zzc.zzc(paramParcel1);
      zzc((Status)localObject);
    }
    else
    {
      localObject = zzc.zzb(paramParcel1);
      zzc.zzc(paramParcel1);
      zzb((List)localObject);
    }
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */