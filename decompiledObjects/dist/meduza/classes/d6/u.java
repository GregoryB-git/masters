package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import n6.b;

public final class u
  implements Parcelable.Creator
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
    Object localObject = str3;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\007': 
        bool3 = b.k(j, paramParcel);
        break;
      case '\006': 
        localObject = b.g(j, paramParcel);
        break;
      case '\005': 
        str3 = b.f(j, paramParcel);
        break;
      case '\004': 
        bool2 = b.k(j, paramParcel);
        break;
      case '\003': 
        str2 = b.f(j, paramParcel);
        break;
      case '\002': 
        str1 = b.f(j, paramParcel);
        break;
      case '\001': 
        bool1 = b.k(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new b.a(bool1, str1, str2, bool2, str3, (ArrayList)localObject, bool3);
  }
}

/* Location:
 * Qualified Name:     d6.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */