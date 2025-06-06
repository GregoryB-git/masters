package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract class ICustomTabsCallback$Stub
  extends Binder
  implements ICustomTabsCallback
{
  private static final String DESCRIPTOR = "android.support.customtabs.ICustomTabsCallback";
  public static final int TRANSACTION_extraCallback = 3;
  public static final int TRANSACTION_onMessageChannelReady = 4;
  public static final int TRANSACTION_onNavigationEvent = 2;
  public static final int TRANSACTION_onPostMessage = 5;
  public static final int TRANSACTION_onRelationshipValidationResult = 6;
  
  public ICustomTabsCallback$Stub()
  {
    attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
  }
  
  public static ICustomTabsCallback asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
    if ((localIInterface != null) && ((localIInterface instanceof ICustomTabsCallback))) {
      return (ICustomTabsCallback)localIInterface;
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
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    if (paramInt1 != 2)
    {
      if (paramInt1 != 3)
      {
        if (paramInt1 != 4)
        {
          if (paramInt1 != 5)
          {
            if (paramInt1 != 6)
            {
              if (paramInt1 != 1598968902) {
                return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
              }
              paramParcel2.writeString("android.support.customtabs.ICustomTabsCallback");
              return true;
            }
            paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            paramInt1 = paramParcel1.readInt();
            if (paramParcel1.readInt() != 0) {
              localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
            } else {
              localObject1 = null;
            }
            boolean bool;
            if (paramParcel1.readInt() != 0) {
              bool = true;
            } else {
              bool = false;
            }
            if (paramParcel1.readInt() != 0) {
              localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
            }
            onRelationshipValidationResult(paramInt1, (Uri)localObject1, bool, (Bundle)localObject5);
            paramParcel2.writeNoException();
            return true;
          }
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
          localObject5 = paramParcel1.readString();
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          onPostMessage((String)localObject5, (Bundle)localObject1);
          paramParcel2.writeNoException();
          return true;
        }
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        localObject1 = localObject2;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        onMessageChannelReady((Bundle)localObject1);
        paramParcel2.writeNoException();
        return true;
      }
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
      localObject5 = paramParcel1.readString();
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      extraCallback((String)localObject5, (Bundle)localObject1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
    paramInt1 = paramParcel1.readInt();
    localObject1 = localObject4;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
    }
    onNavigationEvent(paramInt1, (Bundle)localObject1);
    paramParcel2.writeNoException();
    return true;
  }
  
  public static class Proxy
    implements ICustomTabsCallback
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
    
    public void extraCallback(String paramString, Bundle paramBundle)
      throws RemoteException
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
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
    
    public String getInterfaceDescriptor()
    {
      return "android.support.customtabs.ICustomTabsCallback";
    }
    
    public void onMessageChannelReady(Bundle paramBundle)
      throws RemoteException
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
        }
        else
        {
          localParcel1.writeInt(0);
        }
        mRemote.transact(4, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public void onNavigationEvent(int paramInt, Bundle paramBundle)
      throws RemoteException
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
        localParcel1.writeInt(paramInt);
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
    
    public void onPostMessage(String paramString, Bundle paramBundle)
      throws RemoteException
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
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
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public void onRelationshipValidationResult(int paramInt, Uri paramUri, boolean paramBoolean, Bundle paramBundle)
      throws RemoteException
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
        localParcel1.writeInt(paramInt);
        if (paramUri != null)
        {
          localParcel1.writeInt(1);
          paramUri.writeToParcel(localParcel1, 0);
        }
        else
        {
          localParcel1.writeInt(0);
        }
        if (paramBoolean) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
        localParcel1.writeInt(paramInt);
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
 * Qualified Name:     android.support.customtabs.ICustomTabsCallback.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */