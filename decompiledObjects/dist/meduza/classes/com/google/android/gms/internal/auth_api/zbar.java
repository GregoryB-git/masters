package com.google.android.gms.internal.auth_api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import d6.d0;
import j6.d;
import l6.j;
import m6.a;

public final class zbar
  extends com.google.android.gms.common.internal.c
{
  private final Bundle zba = new Bundle();
  
  public zbar(Context paramContext, Looper paramLooper, d0 paramd0, a parama, l6.c paramc, j paramj)
  {
    super(paramContext, paramLooper, 212, parama, paramc, paramj);
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
    return "com.google.android.gms.auth.api.identity.internal.ISignInService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.api.identity.service.signin.START";
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
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */