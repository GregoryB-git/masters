package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import j6.d;
import k6.e.a;
import k6.e.b;
import m6.a;
import z5.i;

public final class zzam
  extends c
{
  public zzam(Context paramContext, Looper paramLooper, a parama, e.a parama1, e.b paramb)
  {
    super(paramContext, paramLooper, 120, parama, parama1, paramb);
  }
  
  public final d[] getApiFeatures()
  {
    return new d[] { i.d };
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.account.IWorkAccountService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.account.workaccount.START";
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzam
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */