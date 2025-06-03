package v2;

import a3.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import t2.c;
import y2.l;
import y2.n;

public final class i
  extends g<c>
{
  public final ConnectivityManager f;
  public final a g;
  
  public i(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
    paramContext = b.getSystemService("connectivity");
    ec.i.c(paramContext, "null cannot be cast to non-null type android.net.ConnectivityManager");
    f = ((ConnectivityManager)paramContext);
    g = new a(this);
  }
  
  public final Object a()
  {
    return j.a(f);
  }
  
  public final void c()
  {
    o2.j localj;
    try
    {
      o2.j.d().a(j.a, "Registering network callback");
      n.a(f, g);
    }
    catch (SecurityException localSecurityException)
    {
      localj = o2.j.d();
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      localj = o2.j.d();
    }
    localj.c(j.a, "Received exception while registering network callback", localIllegalArgumentException);
  }
  
  public final void d()
  {
    o2.j localj;
    try
    {
      o2.j.d().a(j.a, "Unregistering network callback");
      l.c(f, g);
    }
    catch (SecurityException localSecurityException)
    {
      localj = o2.j.d();
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      localj = o2.j.d();
    }
    localj.c(j.a, "Received exception while unregistering network callback", localIllegalArgumentException);
  }
  
  public static final class a
    extends ConnectivityManager.NetworkCallback
  {
    public a(i parami) {}
    
    public final void onCapabilitiesChanged(Network paramNetwork, NetworkCapabilities paramNetworkCapabilities)
    {
      ec.i.e(paramNetwork, "network");
      ec.i.e(paramNetworkCapabilities, "capabilities");
      o2.j localj = o2.j.d();
      String str = j.a;
      paramNetwork = new StringBuilder();
      paramNetwork.append("Network capabilities changed: ");
      paramNetwork.append(paramNetworkCapabilities);
      localj.a(str, paramNetwork.toString());
      paramNetwork = a;
      paramNetwork.b(j.a(f));
    }
    
    public final void onLost(Network paramNetwork)
    {
      ec.i.e(paramNetwork, "network");
      o2.j.d().a(j.a, "Network connection lost");
      paramNetwork = a;
      paramNetwork.b(j.a(f));
    }
  }
}

/* Location:
 * Qualified Name:     v2.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */