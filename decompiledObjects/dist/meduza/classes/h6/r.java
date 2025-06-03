package h6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import n6.b;

public final class r
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    GoogleSignInOptions localGoogleSignInOptions = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 2)
      {
        if (k != 5) {
          b.t(j, paramParcel);
        } else {
          localGoogleSignInOptions = (GoogleSignInOptions)b.e(paramParcel, j, GoogleSignInOptions.CREATOR);
        }
      }
      else {
        str = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new SignInConfiguration(str, localGoogleSignInOptions);
  }
}

/* Location:
 * Qualified Name:     h6.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */