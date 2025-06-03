package io.flutter.plugins.urllauncher;

import java.util.Map;

public final class Messages$WebViewOptions$Builder
{
  private Boolean enableDomStorage;
  private Boolean enableJavaScript;
  private Map<String, String> headers;
  
  public Messages.WebViewOptions build()
  {
    Messages.WebViewOptions localWebViewOptions = new Messages.WebViewOptions();
    localWebViewOptions.setEnableJavaScript(enableJavaScript);
    localWebViewOptions.setEnableDomStorage(enableDomStorage);
    localWebViewOptions.setHeaders(headers);
    return localWebViewOptions;
  }
  
  public Builder setEnableDomStorage(Boolean paramBoolean)
  {
    enableDomStorage = paramBoolean;
    return this;
  }
  
  public Builder setEnableJavaScript(Boolean paramBoolean)
  {
    enableJavaScript = paramBoolean;
    return this;
  }
  
  public Builder setHeaders(Map<String, String> paramMap)
  {
    headers = paramMap;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.Messages.WebViewOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */