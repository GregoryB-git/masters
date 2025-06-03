package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;
import android.widget.RemoteViews;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.R.layout;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsActionButton;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsMenuItem;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import f;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.b;
import p.o;
import p.o.d;
import p.t;
import p.u;
import p.v;

public class ChromeCustomTabsActivity
  extends Activity
  implements Disposable
{
  public static final int CHROME_CUSTOM_TAB_REQUEST_CODE = 100;
  public static final String LOG_TAG = "CustomTabsActivity";
  public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_chromesafaribrowser_";
  public static final int NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE = 101;
  public CustomTabsActionButton actionButton;
  public o.d builder;
  public ChromeCustomTabsChannelDelegate channelDelegate;
  public ChromeCustomTabsSettings customSettings = new ChromeCustomTabsSettings();
  public CustomTabActivityHelper customTabActivityHelper = new CustomTabActivityHelper();
  public u customTabsSession;
  public String id;
  public Map<String, String> initialHeaders;
  public List<String> initialOtherLikelyURLs;
  public String initialReferrer;
  public String initialUrl;
  public boolean isBindSuccess = false;
  public ChromeSafariBrowserManager manager;
  public List<CustomTabsMenuItem> menuItems = new ArrayList();
  public boolean onCompletedInitialLoad = false;
  public boolean onOpened = false;
  public CustomTabsSecondaryToolbar secondaryToolbar;
  
  private PendingIntent createPendingIntent(int paramInt)
  {
    Intent localIntent = new Intent(this, ActionBroadcastReceiver.class);
    Bundle localBundle = new Bundle();
    localBundle.putInt("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_ID", paramInt);
    localBundle.putString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_VIEW_ID", id);
    Object localObject = manager;
    if (localObject != null) {
      localObject = id;
    } else {
      localObject = null;
    }
    localBundle.putString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_MANAGER_ID", (String)localObject);
    localIntent.putExtras(localBundle);
    if (Build.VERSION.SDK_INT >= 31) {}
    for (int i = 167772160;; i = 134217728) {
      return PendingIntent.getBroadcast(this, paramInt, localIntent, i);
    }
  }
  
  private void prepareCustomTabs()
  {
    Object localObject1 = builder;
    if (localObject1 == null) {
      return;
    }
    Object localObject2 = customSettings;
    Object localObject3 = addDefaultShareMenuItem;
    int i;
    if (localObject3 != null)
    {
      if (((Boolean)localObject3).booleanValue()) {
        i = 1;
      } else {
        i = 2;
      }
    }
    else {
      i = shareState.intValue();
    }
    ((o.d)localObject1).b(i);
    localObject2 = customSettings.toolbarBackgroundColor;
    Object localObject4 = null;
    if ((localObject2 != null) && (!((String)localObject2).isEmpty())) {
      localObject2 = Integer.valueOf(Color.parseColor(customSettings.toolbarBackgroundColor) | 0xFF000000);
    } else {
      localObject2 = null;
    }
    localObject1 = customSettings.navigationBarColor;
    if ((localObject1 != null) && (!((String)localObject1).isEmpty())) {
      localObject1 = Integer.valueOf(0xFF000000 | Color.parseColor(customSettings.navigationBarColor));
    } else {
      localObject1 = null;
    }
    localObject3 = customSettings.navigationBarDividerColor;
    if ((localObject3 != null) && (!((String)localObject3).isEmpty())) {
      localObject3 = Integer.valueOf(Color.parseColor(customSettings.navigationBarDividerColor));
    } else {
      localObject3 = null;
    }
    Object localObject5 = customSettings.secondaryToolbarColor;
    Object localObject6 = localObject4;
    if (localObject5 != null)
    {
      localObject6 = localObject4;
      if (!((String)localObject5).isEmpty()) {
        localObject6 = Integer.valueOf(Color.parseColor(customSettings.secondaryToolbarColor));
      }
    }
    localObject5 = builder;
    localObject5.getClass();
    localObject4 = new Bundle();
    if (localObject2 != null) {
      ((BaseBundle)localObject4).putInt("android.support.customtabs.extra.TOOLBAR_COLOR", ((Integer)localObject2).intValue());
    }
    if (localObject6 != null) {
      ((BaseBundle)localObject4).putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", ((Integer)localObject6).intValue());
    }
    if (localObject1 != null) {
      ((BaseBundle)localObject4).putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", ((Integer)localObject1).intValue());
    }
    if (localObject3 != null) {
      ((BaseBundle)localObject4).putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", ((Integer)localObject3).intValue());
    }
    e = ((Bundle)localObject4);
    localObject2 = builder;
    int j = customSettings.showTitle.booleanValue();
    a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", j);
    localObject2 = builder;
    boolean bool = customSettings.enableUrlBarHiding.booleanValue();
    a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", bool);
    builder.g = customSettings.instantAppsEnabled.booleanValue();
    int m = customSettings.startAnimations.size();
    int k = 0;
    int n;
    if (m == 2)
    {
      localObject2 = builder;
      m = ((AndroidResource)customSettings.startAnimations.get(0)).getIdentifier(this);
      n = ((AndroidResource)customSettings.startAnimations.get(1)).getIdentifier(this);
      localObject2.getClass();
      d = ActivityOptions.makeCustomAnimation(this, m, n);
    }
    if (customSettings.exitAnimations.size() == 2)
    {
      localObject2 = builder;
      m = ((AndroidResource)customSettings.exitAnimations.get(0)).getIdentifier(this);
      n = ((AndroidResource)customSettings.exitAnimations.get(1)).getIdentifier(this);
      localObject2.getClass();
      localObject1 = ActivityOptions.makeCustomAnimation(this, m, n).toBundle();
      a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", (Bundle)localObject1);
    }
    localObject2 = menuItems.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject6 = (CustomTabsMenuItem)((Iterator)localObject2).next();
      localObject1 = builder;
      localObject3 = ((CustomTabsMenuItem)localObject6).getLabel();
      localObject6 = createPendingIntent(((CustomTabsMenuItem)localObject6).getId());
      if (c == null) {
        c = new ArrayList();
      }
      localObject4 = new Bundle();
      ((BaseBundle)localObject4).putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", (String)localObject3);
      ((Bundle)localObject4).putParcelable("android.support.customtabs.customaction.PENDING_INTENT", (Parcelable)localObject6);
      c.add(localObject4);
    }
    localObject2 = actionButton;
    if (localObject2 != null)
    {
      localObject2 = ((CustomTabsActionButton)localObject2).getIcon();
      localObject1 = new BitmapFactory.Options();
      inMutable = true;
      localObject3 = BitmapFactory.decodeByteArray((byte[])localObject2, 0, localObject2.length, (BitmapFactory.Options)localObject1);
      localObject4 = builder;
      localObject2 = actionButton.getDescription();
      localObject6 = createPendingIntent(actionButton.getId());
      bool = actionButton.isShouldTint();
      localObject4.getClass();
      localObject1 = new Bundle();
      ((BaseBundle)localObject1).putInt("android.support.customtabs.customaction.ID", 0);
      ((Bundle)localObject1).putParcelable("android.support.customtabs.customaction.ICON", (Parcelable)localObject3);
      ((BaseBundle)localObject1).putString("android.support.customtabs.customaction.DESCRIPTION", (String)localObject2);
      ((Bundle)localObject1).putParcelable("android.support.customtabs.customaction.PENDING_INTENT", (Parcelable)localObject6);
      a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", (Bundle)localObject1);
      a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", bool);
    }
    localObject2 = secondaryToolbar;
    if (localObject2 != null)
    {
      localObject2 = ((CustomTabsSecondaryToolbar)localObject2).getLayout();
      localObject3 = new RemoteViews(((AndroidResource)localObject2).getDefPackage(), ((AndroidResource)localObject2).getIdentifier(this));
      localObject6 = new int[secondaryToolbar.getClickableIDs().size()];
      m = secondaryToolbar.getClickableIDs().size();
      while (k < m)
      {
        localObject6[k] = ((AndroidResource)secondaryToolbar.getClickableIDs().get(k)).getIdentifier(this);
        k++;
      }
      localObject2 = builder;
      localObject1 = getSecondaryToolbarOnClickPendingIntent();
      a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", (Parcelable)localObject3);
      a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", (int[])localObject6);
      a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", (Parcelable)localObject1);
    }
  }
  
  private void prepareCustomTabsIntent(o paramo)
  {
    Object localObject = customSettings.packageName;
    if (localObject != null) {
      a.setPackage((String)localObject);
    } else {
      a.setPackage(CustomTabsHelper.getPackageNameToUse(this));
    }
    if (customSettings.keepAliveEnabled.booleanValue()) {
      CustomTabsHelper.addKeepAliveExtra(this, a);
    }
    if (customSettings.alwaysUseBrowserUI.booleanValue())
    {
      localObject = a;
      paramo = (o)localObject;
      if (localObject == null) {
        paramo = new Intent("android.intent.action.VIEW");
      }
      paramo.addFlags(268435456);
      paramo.putExtra("android.support.customtabs.extra.user_opt_out", true);
    }
  }
  
  public void close()
  {
    onStop();
    onDestroy();
    customTabsSession = null;
    finish();
    ChromeCustomTabsChannelDelegate localChromeCustomTabsChannelDelegate = channelDelegate;
    if (localChromeCustomTabsChannelDelegate != null) {
      localChromeCustomTabsChannelDelegate.onClosed();
    }
  }
  
  public void customTabsConnected()
  {
    Object localObject1 = customTabActivityHelper.getSession();
    customTabsSession = ((u)localObject1);
    if (localObject1 != null) {
      try
      {
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        Object localObject2 = customTabsSession;
        Object localObject3 = ((u)localObject2).a((Bundle)localObject1);
        try
        {
          boolean bool = b.U2(c, (Bundle)localObject3);
          if (bool)
          {
            localObject3 = customTabsSession;
            localObject2 = new com/pichillilorenzo/flutter_inappwebview_android/chrome_custom_tabs/ChromeCustomTabsActivity$3;
            ((3)localObject2).<init>(this);
            localObject1 = ((u)localObject3).a((Bundle)localObject1);
            t localt = new p/t;
            localt.<init>((v)localObject2);
            try
            {
              b.d2(c, localt, (Bundle)localObject1);
            }
            catch (SecurityException localSecurityException1)
            {
              localObject1 = new java/lang/UnsupportedOperationException;
              ((UnsupportedOperationException)localObject1).<init>("This method isn't supported by the Custom Tabs implementation.", localSecurityException1);
              throw ((Throwable)localObject1);
            }
            localThrowable = finally;
          }
        }
        catch (SecurityException localSecurityException2)
        {
          localObject1 = new java/lang/UnsupportedOperationException;
          ((UnsupportedOperationException)localObject1).<init>("This method isn't supported by the Custom Tabs implementation.", localSecurityException2);
          throw ((Throwable)localObject1);
        }
        if (!isBindSuccess) {
          return;
        }
      }
      finally {}
    }
    String str = initialUrl;
    if (str != null) {
      launchUrl(str, initialHeaders, initialReferrer, initialOtherLikelyURLs);
    }
  }
  
  public void dispose()
  {
    onStop();
    onDestroy();
    Object localObject = channelDelegate;
    if (localObject != null)
    {
      ((ChromeCustomTabsChannelDelegate)localObject).dispose();
      channelDelegate = null;
    }
    localObject = manager;
    if ((localObject != null) && (browsers.containsKey(id))) {
      manager.browsers.put(id, null);
    }
    manager = null;
  }
  
  public PendingIntent getSecondaryToolbarOnClickPendingIntent()
  {
    Intent localIntent = new Intent(this, ActionBroadcastReceiver.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_VIEW_ID", id);
    Object localObject = manager;
    if (localObject != null) {
      localObject = id;
    } else {
      localObject = null;
    }
    localBundle.putString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_MANAGER_ID", (String)localObject);
    localIntent.putExtras(localBundle);
    if (Build.VERSION.SDK_INT >= 31) {}
    for (int i = 167772160;; i = 134217728) {
      return PendingIntent.getBroadcast(this, 0, localIntent, i);
    }
  }
  
  public void launchUrl(String paramString1, Map<String, String> paramMap, String paramString2, List<String> paramList)
  {
    launchUrlWithSession(customTabsSession, paramString1, paramMap, paramString2, paramList);
  }
  
  public void launchUrlWithSession(u paramu, String paramString1, Map<String, String> paramMap, String paramString2, List<String> paramList)
  {
    mayLaunchUrl(paramString1, paramList);
    builder = new o.d(paramu);
    prepareCustomTabs();
    paramList = builder.a();
    prepareCustomTabsIntent(paramList);
    paramString1 = Uri.parse(paramString1);
    if (paramString2 != null) {
      paramu = Uri.parse(paramString2);
    } else {
      paramu = null;
    }
    CustomTabActivityHelper.openCustomTab(this, paramList, paramString1, paramMap, paramu, 100);
  }
  
  public boolean mayLaunchUrl(String paramString, List<String> paramList)
  {
    if (paramString != null) {
      paramString = Uri.parse(paramString);
    } else {
      paramString = null;
    }
    ArrayList localArrayList = new ArrayList();
    if (paramList != null)
    {
      Bundle localBundle = new Bundle();
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localBundle.putString("android.support.customtabs.otherurls.URL", (String)paramList.next());
      }
    }
    return customTabActivityHelper.mayLaunchUrl(paramString, null, localArrayList);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 100)
    {
      close();
      dispose();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.chrome_custom_tabs_layout);
    paramBundle = getIntent().getExtras();
    if (paramBundle == null) {
      return;
    }
    id = paramBundle.getString("id");
    Object localObject1 = paramBundle.getString("managerId");
    localObject1 = (ChromeSafariBrowserManager)ChromeSafariBrowserManager.shared.get(localObject1);
    manager = ((ChromeSafariBrowserManager)localObject1);
    if (localObject1 != null)
    {
      Object localObject2 = plugin;
      if ((localObject2 != null) && (messenger != null))
      {
        browsers.put(id, this);
        localObject1 = manager.plugin.messenger;
        localObject2 = f.l("com.pichillilorenzo/flutter_chromesafaribrowser_");
        ((StringBuilder)localObject2).append(id);
        channelDelegate = new ChromeCustomTabsChannelDelegate(this, new MethodChannel((BinaryMessenger)localObject1, ((StringBuilder)localObject2).toString()));
        initialUrl = paramBundle.getString("url");
        initialHeaders = ((Map)paramBundle.getSerializable("headers"));
        initialReferrer = paramBundle.getString("referrer");
        initialOtherLikelyURLs = paramBundle.getStringArrayList("otherLikelyURLs");
        localObject1 = new ChromeCustomTabsSettings();
        customSettings = ((ChromeCustomTabsSettings)localObject1);
        ((ChromeCustomTabsSettings)localObject1).parse((HashMap)paramBundle.getSerializable("settings"));
        actionButton = CustomTabsActionButton.fromMap((Map)paramBundle.getSerializable("actionButton"));
        secondaryToolbar = CustomTabsSecondaryToolbar.fromMap((Map)paramBundle.getSerializable("secondaryToolbar"));
        paramBundle = ((List)paramBundle.getSerializable("menuItemList")).iterator();
        while (paramBundle.hasNext())
        {
          localObject1 = (Map)paramBundle.next();
          menuItems.add(CustomTabsMenuItem.fromMap((Map)localObject1));
        }
        if (customSettings.noHistory.booleanValue())
        {
          paramBundle = manager.plugin.noHistoryCustomTabsActivityCallbacks;
          if (paramBundle != null)
          {
            paramBundle = noHistoryBrowserIDs;
            localObject1 = id;
            paramBundle.put(localObject1, localObject1);
          }
        }
        customTabActivityHelper.setConnectionCallback(new CustomTabActivityHelper.ConnectionCallback()
        {
          public void onCustomTabsConnected()
          {
            this$0.customTabsConnected();
            ChromeCustomTabsChannelDelegate localChromeCustomTabsChannelDelegate = this$0.channelDelegate;
            if (localChromeCustomTabsChannelDelegate != null) {
              localChromeCustomTabsChannelDelegate.onServiceConnected();
            }
          }
          
          public void onCustomTabsDisconnected()
          {
            jdField_this.close();
            this$0.dispose();
          }
        });
        customTabActivityHelper.setCustomTabsCallback(new b()
        {
          public void extraCallback(String paramAnonymousString, Bundle paramAnonymousBundle) {}
          
          public void onMessageChannelReady(Bundle paramAnonymousBundle)
          {
            paramAnonymousBundle = channelDelegate;
            if (paramAnonymousBundle != null) {
              paramAnonymousBundle.onMessageChannelReady();
            }
          }
          
          public void onNavigationEvent(int paramAnonymousInt, Bundle paramAnonymousBundle)
          {
            if (paramAnonymousInt == 5)
            {
              paramAnonymousBundle = ChromeCustomTabsActivity.this;
              if (!onOpened)
              {
                onOpened = true;
                paramAnonymousBundle = channelDelegate;
                if (paramAnonymousBundle != null) {
                  paramAnonymousBundle.onOpened();
                }
              }
            }
            if (paramAnonymousInt == 2)
            {
              paramAnonymousBundle = ChromeCustomTabsActivity.this;
              if (!onCompletedInitialLoad)
              {
                onCompletedInitialLoad = true;
                paramAnonymousBundle = channelDelegate;
                if (paramAnonymousBundle != null) {
                  paramAnonymousBundle.onCompletedInitialLoad();
                }
              }
            }
            paramAnonymousBundle = channelDelegate;
            if (paramAnonymousBundle != null) {
              paramAnonymousBundle.onNavigationEvent(paramAnonymousInt);
            }
          }
          
          public void onPostMessage(String paramAnonymousString, Bundle paramAnonymousBundle)
          {
            paramAnonymousBundle = channelDelegate;
            if (paramAnonymousBundle != null) {
              paramAnonymousBundle.onPostMessage(paramAnonymousString);
            }
          }
          
          public void onRelationshipValidationResult(int paramAnonymousInt, Uri paramAnonymousUri, boolean paramAnonymousBoolean, Bundle paramAnonymousBundle)
          {
            paramAnonymousBundle = channelDelegate;
            if (paramAnonymousBundle != null) {
              paramAnonymousBundle.onRelationshipValidationResult(paramAnonymousInt, paramAnonymousUri, paramAnonymousBoolean);
            }
          }
        });
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onStart()
  {
    super.onStart();
    boolean bool = customTabActivityHelper.bindCustomTabsService(this);
    isBindSuccess = bool;
    if (!bool)
    {
      String str = initialUrl;
      if (str != null) {
        launchUrlWithSession(null, str, initialHeaders, initialReferrer, initialOtherLikelyURLs);
      }
    }
  }
  
  public void onStop()
  {
    super.onStop();
    customTabActivityHelper.unbindCustomTabsService(this);
    isBindSuccess = false;
  }
  
  public void updateActionButton(byte[] paramArrayOfByte, String paramString)
  {
    u localu;
    Bundle localBundle;
    if ((customTabsSession != null) && (actionButton != null))
    {
      Object localObject1 = new BitmapFactory.Options();
      inMutable = true;
      Object localObject2 = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, (BitmapFactory.Options)localObject1);
      localu = customTabsSession;
      localu.getClass();
      localObject1 = new Bundle();
      ((Bundle)localObject1).putParcelable("android.support.customtabs.customaction.ICON", (Parcelable)localObject2);
      ((BaseBundle)localObject1).putString("android.support.customtabs.customaction.DESCRIPTION", paramString);
      localBundle = new Bundle();
      localBundle.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", (Bundle)localObject1);
      localObject2 = e;
      if (localObject2 != null) {
        ((Bundle)localObject1).putParcelable("android.support.customtabs.extra.SESSION_ID", (Parcelable)localObject2);
      }
    }
    try
    {
      b.i2(c, localBundle);
      actionButton.setIcon(paramArrayOfByte);
      actionButton.setDescription(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public void updateSecondaryToolbar(CustomTabsSecondaryToolbar paramCustomTabsSecondaryToolbar)
  {
    if (customTabsSession == null) {
      return;
    }
    Object localObject = paramCustomTabsSecondaryToolbar.getLayout();
    RemoteViews localRemoteViews = new RemoteViews(((AndroidResource)localObject).getDefPackage(), ((AndroidResource)localObject).getIdentifier(this));
    int[] arrayOfInt = new int[paramCustomTabsSecondaryToolbar.getClickableIDs().size()];
    int i = 0;
    int j = paramCustomTabsSecondaryToolbar.getClickableIDs().size();
    while (i < j)
    {
      arrayOfInt[i] = ((AndroidResource)paramCustomTabsSecondaryToolbar.getClickableIDs().get(i)).getIdentifier(this);
      i++;
    }
    localObject = customTabsSession;
    PendingIntent localPendingIntent = getSecondaryToolbarOnClickPendingIntent();
    localObject.getClass();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", localRemoteViews);
    localBundle.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", arrayOfInt);
    localBundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", localPendingIntent);
    localPendingIntent = e;
    if (localPendingIntent != null) {
      localBundle.putParcelable("android.support.customtabs.extra.SESSION_ID", localPendingIntent);
    }
    try
    {
      b.i2(c, localBundle);
      secondaryToolbar = paramCustomTabsSecondaryToolbar;
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */