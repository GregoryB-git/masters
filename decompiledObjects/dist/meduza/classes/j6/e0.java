package j6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class e0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    boolean bool1 = false;
    boolean bool2 = bool1;
    IBinder localIBinder = null;
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
              bool2 = b.k(j, paramParcel);
            }
          }
          else {
            bool1 = b.k(j, paramParcel);
          }
        }
        else {
          localIBinder = b.n(j, paramParcel);
        }
      }
      else {
        str = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new d0(str, localIBinder, bool1, bool2);
  }
}

/* Location:
 * Qualified Name:     j6.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */