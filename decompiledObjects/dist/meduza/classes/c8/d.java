package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class d
  implements Parcelable.Creator<e>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    String str5 = str4;
    String str6 = str5;
    String str7 = str6;
    boolean bool = false;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\b': 
        str7 = b.f(j, paramParcel);
        break;
      case '\007': 
        bool = b.k(j, paramParcel);
        break;
      case '\006': 
        str6 = b.f(j, paramParcel);
        break;
      case '\005': 
        str3 = b.f(j, paramParcel);
        break;
      case '\004': 
        str4 = b.f(j, paramParcel);
        break;
      case '\003': 
        str5 = b.f(j, paramParcel);
        break;
      case '\002': 
        str2 = b.f(j, paramParcel);
        break;
      case '\001': 
        str1 = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new e(str1, str2, str3, str4, str5, str6, bool, str7);
  }
}

/* Location:
 * Qualified Name:     c8.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */