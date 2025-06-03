package io.flutter.plugins.urllauncher;

import java.util.Map;

public abstract interface Messages$UrlLauncherApi
{
  public abstract Boolean canLaunchUrl(String paramString);
  
  public abstract void closeWebView();
  
  public abstract Boolean launchUrl(String paramString, Map<String, String> paramMap);
  
  public abstract Boolean openUrlInApp(String paramString, Boolean paramBoolean, Messages.WebViewOptions paramWebViewOptions, Messages.BrowserOptions paramBrowserOptions);
  
  public abstract Boolean supportsCustomTabs();
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */