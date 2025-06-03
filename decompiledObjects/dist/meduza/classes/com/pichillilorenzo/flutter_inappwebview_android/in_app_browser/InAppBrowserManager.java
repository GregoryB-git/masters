package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import g;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class InAppBrowserManager
  extends ChannelDelegateImpl
{
  public static final String LOG_TAG = "InAppBrowserManager";
  public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappbrowser";
  public static final Map<String, InAppBrowserManager> shared = new HashMap();
  public String id;
  public InAppWebViewFlutterPlugin plugin;
  
  public InAppBrowserManager(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    super(new MethodChannel(messenger, "com.pichillilorenzo/flutter_inappbrowser"));
    String str = UUID.randomUUID().toString();
    id = str;
    plugin = paramInAppWebViewFlutterPlugin;
    shared.put(str, this);
  }
  
  public static String getMimeType(String paramString)
  {
    paramString = MimeTypeMap.getFileExtensionFromUrl(paramString);
    if (paramString != null) {
      paramString = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
    } else {
      paramString = null;
    }
    return paramString;
  }
  
  public void dispose()
  {
    super.dispose();
    shared.remove(id);
    plugin = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Object localObject = method;
    localObject.getClass();
    if (!((String)localObject).equals("openWithSystemBrowser"))
    {
      if (!((String)localObject).equals("open"))
      {
        paramResult.notImplemented();
        return;
      }
      localObject = plugin;
      if (localObject != null)
      {
        localObject = activity;
        if (localObject != null)
        {
          open((Activity)localObject, (Map)paramMethodCall.arguments());
          paramMethodCall = Boolean.TRUE;
          break label78;
        }
      }
    }
    label78:
    do
    {
      paramMethodCall = Boolean.FALSE;
      paramResult.success(paramMethodCall);
      break;
      localObject = plugin;
    } while ((localObject == null) || (activity == null));
    paramMethodCall = (String)paramMethodCall.argument("url");
    openWithSystemBrowser(plugin.activity, paramMethodCall, paramResult);
  }
  
  public void open(Activity paramActivity, Map<String, Object> paramMap)
  {
    String str1 = (String)paramMap.get("id");
    Map localMap1 = (Map)paramMap.get("urlRequest");
    String str2 = (String)paramMap.get("assetFilePath");
    String str3 = (String)paramMap.get("data");
    String str4 = (String)paramMap.get("mimeType");
    String str5 = (String)paramMap.get("encoding");
    String str6 = (String)paramMap.get("baseUrl");
    String str7 = (String)paramMap.get("historyUrl");
    Map localMap2 = (Map)paramMap.get("settings");
    Map localMap3 = (Map)paramMap.get("contextMenu");
    Integer localInteger = (Integer)paramMap.get("windowId");
    List localList1 = (List)paramMap.get("initialUserScripts");
    Map localMap4 = (Map)paramMap.get("pullToRefreshSettings");
    List localList2 = (List)paramMap.get("menuItems");
    paramMap = new Bundle();
    paramMap.putString("fromActivity", paramActivity.getClass().getName());
    paramMap.putSerializable("initialUrlRequest", (Serializable)localMap1);
    paramMap.putString("initialFile", str2);
    paramMap.putString("initialData", str3);
    paramMap.putString("initialMimeType", str4);
    paramMap.putString("initialEncoding", str5);
    paramMap.putString("initialBaseUrl", str6);
    paramMap.putString("initialHistoryUrl", str7);
    paramMap.putString("id", str1);
    paramMap.putString("managerId", id);
    paramMap.putSerializable("settings", (Serializable)localMap2);
    paramMap.putSerializable("contextMenu", (Serializable)localMap3);
    int i;
    if (localInteger != null) {
      i = localInteger.intValue();
    } else {
      i = -1;
    }
    paramMap.putInt("windowId", i);
    paramMap.putSerializable("initialUserScripts", (Serializable)localList1);
    paramMap.putSerializable("pullToRefreshInitialSettings", (Serializable)localMap4);
    paramMap.putSerializable("menuItems", (Serializable)localList2);
    startInAppBrowserActivity(paramActivity, paramMap);
  }
  
  public void openExternalExcludeCurrentApp(Activity paramActivity, Intent paramIntent)
  {
    Object localObject1 = paramActivity.getPackageName();
    Object localObject2 = paramActivity.getPackageManager().queryIntentActivities(paramIntent, 0);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((List)localObject2).iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      localObject2 = (ResolveInfo)localIterator.next();
      if (!((String)localObject1).equals(activityInfo.packageName))
      {
        Intent localIntent = (Intent)paramIntent.clone();
        localIntent.setPackage(activityInfo.packageName);
        localArrayList.add(localIntent);
      }
      else
      {
        i = 1;
      }
    }
    localObject1 = paramIntent;
    if (i != 0) {
      if (localArrayList.size() == 0)
      {
        localObject1 = paramIntent;
      }
      else if (localArrayList.size() == 1)
      {
        localObject1 = (Intent)localArrayList.get(0);
      }
      else
      {
        if (localArrayList.size() <= 0) {
          return;
        }
        localObject1 = Intent.createChooser((Intent)localArrayList.remove(localArrayList.size() - 1), null);
        ((Intent)localObject1).putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])localArrayList.toArray(new Parcelable[0]));
      }
    }
    paramActivity.startActivity((Intent)localObject1);
  }
  
  public void openWithSystemBrowser(Activity paramActivity, String paramString, MethodChannel.Result paramResult)
  {
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("android.intent.action.VIEW");
      localObject = Uri.parse(paramString);
      if ("file".equals(((Uri)localObject).getScheme())) {
        localIntent.setDataAndType((Uri)localObject, getMimeType(paramString));
      } else {
        localIntent.setData((Uri)localObject);
      }
      localIntent.putExtra("com.android.browser.application_id", paramActivity.getPackageName());
      openExternalExcludeCurrentApp(paramActivity, localIntent);
      paramResult.success(Boolean.TRUE);
    }
    catch (RuntimeException paramActivity)
    {
      Object localObject = g.g(paramString, " cannot be opened: ");
      ((StringBuilder)localObject).append(paramActivity.toString());
      Log.d("InAppBrowserManager", ((StringBuilder)localObject).toString());
      paramActivity = new StringBuilder();
      paramActivity.append(paramString);
      paramActivity.append(" cannot be opened!");
      paramResult.error("InAppBrowserManager", paramActivity.toString(), null);
    }
  }
  
  public void startInAppBrowserActivity(Activity paramActivity, Bundle paramBundle)
  {
    Intent localIntent = new Intent(paramActivity, InAppBrowserActivity.class);
    if (paramBundle != null) {
      localIntent.putExtras(paramBundle);
    }
    paramActivity.startActivity(localIntent);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */