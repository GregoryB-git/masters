package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class IDynamicLinksService$Stub
  extends Binder
  implements IDynamicLinksService
{
  public IDynamicLinksService$Stub()
  {
    attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
  }
  
  public static IDynamicLinksService asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
    if ((localIInterface != null) && ((localIInterface instanceof IDynamicLinksService))) {
      return (IDynamicLinksService)localIInterface;
    }
    return new a(paramIBinder);
  }
  
  public final IBinder asBinder()
  {
    return this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
      paramParcel1.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
    }
    if (paramInt1 != 1598968902)
    {
      if (paramInt1 != 1)
      {
        if (paramInt1 != 2) {
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        }
        IDynamicLinksCallbacks localIDynamicLinksCallbacks = IDynamicLinksCallbacks.Stub.asInterface(paramParcel1.readStrongBinder());
        Parcelable.Creator localCreator = Bundle.CREATOR;
        if (paramParcel1.readInt() != 0) {
          paramParcel1 = localCreator.createFromParcel(paramParcel1);
        } else {
          paramParcel1 = null;
        }
        L(localIDynamicLinksCallbacks, (Bundle)paramParcel1);
      }
      else
      {
        R1(IDynamicLinksCallbacks.Stub.asInterface(paramParcel1.readStrongBinder()), paramParcel1.readString());
      }
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
    return true;
  }
  
  public static final class a
    implements IDynamicLinksService
  {
    public IBinder a;
    
    public a(IBinder paramIBinder)
    {
      a = paramIBinder;
    }
    
    public final void L(IDynamicLinksCallbacks paramIDynamicLinksCallbacks, Bundle paramBundle)
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        localParcel1.writeStrongInterface(paramIDynamicLinksCallbacks);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
        }
        else
        {
          localParcel1.writeInt(0);
        }
        a.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public final void R1(IDynamicLinksCallbacks paramIDynamicLinksCallbacks, String paramString)
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        localParcel1.writeStrongInterface(paramIDynamicLinksCallbacks);
        localParcel1.writeString(paramString);
        a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
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
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.dynamiclinks.internal.IDynamicLinksService.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */