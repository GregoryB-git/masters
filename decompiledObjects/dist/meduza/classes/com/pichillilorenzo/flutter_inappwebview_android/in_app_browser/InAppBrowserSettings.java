package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.R.id;
import g.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InAppBrowserSettings
  implements ISettings<InAppBrowserActivity>
{
  public static final String LOG_TAG = "InAppBrowserSettings";
  public Boolean allowGoBackWithBackButton;
  public Boolean closeOnCannotGoBack;
  public Boolean hidden;
  public Boolean hideDefaultMenuItems;
  public Boolean hideProgressBar;
  public Boolean hideTitleBar;
  public Boolean hideToolbarTop;
  public Boolean hideUrlBar;
  public Boolean shouldCloseOnBackButtonPressed;
  public String toolbarTopBackgroundColor;
  public String toolbarTopFixedTitle;
  
  public InAppBrowserSettings()
  {
    Boolean localBoolean1 = Boolean.FALSE;
    hidden = localBoolean1;
    hideToolbarTop = localBoolean1;
    hideUrlBar = localBoolean1;
    hideProgressBar = localBoolean1;
    hideTitleBar = localBoolean1;
    Boolean localBoolean2 = Boolean.TRUE;
    closeOnCannotGoBack = localBoolean2;
    allowGoBackWithBackButton = localBoolean2;
    shouldCloseOnBackButtonPressed = localBoolean1;
    hideDefaultMenuItems = localBoolean1;
  }
  
  public Map<String, Object> getRealSettings(InAppBrowserActivity paramInAppBrowserActivity)
  {
    Map localMap = toMap();
    localMap.put("hidden", Boolean.valueOf(isHidden));
    Object localObject = actionBar;
    boolean bool1 = false;
    boolean bool2;
    if ((localObject != null) && (((a)localObject).h())) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    localMap.put("hideToolbarTop", Boolean.valueOf(bool2));
    localObject = menu;
    if ((localObject != null) && (((Menu)localObject).findItem(R.id.menu_search).isVisible())) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    localMap.put("hideUrlBar", Boolean.valueOf(bool2));
    paramInAppBrowserActivity = progressBar;
    if (paramInAppBrowserActivity != null)
    {
      bool2 = bool1;
      if (paramInAppBrowserActivity.getMax() != 0) {}
    }
    else
    {
      bool2 = true;
    }
    localMap.put("hideProgressBar", Boolean.valueOf(bool2));
    return localMap;
  }
  
  public InAppBrowserSettings parse(Map<String, Object> paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject = (Map.Entry)paramMap.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      if (localObject != null)
      {
        str.getClass();
        int i = -1;
        switch (str.hashCode())
        {
        default: 
          break;
        case 2140270213: 
          if (str.equals("shouldCloseOnBackButtonPressed")) {
            i = 10;
          }
          break;
        case 2111633307: 
          if (str.equals("toolbarTopBackgroundColor")) {
            i = 9;
          }
          break;
        case 406250502: 
          if (str.equals("hideUrlBar")) {
            i = 8;
          }
          break;
        case 90270825: 
          if (str.equals("closeOnCannotGoBack")) {
            i = 7;
          }
          break;
        case 3851268: 
          if (str.equals("hideProgressBar")) {
            i = 6;
          }
          break;
        case -118493506: 
          if (str.equals("toolbarTopFixedTitle")) {
            i = 5;
          }
          break;
        case -299596350: 
          if (str.equals("hideDefaultMenuItems")) {
            i = 4;
          }
          break;
        case -809085252: 
          if (str.equals("hideToolbarTop")) {
            i = 3;
          }
          break;
        case -842349289: 
          if (str.equals("allowGoBackWithBackButton")) {
            i = 2;
          }
          break;
        case -1217487446: 
          if (str.equals("hidden")) {
            i = 1;
          }
          break;
        case -1307803139: 
          if (str.equals("hideTitleBar")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          break;
        case 10: 
          shouldCloseOnBackButtonPressed = ((Boolean)localObject);
          break;
        case 9: 
          toolbarTopBackgroundColor = ((String)localObject);
          break;
        case 8: 
          hideUrlBar = ((Boolean)localObject);
          break;
        case 7: 
          closeOnCannotGoBack = ((Boolean)localObject);
          break;
        case 6: 
          hideProgressBar = ((Boolean)localObject);
          break;
        case 5: 
          toolbarTopFixedTitle = ((String)localObject);
          break;
        case 4: 
          hideDefaultMenuItems = ((Boolean)localObject);
          break;
        case 3: 
          hideToolbarTop = ((Boolean)localObject);
          break;
        case 2: 
          allowGoBackWithBackButton = ((Boolean)localObject);
          break;
        case 1: 
          hidden = ((Boolean)localObject);
          break;
        case 0: 
          hideTitleBar = ((Boolean)localObject);
        }
      }
    }
    return this;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("hidden", hidden);
    localHashMap.put("hideToolbarTop", hideToolbarTop);
    localHashMap.put("toolbarTopBackgroundColor", toolbarTopBackgroundColor);
    localHashMap.put("toolbarTopFixedTitle", toolbarTopFixedTitle);
    localHashMap.put("hideUrlBar", hideUrlBar);
    localHashMap.put("hideTitleBar", hideTitleBar);
    localHashMap.put("closeOnCannotGoBack", closeOnCannotGoBack);
    localHashMap.put("hideProgressBar", hideProgressBar);
    localHashMap.put("allowGoBackWithBackButton", allowGoBackWithBackButton);
    localHashMap.put("shouldCloseOnBackButtonPressed", shouldCloseOnBackButtonPressed);
    localHashMap.put("hideDefaultMenuItems", hideDefaultMenuItems);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */