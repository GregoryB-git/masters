package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.internal.firebase-auth-api.zzaic;
import com.google.android.gms.internal.firebase_auth_api.zzae;

public final class c1
  extends a0
{
  public static final Parcelable.Creator<c1> CREATOR = new e1();
  public final String a;
  public final String b;
  public final String c;
  public final zzaic d;
  public final String e;
  public final String f;
  public final String o;
  
  public c1(String paramString1, String paramString2, String paramString3, zzaic paramzzaic, String paramString4, String paramString5, String paramString6)
  {
    a = zzae.zzb(paramString1);
    b = paramString2;
    c = paramString3;
    d = paramzzaic;
    e = paramString4;
    f = paramString5;
    o = paramString6;
  }
  
  public static c1 H(zzaic paramzzaic)
  {
    if (paramzzaic != null) {
      return new c1(null, null, null, paramzzaic, null, null, null);
    }
    throw new NullPointerException("Must specify a non-null webSignInCredential");
  }
  
  public final String D()
  {
    return a;
  }
  
  public final String E()
  {
    return a;
  }
  
  public final f F()
  {
    return new c1(a, b, c, d, e, f, o);
  }
  
  public final String G()
  {
    return c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c, false);
    z.E(paramParcel, 4, d, paramInt, false);
    z.F(paramParcel, 5, e, false);
    z.F(paramParcel, 6, f, false);
    z.F(paramParcel, 7, o, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b8.c1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */