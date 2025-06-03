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
import java.util.List;

public abstract class ICustomTabsService$Stub
  extends Binder
  implements ICustomTabsService
{
  private static final String DESCRIPTOR = "android.support.customtabs.ICustomTabsService";
  public static final int TRANSACTION_extraCommand = 5;
  public static final int TRANSACTION_mayLaunchUrl = 4;
  public static final int TRANSACTION_newSession = 3;
  public static final int TRANSACTION_postMessage = 8;
  public static final int TRANSACTION_requestPostMessageChannel = 7;
  public static final int TRANSACTION_updateVisuals = 6;
  public static final int TRANSACTION_validateRelationship = 9;
  public static final int TRANSACTION_warmup = 2;
  
  public ICustomTabsService$Stub()
  {
    attachInterface(this, "android.support.customtabs.ICustomTabsService");
  }
  
  public static ICustomTabsService asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
    if ((localIInterface != null) && ((localIInterface instanceof ICustomTabsService))) {
      return (ICustomTabsService)localIInterface;
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
    if (paramInt1 != 1598968902)
    {
      Object localObject1 = null;
      ICustomTabsCallback localICustomTabsCallback = null;
      Object localObject2 = null;
      Object localObject3 = null;
      Object localObject4 = null;
      Object localObject5 = null;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 9: 
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        localObject4 = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        } else {
          localObject1 = null;
        }
        if (paramParcel1.readInt() != 0) {
          localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        paramInt1 = validateRelationship((ICustomTabsCallback)localObject4, paramInt1, (Uri)localObject1, (Bundle)localObject5);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 8: 
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        localObject5 = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        localObject4 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        paramInt1 = postMessage((ICustomTabsCallback)localObject5, (String)localObject4, (Bundle)localObject1);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 7: 
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        localObject5 = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        localObject1 = localICustomTabsCallback;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        }
        paramInt1 = requestPostMessageChannel((ICustomTabsCallback)localObject5, (Uri)localObject1);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 6: 
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        localObject5 = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        localObject1 = localObject2;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        paramInt1 = updateVisuals((ICustomTabsCallback)localObject5, (Bundle)localObject1);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 5: 
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        localObject5 = paramParcel1.readString();
        localObject1 = localObject3;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        paramParcel1 = extraCommand((String)localObject5, (Bundle)localObject1);
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        else
        {
          paramParcel2.writeInt(0);
        }
        return true;
      case 4: 
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        localICustomTabsCallback = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        } else {
          localObject1 = null;
        }
        localObject5 = localObject4;
        if (paramParcel1.readInt() != 0) {
          localObject5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        paramInt1 = mayLaunchUrl(localICustomTabsCallback, (Uri)localObject1, (Bundle)localObject5, paramParcel1.createTypedArrayList(Bundle.CREATOR));
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 3: 
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        paramInt1 = newSession(ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      }
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
      paramInt1 = warmup(paramParcel1.readLong());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    }
    paramParcel2.writeString("android.support.customtabs.ICustomTabsService");
    return true;
  }
  
  public static class Proxy
    implements ICustomTabsService
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
}

/* Location:
 * Qualified Name:     android.support.customtabs.ICustomTabsService.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */