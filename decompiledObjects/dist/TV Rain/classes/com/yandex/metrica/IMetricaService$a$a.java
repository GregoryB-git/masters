package com.yandex.metrica;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

class IMetricaService$a$a
  implements IMetricaService
{
  private IBinder a;
  
  public IMetricaService$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public void a(int paramInt, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.yandex.metrica.IMetricaService");
      localParcel.writeInt(paramInt);
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      else
      {
        localParcel.writeInt(0);
      }
      if (!a.transact(5, localParcel, null, 1)) {
        paramInt = IMetricaService.a.a;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void a(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.yandex.metrica.IMetricaService");
      localParcel.writeInt(1);
      paramBundle.writeToParcel(localParcel, 0);
      if (!a.transact(4, localParcel, null, 1)) {
        int i = IMetricaService.a.a;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public IBinder asBinder()
  {
    return a;
  }
  
  public void b(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.yandex.metrica.IMetricaService");
      localParcel.writeInt(1);
      paramBundle.writeToParcel(localParcel, 0);
      if (!a.transact(3, localParcel, null, 1)) {
        int i = IMetricaService.a.a;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void reportData(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.yandex.metrica.IMetricaService");
      localParcel.writeInt(1);
      paramBundle.writeToParcel(localParcel, 0);
      if (!a.transact(2, localParcel, null, 1)) {
        int i = IMetricaService.a.a;
      }
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.IMetricaService.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */