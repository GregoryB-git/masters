package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class t
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    boolean bool1 = false;
    boolean bool2 = bool1;
    String str1 = null;
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    int j;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch ((char)k)
      {
      default: 
        b.t(k, paramParcel);
        break;
      case '\006': 
        j = b.o(k, paramParcel);
        break;
      case '\005': 
        bool1 = b.k(k, paramParcel);
        break;
      case '\004': 
        str4 = b.f(k, paramParcel);
        break;
      case '\003': 
        str3 = b.f(k, paramParcel);
        break;
      case '\002': 
        str2 = b.f(k, paramParcel);
        break;
      case '\001': 
        str1 = b.f(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new f(str1, str2, str3, str4, bool1, j);
  }
}

/* Location:
 * Qualified Name:     d6.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */