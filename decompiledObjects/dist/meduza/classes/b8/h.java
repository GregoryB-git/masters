package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import b.z;
import m6.j;

public final class h
  extends f
{
  public static final Parcelable.Creator<h> CREATOR = new f1();
  public String a;
  public String b;
  public final String c;
  public String d;
  public boolean e;
  
  public h(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    j.e(paramString1);
    a = paramString1;
    if ((TextUtils.isEmpty(paramString2)) && (TextUtils.isEmpty(paramString3))) {
      throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }
    b = paramString2;
    c = paramString3;
    d = paramString4;
    e = paramBoolean;
  }
  
  public final String D()
  {
    return "password";
  }
  
  public final String E()
  {
    if (!TextUtils.isEmpty(b)) {
      return "password";
    }
    return "emailLink";
  }
  
  public final f F()
  {
    return new h(a, b, c, d, e);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c, false);
    z.F(paramParcel, 4, d, false);
    z.t(paramParcel, 5, e);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b8.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */