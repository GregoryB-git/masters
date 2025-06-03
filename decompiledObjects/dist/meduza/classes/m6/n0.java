package m6;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class n0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    boolean bool1 = false;
    boolean bool2 = bool1;
    boolean bool3 = bool2;
    l locall = null;
    Object localObject1 = locall;
    Object localObject2 = localObject1;
    int j;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch ((char)k)
      {
      default: 
        n6.b.t(k, paramParcel);
        break;
      case '\006': 
        localObject2 = n6.b.d(k, paramParcel);
        break;
      case '\005': 
        j = n6.b.o(k, paramParcel);
        break;
      case '\004': 
        localObject1 = n6.b.d(k, paramParcel);
        break;
      case '\003': 
        bool2 = n6.b.k(k, paramParcel);
        break;
      case '\002': 
        bool1 = n6.b.k(k, paramParcel);
        break;
      case '\001': 
        locall = (l)n6.b.e(paramParcel, k, l.CREATOR);
      }
    }
    n6.b.j(i, paramParcel);
    return new b(locall, bool1, bool2, (int[])localObject1, j, (int[])localObject2);
  }
}

/* Location:
 * Qualified Name:     m6.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */