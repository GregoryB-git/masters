package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.content.Context;
import android.util.Log;
import android.webkit.WebResourceResponse;
import c2.o;
import c2.o.a;
import c2.o.b;
import c2.o.c;
import c2.o.d;
import c2.o.e;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import d0.b;
import g;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WebViewAssetLoaderExt
  implements Disposable
{
  public List<PathHandlerExt> customPathHandlers;
  public o loader;
  
  public WebViewAssetLoaderExt(o paramo, List<PathHandlerExt> paramList)
  {
    loader = paramo;
    customPathHandlers = paramList;
  }
  
  public static WebViewAssetLoaderExt fromMap(Map<String, Object> paramMap, InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin, Context paramContext)
  {
    if (paramMap == null) {
      return null;
    }
    ArrayList localArrayList1 = new ArrayList();
    String str = (String)paramMap.get("domain");
    Object localObject1 = (Boolean)paramMap.get("httpAllowed");
    paramMap = (List)paramMap.get("pathHandlers");
    ArrayList localArrayList2 = new ArrayList();
    if ((str == null) || (str.isEmpty())) {
      str = "appassets.androidplatform.net";
    }
    boolean bool;
    if (localObject1 != null) {
      bool = ((Boolean)localObject1).booleanValue();
    } else {
      bool = false;
    }
    if (paramMap != null)
    {
      localObject1 = paramMap.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Map localMap = (Map)((Iterator)localObject1).next();
        Object localObject2 = (String)localMap.get("type");
        paramMap = (String)localMap.get("path");
        if ((localObject2 != null) && (paramMap != null))
        {
          int i = -1;
          switch (((String)localObject2).hashCode())
          {
          default: 
            break;
          case 1490480039: 
            if (((String)localObject2).equals("InternalStoragePathHandler")) {
              i = 2;
            }
            break;
          case -667829310: 
            if (((String)localObject2).equals("AssetsPathHandler")) {
              i = 1;
            }
            break;
          case -1506882528: 
            if (((String)localObject2).equals("ResourcesPathHandler")) {
              i = 0;
            }
            break;
          }
          switch (i)
          {
          default: 
            localObject2 = (String)localMap.get("id");
            if (localObject2 != null)
            {
              localObject2 = new PathHandlerExt((String)localObject2, paramInAppWebViewFlutterPlugin);
              localArrayList1.add(new b(paramMap, localObject2));
              localArrayList2.add(localObject2);
            }
            break;
          case 2: 
            localObject2 = (String)localMap.get("directory");
            if (localObject2 != null) {
              paramMap = new b(paramMap, new o.b(paramContext, new File((String)localObject2)));
            }
            break;
          case 1: 
            paramMap = new b(paramMap, new o.a(paramContext));
            break;
          case 0: 
            paramMap = new b(paramMap, new o.e(paramContext));
            localArrayList1.add(paramMap);
          }
        }
      }
    }
    paramMap = new ArrayList();
    paramContext = localArrayList1.iterator();
    while (paramContext.hasNext())
    {
      paramInAppWebViewFlutterPlugin = (b)paramContext.next();
      paramMap.add(new o.d(str, (String)a, bool, (o.c)b));
    }
    return new WebViewAssetLoaderExt(new o(paramMap), localArrayList2);
  }
  
  public void dispose()
  {
    Iterator localIterator = customPathHandlers.iterator();
    while (localIterator.hasNext()) {
      ((PathHandlerExt)localIterator.next()).dispose();
    }
    customPathHandlers.clear();
  }
  
  public static class PathHandlerExt
    implements o.c, Disposable
  {
    public static final String LOG_TAG = "PathHandlerExt";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_custompathhandler_";
    public WebViewAssetLoaderExt.PathHandlerExtChannelDelegate channelDelegate;
    public String id;
    
    public PathHandlerExt(String paramString, InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
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
  
  public static class PathHandlerExtChannelDelegate
    extends ChannelDelegateImpl
  {
    private WebViewAssetLoaderExt.PathHandlerExt pathHandler;
    
    public PathHandlerExtChannelDelegate(WebViewAssetLoaderExt.PathHandlerExt paramPathHandlerExt, MethodChannel paramMethodChannel)
    {
      super();
      pathHandler = paramPathHandlerExt;
    }
    
    public void dispose()
    {
      super.dispose();
      pathHandler = null;
    }
    
    public WebResourceResponseExt handle(String paramString)
    {
      MethodChannel localMethodChannel = getChannel();
      if (localMethodChannel == null) {
        return null;
      }
      SyncHandleCallback localSyncHandleCallback = new SyncHandleCallback();
      HashMap localHashMap = new HashMap();
      localHashMap.put("path", paramString);
      return (WebResourceResponseExt)Util.invokeMethodAndWaitResult(localMethodChannel, "handle", localHashMap, localSyncHandleCallback);
    }
    
    public void handle(String paramString, HandleCallback paramHandleCallback)
    {
      MethodChannel localMethodChannel = getChannel();
      if (localMethodChannel == null) {
        return;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("path", paramString);
      localMethodChannel.invokeMethod("handle", localHashMap, paramHandleCallback);
    }
    
    public static class HandleCallback
      extends BaseCallbackResultImpl<WebResourceResponseExt>
    {
      public WebResourceResponseExt decodeResult(Object paramObject)
      {
        return WebResourceResponseExt.fromMap((Map)paramObject);
      }
    }
    
    public static class SyncHandleCallback
      extends SyncBaseCallbackResultImpl<WebResourceResponseExt>
    {
      public WebResourceResponseExt decodeResult(Object paramObject)
      {
        return new WebViewAssetLoaderExt.PathHandlerExtChannelDelegate.HandleCallback().decodeResult(paramObject);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */