package A2;

import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;

public class l
  extends a
{
  @NonNull
  public static final Parcelable.Creator<l> CREATOR = new F();
  public final int o;
  public final int p;
  public final int q;
  public final long r;
  public final long s;
  public final String t;
  public final String u;
  public final int v;
  public final int w;
  
  public l(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, String paramString1, String paramString2, int paramInt4, int paramInt5)
  {
    o = paramInt1;
    p = paramInt2;
    q = paramInt3;
    r = paramLong1;
    s = paramLong2;
    t = paramString1;
    u = paramString2;
    v = paramInt4;
    w = paramInt5;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.i(paramParcel, 1, o);
    c.i(paramParcel, 2, p);
    c.i(paramParcel, 3, q);
    c.k(paramParcel, 4, r);
    c.k(paramParcel, 5, s);
    c.n(paramParcel, 6, t, false);
    c.n(paramParcel, 7, u, false);
    c.i(paramParcel, 8, v);
    c.i(paramParcel, 9, w);
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     A2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */