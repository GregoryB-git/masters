package com.google.android.gms.internal.auth_api;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import b6.f;
import b6.g;
import com.google.android.gms.common.internal.c;
import k6.e.a;
import k6.e.b;
import m6.a;

public final class zbe
  extends c
{
  private final g zba;
  
  public zbe(Context paramContext, Looper paramLooper, a parama, g paramg, e.a parama1, e.b paramb)
  {
    super(paramContext, paramLooper, 68, parama, parama1, paramb);
    paramContext = paramg;
    if (paramg == null) {
      paramContext = g.c;
    }
    paramContext = new f(paramContext);
    b = zbat.zba();
    zba = new g(paramContext);
  }
  
  public final Bundle getGetServiceRequestExtraArgs()
  {
    g localg = zba;
    localg.getClass();
    Bundle localBundle = new Bundle();
    localBundle.putString("consumer_package", null);
    localBundle.putBoolean("force_save_dialog", a);
    localBundle.putString("log_session_id", b);
    return localBundle;
  }
  
  public final int getMinApkVersion()
  {
    return 12800000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.api.credentials.service.START";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */