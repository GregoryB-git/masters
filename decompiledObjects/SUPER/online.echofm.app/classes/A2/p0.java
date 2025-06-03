package A2;

import M2.b;
import M2.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class p0
  extends b
  implements q0
{
  public p0()
  {
    super("com.google.android.gms.common.internal.ICertData");
  }
  
  public static q0 o(IBinder paramIBinder)
  {
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
    if ((localIInterface instanceof q0)) {
      return (q0)localIInterface;
    }
    return new o0(paramIBinder);
  }
  
  public final boolean n(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramInt1 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
    }
    else
    {
      paramParcel1 = d();
      paramParcel2.writeNoException();
      c.e(paramParcel2, paramParcel1);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     A2.p0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */