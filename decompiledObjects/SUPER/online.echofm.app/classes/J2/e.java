package J2;

import android.os.IBinder;
import android.os.IInterface;

public abstract class e
  extends b
  implements f
{
  public static f n(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    if ((localIInterface instanceof f)) {
      return (f)localIInterface;
    }
    return new d(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     J2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */