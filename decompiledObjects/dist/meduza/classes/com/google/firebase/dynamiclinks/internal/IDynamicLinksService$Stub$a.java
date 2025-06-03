package com.google.firebase.dynamiclinks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class IDynamicLinksService$Stub$a
  implements IDynamicLinksService
{
  public IBinder a;
  
  public IDynamicLinksService$Stub$a(IBinder paramIBinder)
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

/* Location:
 * Qualified Name:     com.google.firebase.dynamiclinks.internal.IDynamicLinksService.Stub.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */