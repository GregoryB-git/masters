package com.google.android.gms.internal.auth_api;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import d6.m;
import j6.d;
import l6.j;
import m6.a;

public final class zbg
  extends com.google.android.gms.common.internal.c
{
  private final Bundle zba;
  
  public zbg(Context paramContext, Looper paramLooper, m paramm, a parama, l6.c paramc, j paramj)
  {
    super(paramContext, paramLooper, 219, parama, paramc, paramj);
    paramm.getClass();
    paramContext = new Bundle();
    paramContext.putString("session_id", a);
    zba = paramContext;
  }
  
  public final d[] getApiFeatures()
  {
    return zbas.zbi;
  }
  
  public final Bundle getGetServiceRequestExtraArgs()
  {
    return zba;
  }
  
  public final int getMinApkVersion()
  {
    return 17895000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.api.identity.service.authorization.START";
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
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */