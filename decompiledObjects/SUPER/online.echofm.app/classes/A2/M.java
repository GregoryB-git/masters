package A2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class M
  implements k
{
  public final IBinder b;
  
  public M(IBinder paramIBinder)
  {
    b = paramIBinder;
  }
  
  public final IBinder asBinder()
  {
    return b;
  }
  
  public final void h0(j paramj, f paramf)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramj != null) {
        paramj = paramj.asBinder();
      }
    }
    finally
    {
      break label94;
    }
    paramj = null;
    localParcel1.writeStrongBinder(paramj);
    if (paramf != null)
    {
      localParcel1.writeInt(1);
      d0.a(paramf, localParcel1, 0);
    }
    else
    {
      localParcel1.writeInt(0);
    }
    b.transact(46, localParcel1, localParcel2, 0);
    localParcel2.readException();
    localParcel2.recycle();
    localParcel1.recycle();
    return;
    label94:
    localParcel2.recycle();
    localParcel1.recycle();
    throw paramj;
  }
}

/* Location:
 * Qualified Name:     A2.M
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */