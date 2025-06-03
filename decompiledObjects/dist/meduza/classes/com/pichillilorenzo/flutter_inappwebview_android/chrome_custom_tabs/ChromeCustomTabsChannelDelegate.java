package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p.u;

public class ChromeCustomTabsChannelDelegate
  extends ChannelDelegateImpl
{
  private ChromeCustomTabsActivity chromeCustomTabsActivity;
  
  public ChromeCustomTabsChannelDelegate(ChromeCustomTabsActivity paramChromeCustomTabsActivity, MethodChannel paramMethodChannel)
  {
    super(paramMethodChannel);
    chromeCustomTabsActivity = paramChromeCustomTabsActivity;
  }
  
  public void dispose()
  {
    super.dispose();
    chromeCustomTabsActivity = null;
  }
  
  public void onClosed()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onClosed", new HashMap());
  }
  
  public void onCompletedInitialLoad()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onCompletedInitialLoad", new HashMap());
  }
  
  public void onGreatestScrollPercentageIncreased(int paramInt)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("scrollPercentage", Integer.valueOf(paramInt));
    localMethodChannel.invokeMethod("onGreatestScrollPercentageIncreased", localHashMap);
  }
  
  public void onItemActionPerform(int paramInt, String paramString1, String paramString2)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", Integer.valueOf(paramInt));
    localHashMap.put("url", paramString1);
    localHashMap.put("title", paramString2);
    localMethodChannel.invokeMethod("onItemActionPerform", localHashMap);
  }
  
  public void onMessageChannelReady()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onMessageChannelReady", new HashMap());
  }
  
  public void onMethodCall(MethodCall arg1, MethodChannel.Result paramResult)
  {
    Object localObject1 = method;
    localObject1.getClass();
    int i = ((String)localObject1).hashCode();
    bool1 = false;
    switch (i)
    {
    default: 
      break;
    case 2000053463: 
      if (((String)localObject1).equals("mayLaunchUrl")) {
        i = 8;
      }
      break;
    case 1490029383: 
      if (((String)localObject1).equals("postMessage")) {
        i = 7;
      }
      break;
    case 1392239787: 
      if (((String)localObject1).equals("requestPostMessageChannel")) {
        i = 6;
      }
      break;
    case 1256059502: 
      if (((String)localObject1).equals("validateRelationship")) {
        i = 5;
      }
      break;
    case 94756344: 
      if (((String)localObject1).equals("close")) {
        i = 4;
      }
      break;
    case 50870385: 
      if (((String)localObject1).equals("updateActionButton")) {
        i = 3;
      }
      break;
    case -334843312: 
      if (((String)localObject1).equals("updateSecondaryToolbar")) {
        i = 2;
      }
      break;
    case -675108676: 
      if (((String)localObject1).equals("launchUrl")) {
        i = 1;
      }
      break;
    case -1526944655: 
      if (((String)localObject1).equals("isEngagementSignalsApiAvailable")) {
        i = 0;
      }
      break;
    }
    i = -1;
    localObject1 = null;
    Object localObject3;
    Object localObject4;
    Uri localUri;
    Bundle localBundle;
    switch (i)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 8: 
      if (chromeCustomTabsActivity != null)
      {
        localObject1 = (String)???.argument("url");
        ??? = (List)???.argument("otherLikelyURLs");
        ??? = Boolean.valueOf(chromeCustomTabsActivity.mayLaunchUrl((String)localObject1, ???));
      }
      break;
    case 7: 
      localObject1 = chromeCustomTabsActivity;
      if ((localObject1 != null) && (customTabsSession != null))
      {
        localObject1 = (String)???.argument("message");
        localObject3 = chromeCustomTabsActivity.customTabsSession;
        localObject4 = ((u)localObject3).a(new Bundle());
        try
        {
          synchronized (a)
          {
            i = b.H1(c, (String)localObject1, (Bundle)localObject4);
          }
        }
        catch (RemoteException localRemoteException)
        {
          i = -2;
        }
        throw paramResult;
      }
      else
      {
        i = -3;
      }
      ??? = Integer.valueOf(i);
      break;
    case 6: 
      localObject4 = chromeCustomTabsActivity;
      if ((localObject4 != null) && (customTabsSession != null))
      {
        localObject4 = (String)???.argument("sourceOrigin");
        ??? = (String)???.argument("targetOrigin");
        localObject3 = chromeCustomTabsActivity.customTabsSession;
        localUri = Uri.parse((String)localObject4);
        if (??? != null) {
          ??? = Uri.parse(???);
        } else {
          ??? = null;
        }
        localBundle = new Bundle();
        localObject3.getClass();
      }
      break;
    }
    try
    {
      localObject4 = new android/os/Bundle;
      ((Bundle)localObject4).<init>();
      if (??? != null) {
        ((Bundle)localObject4).putParcelable("target_origin", ???);
      }
      ??? = e;
      if ((??? != null) && (??? != null)) {
        ((Bundle)localObject4).putParcelable("android.support.customtabs.extra.SESSION_ID", ???);
      }
      if (((BaseBundle)localObject4).isEmpty()) {
        ??? = localRemoteException;
      } else {
        ??? = (MethodCall)localObject4;
      }
      if (??? != null)
      {
        localBundle.putAll(???);
        bool2 = b.U1(c, localUri, localBundle);
      }
      else
      {
        bool2 = b.s2(c, localUri);
      }
    }
    catch (RemoteException ???)
    {
      for (;;)
      {
        Object localObject2;
        boolean bool2 = bool1;
      }
    }
    localObject2 = chromeCustomTabsActivity;
    if ((localObject2 != null) && (customTabsSession != null))
    {
      localObject2 = (Integer)???.argument("relation");
      localObject4 = (String)???.argument("origin");
      ??? = chromeCustomTabsActivity.customTabsSession;
      i = ((Integer)localObject2).intValue();
      localObject2 = Uri.parse((String)localObject4);
      ???.getClass();
      bool2 = bool1;
      if (i >= 1) {
        if (i > 2)
        {
          bool2 = bool1;
        }
        else
        {
          localObject4 = ???.a(null);
          bool2 = b.p0(i, (Uri)localObject2, (Bundle)localObject4, c);
        }
      }
      ??? = Boolean.valueOf(bool2);
      break label1143;
      ??? = chromeCustomTabsActivity;
      if (??? != null)
      {
        ???.onStop();
        chromeCustomTabsActivity.onDestroy();
        chromeCustomTabsActivity.close();
        ??? = chromeCustomTabsActivity.manager;
        if (??? != null)
        {
          ??? = plugin;
          if (??? != null)
          {
            ??? = activity;
            if (??? != null)
            {
              localObject2 = new Intent(???, ???.getClass());
              ((Intent)localObject2).addFlags(67108864);
              ((Intent)localObject2).addFlags(536870912);
              ???.startActivity((Intent)localObject2);
            }
          }
        }
        chromeCustomTabsActivity.dispose();
        if (chromeCustomTabsActivity != null)
        {
          localObject2 = (byte[])???.argument("icon");
          ??? = (String)???.argument("description");
          chromeCustomTabsActivity.updateActionButton((byte[])localObject2, ???);
          if (chromeCustomTabsActivity != null)
          {
            ??? = CustomTabsSecondaryToolbar.fromMap((Map)???.argument("secondaryToolbar"));
            chromeCustomTabsActivity.updateSecondaryToolbar(???);
            if (chromeCustomTabsActivity != null)
            {
              localObject2 = (String)???.argument("url");
              if (localObject2 != null)
              {
                localObject3 = (Map)???.argument("headers");
                localObject4 = (String)???.argument("referrer");
                ??? = (List)???.argument("otherLikelyURLs");
                chromeCustomTabsActivity.launchUrl((String)localObject2, (Map)localObject3, (String)localObject4, ???);
                ??? = Boolean.TRUE;
                break label1143;
                ??? = chromeCustomTabsActivity;
                if (??? != null)
                {
                  ??? = customTabsSession;
                  if (??? == null) {}
                }
              }
            }
          }
        }
      }
    }
    try
    {
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      localObject2 = ???.a((Bundle)localObject2);
      try
      {
        bool2 = b.U2(c, (Bundle)localObject2);
        paramResult.success(Boolean.valueOf(bool2));
      }
      catch (SecurityException ???)
      {
        localObject2 = new java/lang/UnsupportedOperationException;
        ((UnsupportedOperationException)localObject2).<init>("This method isn't supported by the Custom Tabs implementation.", ???);
        throw ((Throwable)localObject2);
      }
    }
    finally
    {
      for (;;) {}
    }
    ??? = Boolean.FALSE;
    label1143:
    paramResult.success(???);
  }
  
  public void onNavigationEvent(int paramInt)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("navigationEvent", Integer.valueOf(paramInt));
    localMethodChannel.invokeMethod("onNavigationEvent", localHashMap);
  }
  
  public void onOpened()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onOpened", new HashMap());
  }
  
  public void onPostMessage(String paramString)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("message", paramString);
    localMethodChannel.invokeMethod("onPostMessage", localHashMap);
  }
  
  public void onRelationshipValidationResult(int paramInt, Uri paramUri, boolean paramBoolean)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("relation", Integer.valueOf(paramInt));
    localHashMap.put("requestedOrigin", paramUri.toString());
    localHashMap.put("result", Boolean.valueOf(paramBoolean));
    localMethodChannel.invokeMethod("onRelationshipValidationResult", localHashMap);
  }
  
  public void onSecondaryItemActionPerform(String paramString1, String paramString2)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("name", paramString1);
    localHashMap.put("url", paramString2);
    localMethodChannel.invokeMethod("onSecondaryItemActionPerform", localHashMap);
  }
  
  public void onServiceConnected()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onServiceConnected", new HashMap());
  }
  
  public void onSessionEnded(boolean paramBoolean)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("didUserInteract", Boolean.valueOf(paramBoolean));
    localMethodChannel.invokeMethod("onSessionEnded", localHashMap);
  }
  
  public void onVerticalScrollEvent(boolean paramBoolean)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("isDirectionUp", Boolean.valueOf(paramBoolean));
    localMethodChannel.invokeMethod("onVerticalScrollEvent", localHashMap);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsChannelDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */