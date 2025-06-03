package m6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import n6.a;

public final class x
  extends a
{
  public static final Parcelable.Creator<x> CREATOR = new y();
  public final int a;
  public final Account b;
  public final int c;
  public final GoogleSignInAccount d;
  
  public x(int paramInt1, Account paramAccount, int paramInt2, GoogleSignInAccount paramGoogleSignInAccount)
  {
    a = paramInt1;
    b = paramAccount;
    c = paramInt2;
    d = paramGoogleSignInAccount;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a;
    int j = z.J(20293, paramParcel);
    z.z(paramParcel, 1, i);
    z.E(paramParcel, 2, b, paramInt, false);
    z.z(paramParcel, 3, c);
    z.E(paramParcel, 4, d, paramInt, false);
    z.L(j, paramParcel);
  }
}

/* Location:
 * Qualified Name:     m6.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */