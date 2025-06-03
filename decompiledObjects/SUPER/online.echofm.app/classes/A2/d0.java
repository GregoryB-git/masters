package A2;

import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class d0
  implements Parcelable.Creator
{
  public static void a(f paramf, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.i(paramParcel, 1, o);
    c.i(paramParcel, 2, p);
    c.i(paramParcel, 3, q);
    c.n(paramParcel, 4, r, false);
    c.h(paramParcel, 5, s, false);
    c.p(paramParcel, 6, t, paramInt, false);
    c.e(paramParcel, 7, u, false);
    c.m(paramParcel, 8, v, paramInt, false);
    c.p(paramParcel, 10, w, paramInt, false);
    c.p(paramParcel, 11, x, paramInt, false);
    c.c(paramParcel, 12, y);
    c.i(paramParcel, 13, z);
    c.c(paramParcel, 14, A);
    c.n(paramParcel, 15, paramf.a(), false);
    c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     A2.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */