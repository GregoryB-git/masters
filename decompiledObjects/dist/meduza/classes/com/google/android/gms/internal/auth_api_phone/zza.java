package com.google.android.gms.internal.auth_api_phone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza
  implements IInterface
{
  private final IBinder zza;
  private final String zzb;
  
  public zza(IBinder paramIBinder, String paramString)
  {
    zza = paramIBinder;
    zzb = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
  }
  
  public final IBinder asBinder()
  {
    return zza;
  }
  
  public final Parcel zza()
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(zzb);
    return localParcel;
  }
  
  public final void zzb(int paramInt, Parcel paramParcel)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      zza.transact(paramInt, paramParcel, localParcel, 0);
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
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */