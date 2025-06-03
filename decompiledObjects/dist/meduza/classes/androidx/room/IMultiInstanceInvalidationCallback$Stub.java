package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IMultiInstanceInvalidationCallback$Stub
  extends Binder
  implements IMultiInstanceInvalidationCallback
{
  public IMultiInstanceInvalidationCallback$Stub()
  {
    attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
  }
  
  public static IMultiInstanceInvalidationCallback asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
    if ((localIInterface != null) && ((localIInterface instanceof IMultiInstanceInvalidationCallback))) {
      return (IMultiInstanceInvalidationCallback)localIInterface;
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
      paramParcel1.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
    }
    if (paramInt1 != 1598968902)
    {
      if (paramInt1 != 1) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      paramParcel1 = paramParcel1.createStringArray();
      ((MultiInstanceInvalidationClient.callback.1)this).j0(paramParcel1);
      return true;
    }
    paramParcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
    return true;
  }
  
  public static final class a
    implements IMultiInstanceInvalidationCallback
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
    
    public final void j0(String[] paramArrayOfString)
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
        localParcel.writeStringArray(paramArrayOfString);
        a.transact(1, localParcel, null, 1);
        return;
      }
      finally
      {
        localParcel.recycle();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.IMultiInstanceInvalidationCallback.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */