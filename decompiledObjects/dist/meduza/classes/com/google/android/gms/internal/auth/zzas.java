package com.google.android.gms.internal.auth;

import android.os.Parcel;
import c6.a;
import c6.b;
import c6.i;
import com.google.android.gms.common.api.Status;

public abstract class zzas
  extends zzb
  implements zzat
{
  public zzas()
  {
    super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject;
    switch (paramInt1)
    {
    default: 
      return false;
    case 7: 
      paramParcel2 = (a)zzc.zza(paramParcel1, a.CREATOR);
      zzc.zzb(paramParcel1);
      zzc(paramParcel2);
      break;
    case 6: 
      paramParcel2 = paramParcel1.createByteArray();
      zzc.zzb(paramParcel1);
      zzb(paramParcel2);
      break;
    case 5: 
      paramParcel2 = (Status)zzc.zza(paramParcel1, Status.CREATOR);
      zzc.zzb(paramParcel1);
      zzd(paramParcel2);
      break;
    case 4: 
      zze();
      break;
    case 3: 
      localObject = (Status)zzc.zza(paramParcel1, Status.CREATOR);
      paramParcel2 = (b)zzc.zza(paramParcel1, b.CREATOR);
      zzc.zzb(paramParcel1);
      zzg((Status)localObject, paramParcel2);
      break;
    case 2: 
      paramParcel2 = (Status)zzc.zza(paramParcel1, Status.CREATOR);
      localObject = (i)zzc.zza(paramParcel1, i.CREATOR);
      zzc.zzb(paramParcel1);
      zzf(paramParcel2, (i)localObject);
      break;
    case 1: 
      paramParcel2 = (Status)zzc.zza(paramParcel1, Status.CREATOR);
      zzc.zzb(paramParcel1);
      zzh(paramParcel2);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzas
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */