package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import b.z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m6.h;
import m6.j;
import n6.a;
import z5.m;

public class TokenData
  extends a
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<TokenData> CREATOR = new m();
  public final int a;
  public final String b;
  public final Long c;
  public final boolean d;
  public final boolean e;
  public final List f;
  public final String o;
  
  public TokenData(int paramInt, String paramString1, Long paramLong, boolean paramBoolean1, boolean paramBoolean2, ArrayList paramArrayList, String paramString2)
  {
    a = paramInt;
    j.e(paramString1);
    b = paramString1;
    c = paramLong;
    d = paramBoolean1;
    e = paramBoolean2;
    f = paramArrayList;
    o = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof TokenData)) {
      return false;
    }
    paramObject = (TokenData)paramObject;
    return (TextUtils.equals(b, b)) && (h.a(c, c)) && (d == d) && (e == e) && (h.a(f, f)) && (h.a(o, o));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { b, c, Boolean.valueOf(d), Boolean.valueOf(e), f, o });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.F(paramParcel, 2, b, false);
    z.D(paramParcel, 3, c);
    z.t(paramParcel, 4, d);
    z.t(paramParcel, 5, e);
    z.G(paramParcel, 6, f);
    z.F(paramParcel, 7, o, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.TokenData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */