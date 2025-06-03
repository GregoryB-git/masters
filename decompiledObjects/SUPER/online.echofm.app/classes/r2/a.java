package r2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b2.b;
import b2.c;

public abstract interface a
  extends IInterface
{
  public abstract Bundle P(Bundle paramBundle);
  
  public static abstract class a
    extends b
    implements a
  {
    public static a n(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
      if ((localIInterface instanceof a)) {
        return (a)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public static class a
      extends b2.a
      implements a
    {
      public a(IBinder paramIBinder)
      {
        super("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
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
  }
}

/* Location:
 * Qualified Name:     r2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */