package j6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import b.z;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.ObjectWrapper;
import m6.b0;
import n6.a;

public final class d0
  extends a
{
  public static final Parcelable.Creator<d0> CREATOR = new e0();
  public final String a;
  public final u b;
  public final boolean c;
  public final boolean d;
  
  public d0(String paramString, IBinder paramIBinder, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramString;
    Object localObject = null;
    if (paramIBinder == null) {
      paramString = (String)localObject;
    } else {
      try
      {
        paramString = zzz.zzg(paramIBinder).zzd();
        if (paramString == null) {
          paramString = null;
        } else {
          paramString = (byte[])ObjectWrapper.unwrap(paramString);
        }
        if (paramString != null)
        {
          paramString = new v(paramString);
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
    b = paramString;
    c = paramBoolean1;
    d = paramBoolean2;
  }
  
  public d0(String paramString, u paramu, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramString;
    b = paramu;
    c = paramBoolean1;
    d = paramBoolean2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = a;
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, (String)localObject, false);
    u localu = b;
    localObject = localu;
    if (localu == null)
    {
      Log.w("GoogleCertificatesQuery", "certificate binder is null");
      localObject = null;
    }
    z.y(paramParcel, 2, (IBinder)localObject);
    z.t(paramParcel, 3, c);
    z.t(paramParcel, 4, d);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     j6.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */