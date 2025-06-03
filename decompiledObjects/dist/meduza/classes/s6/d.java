package s6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class d
  extends a
{
  public static final Parcelable.Creator<d> CREATOR = new f();
  public final int a;
  public final String b;
  public final int c;
  
  public d(int paramInt1, String paramString, int paramInt2)
  {
    a = paramInt1;
    b = paramString;
    c = paramInt2;
  }
  
  public d(String paramString, int paramInt)
  {
    a = 1;
    b = paramString;
    c = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a;
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, i);
    z.F(paramParcel, 2, b, false);
    z.z(paramParcel, 3, c);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     s6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */