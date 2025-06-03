package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import b6.b;
import java.util.Map;
import java.util.Set;
import l6.j;
import m6.a;
import m6.p;

public final class zzbe
  extends com.google.android.gms.common.internal.c
{
  private final Bundle zze;
  
  public zzbe(Context paramContext, Looper paramLooper, a parama, b6.c paramc, l6.c paramc1, j paramj)
  {
    super(paramContext, paramLooper, 16, parama, paramc1, paramj);
    if (paramc == null) {
      paramContext = new Bundle();
    } else {
      paramContext = new Bundle(a);
    }
    zze = paramContext;
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
    return "com.google.android.gms.auth.api.internal.IAuthService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.service.START";
  }
  
  public final boolean requiresSignIn()
  {
    a locala = getClientSettings();
    Object localObject = a;
    if (localObject != null) {
      localObject = name;
    } else {
      localObject = null;
    }
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      localObject = b.a;
      if ((p)d.get(localObject) == null)
      {
        if (!b.isEmpty()) {
          return true;
        }
      }
      else {
        throw null;
      }
    }
    return false;
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzbe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */