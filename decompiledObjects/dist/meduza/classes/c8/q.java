package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b8.h0;
import b8.l0;
import java.util.ArrayList;
import n6.b;

public final class q
  implements Parcelable.Creator<n>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = str1;
    Object localObject1 = str2;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 3)
          {
            if (k != 4)
            {
              if (k != 5) {
                b.t(j, paramParcel);
              } else {
                localObject3 = (i)b.e(paramParcel, j, i.CREATOR);
              }
            }
            else {
              localObject2 = b.i(paramParcel, j, l0.CREATOR);
            }
          }
          else {
            localObject1 = b.i(paramParcel, j, h0.CREATOR);
          }
        }
        else {
          str2 = b.f(j, paramParcel);
        }
      }
      else {
        str1 = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new n(str1, str2, (ArrayList)localObject1, (ArrayList)localObject2, (i)localObject3);
  }
}

/* Location:
 * Qualified Name:     c8.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */