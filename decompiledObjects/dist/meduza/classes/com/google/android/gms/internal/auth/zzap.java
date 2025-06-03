package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import c6.d;
import com.google.android.gms.common.internal.c;
import k6.e.a;
import k6.e.b;
import m6.a;

public final class zzap
  extends c
{
  private final Bundle zze = new Bundle();
  
  public zzap(Context paramContext, Looper paramLooper, a parama, d paramd, e.a parama1, e.b paramb)
  {
    super(paramContext, paramLooper, 128, parama, parama1, paramb);
  }
  
  public final Bundle getGetServiceRequestExtraArgs()
  {
    return zze;
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.api.accounttransfer.service.START";
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */