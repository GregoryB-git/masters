package android.support.v4.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class IResultReceiver$Stub$a
  implements IResultReceiver
{
  public IBinder a;
  
  public IResultReceiver$Stub$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final void a3(int paramInt, Bundle paramBundle)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken(IResultReceiver.o);
      localParcel.writeInt(paramInt);
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      else
      {
        localParcel.writeInt(0);
      }
      a.transact(1, localParcel, null, 1);
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
 * Qualified Name:     android.support.v4.os.IResultReceiver.Stub.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */