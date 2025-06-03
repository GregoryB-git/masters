package N1;

import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import kotlin.jvm.internal.Intrinsics;

public final class a$a
  implements NsdManager.RegistrationListener
{
  public a$a(String paramString1, String paramString2) {}
  
  public void onRegistrationFailed(NsdServiceInfo paramNsdServiceInfo, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramNsdServiceInfo, "serviceInfo");
    paramNsdServiceInfo = a.a;
    a.a(b);
  }
  
  public void onServiceRegistered(NsdServiceInfo paramNsdServiceInfo)
  {
    Intrinsics.checkNotNullParameter(paramNsdServiceInfo, "NsdServiceInfo");
    if (!Intrinsics.a(a, paramNsdServiceInfo.getServiceName()))
    {
      paramNsdServiceInfo = a.a;
      a.a(b);
    }
  }
  
  public void onServiceUnregistered(NsdServiceInfo paramNsdServiceInfo)
  {
    Intrinsics.checkNotNullParameter(paramNsdServiceInfo, "serviceInfo");
  }
  
  public void onUnregistrationFailed(NsdServiceInfo paramNsdServiceInfo, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramNsdServiceInfo, "serviceInfo");
  }
}

/* Location:
 * Qualified Name:     N1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */