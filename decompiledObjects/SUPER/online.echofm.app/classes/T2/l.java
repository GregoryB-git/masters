package T2;

import A2.I;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import x2.b;

public final class l
  extends a
{
  public static final Parcelable.Creator<l> CREATOR = new m();
  public final int o;
  public final b p;
  public final I q;
  
  public l(int paramInt, b paramb, I paramI)
  {
    o = paramInt;
    p = paramb;
    q = paramI;
  }
  
  public final b a()
  {
    return p;
  }
  
  public final I d()
  {
    return q;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.i(paramParcel, 1, o);
    c.m(paramParcel, 2, p, paramInt, false);
    c.m(paramParcel, 3, q, paramInt, false);
    c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     T2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */