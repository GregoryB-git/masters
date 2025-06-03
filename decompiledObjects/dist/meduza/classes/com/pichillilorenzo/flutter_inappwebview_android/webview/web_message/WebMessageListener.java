package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import c2.p.b;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import d2.e0;
import d2.i0;
import d2.t;
import f;
import g;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import x6.b;
import zc.a.a;

public class WebMessageListener
  implements Disposable
{
  public static final String LOG_TAG = "WebMessageListener";
  public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_listener_";
  public Set<String> allowedOriginRules;
  public WebMessageListenerChannelDelegate channelDelegate;
  public String id;
  public String jsObjectName;
  public p.b listener;
  public c2.a replyProxy;
  public InAppWebViewInterface webView;
  
  public WebMessageListener(String paramString1, InAppWebViewInterface paramInAppWebViewInterface, BinaryMessenger paramBinaryMessenger, String paramString2, Set<String> paramSet)
  {
    id = paramString1;
    webView = paramInAppWebViewInterface;
    jsObjectName = paramString2;
    allowedOriginRules = paramSet;
    paramString1 = f.l("com.pichillilorenzo/flutter_inappwebview_web_message_listener_");
    paramString1.append(id);
    paramString1.append("_");
    paramString1.append(jsObjectName);
    channelDelegate = new WebMessageListenerChannelDelegate(this, new MethodChannel(paramBinaryMessenger, paramString1.toString()));
    if ((webView instanceof InAppWebView)) {
      listener = new p.b()
      {
        public void onPostMessage(WebView paramAnonymousWebView, c2.j paramAnonymousj, Uri paramAnonymousUri, boolean paramAnonymousBoolean, c2.a paramAnonymousa)
        {
          paramAnonymousWebView = WebMessageListener.this;
          replyProxy = paramAnonymousa;
          paramAnonymousa = channelDelegate;
          if (paramAnonymousa != null)
          {
            paramAnonymousj = WebMessageCompatExt.fromMapWebMessageCompat(paramAnonymousj);
            if (paramAnonymousUri.toString().equals("null")) {
              paramAnonymousWebView = null;
            } else {
              paramAnonymousWebView = paramAnonymousUri.toString();
            }
            paramAnonymousa.onPostMessage(paramAnonymousj, paramAnonymousWebView, paramAnonymousBoolean);
          }
        }
      };
    }
  }
  
  public static WebMessageListener fromMap(InAppWebViewInterface paramInAppWebViewInterface, BinaryMessenger paramBinaryMessenger, Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new WebMessageListener((String)paramMap.get("id"), paramInAppWebViewInterface, paramBinaryMessenger, (String)paramMap.get("jsObjectName"), new HashSet((List)paramMap.get("allowedOriginRules")));
  }
  
  public void assertOriginRulesValid()
  {
    Iterator localIterator = allowedOriginRules.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (str1 != null)
      {
        if (!str1.isEmpty())
        {
          if (!"*".equals(str1))
          {
            Uri localUri = Uri.parse(str1);
            String str2 = localUri.getScheme();
            String str3 = localUri.getHost();
            String str4 = localUri.getPath();
            int j = localUri.getPort();
            if (str2 != null)
            {
              if (((!"http".equals(str2)) && (!"https".equals(str2))) || ((str3 != null) && (!str3.isEmpty())))
              {
                if ((!"http".equals(str2)) && (!"https".equals(str2)) && ((str3 != null) || (j != -1))) {
                  throw new Exception(g.e("allowedOriginRules ", str1, " is invalid"));
                }
                if (((str3 != null) && (!str3.isEmpty())) || (j == -1))
                {
                  if (str4.isEmpty())
                  {
                    if (str3 != null)
                    {
                      j = str3.indexOf("*");
                      if ((j == 0) && ((j != 0) || (str3.startsWith("*."))))
                      {
                        if (str3.startsWith("[")) {
                          if (str3.endsWith("]"))
                          {
                            if (!Util.isIPv6(str3.substring(1, str3.length() - 1))) {
                              throw new Exception(g.e("allowedOriginRules ", str1, " is invalid"));
                            }
                          }
                          else {
                            throw new Exception(g.e("allowedOriginRules ", str1, " is invalid"));
                          }
                        }
                      }
                      else {
                        throw new Exception(g.e("allowedOriginRules ", str1, " is invalid"));
                      }
                    }
                    i++;
                  }
                  else
                  {
                    throw new Exception(g.e("allowedOriginRules ", str1, " is invalid"));
                  }
                }
                else {
                  throw new Exception(g.e("allowedOriginRules ", str1, " is invalid"));
                }
              }
              else
              {
                throw new Exception(g.e("allowedOriginRules ", str1, " is invalid"));
              }
            }
            else {
              throw new Exception(g.e("allowedOriginRules ", str1, " is invalid"));
            }
          }
        }
        else {
          throw new Exception(a0.j.h("allowedOriginRules[", i, "] is empty"));
        }
      }
      else {
        throw new Exception(a0.j.h("allowedOriginRules[", i, "] is null"));
      }
    }
  }
  
  public void dispose()
  {
    WebMessageListenerChannelDelegate localWebMessageListenerChannelDelegate = channelDelegate;
    if (localWebMessageListenerChannelDelegate != null)
    {
      localWebMessageListenerChannelDelegate.dispose();
      channelDelegate = null;
    }
    listener = null;
    replyProxy = null;
    webView = null;
  }
  
  public void initJsInstance()
  {
    if (webView != null)
    {
      Object localObject1 = Util.replaceAll(jsObjectName, "'", "\\'");
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = allowedOriginRules.iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        if ("*".equals(localObject2))
        {
          localObject2 = "'*'";
        }
        else
        {
          Uri localUri = Uri.parse((String)localObject2);
          localObject2 = localUri.getHost();
          str = "null";
          if (localObject2 != null)
          {
            localObject2 = f.l("'");
            ((StringBuilder)localObject2).append(Util.replaceAll(localUri.getHost(), "'", "\\'"));
            ((StringBuilder)localObject2).append("'");
            localObject2 = ((StringBuilder)localObject2).toString();
          }
          else
          {
            localObject2 = "null";
          }
          StringBuilder localStringBuilder = f.l("{scheme: '");
          localStringBuilder.append(localUri.getScheme());
          localStringBuilder.append("', host: ");
          localStringBuilder.append((String)localObject2);
          localStringBuilder.append(", port: ");
          localObject2 = str;
          if (localUri.getPort() != -1) {
            localObject2 = Integer.valueOf(localUri.getPort());
          }
          localStringBuilder.append(localObject2);
          localStringBuilder.append("}");
          localObject2 = localStringBuilder.toString();
        }
        localArrayList.add(localObject2);
      }
      String str = TextUtils.join(", ", localArrayList);
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("(function() {  var allowedOriginRules = [");
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append("];  var isPageBlank = window.location.href === 'about:blank';  var scheme = !isPageBlank ? window.location.protocol.replace(':', '') : null;  var host = !isPageBlank ? window.location.hostname : null;  var port = !isPageBlank ? window.location.port : null;  if (window.");
      ((StringBuilder)localObject2).append("flutter_inappwebview");
      ((StringBuilder)localObject2).append("._isOriginAllowed(allowedOriginRules, scheme, host, port)) {      window['");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("'] = new FlutterInAppWebViewWebMessageListener('");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("');  }})();");
      str = ((StringBuilder)localObject2).toString();
      localObject2 = webView.getUserContentController();
      localObject1 = f.l("WebMessageListener-");
      ((StringBuilder)localObject1).append(jsObjectName);
      ((UserContentController)localObject2).addPluginScript(new PluginScript(((StringBuilder)localObject1).toString(), str, UserScriptInjectionTime.AT_DOCUMENT_START, null, false, null));
    }
  }
  
  public boolean isOriginAllowed(String paramString1, String paramString2, int paramInt)
  {
    Iterator localIterator = allowedOriginRules.iterator();
    boolean bool;
    int i;
    do
    {
      do
      {
        bool = localIterator.hasNext();
        i = 0;
        if (!bool) {
          break;
        }
        str1 = (String)localIterator.next();
        if ("*".equals(str1)) {
          return true;
        }
      } while ((paramString1 == null) || (paramString1.isEmpty()) || ((paramString1.isEmpty()) && ((paramString2 == null) || (paramString2.isEmpty())) && ((paramInt == 0) || (paramInt == -1))));
      Uri localUri = Uri.parse(str1);
      int j = localUri.getPort();
      int k = 443;
      if ((j != -1) && (localUri.getPort() != 0)) {
        j = localUri.getPort();
      } else if ("https".equals(localUri.getScheme())) {
        j = 443;
      } else {
        j = 80;
      }
      if ((paramInt != 0) && (paramInt != -1)) {
        k = paramInt;
      } else if (!"https".equals(paramString1)) {
        k = 80;
      }
      String str1 = localUri.getHost();
      Object localObject = null;
      if ((str1 != null) && (localUri.getHost().startsWith("["))) {}
      try
      {
        str1 = Util.normalizeIPv6(localUri.getHost().substring(1, localUri.getHost().length() - 1));
      }
      catch (Exception localException1)
      {
        for (;;) {}
      }
      str1 = null;
      try
      {
        String str2 = Util.normalizeIPv6(paramString2);
        localObject = str2;
      }
      catch (Exception localException2)
      {
        int m;
        for (;;) {}
      }
      bool = localUri.getScheme().equals(paramString1);
      if ((localUri.getHost() != null) && (!localUri.getHost().isEmpty()) && (!localUri.getHost().equals(paramString2)) && ((!localUri.getHost().startsWith("*")) || (paramString2 == null) || (!paramString2.contains(localUri.getHost().split("\\*")[1]))) && ((localObject == null) || (str1 == null) || (!((String)localObject).equals(str1)))) {
        m = 0;
      } else {
        m = 1;
      }
      if (j == k) {
        i = 1;
      }
    } while ((!bool) || (m == 0) || (i == 0));
    return true;
    return false;
  }
  
  public void postMessageForInAppWebView(WebMessageCompatExt paramWebMessageCompatExt, MethodChannel.Result paramResult)
  {
    if ((replyProxy != null) && (b.c0("WEB_MESSAGE_LISTENER")))
    {
      Object localObject = paramWebMessageCompatExt.getData();
      if (localObject != null) {
        if ((b.c0("WEB_MESSAGE_ARRAY_BUFFER")) && (paramWebMessageCompatExt.getType() == 1))
        {
          c2.a locala = replyProxy;
          paramWebMessageCompatExt = (byte[])localObject;
          localObject = (t)locala;
          localObject.getClass();
          if (i0.u.d()) {
            a.postMessageWithPayload(new a.a(new e0(paramWebMessageCompatExt)));
          } else {
            throw i0.a();
          }
        }
        else
        {
          paramWebMessageCompatExt = replyProxy;
          localObject = localObject.toString();
          paramWebMessageCompatExt = (t)paramWebMessageCompatExt;
          paramWebMessageCompatExt.getClass();
          if (i0.I.d()) {
            a.postMessage((String)localObject);
          } else {
            throw i0.a();
          }
        }
      }
    }
    paramResult.success(Boolean.TRUE);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */