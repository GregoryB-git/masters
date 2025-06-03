package z5;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;
import n6.b;

public final class m
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    int j = 0;
    int k = j;
    int m = k;
    String str = null;
    Object localObject1 = str;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    boolean bool2;
    boolean bool1;
    while (paramParcel.dataPosition() < i)
    {
      int n = paramParcel.readInt();
      switch ((char)n)
      {
      default: 
        b.t(n, paramParcel);
        break;
      case '\007': 
        localObject3 = b.f(n, paramParcel);
        break;
      case '\006': 
        localObject2 = b.g(n, paramParcel);
        break;
      case '\005': 
        bool2 = b.k(n, paramParcel);
        break;
      case '\004': 
        bool1 = b.k(n, paramParcel);
        break;
      case '\003': 
        localObject1 = b.r(n, paramParcel);
        break;
      case '\002': 
        str = b.f(n, paramParcel);
        break;
      case '\001': 
        j = b.o(n, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new TokenData(j, str, (Long)localObject1, bool1, bool2, (ArrayList)localObject2, (String)localObject3);
  }
}

/* Location:
 * Qualified Name:     z5.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */