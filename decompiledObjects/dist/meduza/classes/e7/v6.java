package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import n6.b;

public final class v6
  implements Parcelable.Creator<k6>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    boolean bool1 = true;
    boolean bool2 = bool1;
    String str1 = "";
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    boolean bool3 = false;
    boolean bool4 = bool3;
    boolean bool5 = bool4;
    boolean bool6 = bool5;
    boolean bool7 = bool6;
    boolean bool8 = bool7;
    long l1 = 0L;
    long l2 = l1;
    long l3 = l2;
    long l4 = l3;
    long l5 = l4;
    long l6 = l5;
    long l7 = l6;
    String str5 = null;
    String str6 = str5;
    String str7 = str6;
    String str8 = str7;
    String str9 = str8;
    String str10 = str9;
    String str11 = str10;
    Object localObject1 = str11;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    long l8 = -2147483648L;
    int n = 100;
    int m;
    int k;
    int j;
    while (paramParcel.dataPosition() < i)
    {
      int i1 = paramParcel.readInt();
      switch ((char)i1)
      {
      case '\r': 
      case '\021': 
      case '\024': 
      case '!': 
      default: 
        b.t(i1, paramParcel);
        break;
      case '&': 
        m = b.o(i1, paramParcel);
        break;
      case '%': 
        l7 = b.q(i1, paramParcel);
        break;
      case '$': 
        str4 = b.f(i1, paramParcel);
        break;
      case '#': 
        localObject5 = b.f(i1, paramParcel);
        break;
      case '"': 
        l6 = b.q(i1, paramParcel);
        break;
      case ' ': 
        k = b.o(i1, paramParcel);
        break;
      case '\037': 
        str3 = b.f(i1, paramParcel);
        break;
      case '\036': 
        n = b.o(i1, paramParcel);
        break;
      case '\035': 
        l5 = b.q(i1, paramParcel);
        break;
      case '\034': 
        bool6 = b.k(i1, paramParcel);
        break;
      case '\033': 
        localObject4 = b.f(i1, paramParcel);
        break;
      case '\032': 
        str2 = b.f(i1, paramParcel);
        break;
      case '\031': 
        str1 = b.f(i1, paramParcel);
        break;
      case '\030': 
        localObject3 = b.f(i1, paramParcel);
        break;
      case '\027': 
        localObject2 = b.g(i1, paramParcel);
        break;
      case '\026': 
        l4 = b.q(i1, paramParcel);
        break;
      case '\025': 
        localObject1 = b.l(i1, paramParcel);
        break;
      case '\023': 
        str11 = b.f(i1, paramParcel);
        break;
      case '\022': 
        bool5 = b.k(i1, paramParcel);
        break;
      case '\020': 
        bool2 = b.k(i1, paramParcel);
        break;
      case '\017': 
        j = b.o(i1, paramParcel);
        break;
      case '\016': 
        l3 = b.q(i1, paramParcel);
        break;
      case '\f': 
        str10 = b.f(i1, paramParcel);
        break;
      case '\013': 
        l8 = b.q(i1, paramParcel);
        break;
      case '\n': 
        bool3 = b.k(i1, paramParcel);
        break;
      case '\t': 
        bool1 = b.k(i1, paramParcel);
        break;
      case '\b': 
        str9 = b.f(i1, paramParcel);
        break;
      case '\007': 
        l2 = b.q(i1, paramParcel);
        break;
      case '\006': 
        l1 = b.q(i1, paramParcel);
        break;
      case '\005': 
        str8 = b.f(i1, paramParcel);
        break;
      case '\004': 
        str7 = b.f(i1, paramParcel);
        break;
      case '\003': 
        str6 = b.f(i1, paramParcel);
        break;
      case '\002': 
        str5 = b.f(i1, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new k6(str5, str6, str7, str8, l1, l2, str9, bool1, bool3, l8, str10, l3, j, bool2, bool5, str11, (Boolean)localObject1, l4, (ArrayList)localObject2, (String)localObject3, str1, str2, (String)localObject4, bool6, l5, n, str3, k, l6, (String)localObject5, str4, l7, m);
  }
}

/* Location:
 * Qualified Name:     e7.v6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */