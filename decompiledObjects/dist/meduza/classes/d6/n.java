package d6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import n6.b;

public final class n
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    boolean bool1 = false;
    boolean bool2 = bool1;
    boolean bool3 = bool2;
    ArrayList localArrayList = null;
    Object localObject1 = localArrayList;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\b': 
        bool3 = b.k(j, paramParcel);
        break;
      case '\007': 
        localObject4 = b.f(j, paramParcel);
        break;
      case '\006': 
        localObject3 = b.f(j, paramParcel);
        break;
      case '\005': 
        localObject2 = (Account)b.e(paramParcel, j, Account.CREATOR);
        break;
      case '\004': 
        bool2 = b.k(j, paramParcel);
        break;
      case '\003': 
        bool1 = b.k(j, paramParcel);
        break;
      case '\002': 
        localObject1 = b.f(j, paramParcel);
        break;
      case '\001': 
        localArrayList = b.i(paramParcel, j, Scope.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new AuthorizationRequest(localArrayList, (String)localObject1, bool1, bool2, (Account)localObject2, (String)localObject3, (String)localObject4, bool3);
  }
}

/* Location:
 * Qualified Name:     d6.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */