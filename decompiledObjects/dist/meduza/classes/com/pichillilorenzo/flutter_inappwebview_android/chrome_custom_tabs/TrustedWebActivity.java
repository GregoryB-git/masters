package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p.o;
import p.o.d;
import p.u;
import q.b;
import q.c;

public class TrustedWebActivity
  extends ChromeCustomTabsActivity
{
  public static final String LOG_TAG = "TrustedWebActivity";
  public c builder;
  
  private void prepareCustomTabs()
  {
    Object localObject1 = customSettings.toolbarBackgroundColor;
    c localc = null;
    if ((localObject1 != null) && (!((String)localObject1).isEmpty())) {
      localObject1 = Integer.valueOf(Color.parseColor(customSettings.toolbarBackgroundColor) | 0xFF000000);
    } else {
      localObject1 = null;
    }
    Object localObject2 = customSettings.navigationBarColor;
    if ((localObject2 != null) && (!((String)localObject2).isEmpty())) {
      localObject2 = Integer.valueOf(0xFF000000 | Color.parseColor(customSettings.navigationBarColor));
    } else {
      localObject2 = null;
    }
    Object localObject3 = customSettings.navigationBarDividerColor;
    if ((localObject3 != null) && (!((String)localObject3).isEmpty())) {
      localObject3 = Integer.valueOf(Color.parseColor(customSettings.navigationBarDividerColor));
    } else {
      localObject3 = null;
    }
    String str = customSettings.secondaryToolbarColor;
    Object localObject4 = localc;
    if (str != null)
    {
      localObject4 = localc;
      if (!str.isEmpty()) {
        localObject4 = Integer.valueOf(Color.parseColor(customSettings.secondaryToolbarColor));
      }
    }
    localc = builder;
    localObject1 = new p.a((Integer)localObject1, (Integer)localObject4, (Integer)localObject2, (Integer)localObject3);
    localObject2 = b;
    localObject2.getClass();
    e = ((p.a)localObject1).a();
    localObject1 = customSettings.additionalTrustedOrigins;
    if ((localObject1 != null) && (!((List)localObject1).isEmpty())) {
      builder.c = customSettings.additionalTrustedOrigins;
    }
    localObject1 = customSettings;
    localObject2 = displayMode;
    if (localObject2 != null) {
      builder.d = ((q.a)localObject2);
    }
    builder.e = screenOrientation.intValue();
  }
  
  private void prepareCustomTabsIntent(b paramb)
  {
    Intent localIntent = a;
    paramb = customSettings.packageName;
    if (paramb == null) {
      paramb = CustomTabsHelper.getPackageNameToUse(this);
    }
    localIntent.setPackage(paramb);
    if (customSettings.keepAliveEnabled.booleanValue()) {
      CustomTabsHelper.addKeepAliveExtra(this, localIntent);
    }
    if (customSettings.alwaysUseBrowserUI.booleanValue())
    {
      localIntent.addFlags(268435456);
      localIntent.putExtra("android.support.customtabs.extra.user_opt_out", true);
    }
  }
  
  public void launchUrl(String paramString1, Map<String, String> paramMap, String paramString2, List<String> paramList)
  {
    if (customTabsSession == null) {
      return;
    }
    Uri localUri = Uri.parse(paramString1);
    mayLaunchUrl(paramString1, paramList);
    builder = new c(localUri);
    prepareCustomTabs();
    paramString1 = builder;
    Object localObject1 = customTabsSession;
    if (localObject1 != null)
    {
      Object localObject2 = b;
      a.setPackage(d.getPackageName());
      paramList = c.asBinder();
      PendingIntent localPendingIntent = e;
      localObject1 = new Bundle();
      ((Bundle)localObject1).putBinder("android.support.customtabs.extra.SESSION", paramList);
      if (localPendingIntent != null) {
        ((Bundle)localObject1).putParcelable("android.support.customtabs.extra.SESSION_ID", localPendingIntent);
      }
      a.putExtras((Bundle)localObject1);
      paramList = b.a().a;
      paramList.setData(a);
      paramList.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
      if (c != null) {
        paramList.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(c));
      }
      localObject2 = Collections.emptyList();
      paramList.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", d.a());
      paramList.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", e);
      paramList = new b(paramList, (List)localObject2);
      prepareCustomTabsIntent(paramList);
      if (paramString2 != null) {
        paramString1 = Uri.parse(paramString2);
      } else {
        paramString1 = null;
      }
      CustomTabActivityHelper.openTrustedWebActivity(this, paramList, localUri, paramMap, paramString1, 100);
      return;
    }
    paramString1.getClass();
    throw new NullPointerException("CustomTabsSession is required for launching a TWA");
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.TrustedWebActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */