package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m6.h;
import m6.j;

public final class a
  extends n6.a
{
  public static final Parcelable.Creator<a> CREATOR = new o();
  public final String a;
  public final String b;
  public final String c;
  public final List d;
  public final GoogleSignInAccount e;
  public final PendingIntent f;
  
  public a(String paramString1, String paramString2, String paramString3, ArrayList paramArrayList, GoogleSignInAccount paramGoogleSignInAccount, PendingIntent paramPendingIntent)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    j.i(paramArrayList);
    d = paramArrayList;
    f = paramPendingIntent;
    e = paramGoogleSignInAccount;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    return (h.a(a, a)) && (h.a(b, b)) && (h.a(c, c)) && (h.a(d, d)) && (h.a(f, f)) && (h.a(e, e));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c, d, f, e });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c, false);
    z.G(paramParcel, 4, d);
    z.E(paramParcel, 5, e, paramInt, false);
    z.E(paramParcel, 6, f, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     d6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */