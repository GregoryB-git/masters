package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h6.r;
import m6.j;
import n6.a;

public final class SignInConfiguration
  extends a
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<SignInConfiguration> CREATOR = new r();
  public final String a;
  public final GoogleSignInOptions b;
  
  public SignInConfiguration(String paramString, GoogleSignInOptions paramGoogleSignInOptions)
  {
    j.e(paramString);
    a = paramString;
    b = paramGoogleSignInOptions;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof SignInConfiguration)) {
      return false;
    }
    Object localObject = (SignInConfiguration)paramObject;
    if (a.equals(a))
    {
      paramObject = b;
      localObject = b;
      if (paramObject == null ? localObject == null : ((GoogleSignInOptions)paramObject).equals(localObject)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = b;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return (1 * 31 + j) * 31 + i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = a;
    int i = z.J(20293, paramParcel);
    z.F(paramParcel, 2, str, false);
    z.E(paramParcel, 5, b, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.SignInConfiguration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */