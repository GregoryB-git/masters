package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

public final class RouteSelector
{
  public final Address a;
  public final RouteDatabase b;
  public final Call c;
  public final EventListener d;
  public List<Proxy> e = Collections.emptyList();
  public int f;
  public List<InetSocketAddress> g = Collections.emptyList();
  public final ArrayList h = new ArrayList();
  
  public RouteSelector(Address paramAddress, RouteDatabase paramRouteDatabase, Call paramCall, EventListener paramEventListener)
  {
    a = paramAddress;
    b = paramRouteDatabase;
    c = paramCall;
    d = paramEventListener;
    paramCall = a;
    paramRouteDatabase = h;
    if (paramRouteDatabase != null)
    {
      paramAddress = Collections.singletonList(paramRouteDatabase);
    }
    else
    {
      paramAddress = g.select(paramCall.n());
      if ((paramAddress != null) && (!paramAddress.isEmpty())) {
        paramAddress = Util.n(paramAddress);
      } else {
        paramAddress = Util.o(new Proxy[] { Proxy.NO_PROXY });
      }
    }
    e = paramAddress;
    f = 0;
  }
  
  public final void a(Route paramRoute, IOException arg2)
  {
    if (b.type() != Proxy.Type.DIRECT)
    {
      Address localAddress = a;
      ProxySelector localProxySelector = g;
      if (localProxySelector != null) {
        localProxySelector.connectFailed(a.n(), b.address(), ???);
      }
    }
    synchronized (b)
    {
      a.add(paramRoute);
      return;
    }
  }
  
  public static final class Selection
  {
    public final List<Route> a;
    public int b = 0;
    
    public Selection(ArrayList paramArrayList)
    {
      a = paramArrayList;
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.connection.RouteSelector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */