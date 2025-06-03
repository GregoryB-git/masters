package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import java.util.List;

class ICustomTabsService$Stub$Proxy
  implements ICustomTabsService
{
  private IBinder mRemote;
  
  public ICustomTabsService$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  public Bundle extraCommand(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
      localParcel1.writeString(paramString);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      mRemote.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0) {
        paramString = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
      } else {
        paramString = null;
      }
      return paramString;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public String getInterfaceDescriptor()
  {
    return "android.support.customtabs.ICustomTabsService";
  }
  
  public boolean mayLaunchUrl(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
      if (paramICustomTabsCallback != null) {
        paramICustomTabsCallback = paramICustomTabsCallback.asBinder();
      } else {
        paramICustomTabsCallback = null;
      }
      localParcel1.writeStrongBinder(paramICustomTabsCallback);
      boolean bool = true;
      if (paramUri != null)
      {
        localParcel1.writeInt(1);
        paramUri.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      localParcel1.writeTypedList(paramList);
      mRemote.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i == 0) {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean newSession(ICustomTabsCallback paramICustomTabsCallback)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
      if (paramICustomTabsCallback != null) {
        paramICustomTabsCallback = paramICustomTabsCallback.asBinder();
      } else {
        paramICustomTabsCallback = null;
      }
      localParcel1.writeStrongBinder(paramICustomTabsCallback);
      paramICustomTabsCallback = mRemote;
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
  
  public int postMessage(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
      if (paramICustomTabsCallback != null) {
        paramICustomTabsCallback = paramICustomTabsCallback.asBinder();
      } else {
        paramICustomTabsCallback = null;
      }
      localParcel1.writeStrongBinder(paramICustomTabsCallback);
      localParcel1.writeString(paramString);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      mRemote.transact(8, localParcel1, localParcel2, 0);
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
  
  public boolean requestPostMessageChannel(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
      if (paramICustomTabsCallback != null) {
        paramICustomTabsCallback = paramICustomTabsCallback.asBinder();
      } else {
        paramICustomTabsCallback = null;
      }
      localParcel1.writeStrongBinder(paramICustomTabsCallback);
      boolean bool = true;
      if (paramUri != null)
      {
        localParcel1.writeInt(1);
        paramUri.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      mRemote.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i == 0) {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean updateVisuals(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
      if (paramICustomTabsCallback != null) {
        paramICustomTabsCallback = paramICustomTabsCallback.asBinder();
      } else {
        paramICustomTabsCallback = null;
      }
      localParcel1.writeStrongBinder(paramICustomTabsCallback);
      boolean bool = true;
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      mRemote.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i == 0) {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean validateRelationship(ICustomTabsCallback paramICustomTabsCallback, int paramInt, Uri paramUri, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
      if (paramICustomTabsCallback != null) {
        paramICustomTabsCallback = paramICustomTabsCallback.asBinder();
      } else {
        paramICustomTabsCallback = null;
      }
      localParcel1.writeStrongBinder(paramICustomTabsCallback);
      localParcel1.writeInt(paramInt);
      boolean bool = true;
      if (paramUri != null)
      {
        localParcel1.writeInt(1);
        paramUri.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      mRemote.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramInt = localParcel2.readInt();
      if (paramInt == 0) {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean warmup(long paramLong)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
      localParcel1.writeLong(paramLong);
      IBinder localIBinder = mRemote;
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
}

/* Location:
 * Qualified Name:     android.support.customtabs.ICustomTabsService.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */