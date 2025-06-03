package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class e0
  implements Parcelable.Creator<f0>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    Object localObject1 = str;
    Object localObject2 = localObject1;
    long l = 0L;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 2)
      {
        if (k != 3)
        {
          if (k != 4)
          {
            if (k != 5) {
              b.t(j, paramParcel);
            } else {
              l = b.q(j, paramParcel);
            }
          }
          else {
            localObject2 = b.f(j, paramParcel);
          }
        }
        else {
          localObject1 = (a0)b.e(paramParcel, j, a0.CREATOR);
        }
      }
      else {
        str = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new f0(str, (a0)localObject1, (String)localObject2, l);
  }
}

/* Location:
 * Qualified Name:     e7.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */