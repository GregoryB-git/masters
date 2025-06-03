package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m6.h;
import m6.j;
import n6.a;

public final class b$a
  extends a
{
  public static final Parcelable.Creator<a> CREATOR = new u();
  public final boolean a;
  public final String b;
  public final String c;
  public final boolean d;
  public final String e;
  public final ArrayList f;
  public final boolean o;
  
  public b$a(boolean paramBoolean1, String paramString1, String paramString2, boolean paramBoolean2, String paramString3, ArrayList paramArrayList, boolean paramBoolean3)
  {
    boolean bool;
    if ((paramBoolean2) && (paramBoolean3)) {
      bool = false;
    } else {
      bool = true;
    }
    j.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", bool);
    a = paramBoolean1;
    if ((paramBoolean1) && (paramString1 == null)) {
      throw new NullPointerException("serverClientId must be provided if Google ID tokens are requested");
    }
    b = paramString1;
    c = paramString2;
    d = paramBoolean2;
    paramString2 = null;
    paramString1 = paramString2;
    if (paramArrayList != null) {
      if (paramArrayList.isEmpty())
      {
        paramString1 = paramString2;
      }
      else
      {
        paramString1 = new ArrayList(paramArrayList);
        Collections.sort(paramString1);
      }
    }
    f = paramString1;
    e = paramString3;
    o = paramBoolean3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    return (a == a) && (h.a(b, b)) && (h.a(c, c)) && (d == d) && (h.a(e, e)) && (h.a(f, f)) && (o == o);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Boolean.valueOf(a), b, c, Boolean.valueOf(d), e, f, Boolean.valueOf(o) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.t(paramParcel, 1, a);
    z.F(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c, false);
    z.t(paramParcel, 4, d);
    z.F(paramParcel, 5, e, false);
    z.G(paramParcel, 6, f);
    z.t(paramParcel, 7, o);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     d6.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */