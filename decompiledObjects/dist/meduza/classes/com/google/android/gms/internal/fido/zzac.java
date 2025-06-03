package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import k6.e.a;
import k6.e.b;
import m6.a;

public final class zzac
  extends c
{
  public zzac(Context paramContext, Looper paramLooper, a parama, e.a parama1, e.b paramb)
  {
    super(paramContext, paramLooper, 119, parama, parama1, paramb);
  }
  
  public final Bundle getGetServiceRequestExtraArgs()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
    return localBundle;
  }
  
  public final int getMinApkVersion()
  {
    return 13000000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.fido.u2f.zeroparty.START";
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */