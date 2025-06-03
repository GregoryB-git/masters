package com.google.android.gms.internal.measurement;

import B2.a;
import B2.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class H0
  extends a
{
  public static final Parcelable.Creator<H0> CREATOR = new K0();
  public final long o;
  public final long p;
  public final boolean q;
  public final String r;
  public final String s;
  public final String t;
  public final Bundle u;
  public final String v;
  
  public H0(long paramLong1, long paramLong2, boolean paramBoolean, String paramString1, String paramString2, String paramString3, Bundle paramBundle, String paramString4)
  {
    o = paramLong1;
    p = paramLong2;
    q = paramBoolean;
    r = paramString1;
    s = paramString2;
    t = paramString3;
    u = paramBundle;
    v = paramString4;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.k(paramParcel, 1, o);
    c.k(paramParcel, 2, p);
    c.c(paramParcel, 3, q);
    c.n(paramParcel, 4, r, false);
    c.n(paramParcel, 5, s, false);
    c.n(paramParcel, 6, t, false);
    c.e(paramParcel, 7, u, false);
    c.n(paramParcel, 8, v, false);
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.H0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */