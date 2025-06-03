package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

final class ThreadedInputConnectionProxyAdapterView
  extends View
{
  private InputConnection cachedConnection;
  public final View containerView;
  public final Handler imeHandler;
  private boolean isLocked = false;
  public final View rootView;
  public final View targetView;
  private boolean triggerDelayed = true;
  public final IBinder windowToken;
  
  public ThreadedInputConnectionProxyAdapterView(View paramView1, View paramView2, Handler paramHandler)
  {
    super(paramView1.getContext());
    imeHandler = paramHandler;
    containerView = paramView1;
    targetView = paramView2;
    windowToken = paramView1.getWindowToken();
    rootView = paramView1.getRootView();
    setFocusable(true);
    setFocusableInTouchMode(true);
    setVisibility(0);
  }
  
  public boolean checkInputConnectionProxy(View paramView)
  {
    return true;
  }
  
  public Handler getHandler()
  {
    return imeHandler;
  }
  
  public View getRootView()
  {
    return rootView;
  }
  
  public IBinder getWindowToken()
  {
    return windowToken;
  }
  
  public boolean hasWindowFocus()
  {
    return true;
  }
  
  public boolean isFocused()
  {
    return true;
  }
  
  public boolean isTriggerDelayed()
  {
    return triggerDelayed;
  }
  
  public boolean onCheckIsTextEditor()
  {
    return true;
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    triggerDelayed = false;
    if (isLocked) {
      paramEditorInfo = cachedConnection;
    } else {
      paramEditorInfo = targetView.onCreateInputConnection(paramEditorInfo);
    }
    triggerDelayed = true;
    cachedConnection = paramEditorInfo;
    return paramEditorInfo;
  }
  
  public void setLocked(boolean paramBoolean)
  {
    isLocked = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.ThreadedInputConnectionProxyAdapterView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */