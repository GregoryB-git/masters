package A2;

import M2.b;
import android.os.IBinder;
import android.os.IInterface;

public abstract class i$a
  extends b
  implements i
{
  public static i o(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
    if ((localIInterface instanceof i)) {
      return (i)localIInterface;
    }
    return new n0(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     A2.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */