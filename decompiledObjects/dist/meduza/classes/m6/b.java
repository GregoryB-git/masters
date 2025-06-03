package m6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class b
  extends a
{
  public static final Parcelable.Creator<b> CREATOR = new n0();
  public final l a;
  public final boolean b;
  public final boolean c;
  public final int[] d;
  public final int e;
  public final int[] f;
  
  public b(l paraml, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt1, int paramInt, int[] paramArrayOfInt2)
  {
    a = paraml;
    b = paramBoolean1;
    c = paramBoolean2;
    d = paramArrayOfInt1;
    e = paramInt;
    f = paramArrayOfInt2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 1, a, paramInt, false);
    z.t(paramParcel, 2, b);
    z.t(paramParcel, 3, c);
    z.A(paramParcel, 4, d, false);
    z.z(paramParcel, 5, e);
    z.A(paramParcel, 6, f, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     m6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */