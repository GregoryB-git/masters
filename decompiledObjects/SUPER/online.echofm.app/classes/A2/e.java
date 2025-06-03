package A2;

import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;

public class e
  extends a
{
  @NonNull
  public static final Parcelable.Creator<e> CREATOR = new c0();
  public final p o;
  public final boolean p;
  public final boolean q;
  public final int[] r;
  public final int s;
  public final int[] t;
  
  public e(p paramp, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt1, int paramInt, int[] paramArrayOfInt2)
  {
    o = paramp;
    p = paramBoolean1;
    q = paramBoolean2;
    r = paramArrayOfInt1;
    s = paramInt;
    t = paramArrayOfInt2;
  }
  
  public int a()
  {
    return s;
  }
  
  public int[] d()
  {
    return r;
  }
  
  public int[] f()
  {
    return t;
  }
  
  public boolean g()
  {
    return p;
  }
  
  public boolean i()
  {
    return q;
  }
  
  public final p k()
  {
    return o;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.m(paramParcel, 1, o, paramInt, false);
    c.c(paramParcel, 2, g());
    c.c(paramParcel, 3, i());
    c.j(paramParcel, 4, d(), false);
    c.i(paramParcel, 5, a());
    c.j(paramParcel, 6, f(), false);
    c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     A2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */