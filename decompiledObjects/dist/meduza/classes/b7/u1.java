package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class u1
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    Boolean localBoolean = null;
    Object localObject1 = localBoolean;
    Object localObject2 = localObject1;
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
              localObject2 = b.f(j, paramParcel);
            }
          }
          else {
            localObject1 = b.f(j, paramParcel);
          }
        }
        else {
          localBoolean = b.l(j, paramParcel);
        }
      }
      else {
        str = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new k(str, localBoolean, (String)localObject1, (String)localObject2);
  }
}

/* Location:
 * Qualified Name:     b7.u1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */