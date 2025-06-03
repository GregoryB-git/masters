package A2;

import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;

public class p
  extends a
{
  @NonNull
  public static final Parcelable.Creator<p> CREATOR = new T();
  public final int o;
  public final boolean p;
  public final boolean q;
  public final int r;
  public final int s;
  
  public p(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, int paramInt3)
  {
    o = paramInt1;
    p = paramBoolean1;
    q = paramBoolean2;
    r = paramInt2;
    s = paramInt3;
  }
  
  public int a()
  {
    return r;
  }
  
  public int d()
  {
    return s;
  }
  
  public boolean f()
  {
    return p;
  }
  
  public boolean g()
  {
    return q;
  }
  
  public int i()
  {
    return o;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.i(paramParcel, 1, i());
    c.c(paramParcel, 2, f());
    c.c(paramParcel, 3, g());
    c.i(paramParcel, 4, a());
    c.i(paramParcel, 5, d());
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     A2.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */