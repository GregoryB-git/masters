package k6;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import j6.d;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import l6.c;
import l6.j;

public final class a<O extends d>
{
  public final a a;
  public final g b;
  public final String c;
  
  public <C extends f> a(String paramString, a<C, O> parama, g<C> paramg)
  {
    c = paramString;
    a = parama;
    b = paramg;
  }
  
  public static abstract class a<T extends a.f, O>
    extends a.e<T, O>
  {
    @Deprecated
    public T buildClient(Context paramContext, Looper paramLooper, m6.a parama, O paramO, e.a parama1, e.b paramb)
    {
      return buildClient(paramContext, paramLooper, parama, paramO, parama1, paramb);
    }
    
    public T buildClient(Context paramContext, Looper paramLooper, m6.a parama, O paramO, c paramc, j paramj)
    {
      throw new UnsupportedOperationException("buildClient must be implemented");
    }
  }
  
  public static abstract interface b {}
  
  public static class c<C extends a.b> {}
  
  public static abstract interface d
  {
    public static final c j = new c(0);
    
    public static abstract interface a
      extends a.d
    {
      public abstract Account u();
    }
    
    public static abstract interface b
      extends a.d
    {
      public abstract GoogleSignInAccount r();
    }
    
    public static final class c
      implements a.d
    {}
  }
  
  public static abstract class e<T extends a.b, O>
  {
    public static final int API_PRIORITY_GAMES = 1;
    public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
    public static final int API_PRIORITY_PLUS = 2;
    
    public List<Scope> getImpliedScopes(O paramO)
    {
      return Collections.emptyList();
    }
    
    public int getPriority()
    {
      return Integer.MAX_VALUE;
    }
  }
  
  public static abstract interface f
    extends a.b
  {
    public abstract void connect(com.google.android.gms.common.internal.a.c paramc);
    
    public abstract void disconnect(String paramString);
    
    public abstract d[] getAvailableFeatures();
    
    public abstract String getEndpointPackageName();
    
    public abstract String getLastDisconnectMessage();
    
    public abstract int getMinApkVersion();
    
    public abstract void getRemoteService(IAccountAccessor paramIAccountAccessor, Set<Scope> paramSet);
    
    public abstract Set<Scope> getScopesForConnectionlessNonSignIn();
    
    public abstract boolean isConnected();
    
    public abstract boolean isConnecting();
    
    public abstract void onUserSignOut(com.google.android.gms.common.internal.a.e parame);
    
    public abstract boolean requiresGooglePlayServices();
    
    public abstract boolean requiresSignIn();
  }
  
  public static final class g<C extends a.f>
    extends a.c<C>
  {}
}

/* Location:
 * Qualified Name:     k6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */