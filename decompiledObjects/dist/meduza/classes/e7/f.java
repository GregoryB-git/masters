package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import m6.j;
import n6.a;

public final class f
  extends a
{
  public static final Parcelable.Creator<f> CREATOR = new i();
  public String a;
  public String b;
  public q6 c;
  public long d;
  public boolean e;
  public String f;
  public f0 o;
  public long p;
  public f0 q;
  public long r;
  public f0 s;
  
  public f(f paramf)
  {
    j.i(paramf);
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
    f = f;
    o = o;
    p = p;
    q = q;
    r = r;
    s = s;
  }
  
  public f(String paramString1, String paramString2, q6 paramq6, long paramLong1, boolean paramBoolean, String paramString3, f0 paramf01, long paramLong2, f0 paramf02, long paramLong3, f0 paramf03)
  {
    a = paramString1;
    b = paramString2;
    c = paramq6;
    d = paramLong1;
    e = paramBoolean;
    f = paramString3;
    o = paramf01;
    p = paramLong2;
    q = paramf02;
    r = paramLong3;
    s = paramf03;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.F(paramParcel, 2, a, false);
    z.F(paramParcel, 3, b, false);
    z.E(paramParcel, 4, c, paramInt, false);
    z.C(paramParcel, 5, d);
    z.t(paramParcel, 6, e);
    z.F(paramParcel, 7, f, false);
    z.E(paramParcel, 8, o, paramInt, false);
    z.C(paramParcel, 9, p);
    z.E(paramParcel, 10, q, paramInt, false);
    z.C(paramParcel, 11, r);
    z.E(paramParcel, 12, s, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     e7.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */