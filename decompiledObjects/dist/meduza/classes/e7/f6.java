package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.List;
import n6.a;

public final class f6
  extends a
{
  public static final Parcelable.Creator<f6> CREATOR = new e6();
  public final List<b6> a;
  
  public f6(List<b6> paramList)
  {
    a = paramList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.I(paramParcel, 1, a, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     e7.f6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */