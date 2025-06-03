package h6;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zba;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class g
  extends zba
{
  public g(h paramh) {}
  
  public final void s1(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus)
  {
    if (paramGoogleSignInAccount != null)
    {
      Object localObject = a;
      o localo = o.a(a);
      localObject = b;
      try
      {
        a.d(paramGoogleSignInAccount, (GoogleSignInOptions)localObject);
        b = paramGoogleSignInAccount;
        c = ((GoogleSignInOptions)localObject);
      }
      finally
      {
        paramGoogleSignInAccount = finally;
        throw paramGoogleSignInAccount;
      }
    }
    a.setResult(new g6.b(paramGoogleSignInAccount, paramStatus));
  }
}

/* Location:
 * Qualified Name:     h6.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */