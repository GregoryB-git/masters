package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

public final class IMultiInstanceInvalidationService$Stub$a
  implements IMultiInstanceInvalidationService
{
  public IBinder a;
  
  public IMultiInstanceInvalidationService$Stub$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final int B0(IMultiInstanceInvalidationCallback paramIMultiInstanceInvalidationCallback, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
      localParcel1.writeStrongInterface(paramIMultiInstanceInvalidationCallback);
      localParcel1.writeString(paramString);
      a.transact(1, localParcel1, localParcel2, 0);
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
  
  public final void K2(int paramInt, String[] paramArrayOfString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
      localParcel.writeInt(paramInt);
      localParcel.writeStringArray(paramArrayOfString);
      a.transact(3, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     androidx.room.IMultiInstanceInvalidationService.Stub.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */