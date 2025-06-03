package io.meduza.meduza;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import b1.v;
import dc.p;
import f8.c;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodChannel;
import j8.q;
import java.lang.reflect.Method;
import java.util.Map;
import mobileproxy.Mobileproxy;
import mobileproxy.Proxy;
import mobileproxy.StreamDialer;
import nc.d0;
import nc.d1;
import nc.r0;
import rb.f;
import rb.h;

public final class MainActivity
  extends FlutterActivity
{
  public final String a = "meduza.meduza.io/mobile_proxy";
  public MethodChannel b;
  public v c;
  public Map<String, ? extends Object> d;
  public ob.b e;
  public ConnectivityManager f;
  public b o;
  public NetworkCapabilities p;
  public final b q = new b(this);
  
  public static final String a(MainActivity paramMainActivity, NetworkCapabilities paramNetworkCapabilities)
  {
    paramMainActivity.getClass();
    localObject = null;
    if (paramNetworkCapabilities != null) {}
    try
    {
      paramMainActivity = paramNetworkCapabilities.getClass().getMethod("getTransportInfo", new Class[0]);
      if (paramMainActivity != null) {
        paramMainActivity = paramMainActivity.invoke(paramNetworkCapabilities, new Object[0]);
      } else {
        paramMainActivity = null;
      }
      if ((paramMainActivity instanceof WifiInfo)) {
        paramNetworkCapabilities = (WifiInfo)paramMainActivity;
      } else {
        paramNetworkCapabilities = null;
      }
      paramMainActivity = (MainActivity)localObject;
      if (paramNetworkCapabilities != null) {
        paramMainActivity = paramNetworkCapabilities.getSSID();
      }
    }
    catch (Exception paramMainActivity)
    {
      for (;;)
      {
        paramMainActivity = (MainActivity)localObject;
      }
    }
    return paramMainActivity;
  }
  
  public final void b(Map<String, ? extends Object> paramMap)
  {
    StringBuilder localStringBuilder = null;
    Object localObject1;
    if (paramMap != null) {
      localObject1 = paramMap.get("config");
    } else {
      localObject1 = null;
    }
    if ((localObject1 instanceof String)) {
      localObject1 = (String)localObject1;
    } else {
      localObject1 = null;
    }
    if (paramMap != null) {
      paramMap = paramMap.get("domains");
    } else {
      paramMap = null;
    }
    Object localObject2;
    if ((paramMap instanceof String)) {
      localObject2 = (String)paramMap;
    } else {
      localObject2 = null;
    }
    ec.s locals = new ec.s();
    try
    {
      paramMap = e;
      int i;
      if (paramMap == null) {
        i = -1;
      } else {
        i = a.a[paramMap.ordinal()];
      }
      if (i != 1)
      {
        if (i == 2)
        {
          localObject2 = c;
          paramMap = localStringBuilder;
          if (localObject2 != null)
          {
            ec.i.b(localObject1);
            paramMap = new mobileproxy/StreamDialer;
            paramMap.<init>((String)localObject1);
            paramMap = Mobileproxy.runProxy("localhost:0", paramMap);
            a = paramMap;
            ec.i.b(paramMap);
            paramMap = paramMap.address();
            ec.i.d(paramMap, "address(...)");
          }
        }
        else
        {
          paramMap = new java/lang/IllegalArgumentException;
          localObject2 = e;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("Invalid mode: ");
          ((StringBuilder)localObject1).append(localObject2);
          paramMap.<init>(((StringBuilder)localObject1).toString());
          throw paramMap;
        }
      }
      else
      {
        v localv = c;
        paramMap = localStringBuilder;
        if (localv != null)
        {
          ec.i.b(localObject1);
          ec.i.b(localObject2);
          paramMap = localv.k((String)localObject1, (String)localObject2);
        }
      }
      a = paramMap;
    }
    catch (Exception paramMap)
    {
      localObject1 = c.a();
      localObject2 = e;
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("mobile-proxy-[");
      localStringBuilder.append(localObject2);
      localStringBuilder.append("]: failed to start");
      localObject2 = localStringBuilder.toString();
      localObject1 = a;
      localObject1.getClass();
      long l1 = System.currentTimeMillis();
      long l2 = d;
      p.a.a(new q((j8.s)localObject1, l1 - l2, (String)localObject2));
      c.a().b(paramMap);
    }
    runOnUiThread(new io.flutter.plugins.firebase.firestore.streamhandler.b(2, this, locals));
  }
  
  public final void configureFlutterEngine(FlutterEngine paramFlutterEngine)
  {
    ec.i.e(paramFlutterEngine, "flutterEngine");
    super.configureFlutterEngine(paramFlutterEngine);
    b = new MethodChannel(paramFlutterEngine.getDartExecutor().getBinaryMessenger(), a);
    c = new v(9);
    paramFlutterEngine = b;
    if (paramFlutterEngine != null) {
      paramFlutterEngine.setMethodCallHandler(new ob.a(this));
    }
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getSystemService("connectivity");
    ec.i.c(paramBundle, "null cannot be cast to non-null type android.net.ConnectivityManager");
    f = ((ConnectivityManager)paramBundle);
  }
  
  public final FlutterEngine provideFlutterEngine(Context paramContext)
  {
    ec.i.e(paramContext, "context");
    return com.ryanheise.audioservice.b.i(paramContext);
  }
  
  public static final class b
    extends ConnectivityManager.NetworkCallback
  {
    public b(MainActivity paramMainActivity) {}
    
    public final void onCapabilitiesChanged(Network paramNetwork, NetworkCapabilities paramNetworkCapabilities)
    {
      ec.i.e(paramNetwork, "network");
      ec.i.e(paramNetworkCapabilities, "networkCapabilities");
      super.onCapabilitiesChanged(paramNetwork, paramNetworkCapabilities);
      paramNetwork = a.p;
      int i = 0;
      if ((paramNetwork != null) && (paramNetwork.hasTransport(1) == paramNetworkCapabilities.hasTransport(1))) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        paramNetwork = a.p;
        if ((paramNetwork != null) && (paramNetwork.hasTransport(0) == paramNetworkCapabilities.hasTransport(0))) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0)
        {
          j = 0;
          break label110;
        }
      }
      int j = 1;
      label110:
      paramNetwork = a.p;
      int k;
      if ((paramNetwork != null) && (paramNetwork.hasTransport(1) == true)) {
        k = 1;
      } else {
        k = 0;
      }
      int m = i;
      if (k != 0)
      {
        m = i;
        if (paramNetworkCapabilities.hasTransport(1) == true)
        {
          paramNetwork = a;
          m = i;
          if (!ec.i.a(MainActivity.a(paramNetwork, p), MainActivity.a(a, paramNetworkCapabilities))) {
            m = 1;
          }
        }
      }
      if ((j != 0) || (m != 0))
      {
        paramNetwork = a;
        p = paramNetworkCapabilities;
        x6.b.g0(d1.a, r0.b, new a(paramNetwork, null), 2);
      }
    }
    
    @wb.e(c="io.meduza.meduza.MainActivity$networkHandler$1$onCapabilitiesChanged$1", f="MainActivity.kt", l={}, m="invokeSuspend")
    public static final class a
      extends wb.i
      implements p<d0, ub.e<? super h>, Object>
    {
      public a(MainActivity paramMainActivity, ub.e<? super a> parame)
      {
        super(parame);
      }
      
      public final ub.e<h> create(Object paramObject, ub.e<?> parame)
      {
        return new a(a, parame);
      }
      
      public final Object invoke(Object paramObject1, Object paramObject2)
      {
        return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
      }
      
      public final Object invokeSuspend(Object paramObject)
      {
        vb.a locala = vb.a.a;
        f.b(paramObject);
        paramObject = a;
        ((MainActivity)paramObject).b(d);
        return h.a;
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.meduza.meduza.MainActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */