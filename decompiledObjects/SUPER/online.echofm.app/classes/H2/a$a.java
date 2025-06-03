package H2;

import M2.b;
import android.os.IBinder;
import android.os.IInterface;

public abstract class a$a
  extends b
  implements a
{
  public a$a()
  {
    super("com.google.android.gms.dynamic.IObjectWrapper");
  }
  
  public static a o(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
    if ((localIInterface instanceof a)) {
      return (a)localIInterface;
    }
    return new c(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     H2.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */