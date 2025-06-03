package r2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b2.c;

public class a$a$a
  extends b2.a
  implements a
{
  public a$a$a(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
  }
  
  public final Bundle P(Bundle paramBundle)
  {
    Parcel localParcel = n();
    c.b(localParcel, paramBundle);
    localParcel = o(localParcel);
    paramBundle = (Bundle)c.a(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return paramBundle;
  }
}

/* Location:
 * Qualified Name:     r2.a.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */