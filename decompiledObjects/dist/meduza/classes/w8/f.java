package w8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class f
  implements Parcelable.Creator<d.a>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      if ((char)j != '\002') {
        b.t(j, paramParcel);
      } else {
        str = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new d.a(str);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new d.a[paramInt];
  }
}

/* Location:
 * Qualified Name:     w8.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */