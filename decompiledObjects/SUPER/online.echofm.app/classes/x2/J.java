package x2;

import A2.p0;
import A2.q0;
import B2.a;
import B2.c;
import H2.b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;

public final class J
  extends a
{
  public static final Parcelable.Creator<J> CREATOR = new K();
  public final String o;
  public final A p;
  public final boolean q;
  public final boolean r;
  
  public J(String paramString, IBinder paramIBinder, boolean paramBoolean1, boolean paramBoolean2)
  {
    o = paramString;
    Object localObject = null;
    if (paramIBinder == null) {
      paramString = (String)localObject;
    } else {
      try
      {
        paramString = p0.o(paramIBinder).d();
        if (paramString == null) {
          paramString = null;
        } else {
          paramString = (byte[])b.v(paramString);
        }
        if (paramString != null)
        {
          paramString = new B(paramString);
        }
        else
        {
          Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
          paramString = (String)localObject;
        }
      }
      catch (RemoteException paramString)
      {
        Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", paramString);
        paramString = (String)localObject;
      }
    }
    p = paramString;
    q = paramBoolean1;
    r = paramBoolean2;
  }
  
  public J(String paramString, A paramA, boolean paramBoolean1, boolean paramBoolean2)
  {
    o = paramString;
    p = paramA;
    q = paramBoolean1;
    r = paramBoolean2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.n(paramParcel, 1, o, false);
    A localA1 = p;
    A localA2 = localA1;
    if (localA1 == null)
    {
      Log.w("GoogleCertificatesQuery", "certificate binder is null");
      localA2 = null;
    }
    c.h(paramParcel, 2, localA2, false);
    c.c(paramParcel, 3, q);
    c.c(paramParcel, 4, r);
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     x2.J
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */