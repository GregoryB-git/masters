package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class b1
  implements Parcelable.Creator<c>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    boolean bool1 = false;
    boolean bool2 = bool1;
    boolean bool3 = bool2;
    String str1 = null;
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    String str5 = str4;
    String str6 = str5;
    String str7 = str6;
    String str8 = str7;
    int j;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch ((char)k)
      {
      default: 
        b.t(k, paramParcel);
        break;
      case '\013': 
        str8 = b.f(k, paramParcel);
        break;
      case '\n': 
        str7 = b.f(k, paramParcel);
        break;
      case '\t': 
        j = b.o(k, paramParcel);
        break;
      case '\b': 
        str6 = b.f(k, paramParcel);
        break;
      case '\007': 
        bool2 = b.k(k, paramParcel);
        break;
      case '\006': 
        str5 = b.f(k, paramParcel);
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
    return new c(str1, str2, str3, str4, bool1, str5, bool2, str6, j, str7, str8);
  }
}

/* Location:
 * Qualified Name:     b8.b1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */