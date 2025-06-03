package o6;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.base.zaf;
import l6.j;
import m6.a;
import m6.n;

public final class d
  extends com.google.android.gms.common.internal.c
{
  public final n a;
  
  public d(Context paramContext, Looper paramLooper, a parama, n paramn, l6.c paramc, j paramj)
  {
    super(paramContext, paramLooper, 270, parama, paramc, paramj);
    a = paramn;
  }
  
  public final j6.d[] getApiFeatures()
  {
    return zaf.zab;
  }
  
  public final Bundle getGetServiceRequestExtraArgs()
  {
    Object localObject = a;
    localObject.getClass();
    Bundle localBundle = new Bundle();
    localObject = a;
    if (localObject != null) {
      localBundle.putString("api", (String)localObject);
    }
    return localBundle;
  }
  
  public final int getMinApkVersion()
  {
    return 203400000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.common.internal.service.IClientTelemetryService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.common.telemetry.service.START";
  }
  
  public final boolean getUseDynamicLookup()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     o6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */