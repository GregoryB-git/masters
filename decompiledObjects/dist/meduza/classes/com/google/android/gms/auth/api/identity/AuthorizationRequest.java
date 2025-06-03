package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d6.n;
import java.util.Arrays;
import java.util.List;
import m6.h;
import m6.j;
import n6.a;

public class AuthorizationRequest
  extends a
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new n();
  public final List a;
  public final String b;
  public final boolean c;
  public final boolean d;
  public final Account e;
  public final String f;
  public final String o;
  public final boolean p;
  
  public AuthorizationRequest(List paramList, String paramString1, boolean paramBoolean1, boolean paramBoolean2, Account paramAccount, String paramString2, String paramString3, boolean paramBoolean3)
  {
    boolean bool;
    if ((paramList != null) && (!paramList.isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    j.a("requestedScopes cannot be null or empty", bool);
    a = paramList;
    b = paramString1;
    c = paramBoolean1;
    d = paramBoolean2;
    e = paramAccount;
    f = paramString2;
    o = paramString3;
    p = paramBoolean3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof AuthorizationRequest)) {
      return false;
    }
    paramObject = (AuthorizationRequest)paramObject;
    return (a.size() == a.size()) && (a.containsAll(a)) && (c == c) && (p == p) && (d == d) && (h.a(b, b)) && (h.a(e, e)) && (h.a(f, f)) && (h.a(o, o));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, Boolean.valueOf(c), Boolean.valueOf(p), Boolean.valueOf(d), e, f, o });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.I(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.t(paramParcel, 3, c);
    z.t(paramParcel, 4, d);
    z.E(paramParcel, 5, e, paramInt, false);
    z.F(paramParcel, 6, f, false);
    z.F(paramParcel, 7, o, false);
    z.t(paramParcel, 8, p);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.identity.AuthorizationRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */