package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import f;
import g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WebMessagePort
{
  public boolean isClosed = false;
  public boolean isStarted = false;
  public boolean isTransferred = false;
  public String name;
  public WebMessageChannel webMessageChannel;
  
  public WebMessagePort(String paramString, WebMessageChannel paramWebMessageChannel)
  {
    name = paramString;
    webMessageChannel = paramWebMessageChannel;
  }
  
  public void close(final ValueCallback<Void> paramValueCallback)
  {
    if (!isTransferred)
    {
      isClosed = true;
      Object localObject = webMessageChannel;
      if (localObject != null)
      {
        localObject = webView;
        if (localObject != null) {}
      }
      else
      {
        localObject = null;
      }
      if (localObject != null)
      {
        StringBuilder localStringBuilder = f.l("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
        localStringBuilder.append(webMessageChannel.id);
        localStringBuilder.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
        ((InAppWebViewInterface)localObject).evaluateJavascript(g.f(localStringBuilder, name, ".close();  }})();"), null, new ValueCallback()
        {
          public void onReceiveValue(String paramAnonymousString)
          {
            paramValueCallback.onReceiveValue(null);
          }
        });
      }
      else
      {
        paramValueCallback.onReceiveValue(null);
      }
      return;
    }
    throw new Exception("Port is already transferred");
  }
  
  public void dispose()
  {
    isClosed = true;
    webMessageChannel = null;
  }
  
  public void postMessage(WebMessage paramWebMessage, final ValueCallback<Void> paramValueCallback)
  {
    if ((!isClosed) && (!isTransferred))
    {
      Object localObject1 = webMessageChannel;
      if (localObject1 != null)
      {
        localObject1 = webView;
        if (localObject1 != null) {}
      }
      else
      {
        localObject1 = null;
      }
      if (localObject1 != null)
      {
        Object localObject2 = ports;
        String str = "null";
        Object localObject3;
        if (localObject2 != null)
        {
          localObject3 = new ArrayList();
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            WebMessagePort localWebMessagePort = (WebMessagePort)((Iterator)localObject2).next();
            if (localWebMessagePort != this)
            {
              if (!isStarted)
              {
                if ((!isClosed) && (!isTransferred))
                {
                  isTransferred = true;
                  StringBuilder localStringBuilder = f.l("window.flutter_inappwebview._webMessageChannels['");
                  localStringBuilder.append(webMessageChannel.id);
                  localStringBuilder.append("'].");
                  localStringBuilder.append(name);
                  ((ArrayList)localObject3).add(localStringBuilder.toString());
                }
                else
                {
                  throw new Exception("Port is already closed or transferred");
                }
              }
              else {
                throw new Exception("Port is already started");
              }
            }
            else {
              throw new Exception("Source port cannot be transferred");
            }
          }
          localObject2 = f.l("[");
          ((StringBuilder)localObject2).append(TextUtils.join(", ", (Iterable)localObject3));
          ((StringBuilder)localObject2).append("]");
          localObject3 = ((StringBuilder)localObject2).toString();
        }
        else
        {
          localObject3 = "null";
        }
        localObject2 = data;
        if (localObject2 != null) {
          str = Util.replaceAll((String)localObject2, "'", "\\'");
        }
        localObject2 = f.l("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
        ((StringBuilder)localObject2).append(webMessageChannel.id);
        ((StringBuilder)localObject2).append("'];  if (webMessageChannel != null) {      webMessageChannel.");
        ((StringBuilder)localObject2).append(name);
        ((StringBuilder)localObject2).append(".postMessage('");
        ((StringBuilder)localObject2).append(str);
        ((StringBuilder)localObject2).append("', ");
        ((InAppWebViewInterface)localObject1).evaluateJavascript(g.f((StringBuilder)localObject2, (String)localObject3, ");  }})();"), null, new ValueCallback()
        {
          public void onReceiveValue(String paramAnonymousString)
          {
            paramValueCallback.onReceiveValue(null);
          }
        });
      }
      else
      {
        paramValueCallback.onReceiveValue(null);
      }
      paramWebMessage.dispose();
      return;
    }
    throw new Exception("Port is already closed or transferred");
  }
  
  public void setWebMessageCallback(final ValueCallback<Void> paramValueCallback)
  {
    if ((!isClosed) && (!isTransferred))
    {
      isStarted = true;
      Object localObject = webMessageChannel;
      if (localObject != null)
      {
        localObject = webView;
        if (localObject != null) {}
      }
      else
      {
        localObject = null;
      }
      if (localObject != null)
      {
        boolean bool = name.equals("port1");
        StringBuilder localStringBuilder = f.l("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
        localStringBuilder.append(webMessageChannel.id);
        localStringBuilder.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
        localStringBuilder.append(name);
        localStringBuilder.append(".onmessage = function (event) {          window.");
        localStringBuilder.append("flutter_inappwebview");
        localStringBuilder.append(".callHandler('onWebMessagePortMessageReceived', {              'webMessageChannelId': '");
        localStringBuilder.append(webMessageChannel.id);
        localStringBuilder.append("',              'index': ");
        localStringBuilder.append(true ^ bool);
        localStringBuilder.append(",              'message': event.data          });      }  }})();");
        ((InAppWebViewInterface)localObject).evaluateJavascript(localStringBuilder.toString(), null, new ValueCallback()
        {
          public void onReceiveValue(String paramAnonymousString)
          {
            paramAnonymousString = paramValueCallback;
            if (paramAnonymousString != null) {
              paramAnonymousString.onReceiveValue(null);
            }
          }
        });
      }
      else if (paramValueCallback != null)
      {
        paramValueCallback.onReceiveValue(null);
      }
      return;
    }
    throw new Exception("Port is already closed or transferred");
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */