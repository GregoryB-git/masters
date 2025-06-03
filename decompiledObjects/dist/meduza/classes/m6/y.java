package m6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import n6.b;

public final class y
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    int j = 0;
    Account localAccount = null;
    Object localObject = localAccount;
    int k = 0;
    while (paramParcel.dataPosition() < i)
    {
      int m = paramParcel.readInt();
      int n = (char)m;
      if (n != 1)
      {
        if (n != 2)
        {
          if (n != 3)
          {
            if (n != 4) {
              b.t(m, paramParcel);
            } else {
              localObject = (GoogleSignInAccount)b.e(paramParcel, m, GoogleSignInAccount.CREATOR);
            }
          }
          else {
            k = b.o(m, paramParcel);
          }
        }
        else {
          localAccount = (Account)b.e(paramParcel, m, Account.CREATOR);
        }
      }
      else {
        j = b.o(m, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new x(j, localAccount, k, (GoogleSignInAccount)localObject);
  }
}

/* Location:
 * Qualified Name:     m6.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */