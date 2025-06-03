package com.pichillilorenzo.flutter_inappwebview_android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeSafariBrowserManager;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabaseHandler;
import com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserManager;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobManager;
import com.pichillilorenzo.flutter_inappwebview_android.process_global_config.ProcessGlobalConfigManager;
import com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager;
import com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerManager;
import com.pichillilorenzo.flutter_inappwebview_android.tracing.TracingControllerManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.FlutterWebViewFactory;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformViewRegistry;

public class InAppWebViewFlutterPlugin
  implements FlutterPlugin, ActivityAware
{
  public static final String LOG_TAG = "InAppWebViewFlutterPL";
  public Activity activity;
  public ActivityPluginBinding activityPluginBinding;
  public Context applicationContext;
  public ChromeSafariBrowserManager chromeSafariBrowserManager;
  public CredentialDatabaseHandler credentialDatabaseHandler;
  public FlutterPlugin.FlutterAssets flutterAssets;
  public FlutterView flutterView;
  public FlutterWebViewFactory flutterWebViewFactory;
  public HeadlessInAppWebViewManager headlessInAppWebViewManager;
  public InAppBrowserManager inAppBrowserManager;
  public InAppWebViewManager inAppWebViewManager;
  public BinaryMessenger messenger;
  public MyCookieManager myCookieManager;
  public MyWebStorage myWebStorage;
  public NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks;
  public PlatformUtil platformUtil;
  public PrintJobManager printJobManager;
  public ProcessGlobalConfigManager processGlobalConfigManager;
  public ProxyManager proxyManager;
  public ServiceWorkerManager serviceWorkerManager;
  public TracingControllerManager tracingControllerManager;
  public WebViewFeatureManager webViewFeatureManager;
  
  private void onAttachedToEngine(Context paramContext, BinaryMessenger paramBinaryMessenger, Activity paramActivity, PlatformViewRegistry paramPlatformViewRegistry, FlutterView paramFlutterView)
  {
    applicationContext = paramContext;
    activity = paramActivity;
    messenger = paramBinaryMessenger;
    flutterView = paramFlutterView;
    inAppBrowserManager = new InAppBrowserManager(this);
    headlessInAppWebViewManager = new HeadlessInAppWebViewManager(this);
    chromeSafariBrowserManager = new ChromeSafariBrowserManager(this);
    noHistoryCustomTabsActivityCallbacks = new NoHistoryCustomTabsActivityCallbacks(this);
    paramContext = new FlutterWebViewFactory(this);
    flutterWebViewFactory = paramContext;
    paramPlatformViewRegistry.registerViewFactory("com.pichillilorenzo/flutter_inappwebview", paramContext);
    platformUtil = new PlatformUtil(this);
    inAppWebViewManager = new InAppWebViewManager(this);
    myCookieManager = new MyCookieManager(this);
    myWebStorage = new MyWebStorage(this);
    int i = Build.VERSION.SDK_INT;
    if (i >= 24) {
      serviceWorkerManager = new ServiceWorkerManager(this);
    }
    if (i >= 26) {
      credentialDatabaseHandler = new CredentialDatabaseHandler(this);
    }
    webViewFeatureManager = new WebViewFeatureManager(this);
    proxyManager = new ProxyManager(this);
    printJobManager = new PrintJobManager(this);
    tracingControllerManager = new TracingControllerManager(this);
    processGlobalConfigManager = new ProcessGlobalConfigManager(this);
  }
  
  public void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    activityPluginBinding = paramActivityPluginBinding;
    paramActivityPluginBinding = paramActivityPluginBinding.getActivity();
    activity = paramActivityPluginBinding;
    if (noHistoryCustomTabsActivityCallbacks != null) {
      paramActivityPluginBinding.getApplication().registerActivityLifecycleCallbacks(noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
    }
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    flutterAssets = paramFlutterPluginBinding.getFlutterAssets();
    onAttachedToEngine(paramFlutterPluginBinding.getApplicationContext(), paramFlutterPluginBinding.getBinaryMessenger(), activity, paramFlutterPluginBinding.getPlatformViewRegistry(), null);
  }
  
  public void onDetachedFromActivity()
  {
    Activity localActivity = activity;
    if ((localActivity != null) && (noHistoryCustomTabsActivityCallbacks != null)) {
      localActivity.getApplication().unregisterActivityLifecycleCallbacks(noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
    }
    activityPluginBinding = null;
    activity = null;
  }
  
  public void onDetachedFromActivityForConfigChanges()
  {
    Activity localActivity = activity;
    if ((localActivity != null) && (noHistoryCustomTabsActivityCallbacks != null)) {
      localActivity.getApplication().unregisterActivityLifecycleCallbacks(noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
    }
    activityPluginBinding = null;
    activity = null;
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    paramFlutterPluginBinding = platformUtil;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.dispose();
      platformUtil = null;
    }
    paramFlutterPluginBinding = inAppBrowserManager;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.dispose();
      inAppBrowserManager = null;
    }
    paramFlutterPluginBinding = headlessInAppWebViewManager;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.dispose();
      headlessInAppWebViewManager = null;
    }
    paramFlutterPluginBinding = chromeSafariBrowserManager;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.dispose();
      chromeSafariBrowserManager = null;
    }
    paramFlutterPluginBinding = noHistoryCustomTabsActivityCallbacks;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.dispose();
      noHistoryCustomTabsActivityCallbacks = null;
    }
    paramFlutterPluginBinding = myCookieManager;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.dispose();
      myCookieManager = null;
    }
    paramFlutterPluginBinding = myWebStorage;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.dispose();
      myWebStorage = null;
    }
    paramFlutterPluginBinding = credentialDatabaseHandler;
    if ((paramFlutterPluginBinding != null) && (Build.VERSION.SDK_INT >= 26))
    {
      paramFlutterPluginBinding.dispose();
      credentialDatabaseHandler = null;
    }
    paramFlutterPluginBinding = inAppWebViewManager;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.dispose();
      inAppWebViewManager = null;
    }
    paramFlutterPluginBinding = serviceWorkerManager;
    if ((paramFlutterPluginBinding != null) && (Build.VERSION.SDK_INT >= 24))
    {
      paramFlutterPluginBinding.dispose();
      serviceWorkerManager = null;
    }
    paramFlutterPluginBinding = webViewFeatureManager;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.dispose();
      webViewFeatureManager = null;
    }
    paramFlutterPluginBinding = proxyManager;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.dispose();
      proxyManager = null;
    }
    paramFlutterPluginBinding = printJobManager;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.dispose();
      printJobManager = null;
    }
    paramFlutterPluginBinding = tracingControllerManager;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.dispose();
      tracingControllerManager = null;
    }
    paramFlutterPluginBinding = processGlobalConfigManager;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.dispose();
      processGlobalConfigManager = null;
    }
  }
  
  public void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    activityPluginBinding = paramActivityPluginBinding;
    paramActivityPluginBinding = paramActivityPluginBinding.getActivity();
    activity = paramActivityPluginBinding;
    if (noHistoryCustomTabsActivityCallbacks != null) {
      paramActivityPluginBinding.getApplication().registerActivityLifecycleCallbacks(noHistoryCustomTabsActivityCallbacks.activityLifecycleCallbacks);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */