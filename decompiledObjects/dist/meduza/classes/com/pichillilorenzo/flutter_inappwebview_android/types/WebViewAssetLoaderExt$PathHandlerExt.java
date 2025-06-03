package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.util.Log;
import android.webkit.WebResourceResponse;
import c2.o.c;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import g;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayInputStream;
import java.util.Map;

public class WebViewAssetLoaderExt$PathHandlerExt
  implements o.c, Disposable
{
  public static final String LOG_TAG = "PathHandlerExt";
  public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_custompathhandler_";
  public WebViewAssetLoaderExt.PathHandlerExtChannelDelegate channelDelegate;
  public String id;
  
  public WebViewAssetLoaderExt$PathHandlerExt(String paramString, InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    id = paramString;
    channelDelegate = new WebViewAssetLoaderExt.PathHandlerExtChannelDelegate(this, new MethodChannel(messenger, g.d("com.pichillilorenzo/flutter_inappwebview_custompathhandler_", paramString)));
  }
  
  public void dispose()
  {
    WebViewAssetLoaderExt.PathHandlerExtChannelDelegate localPathHandlerExtChannelDelegate = channelDelegate;
    if (localPathHandlerExtChannelDelegate != null)
    {
      localPathHandlerExtChannelDelegate.dispose();
      channelDelegate = null;
    }
  }
  
  public WebResourceResponse handle(String paramString)
  {
    Object localObject1 = channelDelegate;
    Object localObject2 = null;
    if (localObject1 != null) {
      try
      {
        paramString = ((WebViewAssetLoaderExt.PathHandlerExtChannelDelegate)localObject1).handle(paramString);
        if (paramString != null)
        {
          String str1 = paramString.getContentType();
          String str2 = paramString.getContentEncoding();
          byte[] arrayOfByte = paramString.getData();
          Map localMap = paramString.getHeaders();
          localObject1 = paramString.getStatusCode();
          String str3 = paramString.getReasonPhrase();
          paramString = (String)localObject2;
          if (arrayOfByte != null) {
            paramString = new ByteArrayInputStream(arrayOfByte);
          }
          if ((localObject1 != null) && (str3 != null)) {
            return new WebResourceResponse(str1, str2, ((Integer)localObject1).intValue(), str3, localMap, paramString);
          }
          return new WebResourceResponse(str1, str2, paramString);
        }
      }
      catch (InterruptedException paramString)
      {
        Log.e("PathHandlerExt", "", paramString);
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt.PathHandlerExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */