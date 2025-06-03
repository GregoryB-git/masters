package com.google.android.gms.internal.auth_api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zba
  implements IInterface
{
  private final IBinder zba;
  private final String zbb;
  
  public zba(IBinder paramIBinder, String paramString)
  {
    zba = paramIBinder;
    zbb = paramString;
  }
  
  public final IBinder asBinder()
  {
    return zba;
  }
  
  public final Parcel zba()
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(zbb);
    return localParcel;
  }
  
  public final void zbb(int paramInt, Parcel paramParcel)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      zba.transact(paramInt, paramParcel, localParcel, 0);
      localParcel.readException();
      return;
    }
    finally
    {
      paramParcel.recycle();
      localParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zba
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */