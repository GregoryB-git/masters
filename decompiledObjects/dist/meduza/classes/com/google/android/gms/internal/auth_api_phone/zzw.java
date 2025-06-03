package com.google.android.gms.internal.auth_api_phone;

import android.content.Context;
import android.os.Looper;
import j6.d;
import l6.j;
import m6.a;

public final class zzw
  extends com.google.android.gms.common.internal.c
{
  public zzw(Context paramContext, Looper paramLooper, a parama, l6.c paramc, j paramj)
  {
    super(paramContext, paramLooper, 126, parama, paramc, paramj);
  }
  
  public final d[] getApiFeatures()
  {
    return zzac.zze;
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */