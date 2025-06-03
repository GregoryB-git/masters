package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import j6.d;
import k6.e.a;
import k6.e.b;
import m6.a;
import z6.b;

public final class zzp
  extends c
{
  public zzp(Context paramContext, Looper paramLooper, a parama, e.a parama1, e.b paramb)
  {
    super(paramContext, paramLooper, 148, parama, parama1, paramb);
  }
  
  public final d[] getApiFeatures()
  {
    return new d[] { b.b, b.a };
  }
  
  public final Bundle getGetServiceRequestExtraArgs()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
    return localBundle;
  }
  
  public final int getMinApkVersion()
  {
    return 13000000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.fido.fido2.regular.START";
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */