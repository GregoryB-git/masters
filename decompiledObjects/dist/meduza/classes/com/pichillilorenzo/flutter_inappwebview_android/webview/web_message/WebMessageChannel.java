package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import android.webkit.ValueCallback;
import c2.j;
import c2.k;
import c2.k.a;
import c2.p;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import d2.c;
import d2.f0;
import d2.i0;
import f;
import g;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.b;

public class WebMessageChannel
  implements Disposable
{
  public static final String LOG_TAG = "WebMessageChannel";
  public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_channel_";
  public WebMessageChannelChannelDelegate channelDelegate;
  public final List<k> compatPorts;
  public String id;
  public final List<WebMessagePort> ports;
  public InAppWebViewInterface webView;
  
  public WebMessageChannel(String paramString, InAppWebViewInterface paramInAppWebViewInterface)
  {
    id = paramString;
    channelDelegate = new WebMessageChannelChannelDelegate(this, new MethodChannel(getPluginmessenger, g.d("com.pichillilorenzo/flutter_inappwebview_web_message_channel_", paramString)));
    boolean bool = paramInAppWebViewInterface instanceof InAppWebView;
    int i = 0;
    if (bool)
    {
      paramString = (InAppWebView)paramInAppWebViewInterface;
      Object localObject = p.a;
      i0.w.getClass();
      localObject = c.c(paramString);
      if (localObject == null)
      {
        paramString = null;
      }
      else
      {
        paramString = new k[localObject.length];
        while (i < localObject.length)
        {
          paramString[i] = new f0(localObject[i]);
          i++;
        }
      }
      compatPorts = new ArrayList(Arrays.asList(paramString));
      ports = new ArrayList();
    }
    else
    {
      ports = Arrays.asList(new WebMessagePort[] { new WebMessagePort("port1", this), new WebMessagePort("port2", this) });
      compatPorts = new ArrayList();
    }
    webView = paramInAppWebViewInterface;
  }
  
  public void closeForInAppWebView(Integer paramInteger, MethodChannel.Result paramResult)
  {
    if ((webView != null) && (compatPorts.size() > 0) && (b.c0("WEB_MESSAGE_PORT_CLOSE")))
    {
      paramInteger = (k)compatPorts.get(paramInteger.intValue());
      try
      {
        paramInteger.a();
        paramResult.success(Boolean.TRUE);
      }
      catch (Exception paramInteger)
      {
        paramResult.error("WebMessageChannel", paramInteger.getMessage(), null);
      }
    }
    else
    {
      paramResult.success(Boolean.TRUE);
    }
  }
  
  public void dispose()
  {
    Object localObject;
    if (b.c0("WEB_MESSAGE_PORT_CLOSE")) {
      localObject = compatPorts.iterator();
    }
    for (;;)
    {
      k localk;
      if (((Iterator)localObject).hasNext()) {
        localk = (k)((Iterator)localObject).next();
      }
      try
      {
        localk.a();
      }
      catch (Exception localException) {}
      localObject = channelDelegate;
      if (localObject != null)
      {
        ((WebMessageChannelChannelDelegate)localObject).dispose();
        channelDelegate = null;
      }
      compatPorts.clear();
      webView = null;
      return;
    }
  }
  
  public void initJsInstance(InAppWebViewInterface paramInAppWebViewInterface, final ValueCallback<WebMessageChannel> paramValueCallback)
  {
    if (paramInAppWebViewInterface != null) {
      paramInAppWebViewInterface.evaluateJavascript(g.f(f.l("(function() {window.flutter_inappwebview._webMessageChannels['"), id, "'] = new MessageChannel();})();"), null, new ValueCallback()
      {
        public void onReceiveValue(String paramAnonymousString)
        {
          paramValueCallback.onReceiveValue(jdField_this);
        }
      });
    } else {
      paramValueCallback.onReceiveValue(this);
    }
  }
  
  public void onMessage(int paramInt, WebMessageCompatExt paramWebMessageCompatExt)
  {
    WebMessageChannelChannelDelegate localWebMessageChannelChannelDelegate = channelDelegate;
    if (localWebMessageChannelChannelDelegate != null) {
      localWebMessageChannelChannelDelegate.onMessage(paramInt, paramWebMessageCompatExt);
    }
  }
  
  public void postMessageForInAppWebView(Integer paramInteger, WebMessageCompatExt paramWebMessageCompatExt, MethodChannel.Result paramResult)
  {
    if ((webView != null) && (compatPorts.size() > 0) && (b.c0("WEB_MESSAGE_PORT_POST_MESSAGE")))
    {
      k localk = (k)compatPorts.get(paramInteger.intValue());
      ArrayList localArrayList = new ArrayList();
      paramInteger = paramWebMessageCompatExt.getPorts();
      if (paramInteger != null)
      {
        Iterator localIterator = paramInteger.iterator();
        while (localIterator.hasNext())
        {
          localObject = (WebMessagePortCompatExt)localIterator.next();
          paramInteger = (WebMessageChannel)webView.getWebMessageChannels().get(((WebMessagePortCompatExt)localObject).getWebMessageChannelId());
          if (paramInteger != null) {
            localArrayList.add((k)compatPorts.get(((WebMessagePortCompatExt)localObject).getIndex()));
          }
        }
      }
      Object localObject = paramWebMessageCompatExt.getData();
      try
      {
        if ((b.c0("WEB_MESSAGE_ARRAY_BUFFER")) && (localObject != null) && (paramWebMessageCompatExt.getType() == 1))
        {
          paramInteger = new c2/j;
          paramInteger.<init>((byte[])localObject, (k[])localArrayList.toArray(new k[0]));
        }
        for (;;)
        {
          localk.d(paramInteger);
          break;
          if (localObject != null) {
            paramInteger = localObject.toString();
          } else {
            paramInteger = null;
          }
          paramInteger = new j(paramInteger, (k[])localArrayList.toArray(new k[0]));
        }
        paramResult.success(Boolean.TRUE);
      }
      catch (Exception paramInteger)
      {
        paramResult.error("WebMessageChannel", paramInteger.getMessage(), null);
      }
    }
    paramResult.success(Boolean.TRUE);
  }
  
  public void setWebMessageCallbackForInAppWebView(int paramInt, MethodChannel.Result paramResult)
  {
    if ((webView != null) && (compatPorts.size() > 0) && (b.c0("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK")))
    {
      k localk = (k)compatPorts.get(paramInt);
      try
      {
        k.a local2 = new com/pichillilorenzo/flutter_inappwebview_android/webview/web_message/WebMessageChannel$2;
        local2.<init>(this, this, paramInt);
        localk.e(local2);
        paramResult.success(Boolean.TRUE);
      }
      catch (Exception localException)
      {
        paramResult.error("WebMessageChannel", localException.getMessage(), null);
      }
    }
    else
    {
      paramResult.success(Boolean.TRUE);
    }
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", id);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */