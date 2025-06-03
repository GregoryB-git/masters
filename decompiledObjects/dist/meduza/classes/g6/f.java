package g6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import h6.a;
import java.util.ArrayList;
import n6.b;

public final class f
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    ArrayList localArrayList1 = null;
    int j = 0;
    int k = j;
    int m = k;
    int n = m;
    ArrayList localArrayList2 = null;
    Object localObject1 = localArrayList2;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    boolean bool3;
    boolean bool2;
    boolean bool1;
    while (paramParcel.dataPosition() < i)
    {
      int i1 = paramParcel.readInt();
      switch ((char)i1)
      {
      default: 
        b.t(i1, paramParcel);
        break;
      case '\n': 
        localObject4 = b.f(i1, paramParcel);
        break;
      case '\t': 
        localArrayList1 = b.i(paramParcel, i1, a.CREATOR);
        break;
      case '\b': 
        localObject3 = b.f(i1, paramParcel);
        break;
      case '\007': 
        localObject2 = b.f(i1, paramParcel);
        break;
      case '\006': 
        bool3 = b.k(i1, paramParcel);
        break;
      case '\005': 
        bool2 = b.k(i1, paramParcel);
        break;
      case '\004': 
        bool1 = b.k(i1, paramParcel);
        break;
      case '\003': 
        localObject1 = (Account)b.e(paramParcel, i1, Account.CREATOR);
        break;
      case '\002': 
        localArrayList2 = b.i(paramParcel, i1, Scope.CREATOR);
        break;
      case '\001': 
        j = b.o(i1, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new GoogleSignInOptions(j, localArrayList2, (Account)localObject1, bool1, bool2, bool3, (String)localObject2, (String)localObject3, GoogleSignInOptions.F(localArrayList1), (String)localObject4);
  }
}

/* Location:
 * Qualified Name:     g6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */