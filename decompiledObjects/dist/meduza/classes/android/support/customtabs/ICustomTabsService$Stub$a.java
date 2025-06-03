package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class ICustomTabsService$Stub$a
  implements ICustomTabsService
{
  public IBinder a;
  
  public ICustomTabsService$Stub$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final int H1(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(ICustomTabsService.h);
      localParcel1.writeStrongInterface(paramICustomTabsCallback);
      localParcel1.writeString(paramString);
      ICustomTabsService.a.b(localParcel1, paramBundle, 0);
      a.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final boolean T(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(ICustomTabsService.h);
      localParcel1.writeStrongInterface(paramICustomTabsCallback);
      boolean bool = false;
      ICustomTabsService.a.b(localParcel1, paramUri, 0);
      ICustomTabsService.a.b(localParcel1, paramBundle, 0);
      if (paramList == null)
      {
        localParcel1.writeInt(-1);
      }
      else
      {
        int i = paramList.size();
        localParcel1.writeInt(i);
        for (j = 0; j < i; j++) {
          ICustomTabsService.a.b(localParcel1, (Parcelable)paramList.get(j), 0);
        }
      }
      a.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int j = localParcel2.readInt();
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final boolean T1(ICustomTabsCallback paramICustomTabsCallback)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(ICustomTabsService.h);
      localParcel1.writeStrongInterface(paramICustomTabsCallback);
      paramICustomTabsCallback = a;
      boolean bool = false;
      paramICustomTabsCallback.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final boolean U1(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(ICustomTabsService.h);
      localParcel1.writeStrongInterface(paramICustomTabsCallback);
      boolean bool = false;
      ICustomTabsService.a.b(localParcel1, paramUri, 0);
      ICustomTabsService.a.b(localParcel1, paramBundle, 0);
      a.transact(11, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final boolean U2(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(ICustomTabsService.h);
      localParcel1.writeStrongInterface(paramICustomTabsCallback);
      boolean bool = false;
      ICustomTabsService.a.b(localParcel1, paramBundle, 0);
      a.transact(13, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final boolean W1(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(ICustomTabsService.h);
      localParcel1.writeStrongInterface(paramICustomTabsCallback);
      boolean bool = false;
      ICustomTabsService.a.b(localParcel1, paramBundle, 0);
      a.transact(10, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  public final boolean d2(ICustomTabsCallback paramICustomTabsCallback, IBinder paramIBinder, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(ICustomTabsService.h);
      localParcel1.writeStrongInterface(paramICustomTabsCallback);
      localParcel1.writeStrongBinder(paramIBinder);
      boolean bool = false;
      ICustomTabsService.a.b(localParcel1, paramBundle, 0);
      a.transact(14, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final boolean g1(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(ICustomTabsService.h);
      localParcel1.writeLong(paramLong);
      IBinder localIBinder = a;
      boolean bool = false;
      localIBinder.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final boolean i2(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(ICustomTabsService.h);
      localParcel1.writeStrongInterface(paramICustomTabsCallback);
      boolean bool = false;
      ICustomTabsService.a.b(localParcel1, paramBundle, 0);
      a.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final boolean p0(int paramInt, Uri paramUri, Bundle paramBundle, ICustomTabsCallback paramICustomTabsCallback)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(ICustomTabsService.h);
      localParcel1.writeStrongInterface(paramICustomTabsCallback);
      localParcel1.writeInt(paramInt);
      boolean bool = false;
      ICustomTabsService.a.b(localParcel1, paramUri, 0);
      ICustomTabsService.a.b(localParcel1, paramBundle, 0);
      a.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramInt = localParcel2.readInt();
      if (paramInt != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final boolean s2(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(ICustomTabsService.h);
      localParcel1.writeStrongInterface(paramICustomTabsCallback);
      boolean bool = false;
      ICustomTabsService.a.b(localParcel1, paramUri, 0);
      a.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     android.support.customtabs.ICustomTabsService.Stub.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */