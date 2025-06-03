package k6;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.a.e;
import j6.d;
import java.util.Set;

public abstract interface a$f
  extends a.b
{
  public abstract void connect(a.c paramc);
  
  public abstract void disconnect(String paramString);
  
  public abstract d[] getAvailableFeatures();
  
  public abstract String getEndpointPackageName();
  
  public abstract String getLastDisconnectMessage();
  
  public abstract int getMinApkVersion();
  
  public abstract void getRemoteService(IAccountAccessor paramIAccountAccessor, Set<Scope> paramSet);
  
  public abstract Set<Scope> getScopesForConnectionlessNonSignIn();
  
  public abstract boolean isConnected();
  
  public abstract boolean isConnecting();
  
  public abstract void onUserSignOut(a.e parame);
  
  public abstract boolean requiresGooglePlayServices();
  
  public abstract boolean requiresSignIn();
}

/* Location:
 * Qualified Name:     k6.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */