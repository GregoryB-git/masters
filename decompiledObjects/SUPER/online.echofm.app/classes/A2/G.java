package A2;

import B2.a;
import B2.c;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class G
  extends a
{
  public static final Parcelable.Creator<G> CREATOR = new H();
  public final int o;
  public final Account p;
  public final int q;
  public final GoogleSignInAccount r;
  
  public G(int paramInt1, Account paramAccount, int paramInt2, GoogleSignInAccount paramGoogleSignInAccount)
  {
    o = paramInt1;
    p = paramAccount;
    q = paramInt2;
    r = paramGoogleSignInAccount;
  }
  
  public G(Account paramAccount, int paramInt, GoogleSignInAccount paramGoogleSignInAccount)
  {
    this(2, paramAccount, paramInt, paramGoogleSignInAccount);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.i(paramParcel, 1, o);
    c.m(paramParcel, 2, p, paramInt, false);
    c.i(paramParcel, 3, q);
    c.m(paramParcel, 4, r, paramInt, false);
    c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     A2.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */