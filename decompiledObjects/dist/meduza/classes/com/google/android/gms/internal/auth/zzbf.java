package com.google.android.gms.internal.auth;

import android.os.Parcel;
import f6.b;

public abstract class zzbf
  extends zzb
  implements zzbg
{
  public zzbf()
  {
    super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      localObject = paramParcel1.readString();
      zzc.zzb(paramParcel1);
      zzc((String)localObject);
    }
    else
    {
      localObject = (b)zzc.zza(paramParcel1, b.CREATOR);
      zzc.zzb(paramParcel1);
      zzb((b)localObject);
    }
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzbf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */