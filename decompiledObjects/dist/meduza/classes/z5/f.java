package z5;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class f
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = str1;
    int j = 0;
    int k = j;
    int m = k;
    long l = 0L;
    while (paramParcel.dataPosition() < i)
    {
      int n = paramParcel.readInt();
      switch ((char)n)
      {
      default: 
        b.t(n, paramParcel);
        break;
      case '\006': 
        str2 = b.f(n, paramParcel);
        break;
      case '\005': 
        m = b.o(n, paramParcel);
        break;
      case '\004': 
        k = b.o(n, paramParcel);
        break;
      case '\003': 
        str1 = b.f(n, paramParcel);
        break;
      case '\002': 
        l = b.q(n, paramParcel);
        break;
      case '\001': 
        j = b.o(n, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new a(j, l, str1, k, m, str2);
  }
}

/* Location:
 * Qualified Name:     z5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */