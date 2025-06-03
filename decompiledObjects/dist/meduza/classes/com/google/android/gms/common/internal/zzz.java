package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import j6.u;
import m6.b0;
import m6.w0;

public abstract class zzz
  extends zzb
  implements b0
{
  public zzz()
  {
    super("com.google.android.gms.common.internal.ICertData");
  }
  
  public static b0 zzg(IBinder paramIBinder)
  {
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
    if ((localIInterface instanceof b0)) {
      return (b0)localIInterface;
    }
    return new w0(paramIBinder);
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramInt1 = a;
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
    }
    else
    {
      paramParcel1 = ((u)this).zzd();
      paramParcel2.writeNoException();
      zzc.zze(paramParcel2, paramParcel1);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */