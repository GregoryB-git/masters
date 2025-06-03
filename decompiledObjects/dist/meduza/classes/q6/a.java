package q6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;

public final class a
  extends n6.a
{
  public static final Parcelable.Creator<a> CREATOR = new e();
  public final boolean a;
  public final int b;
  
  public a(int paramInt, boolean paramBoolean)
  {
    a = paramBoolean;
    b = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.t(paramParcel, 1, a);
    z.z(paramParcel, 2, b);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     q6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */