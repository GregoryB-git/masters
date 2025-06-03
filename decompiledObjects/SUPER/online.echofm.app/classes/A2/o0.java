package A2;

import H2.a.a;
import android.os.IBinder;
import android.os.Parcel;

public final class o0
  extends M2.a
  implements q0
{
  public o0(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.ICertData");
  }
  
  public final int c()
  {
    Parcel localParcel = n(2, o());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final H2.a d()
  {
    Parcel localParcel = n(1, o());
    H2.a locala = a.a.o(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
}

/* Location:
 * Qualified Name:     A2.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */