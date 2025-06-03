package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import b.z;
import m6.j;

public final class c0
  extends f
  implements Cloneable
{
  public static final Parcelable.Creator<c0> CREATOR = new v0();
  public String a;
  public String b;
  public String c;
  public boolean d;
  public String e;
  
  public c0(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    boolean bool;
    if (((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2))) || ((!TextUtils.isEmpty(paramString3)) && (!TextUtils.isEmpty(paramString4)))) {
      bool = true;
    } else {
      bool = false;
    }
    j.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", bool);
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramBoolean;
    e = paramString4;
  }
  
  public static c0 G(String paramString1, String paramString2)
  {
    return new c0(paramString1, paramString2, null, null, true);
  }
  
  public final String D()
  {
    return "phone";
  }
  
  public final String E()
  {
    return "phone";
  }
  
  public final f F()
  {
    return (c0)clone();
  }
  
  public final Object clone()
  {
    String str1 = a;
    String str2 = b;
    String str3 = c;
    boolean bool = d;
    return new c0(str1, str2, str3, e, bool);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.F(paramParcel, 4, c, false);
    z.t(paramParcel, 5, d);
    z.F(paramParcel, 6, e, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b8.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */