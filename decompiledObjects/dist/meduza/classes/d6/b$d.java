package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import n6.a;

public final class b$d
  extends a
{
  public static final Parcelable.Creator<d> CREATOR = new x();
  public final boolean a;
  
  public b$d(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof d)) {
      return false;
    }
    paramObject = (d)paramObject;
    return a == a;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Boolean.valueOf(a) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.t(paramParcel, 1, a);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     d6.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */