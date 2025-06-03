package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class p
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    boolean bool1 = false;
    boolean bool2 = bool1;
    b.d locald = null;
    Object localObject1 = locald;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    int j;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch ((char)k)
      {
      default: 
        n6.b.t(k, paramParcel);
        break;
      case '\007': 
        localObject4 = (b.b)n6.b.e(paramParcel, k, b.b.CREATOR);
        break;
      case '\006': 
        localObject3 = (b.c)n6.b.e(paramParcel, k, b.c.CREATOR);
        break;
      case '\005': 
        j = n6.b.o(k, paramParcel);
        break;
      case '\004': 
        bool1 = n6.b.k(k, paramParcel);
        break;
      case '\003': 
        localObject2 = n6.b.f(k, paramParcel);
        break;
      case '\002': 
        localObject1 = (b.a)n6.b.e(paramParcel, k, b.a.CREATOR);
        break;
      case '\001': 
        locald = (b.d)n6.b.e(paramParcel, k, b.d.CREATOR);
      }
    }
    n6.b.j(i, paramParcel);
    return new b(locald, (b.a)localObject1, (String)localObject2, bool1, j, (b.c)localObject3, (b.b)localObject4);
  }
}

/* Location:
 * Qualified Name:     d6.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */