package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import android.app.Activity;
import java.util.List;

public abstract interface InAppBrowserDelegate
{
  public abstract void didChangeProgress(int paramInt);
  
  public abstract void didChangeTitle(String paramString);
  
  public abstract void didFailNavigation(String paramString1, int paramInt, String paramString2);
  
  public abstract void didFinishNavigation(String paramString);
  
  public abstract void didStartNavigation(String paramString);
  
  public abstract void didUpdateVisitedHistory(String paramString);
  
  public abstract Activity getActivity();
  
  public abstract List<ActivityResultListener> getActivityResultListeners();
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */