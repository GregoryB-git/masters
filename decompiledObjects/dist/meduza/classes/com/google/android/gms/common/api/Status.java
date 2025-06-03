package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j6.b;
import java.util.Arrays;
import k6.c;
import k6.j;
import k6.r;
import m6.h;
import m6.h.a;
import n6.a;

public final class Status
  extends a
  implements j, ReflectedParcelable
{
  public static final Parcelable.Creator<Status> CREATOR = new r();
  public static final Status e;
  public static final Status f;
  public static final Status o;
  public static final Status p;
  public static final Status q;
  public final int a;
  public final String b;
  public final PendingIntent c;
  public final b d;
  
  static
  {
    new Status(-1, null, null, null);
    e = new Status(0, null, null, null);
    f = new Status(14, null, null, null);
    o = new Status(8, null, null, null);
    p = new Status(15, null, null, null);
    q = new Status(16, null, null, null);
    new Status(17, null, null, null);
    new Status(18, null, null, null);
  }
  
  public Status() {}
  
  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent, b paramb)
  {
    a = paramInt;
    b = paramString;
    c = paramPendingIntent;
    d = paramb;
  }
  
  public final boolean D()
  {
    return a <= 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status)) {
      return false;
    }
    paramObject = (Status)paramObject;
    return (a == a) && (h.a(b, b)) && (h.a(c, c)) && (h.a(d, d));
  }
  
  public final Status getStatus()
  {
    return this;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(a), b, c, d });
  }
  
  public final String toString()
  {
    h.a locala = new h.a(this);
    String str = b;
    if (str == null) {
      str = c.a(a);
    }
    locala.a(str, "statusCode");
    locala.a(c, "resolution");
    return locala.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.F(paramParcel, 2, b, false);
    z.E(paramParcel, 3, c, paramInt, false);
    z.E(paramParcel, 4, d, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.Status
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */