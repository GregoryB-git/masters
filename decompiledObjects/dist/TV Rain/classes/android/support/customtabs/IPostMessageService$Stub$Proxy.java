package android.support.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

class IPostMessageService$Stub$Proxy
  implements IPostMessageService
{
  private IBinder mRemote;
  
  public IPostMessageService$Stub$Proxy(IBinder paramIBinder)
  {
    mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "android.support.customtabs.IPostMessageService";
  }
  
  public void onMessageChannelReady(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.customtabs.IPostMessageService");
      if (paramICustomTabsCallback != null) {
        paramICustomTabsCallback = paramICustomTabsCallback.asBinder();
      } else {
        paramICustomTabsCallback = null;
      }
      localParcel1.writeStrongBinder(paramICustomTabsCallback);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      else
      {
        localParcel1.writeInt(0);
      }
      mRemote.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void onPostMessage(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.customtabs.IPostMessageService");
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
      mRemote.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     android.support.customtabs.IPostMessageService.Stub.Proxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */