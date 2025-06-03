package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class k1
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    f0 localf0 = null;
    n1 localn1 = null;
    Object localObject1 = localn1;
    Object localObject2 = localObject1;
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
            if (k != 4) {
              b.t(j, paramParcel);
            } else {
              localObject2 = (p1)b.e(paramParcel, j, p1.CREATOR);
            }
          }
          else {
            localObject1 = (f)b.e(paramParcel, j, f.CREATOR);
          }
        }
        else {
          localn1 = (n1)b.e(paramParcel, j, n1.CREATOR);
        }
      }
      else {
        localf0 = (f0)b.e(paramParcel, j, f0.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new e(localf0, localn1, (f)localObject1, (p1)localObject2);
  }
}

/* Location:
 * Qualified Name:     b7.k1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */