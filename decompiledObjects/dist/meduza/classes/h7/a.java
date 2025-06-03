package h7;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import g7.f;
import k6.e.a;
import k6.e.b;

public final class a
  extends c<e>
  implements f
{
  public final boolean a = true;
  public final m6.a b;
  public final Bundle c;
  public final Integer d;
  
  public a(Context paramContext, Looper paramLooper, m6.a parama, Bundle paramBundle, e.a parama1, e.b paramb)
  {
    super(paramContext, paramLooper, 44, parama, parama1, paramb);
    b = parama;
    c = paramBundle;
    d = h;
  }
  
  public final Bundle getGetServiceRequestExtraArgs()
  {
    String str = b.e;
    if (!getContext().getPackageName().equals(str)) {
      c.putString("com.google.android.gms.signin.internal.realClientPackageName", b.e);
    }
    return c;
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.signin.service.START";
  }
  
  public final boolean requiresSignIn()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     h7.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */