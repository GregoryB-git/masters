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
import x.a;

public class WebViewActivity
  extends Activity
{
  public final BroadcastReceiver o = new a();
  public final WebViewClient p = new b();
  public WebView q;
  public final IntentFilter r = new IntentFilter("close action");
  
  public static Intent a(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle)
  {
    return new Intent(paramContext, WebViewActivity.class).putExtra("url", paramString).putExtra("enableJavaScript", paramBoolean1).putExtra("enableDomStorage", paramBoolean2).putExtra("com.android.browser.headers", paramBundle);
  }
  
  public static Map b(Bundle paramBundle)
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
    q = paramBundle;
    setContentView(paramBundle);
    Object localObject = getIntent();
    paramBundle = ((Intent)localObject).getStringExtra("url");
    boolean bool1 = ((Intent)localObject).getBooleanExtra("enableJavaScript", false);
    boolean bool2 = ((Intent)localObject).getBooleanExtra("enableDomStorage", false);
    localObject = b(((Intent)localObject).getBundleExtra("com.android.browser.headers"));
    q.loadUrl(paramBundle, (Map)localObject);
    q.getSettings().setJavaScriptEnabled(bool1);
    q.getSettings().setDomStorageEnabled(bool2);
    q.setWebViewClient(p);
    q.getSettings().setSupportMultipleWindows(true);
    q.setWebChromeClient(new c());
    a.h(this, o, r, 2);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    unregisterReceiver(o);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (q.canGoBack()))
    {
      q.goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public class a
    extends BroadcastReceiver
  {
    public a() {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if ("close action".equals(paramIntent.getAction())) {
        finish();
      }
    }
  }
  
  public class b
    extends WebViewClient
  {
    public b() {}
    
    public boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
    {
      paramWebView.loadUrl(paramWebResourceRequest.getUrl().toString());
      return false;
    }
    
    public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
    {
      return super.shouldOverrideUrlLoading(paramWebView, paramString);
    }
  }
  
  public class c
    extends WebChromeClient
  {
    public c() {}
    
    public boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
    {
      paramWebView = new a();
      WebView localWebView = new WebView(q.getContext());
      localWebView.setWebViewClient(paramWebView);
      ((WebView.WebViewTransport)obj).setWebView(localWebView);
      paramMessage.sendToTarget();
      return true;
    }
    
    public class a
      extends WebViewClient
    {
      public a() {}
      
      public boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
      {
        q.loadUrl(paramWebResourceRequest.getUrl().toString());
        return true;
      }
      
      public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
      {
        q.loadUrl(paramString);
        return true;
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.WebViewActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */