package c7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class j
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = null;
    int j = 0;
    Object localObject = str2;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3)
          {
            if (m != 4) {
              b.t(k, paramParcel);
            } else {
              str2 = b.f(k, paramParcel);
            }
          }
          else {
            localObject = b.c(k, paramParcel);
          }
        }
        else {
          str1 = b.f(k, paramParcel);
        }
      }
      else {
        j = b.o(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new d(j, str1, str2, (byte[])localObject);
  }
}

/* Location:
 * Qualified Name:     c7.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */