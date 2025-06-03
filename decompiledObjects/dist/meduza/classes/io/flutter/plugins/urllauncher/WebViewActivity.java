package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import v.a;

public class WebViewActivity
  extends Activity
{
  public static final String ACTION_CLOSE = "close action";
  public static final String ENABLE_DOM_EXTRA = "enableDomStorage";
  public static final String ENABLE_JS_EXTRA = "enableJavaScript";
  public static final String URL_EXTRA = "url";
  private final BroadcastReceiver broadcastReceiver = new BroadcastReceiver()
  {
    public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if ("close action".equals(paramAnonymousIntent.getAction())) {
        finish();
      }
    }
  };
  private final IntentFilter closeIntentFilter = new IntentFilter("close action");
  private final WebViewClient webViewClient = new WebViewClient()
  {
    public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, WebResourceRequest paramAnonymousWebResourceRequest)
    {
      paramAnonymousWebView.loadUrl(paramAnonymousWebResourceRequest.getUrl().toString());
      return false;
    }
    
    public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
    {
      return super.shouldOverrideUrlLoading(paramAnonymousWebView, paramAnonymousString);
    }
  };
  public WebView webview;
  
  public static Intent createIntent(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle)
  {
    return new Intent(paramContext, WebViewActivity.class).putExtra("url", paramString).putExtra("enableJavaScript", paramBoolean1).putExtra("enableDomStorage", paramBoolean2).putExtra("com.android.browser.headers", paramBundle);
  }
  
  public static Map<String, String> extractHeaders(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return Collections.emptyMap();
    }
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramBundle.getString(str));
    }
    return localHashMap;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new WebView(this);
    webview = paramBundle;
    setContentView(paramBundle);
    Object localObject = getIntent();
    paramBundle = ((Intent)localObject).getStringExtra("url");
    boolean bool1 = ((Intent)localObject).getBooleanExtra("enableJavaScript", false);
    boolean bool2 = ((Intent)localObject).getBooleanExtra("enableDomStorage", false);
    localObject = extractHeaders(((Intent)localObject).getBundleExtra("com.android.browser.headers"));
    webview.loadUrl(paramBundle, (Map)localObject);
    webview.getSettings().setJavaScriptEnabled(bool1);
    webview.getSettings().setDomStorageEnabled(bool2);
    webview.setWebViewClient(webViewClient);
    webview.getSettings().setSupportMultipleWindows(true);
    webview.setWebChromeClient(new FlutterWebChromeClient());
    a.registerReceiver(this, broadcastReceiver, closeIntentFilter, 2);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    unregisterReceiver(broadcastReceiver);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (webview.canGoBack()))
    {
      webview.goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public class FlutterWebChromeClient
    extends WebChromeClient
  {
    public FlutterWebChromeClient() {}
    
    public boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
    {
      paramWebView = new WebViewClient()
      {
        public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, WebResourceRequest paramAnonymousWebResourceRequest)
        {
          webview.loadUrl(paramAnonymousWebResourceRequest.getUrl().toString());
          return true;
        }
        
        public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
        {
          webview.loadUrl(paramAnonymousString);
          return true;
        }
      };
      WebView localWebView = new WebView(webview.getContext());
      localWebView.setWebViewClient(paramWebView);
      ((WebView.WebViewTransport)obj).setWebView(localWebView);
      paramMessage.sendToTarget();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.WebViewActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */