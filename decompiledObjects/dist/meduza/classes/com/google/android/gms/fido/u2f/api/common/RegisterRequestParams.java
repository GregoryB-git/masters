package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import c7.a;
import c7.d;
import c7.e;
import c7.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m6.h;
import m6.j;

@Deprecated
public class RegisterRequestParams
  extends RequestParams
{
  public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new k();
  public final Integer a;
  public final Double b;
  public final Uri c;
  public final List d;
  public final List e;
  public final a f;
  public final String o;
  
  public RegisterRequestParams(Integer paramInteger, Double paramDouble, Uri paramUri, ArrayList paramArrayList1, ArrayList paramArrayList2, a parama, String paramString)
  {
    a = paramInteger;
    b = paramDouble;
    c = paramUri;
    boolean bool1 = false;
    boolean bool2;
    if ((paramArrayList1 != null) && (!paramArrayList1.isEmpty())) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    j.a("empty list of register requests is provided", bool2);
    d = paramArrayList1;
    e = paramArrayList2;
    f = parama;
    paramInteger = new HashSet();
    if (paramUri != null) {
      paramInteger.add(paramUri);
    }
    paramDouble = paramArrayList1.iterator();
    while (paramDouble.hasNext())
    {
      paramArrayList1 = (d)paramDouble.next();
      if ((paramUri == null) && (d == null)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      j.a("register request has null appId and no request appId is provided", bool2);
      paramArrayList1 = d;
      if (paramArrayList1 != null) {
        paramInteger.add(Uri.parse(paramArrayList1));
      }
    }
    paramDouble = paramArrayList2.iterator();
    while (paramDouble.hasNext())
    {
      paramArrayList1 = (e)paramDouble.next();
      if ((paramUri == null) && (b == null)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      j.a("registered key has null appId and no request appId is provided", bool2);
      paramArrayList1 = b;
      if (paramArrayList1 != null) {
        paramInteger.add(Uri.parse(paramArrayList1));
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
    if (!(paramObject instanceof RegisterRequestParams)) {
      return false;
    }
    RegisterRequestParams localRegisterRequestParams = (RegisterRequestParams)paramObject;
    if ((h.a(a, a)) && (h.a(b, b)) && (h.a(c, c)) && (h.a(d, d)))
    {
      paramObject = e;
      if ((paramObject != null) || (e != null))
      {
        if (paramObject != null)
        {
          List localList = e;
          if ((localList == null) || (!((List)paramObject).containsAll(localList)) || (!e.containsAll(e))) {}
        }
      }
      else if ((h.a(f, f)) && (h.a(o, o))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, c, b, d, e, f, o });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.B(paramParcel, 2, a);
    z.x(paramParcel, 3, b);
    z.E(paramParcel, 4, c, paramInt, false);
    z.I(paramParcel, 5, d, false);
    z.I(paramParcel, 6, e, false);
    z.E(paramParcel, 7, f, paramInt, false);
    z.F(paramParcel, 8, o, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fido.u2f.api.common.RegisterRequestParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */