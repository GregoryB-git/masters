package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import q.a;
import q.a.a;
import q.a.b;

public class ChromeCustomTabsSettings
  implements ISettings<ChromeCustomTabsActivity>
{
  public static final String LOG_TAG = "ChromeCustomTabsSettings";
  @Deprecated
  public Boolean addDefaultShareMenuItem;
  public List<String> additionalTrustedOrigins;
  public Boolean alwaysUseBrowserUI;
  public a displayMode;
  public Boolean enableUrlBarHiding;
  public List<AndroidResource> exitAnimations;
  public Boolean instantAppsEnabled;
  public Boolean isSingleInstance;
  public Boolean isTrustedWebActivity;
  public Boolean keepAliveEnabled;
  public String navigationBarColor;
  public String navigationBarDividerColor;
  public Boolean noHistory;
  public String packageName;
  public Integer screenOrientation;
  public String secondaryToolbarColor;
  public Integer shareState;
  public Boolean showTitle;
  public List<AndroidResource> startAnimations;
  public String toolbarBackgroundColor;
  
  public ChromeCustomTabsSettings()
  {
    Integer localInteger = Integer.valueOf(0);
    shareState = localInteger;
    showTitle = Boolean.TRUE;
    Boolean localBoolean = Boolean.FALSE;
    enableUrlBarHiding = localBoolean;
    instantAppsEnabled = localBoolean;
    keepAliveEnabled = localBoolean;
    isSingleInstance = localBoolean;
    noHistory = localBoolean;
    isTrustedWebActivity = localBoolean;
    additionalTrustedOrigins = new ArrayList();
    displayMode = null;
    screenOrientation = localInteger;
    startAnimations = new ArrayList();
    exitAnimations = new ArrayList();
    alwaysUseBrowserUI = localBoolean;
  }
  
  public Map<String, Object> getRealSettings(ChromeCustomTabsActivity paramChromeCustomTabsActivity)
  {
    Map localMap = toMap();
    if (paramChromeCustomTabsActivity != null)
    {
      paramChromeCustomTabsActivity = paramChromeCustomTabsActivity.getIntent();
      if (paramChromeCustomTabsActivity != null)
      {
        localMap.put("packageName", paramChromeCustomTabsActivity.getPackage());
        localMap.put("keepAliveEnabled", Boolean.valueOf(paramChromeCustomTabsActivity.hasExtra("android.support.customtabs.extra.KEEP_ALIVE")));
      }
    }
    return localMap;
  }
  
  public ChromeCustomTabsSettings parse(Map<String, Object> paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject1 = (Map.Entry)paramMap.next();
      Object localObject2 = (String)((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      if (localObject1 != null)
      {
        localObject2.getClass();
        int i = -1;
        switch (((String)localObject2).hashCode())
        {
        default: 
          break;
        case 2126240217: 
          if (((String)localObject2).equals("keepAliveEnabled")) {
            i = 19;
          }
          break;
        case 1714132357: 
          if (((String)localObject2).equals("displayMode")) {
            i = 18;
          }
          break;
        case 1603728804: 
          if (((String)localObject2).equals("alwaysUseBrowserUI")) {
            i = 17;
          }
          break;
        case 1578203421: 
          if (((String)localObject2).equals("additionalTrustedOrigins")) {
            i = 16;
          }
          break;
        case 1518510995: 
          if (((String)localObject2).equals("noHistory")) {
            i = 15;
          }
          break;
        case 908759025: 
          if (((String)localObject2).equals("packageName")) {
            i = 14;
          }
          break;
        case 472764366: 
          if (((String)localObject2).equals("instantAppsEnabled")) {
            i = 13;
          }
          break;
        case 390710230: 
          if (((String)localObject2).equals("isTrustedWebActivity")) {
            i = 12;
          }
          break;
        case 378069052: 
          if (((String)localObject2).equals("secondaryToolbarColor")) {
            i = 11;
          }
          break;
        case 317955373: 
          if (((String)localObject2).equals("exitAnimations")) {
            i = 10;
          }
          break;
        case 227582404: 
          if (((String)localObject2).equals("screenOrientation")) {
            i = 9;
          }
          break;
        case 137483238: 
          if (((String)localObject2).equals("enableUrlBarHiding")) {
            i = 8;
          }
          break;
        case -227713574: 
          if (((String)localObject2).equals("toolbarBackgroundColor")) {
            i = 7;
          }
          break;
        case -329366839: 
          if (((String)localObject2).equals("navigationBarDividerColor")) {
            i = 6;
          }
          break;
        case -462720700: 
          if (((String)localObject2).equals("navigationBarColor")) {
            i = 5;
          }
          break;
        case -632275769: 
          if (((String)localObject2).equals("isSingleInstance")) {
            i = 4;
          }
          break;
        case -1799055374: 
          if (((String)localObject2).equals("shareState")) {
            i = 3;
          }
          break;
        case -1913803429: 
          if (((String)localObject2).equals("showTitle")) {
            i = 2;
          }
          break;
        case -2080611471: 
          if (((String)localObject2).equals("startAnimations")) {
            i = 1;
          }
          break;
        case -2112880751: 
          if (((String)localObject2).equals("addDefaultShareMenuItem")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          break;
        case 19: 
          keepAliveEnabled = ((Boolean)localObject1);
          break;
        case 18: 
          localObject1 = (Map)localObject1;
          localObject2 = (String)((Map)localObject1).get("type");
          if (localObject2 != null) {
            if (!((String)localObject2).equals("IMMERSIVE_MODE"))
            {
              if (((String)localObject2).equals("DEFAULT_MODE")) {
                displayMode = new a.a();
              }
            }
            else
            {
              boolean bool = ((Boolean)((Map)localObject1).get("isSticky")).booleanValue();
              displayMode = new a.b(((Integer)((Map)localObject1).get("displayCutoutMode")).intValue(), bool);
            }
          }
          break;
        case 17: 
          alwaysUseBrowserUI = ((Boolean)localObject1);
          break;
        case 16: 
          additionalTrustedOrigins = ((List)localObject1);
          break;
        case 15: 
          noHistory = ((Boolean)localObject1);
          break;
        case 14: 
          packageName = ((String)localObject1);
          break;
        case 13: 
          instantAppsEnabled = ((Boolean)localObject1);
          break;
        case 12: 
          isTrustedWebActivity = ((Boolean)localObject1);
          break;
        case 11: 
          secondaryToolbarColor = ((String)localObject1);
          break;
        case 10: 
          localObject1 = ((List)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (Map)((Iterator)localObject1).next();
            if (AndroidResource.fromMap((Map)localObject2) != null) {
              exitAnimations.add(AndroidResource.fromMap((Map)localObject2));
            }
          }
        case 9: 
          screenOrientation = ((Integer)localObject1);
          break;
        case 8: 
          enableUrlBarHiding = ((Boolean)localObject1);
          break;
        case 7: 
          toolbarBackgroundColor = ((String)localObject1);
          break;
        case 6: 
          navigationBarDividerColor = ((String)localObject1);
          break;
        case 5: 
          navigationBarColor = ((String)localObject1);
          break;
        case 4: 
          isSingleInstance = ((Boolean)localObject1);
          break;
        case 3: 
          shareState = ((Integer)localObject1);
          break;
        case 2: 
          showTitle = ((Boolean)localObject1);
          break;
        case 1: 
          localObject1 = ((List)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (Map)((Iterator)localObject1).next();
            if (AndroidResource.fromMap((Map)localObject2) != null) {
              startAnimations.add(AndroidResource.fromMap((Map)localObject2));
            }
          }
        case 0: 
          addDefaultShareMenuItem = ((Boolean)localObject1);
        }
      }
    }
    return this;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("addDefaultShareMenuItem", addDefaultShareMenuItem);
    localHashMap.put("showTitle", showTitle);
    localHashMap.put("toolbarBackgroundColor", toolbarBackgroundColor);
    localHashMap.put("navigationBarColor", navigationBarColor);
    localHashMap.put("navigationBarDividerColor", navigationBarDividerColor);
    localHashMap.put("secondaryToolbarColor", secondaryToolbarColor);
    localHashMap.put("enableUrlBarHiding", enableUrlBarHiding);
    localHashMap.put("instantAppsEnabled", instantAppsEnabled);
    localHashMap.put("packageName", packageName);
    localHashMap.put("keepAliveEnabled", keepAliveEnabled);
    localHashMap.put("isSingleInstance", isSingleInstance);
    localHashMap.put("noHistory", noHistory);
    localHashMap.put("isTrustedWebActivity", isTrustedWebActivity);
    localHashMap.put("additionalTrustedOrigins", additionalTrustedOrigins);
    localHashMap.put("screenOrientation", screenOrientation);
    localHashMap.put("alwaysUseBrowserUI", alwaysUseBrowserUI);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */