package h6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import k6.e;
import p6.a;

public final class n
{
  public static final a a = new a("GoogleSignInCommon", new String[0]);
  
  public static Intent a(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    a.a("getSignInIntent()", new Object[0]);
    SignInConfiguration localSignInConfiguration = new SignInConfiguration(paramContext.getPackageName(), paramGoogleSignInOptions);
    paramGoogleSignInOptions = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
    paramGoogleSignInOptions.setPackage(paramContext.getPackageName());
    paramGoogleSignInOptions.setClass(paramContext, SignInHubActivity.class);
    paramContext = new Bundle();
    paramContext.putParcelable("config", localSignInConfiguration);
    paramGoogleSignInOptions.putExtra("config", paramContext);
    return paramGoogleSignInOptions;
  }
  
  public static void b(Context arg0)
  {
    o.a(???).b();
    synchronized (e.a)
    {
      ??? = ((Set)???).iterator();
    }
    ((e)???.next()).getClass();
    throw new UnsupportedOperationException();
    ??? = finally;
    throw ???;
  }
}

/* Location:
 * Qualified Name:     h6.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */