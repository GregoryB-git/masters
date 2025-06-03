package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import k6.e.a;
import k6.e.b;

public final class a
  extends c<IDynamicLinksService>
{
  public a(Context paramContext, Looper paramLooper, m6.a parama, e.a parama1, e.b paramb)
  {
    super(paramContext, paramLooper, 131, parama, parama1, paramb);
  }
  
  public final IInterface createServiceInterface(IBinder paramIBinder)
  {
    return IDynamicLinksService.Stub.asInterface(paramIBinder);
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.firebase.dynamiclinks.service.START";
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.dynamiclinks.internal.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */