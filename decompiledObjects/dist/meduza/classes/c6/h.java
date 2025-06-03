package c6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import f;
import java.util.HashSet;
import n6.b;
import n6.b.a;

public final class h
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    i locali = null;
    Object localObject1 = locali;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      int n = 1;
      int i1;
      if (m != 1)
      {
        i1 = 2;
        if (m != 2)
        {
          i1 = 3;
          if (m != 3)
          {
            i1 = 4;
            if (m != 4)
            {
              i1 = 5;
              if (m != 5)
              {
                b.t(k, paramParcel);
                continue;
              }
              localObject3 = b.f(k, paramParcel);
              n = j;
              j = i1;
            }
            else
            {
              localObject2 = b.f(k, paramParcel);
              n = j;
              j = i1;
            }
          }
          else
          {
            localObject1 = b.f(k, paramParcel);
            n = j;
            j = i1;
          }
        }
        else
        {
          locali = (i)b.e(paramParcel, k, i.CREATOR);
          n = j;
          j = i1;
        }
      }
      else
      {
        i1 = b.o(k, paramParcel);
        j = n;
        n = i1;
      }
      localHashSet.add(Integer.valueOf(j));
      j = n;
    }
    if (paramParcel.dataPosition() == i) {
      return new g(localHashSet, j, locali, (String)localObject1, (String)localObject2, (String)localObject3);
    }
    throw new b.a(f.h("Overread allowed size end=", i), paramParcel);
  }
}

/* Location:
 * Qualified Name:     c6.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */