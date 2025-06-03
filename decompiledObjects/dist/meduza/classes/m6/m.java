package m6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.List;
import n6.a;

public final class m
  extends a
{
  public static final Parcelable.Creator<m> CREATOR = new o();
  public final int a;
  public List b;
  
  public m(int paramInt, List paramList)
  {
    a = paramInt;
    b = paramList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.I(paramParcel, 2, b, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     m6.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */