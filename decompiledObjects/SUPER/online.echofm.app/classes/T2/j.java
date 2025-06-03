package T2;

import A2.G;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class j
  extends a
{
  public static final Parcelable.Creator<j> CREATOR = new k();
  public final int o;
  public final G p;
  
  public j(int paramInt, G paramG)
  {
    o = paramInt;
    p = paramG;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.i(paramParcel, 1, o);
    c.m(paramParcel, 2, p, paramInt, false);
    c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     T2.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */