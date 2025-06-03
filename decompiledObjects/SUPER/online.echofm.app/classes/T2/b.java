package T2;

import B2.a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  extends a
{
  public static final Parcelable.Creator<b> CREATOR = new c();
  public final int o;
  public int p;
  public Intent q;
  
  public b(int paramInt1, int paramInt2, Intent paramIntent)
  {
    o = paramInt1;
    p = paramInt2;
    q = paramIntent;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = B2.c.a(paramParcel);
    B2.c.i(paramParcel, 1, o);
    B2.c.i(paramParcel, 2, p);
    B2.c.m(paramParcel, 3, q, paramInt, false);
    B2.c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     T2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */