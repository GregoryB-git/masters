package w8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class d$a
  extends a
  implements v8.d.a
{
  public static final Parcelable.Creator<a> CREATOR = new f();
  public final String a;
  
  public d$a(String paramString)
  {
    a = paramString;
  }
  
  public final String i()
  {
    return a;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 2, a, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     w8.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */