package g6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import n6.b;

public final class d
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    Object localObject1 = str4;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    Object localObject6 = localObject5;
    long l = 0L;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch ((char)k)
      {
      default: 
        b.t(k, paramParcel);
        break;
      case '\f': 
        localObject6 = b.f(k, paramParcel);
        break;
      case '\013': 
        localObject5 = b.f(k, paramParcel);
        break;
      case '\n': 
        localObject4 = b.i(paramParcel, k, Scope.CREATOR);
        break;
      case '\t': 
        localObject3 = b.f(k, paramParcel);
        break;
      case '\b': 
        l = b.q(k, paramParcel);
        break;
      case '\007': 
        localObject2 = b.f(k, paramParcel);
        break;
      case '\006': 
        localObject1 = (Uri)b.e(paramParcel, k, Uri.CREATOR);
        break;
      case '\005': 
        str4 = b.f(k, paramParcel);
        break;
      case '\004': 
        str3 = b.f(k, paramParcel);
        break;
      case '\003': 
        str2 = b.f(k, paramParcel);
        break;
      case '\002': 
        str1 = b.f(k, paramParcel);
        break;
      case '\001': 
        j = b.o(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new GoogleSignInAccount(j, str1, str2, str3, str4, (Uri)localObject1, (String)localObject2, l, (String)localObject3, (ArrayList)localObject4, (String)localObject5, (String)localObject6);
  }
}

/* Location:
 * Qualified Name:     g6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */