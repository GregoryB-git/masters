package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.SearchView.OnCloseListener;
import android.widget.SearchView.OnQueryTextListener;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.R.id;
import com.pichillilorenzo.flutter_inappwebview_android.R.layout;
import com.pichillilorenzo.flutter_inappwebview_android.R.menu;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
import g.a;
import g.c;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.ActivityResultListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x0.m;

public class InAppBrowserActivity
  extends c
  implements InAppBrowserDelegate, Disposable
{
  public static final String LOG_TAG = "InAppBrowserActivity";
  public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappbrowser_";
  public a actionBar;
  private List<ActivityResultListener> activityResultListeners = new ArrayList();
  public InAppBrowserChannelDelegate channelDelegate;
  public InAppBrowserSettings customSettings = new InAppBrowserSettings();
  public String fromActivity;
  public String id;
  public boolean isHidden = false;
  public InAppBrowserManager manager;
  public Menu menu;
  public List<InAppBrowserMenuItem> menuItems = new ArrayList();
  public ProgressBar progressBar;
  public PullToRefreshLayout pullToRefreshLayout;
  public SearchView searchView;
  public InAppWebView webView;
  public Integer windowId;
  
  private void prepareView()
  {
    Object localObject = webView;
    if (localObject != null) {
      ((InAppWebView)localObject).prepare();
    }
    if (customSettings.hidden.booleanValue()) {
      hide();
    } else {
      show();
    }
    localObject = (ProgressBar)findViewById(R.id.progressBar);
    progressBar = ((ProgressBar)localObject);
    if (localObject != null)
    {
      int i;
      if (customSettings.hideProgressBar.booleanValue())
      {
        localObject = progressBar;
        i = 0;
      }
      else
      {
        localObject = progressBar;
        i = 100;
      }
      ((ProgressBar)localObject).setMax(i);
    }
    localObject = actionBar;
    if (localObject != null)
    {
      ((a)localObject).p(customSettings.hideTitleBar.booleanValue() ^ true);
      if (customSettings.hideToolbarTop.booleanValue()) {
        actionBar.f();
      }
      localObject = customSettings.toolbarTopBackgroundColor;
      if ((localObject != null) && (!((String)localObject).isEmpty())) {
        actionBar.n(new ColorDrawable(Color.parseColor(customSettings.toolbarTopBackgroundColor)));
      }
      localObject = customSettings.toolbarTopFixedTitle;
      if ((localObject != null) && (!((String)localObject).isEmpty())) {
        actionBar.r(customSettings.toolbarTopFixedTitle);
      }
    }
  }
  
  public boolean canGoBack()
  {
    InAppWebView localInAppWebView = webView;
    if (localInAppWebView != null) {
      return localInAppWebView.canGoBack();
    }
    return false;
  }
  
  public boolean canGoForward()
  {
    InAppWebView localInAppWebView = webView;
    if (localInAppWebView != null) {
      return localInAppWebView.canGoForward();
    }
    return false;
  }
  
  public void close(MethodChannel.Result paramResult)
  {
    InAppBrowserChannelDelegate localInAppBrowserChannelDelegate = channelDelegate;
    if (localInAppBrowserChannelDelegate != null) {
      localInAppBrowserChannelDelegate.onExit();
    }
    dispose();
    if (paramResult != null) {
      paramResult.success(Boolean.TRUE);
    }
  }
  
  public void closeButtonClicked(MenuItem paramMenuItem)
  {
    close(null);
  }
  
  public void didChangeProgress(int paramInt)
  {
    ProgressBar localProgressBar = progressBar;
    if (localProgressBar != null)
    {
      localProgressBar.setVisibility(0);
      if (Build.VERSION.SDK_INT >= 24) {
        b0.f.n(progressBar, paramInt);
      } else {
        progressBar.setProgress(paramInt);
      }
      if (paramInt == 100) {
        progressBar.setVisibility(8);
      }
    }
  }
  
  public void didChangeTitle(String paramString)
  {
    if (actionBar != null)
    {
      String str = customSettings.toolbarTopFixedTitle;
      if ((str == null) || (str.isEmpty())) {
        actionBar.r(paramString);
      }
    }
  }
  
  public void didFailNavigation(String paramString1, int paramInt, String paramString2)
  {
    paramString1 = progressBar;
    if (paramString1 != null) {
      paramString1.setProgress(0);
    }
  }
  
  public void didFinishNavigation(String paramString)
  {
    SearchView localSearchView = searchView;
    if (localSearchView != null) {
      localSearchView.setQuery(paramString, false);
    }
    paramString = progressBar;
    if (paramString != null) {
      paramString.setProgress(0);
    }
  }
  
  public void didStartNavigation(String paramString)
  {
    Object localObject = progressBar;
    if (localObject != null) {
      ((ProgressBar)localObject).setProgress(0);
    }
    localObject = searchView;
    if (localObject != null) {
      ((SearchView)localObject).setQuery(paramString, false);
    }
  }
  
  public void didUpdateVisitedHistory(String paramString)
  {
    SearchView localSearchView = searchView;
    if (localSearchView != null) {
      localSearchView.setQuery(paramString, false);
    }
  }
  
  public void dispose()
  {
    Object localObject1 = channelDelegate;
    if (localObject1 != null)
    {
      ((ChannelDelegateImpl)localObject1).dispose();
      channelDelegate = null;
    }
    activityResultListeners.clear();
    localObject1 = webView;
    if (localObject1 != null)
    {
      Object localObject2 = manager;
      if (localObject2 != null)
      {
        localObject2 = plugin;
        if (localObject2 != null)
        {
          localObject2 = activityPluginBinding;
          if (localObject2 != null)
          {
            localObject1 = inAppWebViewChromeClient;
            if (localObject1 != null) {
              ((ActivityPluginBinding)localObject2).removeActivityResultListener((PluginRegistry.ActivityResultListener)localObject1);
            }
          }
        }
      }
      localObject1 = (RelativeLayout)findViewById(R.id.container);
      if (localObject1 != null) {
        ((ViewGroup)localObject1).removeAllViews();
      }
      webView.dispose();
      webView = null;
      finish();
    }
  }
  
  public Activity getActivity()
  {
    return this;
  }
  
  public List<ActivityResultListener> getActivityResultListeners()
  {
    return activityResultListeners;
  }
  
  public Map<String, Object> getCustomSettings()
  {
    Object localObject1 = webView;
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject1 = ((InAppWebView)localObject1).getCustomSettings();
    } else {
      localObject1 = null;
    }
    InAppBrowserSettings localInAppBrowserSettings = customSettings;
    Object localObject3 = localObject2;
    if (localInAppBrowserSettings != null) {
      if (localObject1 == null)
      {
        localObject3 = localObject2;
      }
      else
      {
        localObject3 = localInAppBrowserSettings.getRealSettings(this);
        ((Map)localObject3).putAll((Map)localObject1);
      }
    }
    return (Map<String, Object>)localObject3;
  }
  
  public void goBack()
  {
    if ((webView != null) && (canGoBack())) {
      webView.goBack();
    }
  }
  
  public void goBackButtonClicked(MenuItem paramMenuItem)
  {
    goBack();
  }
  
  public void goForward()
  {
    if ((webView != null) && (canGoForward())) {
      webView.goForward();
    }
  }
  
  public void goForwardButtonClicked(MenuItem paramMenuItem)
  {
    goForward();
  }
  
  public void hide()
  {
    if (fromActivity != null) {
      try
      {
        isHidden = true;
        Intent localIntent = new android/content/Intent;
        localIntent.<init>(this, Class.forName(fromActivity));
        localIntent.setFlags(131072);
        startActivityIfNeeded(localIntent, 0);
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Log.d("InAppBrowserActivity", "", localClassNotFoundException);
      }
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Iterator localIterator = activityResultListeners.iterator();
    while (localIterator.hasNext()) {
      if (((ActivityResultListener)localIterator.next()).onActivityResult(paramInt1, paramInt2, paramIntent)) {
        return;
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getExtras();
    if (paramBundle == null) {
      return;
    }
    id = paramBundle.getString("id");
    Object localObject1 = paramBundle.getString("managerId");
    localObject1 = (InAppBrowserManager)InAppBrowserManager.shared.get(localObject1);
    manager = ((InAppBrowserManager)localObject1);
    if (localObject1 != null)
    {
      localObject1 = plugin;
      if ((localObject1 != null) && (messenger != null))
      {
        localObject1 = (Map)paramBundle.getSerializable("settings");
        customSettings.parse((Map)localObject1);
        windowId = Integer.valueOf(paramBundle.getInt("windowId"));
        setContentView(R.layout.activity_web_view);
        Object localObject2 = (Map)paramBundle.getSerializable("pullToRefreshInitialSettings");
        Object localObject3 = manager.plugin.messenger;
        Object localObject4 = f.l("com.pichillilorenzo/flutter_inappwebview_pull_to_refresh_");
        ((StringBuilder)localObject4).append(id);
        localObject3 = new MethodChannel((BinaryMessenger)localObject3, ((StringBuilder)localObject4).toString());
        localObject4 = new PullToRefreshSettings();
        ((PullToRefreshSettings)localObject4).parse((Map)localObject2);
        localObject2 = (PullToRefreshLayout)findViewById(R.id.pullToRefresh);
        pullToRefreshLayout = ((PullToRefreshLayout)localObject2);
        channelDelegate = new PullToRefreshChannelDelegate((PullToRefreshLayout)localObject2, (MethodChannel)localObject3);
        localObject2 = pullToRefreshLayout;
        settings = ((PullToRefreshSettings)localObject4);
        ((PullToRefreshLayout)localObject2).prepare();
        localObject3 = (InAppWebView)findViewById(R.id.webView);
        webView = ((InAppWebView)localObject3);
        localObject2 = id;
        id = localObject2;
        windowId = windowId;
        inAppBrowserDelegate = this;
        localObject4 = manager.plugin;
        plugin = ((InAppWebViewFlutterPlugin)localObject4);
        localObject4 = new FindInteractionController((InAppWebViewInterface)localObject3, (InAppWebViewFlutterPlugin)localObject4, localObject2, null);
        webView.findInteractionController = ((FindInteractionController)localObject4);
        ((FindInteractionController)localObject4).prepare();
        localObject4 = manager.plugin.messenger;
        localObject2 = f.l("com.pichillilorenzo/flutter_inappbrowser_");
        ((StringBuilder)localObject2).append(id);
        localObject4 = new MethodChannel((BinaryMessenger)localObject4, ((StringBuilder)localObject2).toString());
        channelDelegate = new InAppBrowserChannelDelegate((MethodChannel)localObject4);
        localObject2 = webView;
        channelDelegate = new WebViewChannelDelegate((InAppWebView)localObject2, (MethodChannel)localObject4);
        fromActivity = paramBundle.getString("fromActivity");
        localObject2 = (Map)paramBundle.getSerializable("contextMenu");
        localObject4 = (List)paramBundle.getSerializable("initialUserScripts");
        Iterator localIterator = ((List)paramBundle.getSerializable("menuItems")).iterator();
        while (localIterator.hasNext())
        {
          localObject3 = (Map)localIterator.next();
          menuItems.add(InAppBrowserMenuItem.fromMap((Map)localObject3));
        }
        localObject3 = new InAppWebViewSettings();
        ((InAppWebViewSettings)localObject3).parse((Map)localObject1);
        localObject1 = webView;
        customSettings = ((InAppWebViewSettings)localObject3);
        contextMenu = ((Map)localObject2);
        localObject1 = new ArrayList();
        if (localObject4 != null)
        {
          localObject4 = ((List)localObject4).iterator();
          while (((Iterator)localObject4).hasNext()) {
            ((ArrayList)localObject1).add(UserScript.fromMap((Map)((Iterator)localObject4).next()));
          }
        }
        webView.userContentController.addUserOnlyScripts((List)localObject1);
        actionBar = getSupportActionBar();
        prepareView();
        if (windowId.intValue() != -1)
        {
          paramBundle = webView.plugin;
          if (paramBundle != null)
          {
            paramBundle = inAppWebViewManager;
            if (paramBundle != null)
            {
              paramBundle = (Message)windowWebViewMessages.get(windowId);
              if (paramBundle != null)
              {
                ((WebView.WebViewTransport)obj).setWebView(webView);
                paramBundle.sendToTarget();
              }
            }
          }
        }
        else
        {
          localObject4 = paramBundle.getString("initialFile");
          localObject2 = (Map)paramBundle.getSerializable("initialUrlRequest");
          localObject1 = paramBundle.getString("initialData");
          if (localObject4 != null)
          {
            try
            {
              webView.loadFile((String)localObject4);
            }
            catch (IOException localIOException)
            {
              paramBundle = new StringBuilder();
              paramBundle.append((String)localObject4);
              paramBundle.append(" asset file cannot be found!");
              Log.e("InAppBrowserActivity", paramBundle.toString(), localIOException);
              return;
            }
          }
          else if (localIOException != null)
          {
            localObject4 = paramBundle.getString("initialMimeType");
            localObject3 = paramBundle.getString("initialEncoding");
            localObject2 = paramBundle.getString("initialBaseUrl");
            paramBundle = paramBundle.getString("initialHistoryUrl");
            webView.loadDataWithBaseURL((String)localObject2, localIOException, (String)localObject4, (String)localObject3, paramBundle);
          }
          else if (localObject2 != null)
          {
            paramBundle = URLRequest.fromMap((Map)localObject2);
            if (paramBundle != null) {
              webView.loadUrl(paramBundle);
            }
          }
        }
        paramBundle = channelDelegate;
        if (paramBundle != null) {
          paramBundle.onBrowserCreated();
        }
      }
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    menu = paramMenu;
    final Object localObject1 = actionBar;
    Object localObject2 = "";
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = customSettings.toolbarTopFixedTitle;
      if ((localObject1 == null) || (((String)localObject1).isEmpty()))
      {
        localObject3 = actionBar;
        localObject1 = webView;
        if (localObject1 != null) {
          localObject1 = ((WebView)localObject1).getTitle();
        } else {
          localObject1 = "";
        }
        ((a)localObject3).r((CharSequence)localObject1);
      }
    }
    localObject1 = menu;
    if (localObject1 == null) {
      return super.onCreateOptionsMenu(paramMenu);
    }
    if ((localObject1 instanceof androidx.appcompat.view.menu.f)) {
      s = true;
    }
    getMenuInflater().inflate(R.menu.menu_main, menu);
    paramMenu = menu.findItem(R.id.menu_search);
    if (paramMenu != null)
    {
      if (customSettings.hideUrlBar.booleanValue()) {
        paramMenu.setVisible(false);
      }
      paramMenu = (SearchView)paramMenu.getActionView();
      searchView = paramMenu;
      if (paramMenu != null)
      {
        paramMenu.setFocusable(true);
        localObject1 = searchView;
        localObject3 = webView;
        paramMenu = (Menu)localObject2;
        if (localObject3 != null) {
          paramMenu = ((WebView)localObject3).getUrl();
        }
        ((SearchView)localObject1).setQuery(paramMenu, false);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener()
        {
          public boolean onQueryTextChange(String paramAnonymousString)
          {
            return false;
          }
          
          public boolean onQueryTextSubmit(String paramAnonymousString)
          {
            if (!paramAnonymousString.isEmpty())
            {
              InAppWebView localInAppWebView = webView;
              if (localInAppWebView != null) {
                localInAppWebView.loadUrl(paramAnonymousString);
              }
              paramAnonymousString = searchView;
              if (paramAnonymousString != null)
              {
                paramAnonymousString.setQuery("", false);
                searchView.setIconified(true);
              }
              return true;
            }
            return false;
          }
        });
        searchView.setOnCloseListener(new SearchView.OnCloseListener()
        {
          public boolean onClose()
          {
            Object localObject = searchView;
            if ((localObject != null) && (((SearchView)localObject).getQuery().toString().isEmpty()))
            {
              localObject = InAppBrowserActivity.this;
              SearchView localSearchView = searchView;
              localObject = webView;
              if (localObject != null) {
                localObject = ((WebView)localObject).getUrl();
              } else {
                localObject = "";
              }
              localSearchView.setQuery((CharSequence)localObject, false);
            }
            return false;
          }
        });
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener()
        {
          public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
          {
            if (!paramAnonymousBoolean)
            {
              paramAnonymousView = searchView;
              if (paramAnonymousView != null)
              {
                paramAnonymousView.setQuery("", false);
                searchView.setIconified(true);
              }
            }
          }
        });
      }
    }
    if (customSettings.hideDefaultMenuItems.booleanValue())
    {
      paramMenu = menu.findItem(R.id.action_close);
      if (paramMenu != null) {
        paramMenu.setVisible(false);
      }
      paramMenu = menu.findItem(R.id.action_go_back);
      if (paramMenu != null) {
        paramMenu.setVisible(false);
      }
      paramMenu = menu.findItem(R.id.action_reload);
      if (paramMenu != null) {
        paramMenu.setVisible(false);
      }
      paramMenu = menu.findItem(R.id.action_go_forward);
      if (paramMenu != null) {
        paramMenu.setVisible(false);
      }
      paramMenu = menu.findItem(R.id.action_share);
      if (paramMenu != null) {
        paramMenu.setVisible(false);
      }
    }
    localObject2 = menuItems.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (InAppBrowserMenuItem)((Iterator)localObject2).next();
      int i;
      if (((InAppBrowserMenuItem)localObject1).getOrder() != null) {
        i = ((InAppBrowserMenuItem)localObject1).getOrder().intValue();
      } else {
        i = 0;
      }
      paramMenu = menu.add(0, ((InAppBrowserMenuItem)localObject1).getId(), i, ((InAppBrowserMenuItem)localObject1).getTitle());
      if (((InAppBrowserMenuItem)localObject1).isShowAsAction()) {
        paramMenu.setShowAsAction(2);
      }
      localObject3 = ((InAppBrowserMenuItem)localObject1).getIcon();
      if (localObject3 != null)
      {
        if ((localObject3 instanceof AndroidResource)) {
          paramMenu.setIcon(((AndroidResource)localObject3).getIdentifier(this));
        } else {
          paramMenu.setIcon(Util.drawableFromBytes(this, (byte[])localObject3));
        }
        localObject3 = ((InAppBrowserMenuItem)localObject1).getIconColor();
        if ((localObject3 != null) && (!((String)localObject3).isEmpty())) {
          paramMenu.getIcon().setTint(Color.parseColor((String)localObject3));
        }
      }
      paramMenu.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
      {
        public boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          paramAnonymousMenuItem = this$0.channelDelegate;
          if (paramAnonymousMenuItem != null) {
            paramAnonymousMenuItem.onMenuItemClicked(localObject1);
          }
          return true;
        }
      });
    }
    return true;
  }
  
  public void onDestroy()
  {
    dispose();
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (customSettings.shouldCloseOnBackButtonPressed.booleanValue())
      {
        close(null);
        return true;
      }
      if (customSettings.allowGoBackWithBackButton.booleanValue())
      {
        if (canGoBack()) {
          goBack();
        } else if (customSettings.closeOnCannotGoBack.booleanValue()) {
          close(null);
        }
        return true;
      }
      if (!customSettings.shouldCloseOnBackButtonPressed.booleanValue()) {
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void reload()
  {
    InAppWebView localInAppWebView = webView;
    if (localInAppWebView != null) {
      localInAppWebView.reload();
    }
  }
  
  public void reloadButtonClicked(MenuItem paramMenuItem)
  {
    reload();
  }
  
  public void setSettings(InAppBrowserSettings paramInAppBrowserSettings, HashMap<String, Object> paramHashMap)
  {
    Object localObject1 = new InAppWebViewSettings();
    ((InAppWebViewSettings)localObject1).parse(paramHashMap);
    Object localObject2 = webView;
    if (localObject2 != null) {
      ((InAppWebView)localObject2).setSettings((InAppWebViewSettings)localObject1, paramHashMap);
    }
    if (paramHashMap.get("hidden") != null)
    {
      localObject1 = customSettings.hidden;
      localObject2 = hidden;
      if (localObject1 != localObject2) {
        if (((Boolean)localObject2).booleanValue()) {
          hide();
        } else {
          show();
        }
      }
    }
    if (paramHashMap.get("hideProgressBar") != null)
    {
      localObject1 = customSettings.hideProgressBar;
      localObject2 = hideProgressBar;
      if ((localObject1 != localObject2) && (progressBar != null))
      {
        int i;
        if (((Boolean)localObject2).booleanValue())
        {
          localObject1 = progressBar;
          i = 0;
        }
        else
        {
          localObject1 = progressBar;
          i = 100;
        }
        ((ProgressBar)localObject1).setMax(i);
      }
    }
    if ((actionBar != null) && (paramHashMap.get("hideTitleBar") != null))
    {
      localObject2 = customSettings.hideTitleBar;
      localObject1 = hideTitleBar;
      if (localObject2 != localObject1) {
        actionBar.p(((Boolean)localObject1).booleanValue() ^ true);
      }
    }
    if ((actionBar != null) && (paramHashMap.get("hideToolbarTop") != null))
    {
      localObject1 = customSettings.hideToolbarTop;
      localObject2 = hideToolbarTop;
      if (localObject1 != localObject2) {
        if (((Boolean)localObject2).booleanValue()) {
          actionBar.f();
        } else {
          actionBar.t();
        }
      }
    }
    if ((actionBar != null) && (paramHashMap.get("toolbarTopBackgroundColor") != null) && (!Util.objEquals(customSettings.toolbarTopBackgroundColor, toolbarTopBackgroundColor)))
    {
      localObject1 = toolbarTopBackgroundColor;
      if ((localObject1 != null) && (!((String)localObject1).isEmpty())) {
        actionBar.n(new ColorDrawable(Color.parseColor(toolbarTopBackgroundColor)));
      }
    }
    if ((actionBar != null) && (paramHashMap.get("toolbarTopFixedTitle") != null) && (!Util.objEquals(customSettings.toolbarTopFixedTitle, toolbarTopFixedTitle)))
    {
      localObject1 = toolbarTopFixedTitle;
      if ((localObject1 != null) && (!((String)localObject1).isEmpty())) {
        actionBar.r(toolbarTopFixedTitle);
      }
    }
    if ((menu != null) && (paramHashMap.get("hideUrlBar") != null) && (customSettings.hideUrlBar != hideUrlBar))
    {
      localObject1 = menu.findItem(R.id.menu_search);
      if (localObject1 != null) {
        ((MenuItem)localObject1).setVisible(hideUrlBar.booleanValue() ^ true);
      }
    }
    if ((menu != null) && (paramHashMap.get("hideDefaultMenuItems") != null) && (customSettings.hideDefaultMenuItems != hideDefaultMenuItems))
    {
      paramHashMap = menu.findItem(R.id.action_close);
      if (paramHashMap != null) {
        paramHashMap.setVisible(hideDefaultMenuItems.booleanValue() ^ true);
      }
      paramHashMap = menu.findItem(R.id.action_go_back);
      if (paramHashMap != null) {
        paramHashMap.setVisible(hideDefaultMenuItems.booleanValue() ^ true);
      }
      paramHashMap = menu.findItem(R.id.action_reload);
      if (paramHashMap != null) {
        paramHashMap.setVisible(hideDefaultMenuItems.booleanValue() ^ true);
      }
      paramHashMap = menu.findItem(R.id.action_go_forward);
      if (paramHashMap != null) {
        paramHashMap.setVisible(hideDefaultMenuItems.booleanValue() ^ true);
      }
      paramHashMap = menu.findItem(R.id.action_share);
      if (paramHashMap != null) {
        paramHashMap.setVisible(hideDefaultMenuItems.booleanValue() ^ true);
      }
    }
    customSettings = paramInAppBrowserSettings;
  }
  
  public void shareButtonClicked(MenuItem paramMenuItem)
  {
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.setType("text/plain");
    paramMenuItem = webView;
    if (paramMenuItem != null) {
      paramMenuItem = paramMenuItem.getUrl();
    } else {
      paramMenuItem = "";
    }
    localIntent.putExtra("android.intent.extra.TEXT", paramMenuItem);
    startActivity(Intent.createChooser(localIntent, "Share"));
  }
  
  public void show()
  {
    isHidden = false;
    Intent localIntent = new Intent(this, InAppBrowserActivity.class);
    localIntent.setFlags(131072);
    startActivityIfNeeded(localIntent, 0);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */