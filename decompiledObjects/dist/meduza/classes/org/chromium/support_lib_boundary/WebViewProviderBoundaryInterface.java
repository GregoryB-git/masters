package org.chromium.support_lib_boundary;

import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;

public abstract interface WebViewProviderBoundaryInterface
{
  public abstract InvocationHandler addDocumentStartJavaScript(String paramString, String[] paramArrayOfString);
  
  public abstract void addWebMessageListener(String paramString, String[] paramArrayOfString, InvocationHandler paramInvocationHandler);
  
  public abstract InvocationHandler[] createWebMessageChannel();
  
  public abstract InvocationHandler getProfile();
  
  public abstract WebChromeClient getWebChromeClient();
  
  public abstract WebViewClient getWebViewClient();
  
  public abstract InvocationHandler getWebViewRenderer();
  
  public abstract InvocationHandler getWebViewRendererClient();
  
  public abstract void insertVisualStateCallback(long paramLong, InvocationHandler paramInvocationHandler);
  
  public abstract boolean isAudioMuted();
  
  public abstract void postMessageToMainFrame(InvocationHandler paramInvocationHandler, Uri paramUri);
  
  public abstract void removeWebMessageListener(String paramString);
  
  public abstract void setAudioMuted(boolean paramBoolean);
  
  public abstract void setProfile(String paramString);
  
  public abstract void setWebViewRendererClient(InvocationHandler paramInvocationHandler);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */