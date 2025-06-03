package R2;

import A2.n;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class e
  extends a
{
  public static final Parcelable.Creator<e> CREATOR = new h();
  public String o;
  public String p;
  public R5 q;
  public long r;
  public boolean s;
  public String t;
  public I u;
  public long v;
  public I w;
  public long x;
  public I y;
  
  public e(e parame)
  {
    n.i(parame);
    o = o;
    p = p;
    q = q;
    r = r;
    s = s;
    t = t;
    u = u;
    v = v;
    w = w;
    x = x;
    y = y;
  }
  
  public e(String paramString1, String paramString2, R5 paramR5, long paramLong1, boolean paramBoolean, String paramString3, I paramI1, long paramLong2, I paramI2, long paramLong3, I paramI3)
  {
    o = paramString1;
    p = paramString2;
    q = paramR5;
    r = paramLong1;
    s = paramBoolean;
    t = paramString3;
    u = paramI1;
    v = paramLong2;
    w = paramI2;
    x = paramLong3;
    y = paramI3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.n(paramParcel, 2, o, false);
    c.n(paramParcel, 3, p, false);
    c.m(paramParcel, 4, q, paramInt, false);
    c.k(paramParcel, 5, r);
    c.c(paramParcel, 6, s);
    c.n(paramParcel, 7, t, false);
    c.m(paramParcel, 8, u, paramInt, false);
    c.k(paramParcel, 9, v);
    c.m(paramParcel, 10, w, paramInt, false);
    c.k(paramParcel, 11, x);
    c.m(paramParcel, 12, y, paramInt, false);
    c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     R2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */