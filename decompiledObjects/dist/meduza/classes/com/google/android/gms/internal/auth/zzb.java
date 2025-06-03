package com.google.android.gms.internal.auth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzb
  extends Binder
  implements IInterface
{
  public zzb(String paramString)
  {
    attachInterface(this, paramString);
  }
  
  public final IBinder asBinder()
  {
    return this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 > 16777215)
    {
      if (super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2)) {
        return true;
      }
    }
    else {
      paramParcel1.enforceInterface(getInterfaceDescriptor());
    }
    return zza(paramInt1, paramParcel1, paramParcel2, paramInt2);
  }
  
  public boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    throw null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */