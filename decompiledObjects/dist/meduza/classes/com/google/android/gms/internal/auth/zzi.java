package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import j6.d;
import l6.j;
import z5.i;

final class zzi
  extends com.google.android.gms.common.internal.c
{
  public zzi(Context paramContext, Looper paramLooper, m6.a parama, l6.c paramc, j paramj)
  {
    super(paramContext, paramLooper, 224, parama, paramc, paramj);
  }
  
  public final void disconnect(String paramString)
  {
    Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(paramString)));
    super.disconnect(paramString);
  }
  
  public final d[] getApiFeatures()
  {
    return new d[] { i.c, i.b, i.a };
  }
  
  public final int getMinApkVersion()
  {
    return 17895000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.account.data.IGoogleAuthService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.account.authapi.START";
  }
  
  public final boolean getUseDynamicLookup()
  {
    return true;
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */