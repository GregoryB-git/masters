package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import c2.b.a;
import c2.c;
import c2.c.a;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import d2.a;
import d2.i0;
import d2.j0.b;
import d2.k0;
import d2.u;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import x6.b;

public class ProxyManager
  extends ChannelDelegateImpl
{
  public static final String LOG_TAG = "ProxyManager";
  public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_proxycontroller";
  public static c proxyController;
  public InAppWebViewFlutterPlugin plugin;
  
  public ProxyManager(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    super(new MethodChannel(messenger, "com.pichillilorenzo/flutter_inappwebview_proxycontroller"));
    plugin = paramInAppWebViewFlutterPlugin;
  }
  
  private void clearProxyOverride(final MethodChannel.Result paramResult)
  {
    Object localObject = proxyController;
    if (localObject != null)
    {
      Executor local3 = new Executor()
      {
        public void execute(Runnable paramAnonymousRunnable)
        {
          paramAnonymousRunnable.run();
        }
      };
      paramResult = new Runnable()
      {
        public void run()
        {
          paramResult.success(Boolean.TRUE);
        }
      };
      localObject = (u)localObject;
      if (i0.E.d())
      {
        if (a == null) {
          a = j0.b.a.getProxyController();
        }
        a.clearProxyOverride(paramResult, local3);
      }
      else
      {
        throw i0.a();
      }
    }
  }
  
  public static void init()
  {
    if ((proxyController == null) && (b.c0("PROXY_OVERRIDE"))) {
      if (b.c0("PROXY_OVERRIDE")) {
        proxyController = c.a.a;
      } else {
        throw new UnsupportedOperationException("Proxy override not supported");
      }
    }
  }
  
  private void setProxyOverride(ProxySettings paramProxySettings, final MethodChannel.Result paramResult)
  {
    if (proxyController != null)
    {
      Object localObject1 = new ArrayList();
      Object localObject2 = new ArrayList();
      Object localObject3 = bypassRules.iterator();
      while (((Iterator)localObject3).hasNext()) {
        ((ArrayList)localObject2).add((String)((Iterator)localObject3).next());
      }
      localObject3 = directs.iterator();
      while (((Iterator)localObject3).hasNext()) {
        ((ArrayList)localObject1).add(new b.a((String)((Iterator)localObject3).next(), "direct://"));
      }
      Object localObject4 = proxyRules.iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (ProxyRuleExt)((Iterator)localObject4).next();
        if (((ProxyRuleExt)localObject5).getSchemeFilter() != null)
        {
          localObject3 = ((ProxyRuleExt)localObject5).getUrl();
          ((ArrayList)localObject1).add(new b.a(((ProxyRuleExt)localObject5).getSchemeFilter(), (String)localObject3));
        }
        else
        {
          ((ArrayList)localObject1).add(new b.a("*", ((ProxyRuleExt)localObject5).getUrl()));
        }
      }
      localObject3 = bypassSimpleHostnames;
      if ((localObject3 != null) && (((Boolean)localObject3).booleanValue())) {
        ((ArrayList)localObject2).add("<local>");
      }
      localObject3 = removeImplicitRules;
      if ((localObject3 != null) && (((Boolean)localObject3).booleanValue())) {
        ((ArrayList)localObject2).add("<-loopback>");
      }
      boolean bool;
      if ((reverseBypassEnabled != null) && (b.c0("PROXY_OVERRIDE_REVERSE_BYPASS"))) {
        bool = reverseBypassEnabled.booleanValue();
      } else {
        bool = false;
      }
      localObject3 = proxyController;
      paramProxySettings = new Executor()
      {
        public void execute(Runnable paramAnonymousRunnable)
        {
          paramAnonymousRunnable.run();
        }
      };
      paramResult = new Runnable()
      {
        public void run()
        {
          paramResult.success(Boolean.TRUE);
        }
      };
      localObject3 = (u)localObject3;
      localObject3.getClass();
      Object localObject5 = i0.E;
      localObject4 = i0.K;
      List localList = Collections.unmodifiableList((List)localObject1);
      localObject1 = new String[localList.size()][2];
      for (int i = 0; i < localList.size(); i++)
      {
        localObject1[i][0] = geta;
        localObject1[i][1] = getb;
      }
      localObject2 = (String[])Collections.unmodifiableList((List)localObject2).toArray(new String[0]);
      if ((((a)localObject5).d()) && (!bool))
      {
        if (a == null) {
          a = j0.b.a.getProxyController();
        }
        a.setProxyOverride((String[][])localObject1, (String[])localObject2, paramResult, paramProxySettings);
      }
      else if ((((a)localObject5).d()) && (((a)localObject4).d()))
      {
        if (a == null) {
          a = j0.b.a.getProxyController();
        }
        a.setProxyOverride((String[][])localObject1, (String[])localObject2, paramResult, paramProxySettings, bool);
      }
      else
      {
        throw i0.a();
      }
    }
  }
  
  public void dispose()
  {
    super.dispose();
    plugin = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    init();
    Object localObject = method;
    localObject.getClass();
    if (!((String)localObject).equals("clearProxyOverride"))
    {
      if (!((String)localObject).equals("setProxyOverride"))
      {
        paramResult.notImplemented();
        return;
      }
      if (proxyController != null)
      {
        paramMethodCall = (HashMap)paramMethodCall.argument("settings");
        localObject = new ProxySettings();
        if (paramMethodCall != null) {
          ((ProxySettings)localObject).parse(paramMethodCall);
        }
        setProxyOverride((ProxySettings)localObject, paramResult);
        return;
      }
    }
    while (proxyController == null)
    {
      paramResult.success(Boolean.FALSE);
      break;
    }
    clearProxyOverride(paramResult);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */