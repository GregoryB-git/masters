package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

public final class IMultiInstanceInvalidationCallback$Stub$a
  implements IMultiInstanceInvalidationCallback
{
  public IBinder a;
  
  public IMultiInstanceInvalidationCallback$Stub$a(IBinder paramIBinder)
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

/* Location:
 * Qualified Name:     androidx.room.IMultiInstanceInvalidationCallback.Stub.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */