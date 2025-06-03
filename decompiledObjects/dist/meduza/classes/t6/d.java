package t6;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class d
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    String str1 = null;
    String str2 = str1;
    Object localObject = str2;
    int j = 0;
    int k = j;
    int m = k;
    int n = m;
    int i1 = n;
    int i2 = i1;
    boolean bool2;
    boolean bool1;
    while (paramParcel.dataPosition() < i)
    {
      int i3 = paramParcel.readInt();
      switch ((char)i3)
      {
      default: 
        n6.b.t(i3, paramParcel);
        break;
      case '\t': 
        localObject = (s6.b)n6.b.e(paramParcel, i3, s6.b.CREATOR);
        break;
      case '\b': 
        str2 = n6.b.f(i3, paramParcel);
        break;
      case '\007': 
        i2 = n6.b.o(i3, paramParcel);
        break;
      case '\006': 
        str1 = n6.b.f(i3, paramParcel);
        break;
      case '\005': 
        bool2 = n6.b.k(i3, paramParcel);
        break;
      case '\004': 
        n = n6.b.o(i3, paramParcel);
        break;
      case '\003': 
        bool1 = n6.b.k(i3, paramParcel);
        break;
      case '\002': 
        k = n6.b.o(i3, paramParcel);
        break;
      case '\001': 
        j = n6.b.o(i3, paramParcel);
      }
    }
    n6.b.j(i, paramParcel);
    return new a.a(j, k, bool1, n, bool2, str1, i2, str2, (s6.b)localObject);
  }
}

/* Location:
 * Qualified Name:     t6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */