package l6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.a.e;
import j6.d;
import java.util.Collections;
import java.util.Set;
import k6.a.f;
import m6.j;

public final class i
  implements a.f, ServiceConnection
{
  public final void connect(a.c paramc)
  {
    Thread.currentThread();
    throw null;
  }
  
  public final void disconnect(String paramString)
  {
    Thread.currentThread();
    throw null;
  }
  
  public final d[] getAvailableFeatures()
  {
    return new d[0];
  }
  
  public final String getEndpointPackageName()
  {
    j.i(null);
    throw null;
  }
  
  public final String getLastDisconnectMessage()
  {
    return null;
  }
  
  public final int getMinApkVersion()
  {
    return 0;
  }
  
  public final void getRemoteService(IAccountAccessor paramIAccountAccessor, Set<Scope> paramSet) {}
  
  public final Set<Scope> getScopesForConnectionlessNonSignIn()
  {
    return Collections.emptySet();
  }
  
  public final boolean isConnected()
  {
    Thread.currentThread();
    throw null;
  }
  
  public final boolean isConnecting()
  {
    Thread.currentThread();
    throw null;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    throw null;
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    throw null;
  }
  
  public final void onUserSignOut(a.e parame) {}
  
  public final boolean requiresGooglePlayServices()
  {
    return false;
  }
  
  public final boolean requiresSignIn()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     l6.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */