package com.google.android.gms.common.api;

import A2.m;
import A2.m.a;
import B2.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import x2.b;
import y2.j;

public final class Status
  extends a
  implements ReflectedParcelable
{
  public static final Status A;
  @NonNull
  public static final Parcelable.Creator<Status> CREATOR = new j();
  public static final Status t = new Status(-1);
  public static final Status u = new Status(0);
  public static final Status v = new Status(14);
  public static final Status w = new Status(8);
  public static final Status x = new Status(15);
  public static final Status y = new Status(16);
  public static final Status z;
  public final int o;
  public final int p;
  public final String q;
  public final PendingIntent r;
  public final b s;
  
  static
  {
    A = new Status(17);
    z = new Status(18);
  }
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  public Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent, b paramb)
  {
    o = paramInt1;
    p = paramInt2;
    q = paramString;
    r = paramPendingIntent;
    s = paramb;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null, null);
  }
  
  public Status(b paramb, String paramString)
  {
    this(paramb, paramString, 17);
  }
  
  public Status(b paramb, String paramString, int paramInt)
  {
    this(1, paramInt, paramString, paramb.f(), paramb);
  }
  
  public b a()
  {
    return s;
  }
  
  public int d()
  {
    return p;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status)) {
      return false;
    }
    paramObject = (Status)paramObject;
    return (o == o) && (p == p) && (m.a(q, q)) && (m.a(r, r)) && (m.a(s, s));
  }
  
  public String f()
  {
    return q;
  }
  
  public boolean g()
  {
    return r != null;
  }
  
  public int hashCode()
  {
    return m.b(new Object[] { Integer.valueOf(o), Integer.valueOf(p), q, r, s });
  }
  
  public final String i()
  {
    String str = q;
    if (str != null) {
      return str;
    }
    return y2.c.a(p);
  }
  
  public String toString()
  {
    m.a locala = m.c(this);
    locala.a("statusCode", i());
    locala.a("resolution", r);
    return locala.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = B2.c.a(paramParcel);
    B2.c.i(paramParcel, 1, d());
    B2.c.n(paramParcel, 2, f(), false);
    B2.c.m(paramParcel, 3, r, paramInt, false);
    B2.c.m(paramParcel, 4, a(), paramInt, false);
    B2.c.i(paramParcel, 1000, o);
    B2.c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.Status
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */