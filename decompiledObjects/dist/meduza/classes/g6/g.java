package g6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import n6.b;

public final class g
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = "";
    GoogleSignInAccount localGoogleSignInAccount = null;
    String str2 = "";
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 4)
      {
        if (k != 7)
        {
          if (k != 8) {
            b.t(j, paramParcel);
          } else {
            str2 = b.f(j, paramParcel);
          }
        }
        else {
          localGoogleSignInAccount = (GoogleSignInAccount)b.e(paramParcel, j, GoogleSignInAccount.CREATOR);
        }
      }
      else {
        str1 = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new SignInAccount(str1, localGoogleSignInAccount, str2);
  }
}

/* Location:
 * Qualified Name:     g6.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */