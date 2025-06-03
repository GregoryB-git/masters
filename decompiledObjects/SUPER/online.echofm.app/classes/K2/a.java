package K2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a
  implements IInterface
{
  public final IBinder b;
  public final String c;
  
  public a(IBinder paramIBinder, String paramString)
  {
    b = paramIBinder;
    c = paramString;
  }
  
  public final IBinder asBinder()
  {
    return b;
  }
  
  public final Parcel n()
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(c);
    return localParcel;
  }
  
  public final void o(int paramInt, Parcel paramParcel)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      b.transact(paramInt, paramParcel, localParcel, 0);
      localParcel.readException();
      return;
    }
    finally
    {
      paramParcel.recycle();
      localParcel.recycle();
    }
  }
  
  public final void v(int paramInt, Parcel paramParcel)
  {
    try
    {
      b.transact(1, paramParcel, null, 1);
      return;
    }
    finally
    {
      paramParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     K2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */