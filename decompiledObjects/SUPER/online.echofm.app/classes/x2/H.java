package x2;

import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class H
  extends a
{
  public static final Parcelable.Creator<H> CREATOR = new I();
  public final boolean o;
  public final String p;
  public final int q;
  public final int r;
  
  public H(boolean paramBoolean, String paramString, int paramInt1, int paramInt2)
  {
    o = paramBoolean;
    p = paramString;
    q = (P.a(paramInt1) - 1);
    r = (u.a(paramInt2) - 1);
  }
  
  public final String a()
  {
    return p;
  }
  
  public final boolean d()
  {
    return o;
  }
  
  public final int f()
  {
    return u.a(r);
  }
  
  public final int g()
  {
    return P.a(q);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.c(paramParcel, 1, o);
    c.n(paramParcel, 2, p, false);
    c.i(paramParcel, 3, q);
    c.i(paramParcel, 4, r);
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     x2.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */