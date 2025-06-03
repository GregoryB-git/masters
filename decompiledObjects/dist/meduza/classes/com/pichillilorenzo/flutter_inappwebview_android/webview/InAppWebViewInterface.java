package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebView.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.HashMap;
import java.util.Map;

public abstract interface InAppWebViewInterface
{
  public abstract void addWebMessageListener(WebMessageListener paramWebMessageListener);
  
  public abstract void callAsyncJavaScript(String paramString, Map<String, Object> paramMap, ContentWorld paramContentWorld, ValueCallback<String> paramValueCallback);
  
  public abstract boolean canGoBack();
  
  public abstract boolean canGoBackOrForward(int paramInt);
  
  public abstract boolean canGoForward();
  
  public abstract boolean canScrollHorizontally();
  
  public abstract boolean canScrollVertically();
  
  public abstract void clearAllCache();
  
  public abstract void clearFocus();
  
  public abstract void clearHistory();
  
  public abstract void clearMatches();
  
  public abstract void clearSslPreferences();
  
  public abstract WebMessageChannel createCompatWebMessageChannel();
  
  public abstract WebMessageChannel createWebMessageChannel(ValueCallback<WebMessageChannel> paramValueCallback);
  
  public abstract void disposeWebMessageChannels();
  
  public abstract void disposeWebMessageListeners();
  
  public abstract void evaluateJavascript(String paramString, ContentWorld paramContentWorld, ValueCallback<String> paramValueCallback);
  
  public abstract void findAllAsync(String paramString);
  
  public abstract void findNext(boolean paramBoolean);
  
  public abstract SslCertificate getCertificate();
  
  public abstract WebViewChannelDelegate getChannelDelegate();
  
  public abstract int getContentHeight();
  
  public abstract void getContentHeight(ValueCallback<Integer> paramValueCallback);
  
  public abstract void getContentWidth(ValueCallback<Integer> paramValueCallback);
  
  public abstract Context getContext();
  
  public abstract Map<String, Object> getContextMenu();
  
  public abstract HashMap<String, Object> getCopyBackForwardList();
  
  public abstract Map<String, Object> getCustomSettings();
  
  public abstract WebView.HitTestResult getHitTestResult();
  
  public abstract void getHitTestResult(ValueCallback<HitTestResult> paramValueCallback);
  
  public abstract InAppBrowserDelegate getInAppBrowserDelegate();
  
  public abstract String getOriginalUrl();
  
  public abstract InAppWebViewFlutterPlugin getPlugin();
  
  public abstract int getProgress();
  
  public abstract int getScrollX();
  
  public abstract int getScrollY();
  
  public abstract void getSelectedText(ValueCallback<String> paramValueCallback);
  
  public abstract String getTitle();
  
  public abstract String getUrl();
  
  public abstract UserContentController getUserContentController();
  
  public abstract Map<String, WebMessageChannel> getWebMessageChannels();
  
  public abstract Looper getWebViewLooper();
  
  public abstract float getZoomScale();
  
  public abstract void getZoomScale(ValueCallback<Float> paramValueCallback);
  
  public abstract void goBack();
  
  public abstract void goBackOrForward(int paramInt);
  
  public abstract void goForward();
  
  public abstract void injectCSSCode(String paramString);
  
  public abstract void injectCSSFileFromUrl(String paramString, Map<String, Object> paramMap);
  
  public abstract void injectJavascriptFileFromUrl(String paramString, Map<String, Object> paramMap);
  
  public abstract boolean isInFullscreen();
  
  public abstract boolean isLoading();
  
  public abstract void isSecureContext(ValueCallback<Boolean> paramValueCallback);
  
  public abstract void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);
  
  public abstract void loadFile(String paramString);
  
  public abstract void loadUrl(URLRequest paramURLRequest);
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract boolean pageDown(boolean paramBoolean);
  
  public abstract boolean pageUp(boolean paramBoolean);
  
  public abstract void pauseTimers();
  
  public abstract void postUrl(String paramString, byte[] paramArrayOfByte);
  
  public abstract void postWebMessage(android.webkit.WebMessage paramWebMessage, Uri paramUri);
  
  public abstract void postWebMessage(com.pichillilorenzo.flutter_inappwebview_android.types.WebMessage paramWebMessage, Uri paramUri, ValueCallback<String> paramValueCallback);
  
  public abstract String printCurrentPage(PrintJobSettings paramPrintJobSettings);
  
  public abstract void reload();
  
  public abstract Map<String, Object> requestFocusNodeHref();
  
  public abstract Map<String, Object> requestImageRef();
  
  public abstract void resumeTimers();
  
  public abstract void saveWebArchive(String paramString, boolean paramBoolean, ValueCallback<String> paramValueCallback);
  
  public abstract void scrollBy(Integer paramInteger1, Integer paramInteger2, Boolean paramBoolean);
  
  public abstract void scrollTo(Integer paramInteger1, Integer paramInteger2, Boolean paramBoolean);
  
  public abstract void setChannelDelegate(WebViewChannelDelegate paramWebViewChannelDelegate);
  
  public abstract void setContextMenu(Map<String, Object> paramMap);
  
  public abstract void setInAppBrowserDelegate(InAppBrowserDelegate paramInAppBrowserDelegate);
  
  public abstract void setInFullscreen(boolean paramBoolean);
  
  public abstract void setPlugin(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin);
  
  public abstract void setSettings(InAppWebViewSettings paramInAppWebViewSettings, HashMap<String, Object> paramHashMap);
  
  public abstract void setUserContentController(UserContentController paramUserContentController);
  
  public abstract void setWebMessageChannels(Map<String, WebMessageChannel> paramMap);
  
  public abstract void stopLoading();
  
  public abstract void takeScreenshot(Map<String, Object> paramMap, MethodChannel.Result paramResult);
  
  public abstract void zoomBy(float paramFloat);
  
  public abstract boolean zoomIn();
  
  public abstract boolean zoomOut();
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */