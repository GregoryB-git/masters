package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import c7.a;
import c7.e;
import c7.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m6.h;
import m6.j;

@Deprecated
public class SignRequestParams
  extends RequestParams
{
  public static final Parcelable.Creator<SignRequestParams> CREATOR = new m();
  public final Integer a;
  public final Double b;
  public final Uri c;
  public final byte[] d;
  public final List e;
  public final a f;
  public final String o;
  
  public SignRequestParams(Integer paramInteger, Double paramDouble, Uri paramUri, byte[] paramArrayOfByte, ArrayList paramArrayList, a parama, String paramString)
  {
    a = paramInteger;
    b = paramDouble;
    c = paramUri;
    d = paramArrayOfByte;
    boolean bool1 = false;
    boolean bool2;
    if ((paramArrayList != null) && (!paramArrayList.isEmpty())) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    j.a("registeredKeys must not be null or empty", bool2);
    e = paramArrayList;
    f = parama;
    paramInteger = new HashSet();
    if (paramUri != null) {
      paramInteger.add(paramUri);
    }
    paramDouble = paramArrayList.iterator();
    while (paramDouble.hasNext())
    {
      paramArrayOfByte = (e)paramDouble.next();
      if ((b == null) && (paramUri == null)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      j.a("registered key has null appId and no request appId is provided", bool2);
      paramArrayOfByte = b;
      if (paramArrayOfByte != null) {
        paramInteger.add(Uri.parse(paramArrayOfByte));
      }
    }
    if (paramString != null)
    {
      bool2 = bool1;
      if (paramString.length() > 80) {}
    }
    else
    {
      bool2 = true;
    }
    j.a("Display Hint cannot be longer than 80 characters", bool2);
    o = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof SignRequestParams)) {
      return false;
    }
    paramObject = (SignRequestParams)paramObject;
    return (h.a(a, a)) && (h.a(b, b)) && (h.a(c, c)) && (Arrays.equals(d, d)) && (e.containsAll(e)) && (e.containsAll(e)) && (h.a(f, f)) && (h.a(o, o));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, c, b, e, f, o, Integer.valueOf(Arrays.hashCode(d)) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.B(paramParcel, 2, a);
    z.x(paramParcel, 3, b);
    z.E(paramParcel, 4, c, paramInt, false);
    z.w(paramParcel, 5, d, false);
    z.I(paramParcel, 6, e, false);
    z.E(paramParcel, 7, f, paramInt, false);
    z.F(paramParcel, 8, o, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fido.u2f.api.common.SignRequestParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */