package c6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import f;
import java.util.ArrayList;
import java.util.HashSet;
import n6.b.a;

public final class c
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    ArrayList localArrayList = null;
    Object localObject = localArrayList;
    int k = j;
    while (paramParcel.dataPosition() < i)
    {
      int m = paramParcel.readInt();
      int n = (char)m;
      int i1 = 1;
      int i2;
      if (n != 1)
      {
        i2 = 2;
        if (n != 2)
        {
          i2 = 3;
          if (n != 3)
          {
            i2 = 4;
            if (n != 4)
            {
              n6.b.t(m, paramParcel);
              continue;
            }
            localObject = (e)n6.b.e(paramParcel, m, e.CREATOR);
            i1 = k;
            k = i2;
          }
          else
          {
            j = n6.b.o(m, paramParcel);
            i1 = k;
            k = i2;
          }
        }
        else
        {
          localArrayList = n6.b.i(paramParcel, m, g.CREATOR);
          i1 = k;
          k = i2;
        }
      }
      else
      {
        i2 = n6.b.o(m, paramParcel);
        k = i1;
        i1 = i2;
      }
      localHashSet.add(Integer.valueOf(k));
      k = i1;
    }
    if (paramParcel.dataPosition() == i) {
      return new b(localHashSet, k, localArrayList, j, (e)localObject);
    }
    throw new b.a(f.h("Overread allowed size end=", i), paramParcel);
  }
}

/* Location:
 * Qualified Name:     c6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */