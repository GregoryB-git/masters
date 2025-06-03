package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzbx
  extends Binder
  implements IInterface
{
  public zzbx(String paramString)
  {
    attachInterface(this, paramString);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool;
    if (paramInt1 > 16777215)
    {
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    else
    {
      paramParcel1.enforceInterface(getInterfaceDescriptor());
      bool = false;
    }
    if (bool) {
      return true;
    }
    return zza(paramInt1, paramParcel1, paramParcel2, paramInt2);
  }
  
  public boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzbx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */