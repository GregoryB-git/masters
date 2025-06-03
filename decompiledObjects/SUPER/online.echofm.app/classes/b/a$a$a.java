package b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public class a$a$a
  implements a
{
  public IBinder b;
  
  public a$a$a(IBinder paramIBinder)
  {
    b = paramIBinder;
  }
  
  public void T0(int paramInt, Bundle paramBundle)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken(a.a);
      localParcel.writeInt(paramInt);
      a.b.b(localParcel, paramBundle, 0);
      b.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public IBinder asBinder()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     b.a.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */