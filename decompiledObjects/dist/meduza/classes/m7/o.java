package m7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class o
  extends a
  implements p
{
  public o(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
  }
  
  public final void J(Bundle paramBundle, q paramq)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(b);
    int i = l.a;
    localParcel.writeInt(1);
    paramBundle.writeToParcel(localParcel, 0);
    localParcel.writeStrongBinder(paramq);
    g(2, localParcel);
  }
  
  public final void y(Bundle paramBundle, u paramu)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(b);
    int i = l.a;
    localParcel.writeInt(1);
    paramBundle.writeToParcel(localParcel, 0);
    localParcel.writeStrongBinder(paramu);
    g(6, localParcel);
  }
  
  public final void z0(Bundle paramBundle, q paramq)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(b);
    int i = l.a;
    localParcel.writeInt(1);
    paramBundle.writeToParcel(localParcel, 0);
    localParcel.writeStrongBinder(paramq);
    g(3, localParcel);
  }
}

/* Location:
 * Qualified Name:     m7.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */