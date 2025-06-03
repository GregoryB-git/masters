package m6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.f;

public final class z
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    IBinder localIBinder = null;
    Object localObject = localIBinder;
    int j = 0;
    int k = j;
    int m = k;
    boolean bool2;
    boolean bool1;
    while (paramParcel.dataPosition() < i)
    {
      int n = paramParcel.readInt();
      int i1 = (char)n;
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            if (i1 != 4)
            {
              if (i1 != 5) {
                n6.b.t(n, paramParcel);
              } else {
                bool2 = n6.b.k(n, paramParcel);
              }
            }
            else {
              bool1 = n6.b.k(n, paramParcel);
            }
          }
          else {
            localObject = (j6.b)n6.b.e(paramParcel, n, j6.b.CREATOR);
          }
        }
        else {
          localIBinder = n6.b.n(n, paramParcel);
        }
      }
      else {
        j = n6.b.o(n, paramParcel);
      }
    }
    n6.b.j(i, paramParcel);
    return new f(j, localIBinder, (j6.b)localObject, bool1, bool2);
  }
}

/* Location:
 * Qualified Name:     m6.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */