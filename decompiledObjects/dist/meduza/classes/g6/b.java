package g6;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import k6.j;

public final class b
  implements j
{
  public final Status a;
  public final GoogleSignInAccount b;
  
  public b(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus)
  {
    b = paramGoogleSignInAccount;
    a = paramStatus;
  }
  
  public final Status getStatus()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     g6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */