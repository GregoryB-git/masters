package m7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class r
  extends a
  implements s
{
  public r(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
  }
  
  public final void y(Bundle paramBundle, u paramu)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(b);
    int i = l.a;
    localParcel.writeInt(1);
    paramBundle.writeToParcel(localParcel, 0);
    localParcel.writeStrongBinder(paramu);
    g(3, localParcel);
  }
  
  public final void z1(Bundle paramBundle, t paramt)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(b);
    int i = l.a;
    localParcel.writeInt(1);
    paramBundle.writeToParcel(localParcel, 0);
    localParcel.writeStrongBinder(paramt);
    g(2, localParcel);
  }
}

/* Location:
 * Qualified Name:     m7.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */