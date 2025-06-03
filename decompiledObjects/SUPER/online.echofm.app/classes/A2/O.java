package A2;

import M2.b;
import android.os.IBinder;
import android.os.IInterface;

public abstract class O
  extends b
  implements P
{
  public static P o(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
    if ((localIInterface instanceof P)) {
      return (P)localIInterface;
    }
    return new N(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     A2.O
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */