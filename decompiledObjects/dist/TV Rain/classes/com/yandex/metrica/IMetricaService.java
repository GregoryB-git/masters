package com.yandex.metrica;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.yandex.metrica.impl.ob.p1;

public abstract interface IMetricaService
  extends IInterface
{
  public abstract void a(int paramInt, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void a(Bundle paramBundle)
    throws RemoteException;
  
  public abstract void b(Bundle paramBundle)
    throws RemoteException;
  
  public abstract void reportData(Bundle paramBundle)
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements IMetricaService
  {
    public a()
    {
      attachInterface(this, "com.yandex.metrica.IMetricaService");
    }
    
    public static IMetricaService a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.yandex.metrica.IMetricaService");
      if ((localIInterface != null) && ((localIInterface instanceof IMetricaService))) {
        return (IMetricaService)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      if (paramInt1 != 1598968902)
      {
        String str1 = null;
        Object localObject1 = null;
        Object localObject2 = null;
        Object localObject3 = null;
        String str2 = null;
        if (paramInt1 != 1)
        {
          if (paramInt1 != 2)
          {
            if (paramInt1 != 3)
            {
              if (paramInt1 != 4)
              {
                if (paramInt1 != 5) {
                  return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
                }
                paramParcel1.enforceInterface("com.yandex.metrica.IMetricaService");
                paramInt1 = paramParcel1.readInt();
                paramParcel2 = str2;
                if (paramParcel1.readInt() != 0) {
                  paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                }
                MetricaService.a().a(paramInt1, paramParcel2);
                return true;
              }
              paramParcel1.enforceInterface("com.yandex.metrica.IMetricaService");
              paramParcel2 = str1;
              if (paramParcel1.readInt() != 0) {
                paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
              }
              MetricaService.a().a(paramParcel2);
              return true;
            }
            paramParcel1.enforceInterface("com.yandex.metrica.IMetricaService");
            paramParcel2 = (Parcel)localObject1;
            if (paramParcel1.readInt() != 0) {
              paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
            }
            MetricaService.a().b(paramParcel2);
            return true;
          }
          paramParcel1.enforceInterface("com.yandex.metrica.IMetricaService");
          paramParcel2 = (Parcel)localObject2;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          MetricaService.a().reportData(paramParcel2);
          return true;
        }
        paramParcel1.enforceInterface("com.yandex.metrica.IMetricaService");
        str1 = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        str2 = paramParcel1.readString();
        paramParcel2 = (Parcel)localObject3;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        MetricaService.a().a(str1, paramInt1, str2, paramParcel2);
        return true;
      }
      paramParcel2.writeString("com.yandex.metrica.IMetricaService");
      return true;
    }
    
    public static class a
      implements IMetricaService
    {
      private IBinder a;
      
      public a(IBinder paramIBinder)
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
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.IMetricaService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */