package org.chromium.support_lib_boundary;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

public abstract interface WebViewRendererClientBoundaryInterface
  extends FeatureFlagHolderBoundaryInterface
{
  public abstract void onRendererResponsive(WebView paramWebView, InvocationHandler paramInvocationHandler);
  
  public abstract void onRendererUnresponsive(WebView paramWebView, InvocationHandler paramInvocationHandler);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */