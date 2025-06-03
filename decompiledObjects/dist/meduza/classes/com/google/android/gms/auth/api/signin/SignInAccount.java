package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g6.g;
import m6.j;
import n6.a;

public class SignInAccount
  extends a
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<SignInAccount> CREATOR = new g();
  @Deprecated
  public final String a;
  public final GoogleSignInAccount b;
  @Deprecated
  public final String c;
  
  public SignInAccount(String paramString1, GoogleSignInAccount paramGoogleSignInAccount, String paramString2)
  {
    b = paramGoogleSignInAccount;
    j.f("8.3 and 8.4 SDKs require non-null email", paramString1);
    a = paramString1;
    j.f("8.3 and 8.4 SDKs require non-null userId", paramString2);
    c = paramString2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = a;
    int i = z.J(20293, paramParcel);
    z.F(paramParcel, 4, str, false);
    z.E(paramParcel, 7, b, paramInt, false);
    z.F(paramParcel, 8, c, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.SignInAccount
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */