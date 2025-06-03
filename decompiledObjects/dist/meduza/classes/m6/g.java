package m6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class g
  extends a
{
  public static final Parcelable.Creator<g> CREATOR = new v();
  public final int a;
  public final int b;
  public final int c;
  public final long d;
  public final long e;
  public final String f;
  public final String o;
  public final int p;
  public final int q;
  
  public g(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, String paramString1, String paramString2, int paramInt4, int paramInt5)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramLong1;
    e = paramLong2;
    f = paramString1;
    o = paramString2;
    p = paramInt4;
    q = paramInt5;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = a;
    int i = z.J(20293, paramParcel);
    z.z(paramParcel, 1, paramInt);
    z.z(paramParcel, 2, b);
    z.z(paramParcel, 3, c);
    z.C(paramParcel, 4, d);
    z.C(paramParcel, 5, e);
    z.F(paramParcel, 6, f, false);
    z.F(paramParcel, 7, o, false);
    z.z(paramParcel, 8, p);
    z.z(paramParcel, 9, q);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     m6.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */