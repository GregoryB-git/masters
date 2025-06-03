package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h;
import n6.a;

public final class e
  extends a
{
  public static final Parcelable.Creator<e> CREATOR = new s();
  public final int a;
  
  public e(int paramInt)
  {
    a = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    return h.a(Integer.valueOf(a), Integer.valueOf(a));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(a) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = a;
    int i = z.J(20293, paramParcel);
    z.z(paramParcel, 1, paramInt);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     d6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */