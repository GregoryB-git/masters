package org.chromium.support_lib_boundary;

import android.app.PendingIntent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

public abstract interface WebViewClientBoundaryInterface
  extends FeatureFlagHolderBoundaryInterface
{
  public abstract void onPageCommitVisible(WebView paramWebView, String paramString);
  
  public abstract void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, InvocationHandler paramInvocationHandler);
  
  public abstract void onReceivedHttpError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceResponse paramWebResourceResponse);
  
  public abstract void onSafeBrowsingHit(WebView paramWebView, WebResourceRequest paramWebResourceRequest, int paramInt, InvocationHandler paramInvocationHandler);
  
  public abstract boolean onWebAuthnIntent(WebView paramWebView, PendingIntent paramPendingIntent, InvocationHandler paramInvocationHandler);
  
  public abstract boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */