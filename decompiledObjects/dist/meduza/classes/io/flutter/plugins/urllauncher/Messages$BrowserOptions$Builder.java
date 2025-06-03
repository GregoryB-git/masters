package io.flutter.plugins.urllauncher;

public final class Messages$BrowserOptions$Builder
{
  private Boolean showTitle;
  
  public Messages.BrowserOptions build()
  {
    Messages.BrowserOptions localBrowserOptions = new Messages.BrowserOptions();
    localBrowserOptions.setShowTitle(showTitle);
    return localBrowserOptions;
  }
  
  public Builder setShowTitle(Boolean paramBoolean)
  {
    showTitle = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.Messages.BrowserOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */