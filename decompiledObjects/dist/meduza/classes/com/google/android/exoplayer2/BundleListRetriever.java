package com.google.android.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e0.f0;
import o7.t;
import o7.t.a;
import v5.e0;

public final class BundleListRetriever
  extends Binder
{
  static
  {
    if (e0.a >= 30) {
      f0.a();
    }
  }
  
  public static t<Bundle> getList(IBinder paramIBinder)
  {
    Object localObject = t.b;
    locala = new t.a();
    int i = 1;
    int j = 0;
    while (i != 0)
    {
      Parcel localParcel = Parcel.obtain();
      localObject = Parcel.obtain();
      try
      {
        localParcel.writeInt(j);
        try
        {
          paramIBinder.transact(1, localParcel, (Parcel)localObject, 0);
          for (;;)
          {
            i = ((Parcel)localObject).readInt();
            if (i != 1) {
              break;
            }
            Bundle localBundle = ((Parcel)localObject).readBundle();
            localBundle.getClass();
            locala.c(localBundle);
            j++;
          }
        }
        catch (RemoteException localRemoteException)
        {
          paramIBinder = new java/lang/RuntimeException;
          paramIBinder.<init>(localRemoteException);
          throw paramIBinder;
        }
        return locala.e();
      }
      finally
      {
        ((Parcel)localObject).recycle();
        localParcel.recycle();
      }
    }
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 != 1) {
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    if (paramParcel2 == null) {
      return false;
    }
    throw null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.BundleListRetriever
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */