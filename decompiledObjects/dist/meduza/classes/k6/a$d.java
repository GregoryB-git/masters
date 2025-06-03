package k6;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public abstract interface a$d
{
  public static final c j = new c(0);
  
  public static abstract interface a
    extends a.d
  {
    public abstract Account u();
  }
  
  public static abstract interface b
    extends a.d
  {
    public abstract GoogleSignInAccount r();
  }
  
  public static final class c
    implements a.d
  {}
}

/* Location:
 * Qualified Name:     k6.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */