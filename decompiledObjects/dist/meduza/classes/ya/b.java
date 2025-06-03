package ya;

import a0.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;
import java.util.ArrayList;
import w.g;

public final class b
  extends BroadcastReceiver
  implements EventChannel.StreamHandler
{
  public final Context a;
  public final a b;
  public EventChannel.EventSink c;
  public final Handler d = new Handler(Looper.getMainLooper());
  public a e;
  
  public b(Context paramContext, a parama)
  {
    a = paramContext;
    b = parama;
  }
  
  public final void a(ArrayList paramArrayList)
  {
    paramArrayList = new g(26, this, paramArrayList);
    d.post(paramArrayList);
  }
  
  public final void onCancel(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 24)
    {
      paramObject = e;
      if (paramObject == null) {
        break label44;
      }
      b.a.unregisterNetworkCallback((ConnectivityManager.NetworkCallback)paramObject);
      e = null;
    }
    try
    {
      a.unregisterReceiver(this);
      label44:
      return;
    }
    catch (Exception paramObject)
    {
      for (;;) {}
    }
  }
  
  public final void onListen(Object paramObject, EventChannel.EventSink paramEventSink)
  {
    c = paramEventSink;
    if (Build.VERSION.SDK_INT >= 24)
    {
      paramObject = new a();
      e = ((a)paramObject);
      d.j(b.a, (a)paramObject);
    }
    else
    {
      a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
    paramObject = b;
    paramEventSink = a.getActiveNetwork();
    a(a.a(a.getNetworkCapabilities(paramEventSink)));
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = c;
    if (paramContext != null)
    {
      paramIntent = b;
      Network localNetwork = a.getActiveNetwork();
      paramContext.success(a.a(a.getNetworkCapabilities(localNetwork)));
    }
  }
  
  public final class a
    extends ConnectivityManager.NetworkCallback
  {
    public a() {}
    
    public final void onAvailable(Network paramNetwork)
    {
      b localb = b.this;
      localb.a(a.a(b.a.getNetworkCapabilities(paramNetwork)));
    }
    
    public final void onCapabilitiesChanged(Network paramNetwork, NetworkCapabilities paramNetworkCapabilities)
    {
      paramNetwork = b.this;
      b.getClass();
      paramNetwork.a(a.a(paramNetworkCapabilities));
    }
    
    public final void onLost(Network paramNetwork)
    {
      paramNetwork = b.this;
      paramNetwork.getClass();
      u.a locala = new u.a(paramNetwork, 18);
      d.postDelayed(locala, 500L);
    }
  }
}

/* Location:
 * Qualified Name:     ya.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */