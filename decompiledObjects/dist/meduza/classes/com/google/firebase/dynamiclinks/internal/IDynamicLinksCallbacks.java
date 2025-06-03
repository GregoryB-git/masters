package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import w8.a;
import w8.d;

public abstract interface IDynamicLinksCallbacks
  extends IInterface
{
  public abstract void K0(Status paramStatus, d paramd);
  
  public abstract void m2(Status paramStatus, a parama);
  
  public static abstract class Stub
    extends Binder
    implements IDynamicLinksCallbacks
  {
    public Stub()
    {
      attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }
    
    public static IDynamicLinksCallbacks asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof IDynamicLinksCallbacks))) {
        return (IDynamicLinksCallbacks)localIInterface;
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
        paramParcel1.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
      }
      if (paramInt1 != 1598968902)
      {
        if (paramInt1 != 1)
        {
          if (paramInt1 != 2) {
            return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
          }
          K0((Status)IDynamicLinksCallbacks.a.a(paramParcel1, Status.CREATOR), (d)IDynamicLinksCallbacks.a.a(paramParcel1, d.CREATOR));
        }
        else
        {
          m2((Status)IDynamicLinksCallbacks.a.a(paramParcel1, Status.CREATOR), (a)IDynamicLinksCallbacks.a.a(paramParcel1, a.CREATOR));
        }
        return true;
      }
      paramParcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
      return true;
    }
    
    public static final class a
      implements IDynamicLinksCallbacks
    {
      public IBinder a;
      
      public a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
    }
  }
  
  public static final class a
  {
    public static Object a(Parcel paramParcel, Parcelable.Creator paramCreator)
    {
      if (paramParcel.readInt() != 0) {
        paramParcel = paramCreator.createFromParcel(paramParcel);
      } else {
        paramParcel = null;
      }
      return paramParcel;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */