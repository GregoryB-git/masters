package x2;

import B2.a;
import B2.c;
import H2.a.a;
import H2.b;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class F
  extends a
{
  public static final Parcelable.Creator<F> CREATOR = new G();
  public final String o;
  public final boolean p;
  public final boolean q;
  public final Context r;
  public final boolean s;
  
  public F(String paramString, boolean paramBoolean1, boolean paramBoolean2, IBinder paramIBinder, boolean paramBoolean3)
  {
    o = paramString;
    p = paramBoolean1;
    q = paramBoolean2;
    r = ((Context)b.v(a.a.o(paramIBinder)));
    s = paramBoolean3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.n(paramParcel, 1, o, false);
    c.c(paramParcel, 2, p);
    c.c(paramParcel, 3, q);
    c.h(paramParcel, 4, b.Z0(r), false);
    c.c(paramParcel, 5, s);
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     x2.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */