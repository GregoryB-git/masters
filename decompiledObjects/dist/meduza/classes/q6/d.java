package q6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class d
  extends a
{
  public static final Parcelable.Creator<d> CREATOR = new h();
  public final int a;
  public final int b;
  public final Long c;
  public final Long d;
  public final int e;
  
  public d(int paramInt1, int paramInt2, Long paramLong1, Long paramLong2, int paramInt3)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramLong1;
    d = paramLong2;
    e = paramInt3;
    if ((paramLong1 != null) && (paramLong2 != null) && (paramLong2.longValue() != 0L))
    {
      paramLong1.longValue();
      if (paramLong2.longValue() != 0L) {
        return;
      }
      throw new IllegalArgumentException("Given Long is zero");
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.z(paramParcel, 2, b);
    z.D(paramParcel, 3, c);
    z.D(paramParcel, 4, d);
    z.z(paramParcel, 5, e);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     q6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */