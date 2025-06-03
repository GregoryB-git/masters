package T2;

import K2.a;
import K2.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class g
  extends a
  implements IInterface
{
  public g(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.signin.internal.ISignInService");
  }
  
  public final void Z0(j paramj, f paramf)
  {
    Parcel localParcel = n();
    c.c(localParcel, paramj);
    c.d(localParcel, paramf);
    o(12, localParcel);
  }
}

/* Location:
 * Qualified Name:     T2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */