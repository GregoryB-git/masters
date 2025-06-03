package io.flutter.plugins.urllauncher;

import java.util.ArrayList;
import java.util.Map;

public final class Messages$WebViewOptions
{
  private Boolean enableDomStorage;
  private Boolean enableJavaScript;
  private Map<String, String> headers;
  
  public static WebViewOptions fromList(ArrayList<Object> paramArrayList)
  {
    WebViewOptions localWebViewOptions = new WebViewOptions();
    localWebViewOptions.setEnableJavaScript((Boolean)paramArrayList.get(0));
    localWebViewOptions.setEnableDomStorage((Boolean)paramArrayList.get(1));
    localWebViewOptions.setHeaders((Map)paramArrayList.get(2));
    return localWebViewOptions;
  }
  
  public Boolean getEnableDomStorage()
  {
    return enableDomStorage;
  }
  
  public Boolean getEnableJavaScript()
  {
    return enableJavaScript;
  }
  
  public Map<String, String> getHeaders()
  {
    return headers;
  }
  
  public void setEnableDomStorage(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      enableDomStorage = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
  }
  
  public void setEnableJavaScript(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      enableJavaScript = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
  }
  
  public void setHeaders(Map<String, String> paramMap)
  {
    if (paramMap != null)
    {
      headers = paramMap;
      return;
    }
    throw new IllegalStateException("Nonnull field \"headers\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(enableJavaScript);
    localArrayList.add(enableDomStorage);
    localArrayList.add(headers);
    return localArrayList;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.Messages.WebViewOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */