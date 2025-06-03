package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract class IPostMessageService$Stub
  extends Binder
  implements IPostMessageService
{
  private static final String DESCRIPTOR = "android.support.customtabs.IPostMessageService";
  public static final int TRANSACTION_onMessageChannelReady = 2;
  public static final int TRANSACTION_onPostMessage = 3;
  
  public IPostMessageService$Stub()
  {
    attachInterface(this, "android.support.customtabs.IPostMessageService");
  }
  
  public static IPostMessageService asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.IPostMessageService");
    if ((localIInterface != null) && ((localIInterface instanceof IPostMessageService))) {
      return (IPostMessageService)localIInterface;
    }
    return new Proxy(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    String str = null;
    Object localObject = null;
    if (paramInt1 != 2)
    {
      if (paramInt1 != 3)
      {
        if (paramInt1 != 1598968902) {
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        }
        paramParcel2.writeString("android.support.customtabs.IPostMessageService");
        return true;
      }
      paramParcel1.enforceInterface("android.support.customtabs.IPostMessageService");
      localICustomTabsCallback = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
      str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      onPostMessage(localICustomTabsCallback, str, (Bundle)localObject);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("android.support.customtabs.IPostMessageService");
    ICustomTabsCallback localICustomTabsCallback = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
    localObject = str;
    if (paramParcel1.readInt() != 0) {
      localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
    }
    onMessageChannelReady(localICustomTabsCallback, (Bundle)localObject);
    paramParcel2.writeNoException();
    return true;
  }
  
  public static class Proxy
    implements IPostMessageService
  {
    private IBinder mRemote;
    
    public Proxy(IBinder paramIBinder)
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
}

/* Location:
 * Qualified Name:     android.support.customtabs.IPostMessageService.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */