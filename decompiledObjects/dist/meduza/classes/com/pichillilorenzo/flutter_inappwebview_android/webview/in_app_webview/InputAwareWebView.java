package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ListPopupWindow;

public class InputAwareWebView
  extends WebView
{
  private static final String LOG_TAG = "InputAwareWebView";
  public View containerView;
  private ThreadedInputConnectionProxyAdapterView proxyAdapterView;
  private View threadedInputConnectionProxyView;
  private boolean useHybridComposition;
  
  public InputAwareWebView(Context paramContext)
  {
    super(paramContext);
    useHybridComposition = false;
    containerView = null;
  }
  
  public InputAwareWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    useHybridComposition = false;
    containerView = null;
  }
  
  public InputAwareWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    useHybridComposition = false;
    containerView = null;
  }
  
  public InputAwareWebView(Context paramContext, View paramView, Boolean paramBoolean)
  {
    super(paramContext);
    boolean bool = false;
    useHybridComposition = false;
    containerView = paramView;
    if (paramBoolean != null) {
      bool = paramBoolean.booleanValue();
    }
    useHybridComposition = bool;
  }
  
  private boolean isCalledFromListPopupWindowShow()
  {
    for (StackTraceElement localStackTraceElement : Thread.currentThread().getStackTrace()) {
      if ((localStackTraceElement.getClassName().equals(ListPopupWindow.class.getCanonicalName())) && (localStackTraceElement.getMethodName().equals("show"))) {
        return true;
      }
    }
    return false;
  }
  
  private void resetInputConnection()
  {
    if (proxyAdapterView == null) {
      return;
    }
    View localView = containerView;
    if (localView == null)
    {
      Log.e("InputAwareWebView", "Can't reset the input connection to the container view because there is none.");
      return;
    }
    setInputConnectionTarget(localView);
  }
  
  private void setInputConnectionTarget(final View paramView)
  {
    if (containerView == null)
    {
      Log.e("InputAwareWebView", "Can't set the input connection target because there is no containerView to use as a handler.");
      return;
    }
    paramView.requestFocus();
    containerView.post(new Runnable()
    {
      public void run()
      {
        Object localObject = this$0;
        if (containerView == null)
        {
          Log.e("InputAwareWebView", "Can't set the input connection target because there is no containerView to use as a handler.");
          return;
        }
        localObject = (InputMethodManager)((View)localObject).getContext().getSystemService("input_method");
        paramView.onWindowFocusChanged(true);
        if (Build.VERSION.SDK_INT < 29) {
          ((InputMethodManager)localObject).isActive(this$0.containerView);
        }
      }
    });
  }
  
  public boolean checkInputConnectionProxy(View paramView)
  {
    if (useHybridComposition) {
      return super.checkInputConnectionProxy(paramView);
    }
    Object localObject = threadedInputConnectionProxyView;
    threadedInputConnectionProxyView = paramView;
    if (localObject == paramView) {
      return super.checkInputConnectionProxy(paramView);
    }
    localObject = containerView;
    if (localObject == null) {
      Log.e("InputAwareWebView", "Can't create a proxy view because there's no container view. Text input may not work.");
    }
    for (;;)
    {
      return super.checkInputConnectionProxy(paramView);
      localObject = new ThreadedInputConnectionProxyAdapterView((View)localObject, paramView, paramView.getHandler());
      proxyAdapterView = ((ThreadedInputConnectionProxyAdapterView)localObject);
      setInputConnectionTarget((View)localObject);
    }
  }
  
  public void clearFocus()
  {
    super.clearFocus();
    if (useHybridComposition) {
      return;
    }
    resetInputConnection();
  }
  
  public void dispose()
  {
    if (useHybridComposition) {
      return;
    }
    resetInputConnection();
  }
  
  public void lockInputConnection()
  {
    ThreadedInputConnectionProxyAdapterView localThreadedInputConnectionProxyAdapterView = proxyAdapterView;
    if (localThreadedInputConnectionProxyAdapterView == null) {
      return;
    }
    localThreadedInputConnectionProxyAdapterView.setLocked(true);
  }
  
  public void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    if (useHybridComposition)
    {
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
      return;
    }
    if ((Build.VERSION.SDK_INT < 28) && (isCalledFromListPopupWindowShow()) && (!paramBoolean)) {
      return;
    }
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
  }
  
  public void setContainerView(View paramView)
  {
    containerView = paramView;
    if (proxyAdapterView == null) {
      return;
    }
    Log.w("InputAwareWebView", "The containerView has changed while the proxyAdapterView exists.");
    if (paramView != null) {
      setInputConnectionTarget(proxyAdapterView);
    }
  }
  
  public void unlockInputConnection()
  {
    ThreadedInputConnectionProxyAdapterView localThreadedInputConnectionProxyAdapterView = proxyAdapterView;
    if (localThreadedInputConnectionProxyAdapterView == null) {
      return;
    }
    localThreadedInputConnectionProxyAdapterView.setLocked(false);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InputAwareWebView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */