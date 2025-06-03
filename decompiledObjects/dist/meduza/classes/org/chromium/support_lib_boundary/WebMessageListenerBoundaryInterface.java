package org.chromium.support_lib_boundary;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

public abstract interface WebMessageListenerBoundaryInterface
  extends FeatureFlagHolderBoundaryInterface
{
  public abstract void onPostMessage(WebView paramWebView, InvocationHandler paramInvocationHandler1, Uri paramUri, boolean paramBoolean, InvocationHandler paramInvocationHandler2);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */