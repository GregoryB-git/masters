package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class s0
  implements Parcelable.Creator<u>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 1)
      {
        if (k != 2) {
          b.t(j, paramParcel);
        } else {
          str2 = b.f(j, paramParcel);
        }
      }
      else {
        str1 = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new u(str1, str2);
  }
}

/* Location:
 * Qualified Name:     b8.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */