package f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class c
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    int j = 0;
    int k = j;
    String str = null;
    Object localObject1 = str;
    Object localObject2 = localObject1;
    long l = 0L;
    while (paramParcel.dataPosition() < i)
    {
      int m = paramParcel.readInt();
      int n = (char)m;
      if (n != 1)
      {
        if (n != 2)
        {
          if (n != 3)
          {
            if (n != 4)
            {
              if (n != 5)
              {
                if (n != 1000) {
                  b.t(m, paramParcel);
                } else {
                  j = b.o(m, paramParcel);
                }
              }
              else {
                localObject2 = b.b(m, paramParcel);
              }
            }
            else {
              localObject1 = b.c(m, paramParcel);
            }
          }
          else {
            l = b.q(m, paramParcel);
          }
        }
        else {
          k = b.o(m, paramParcel);
        }
      }
      else {
        str = b.f(m, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new a(j, str, k, l, (byte[])localObject1, (Bundle)localObject2);
  }
}

/* Location:
 * Qualified Name:     f6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */