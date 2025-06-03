package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import k6.e.a;
import k6.e.b;
import m6.a;

public final class zzy
  extends c
{
  public zzy(Context paramContext, Looper paramLooper, a parama, e.a parama1, e.b paramb)
  {
    super(paramContext, paramLooper, 117, parama, parama1, paramb);
  }
  
  public final Bundle getGetServiceRequestExtraArgs()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.thirdparty.START");
    return localBundle;
  }
  
  public final int getMinApkVersion()
  {
    return 13000000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.fido.u2f.thirdparty.START";
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */