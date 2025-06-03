package A2;

import B2.a;
import B2.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import x2.d;

public final class a0
  extends a
{
  public static final Parcelable.Creator<a0> CREATOR = new b0();
  public Bundle o;
  public d[] p;
  public int q;
  public e r;
  
  public a0(Bundle paramBundle, d[] paramArrayOfd, int paramInt, e parame)
  {
    o = paramBundle;
    p = paramArrayOfd;
    q = paramInt;
    r = parame;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.e(paramParcel, 1, o, false);
    c.p(paramParcel, 2, p, paramInt, false);
    c.i(paramParcel, 3, q);
    c.m(paramParcel, 4, r, paramInt, false);
    c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     A2.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */