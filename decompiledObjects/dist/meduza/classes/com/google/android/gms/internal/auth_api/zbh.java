package com.google.android.gms.internal.auth_api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import d6.r;
import j6.d;
import l6.j;
import m6.a;

public final class zbh
  extends com.google.android.gms.common.internal.c
{
  private final Bundle zba = new Bundle();
  
  public zbh(Context paramContext, Looper paramLooper, r paramr, a parama, l6.c paramc, j paramj)
  {
    super(paramContext, paramLooper, 223, parama, paramc, paramj);
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
    return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
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
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */