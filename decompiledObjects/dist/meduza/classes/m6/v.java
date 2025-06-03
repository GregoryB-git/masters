package m6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class v
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    long l1 = 0L;
    long l2 = l1;
    String str1 = null;
    String str2 = str1;
    int j = 0;
    int k = j;
    int m = k;
    int n = m;
    int i1 = -1;
    while (paramParcel.dataPosition() < i)
    {
      int i2 = paramParcel.readInt();
      switch ((char)i2)
      {
      default: 
        b.t(i2, paramParcel);
        break;
      case '\t': 
        i1 = b.o(i2, paramParcel);
        break;
      case '\b': 
        n = b.o(i2, paramParcel);
        break;
      case '\007': 
        str2 = b.f(i2, paramParcel);
        break;
      case '\006': 
        str1 = b.f(i2, paramParcel);
        break;
      case '\005': 
        l2 = b.q(i2, paramParcel);
        break;
      case '\004': 
        l1 = b.q(i2, paramParcel);
        break;
      case '\003': 
        m = b.o(i2, paramParcel);
        break;
      case '\002': 
        k = b.o(i2, paramParcel);
        break;
      case '\001': 
        j = b.o(i2, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new g(j, k, m, l1, l2, str1, str2, n, i1);
  }
}

/* Location:
 * Qualified Name:     m6.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */