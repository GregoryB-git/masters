package b8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import b.z;
import n6.a;

public final class p0
  extends a
{
  public static final Parcelable.Creator<p0> CREATOR = new a1();
  public String a;
  public String b;
  public boolean c;
  public boolean d;
  public Uri e;
  
  public p0(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramString1;
    b = paramString2;
    c = paramBoolean1;
    d = paramBoolean2;
    if (TextUtils.isEmpty(paramString2)) {
      paramString1 = null;
    } else {
      paramString1 = Uri.parse(paramString2);
    }
    e = paramString1;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 2, a, false);
    z.F(paramParcel, 3, b, false);
    z.t(paramParcel, 4, c);
    z.t(paramParcel, 5, d);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b8.p0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */