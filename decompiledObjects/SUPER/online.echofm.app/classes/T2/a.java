package T2;

import A2.G;
import A2.c;
import A2.c.d;
import A2.d;
import A2.n;
import S2.e;
import android.accounts.Account;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import x2.b;
import y2.e.a;
import y2.e.b;

public class a
  extends A2.g
  implements e
{
  public final boolean I = true;
  public final d J;
  public final Bundle K;
  public final Integer L;
  
  public a(Context paramContext, Looper paramLooper, boolean paramBoolean, d paramd, Bundle paramBundle, e.a parama, e.b paramb)
  {
    super(paramContext, paramLooper, 44, paramd, parama, paramb);
    J = paramd;
    K = paramBundle;
    L = paramd.g();
  }
  
  public static Bundle l0(d paramd)
  {
    paramd.f();
    Integer localInteger = paramd.g();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", paramd.a());
    if (localInteger != null) {
      localBundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", localInteger.intValue());
    }
    localBundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
    localBundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
    localBundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
    localBundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
    localBundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
    localBundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
    localBundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
    localBundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
    return localBundle;
  }
  
  public final Bundle A()
  {
    String str = J.d();
    if (!y().getPackageName().equals(str)) {
      K.putString("com.google.android.gms.signin.internal.realClientPackageName", J.d());
    }
    return K;
  }
  
  public final String E()
  {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  public final String F()
  {
    return "com.google.android.gms.signin.service.START";
  }
  
  public final void d(f paramf)
  {
    n.j(paramf, "Expecting a valid ISignInCallbacks");
    try
    {
      localObject1 = J.b();
      if ("<<default account>>".equals(name)) {
        GoogleSignInAccount localGoogleSignInAccount = u2.a.a(y()).b();
      }
    }
    catch (RemoteException localRemoteException)
    {
      break label98;
    }
    Object localObject2 = null;
    Object localObject3 = new A2/G;
    ((G)localObject3).<init>((Account)localObject1, ((Integer)n.i(L)).intValue(), (GoogleSignInAccount)localObject2);
    localObject2 = (g)D();
    Object localObject1 = new T2/j;
    ((j)localObject1).<init>(1, (G)localObject3);
    ((g)localObject2).Z0((j)localObject1, paramf);
    return;
    label98:
    Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
    try
    {
      localObject3 = new T2/l;
      localObject1 = new x2/b;
      ((b)localObject1).<init>(8, null);
      ((l)localObject3).<init>(1, (b)localObject1, null);
      paramf.K((l)localObject3);
      return;
    }
    catch (RemoteException paramf)
    {
      Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", (Throwable)localObject2);
    }
  }
  
  public final int h()
  {
    return 12451000;
  }
  
  public final boolean m()
  {
    return I;
  }
  
  public final void n()
  {
    p(new c.d(this));
  }
}

/* Location:
 * Qualified Name:     T2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */