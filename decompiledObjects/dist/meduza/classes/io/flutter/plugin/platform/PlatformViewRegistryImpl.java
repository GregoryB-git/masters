package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

class PlatformViewRegistryImpl
  implements PlatformViewRegistry
{
  private final Map<String, PlatformViewFactory> viewFactories = new HashMap();
  
  public PlatformViewFactory getFactory(String paramString)
  {
    return (PlatformViewFactory)viewFactories.get(paramString);
  }
  
  public boolean registerViewFactory(String paramString, PlatformViewFactory paramPlatformViewFactory)
  {
    if (viewFactories.containsKey(paramString)) {
      return false;
    }
    viewFactories.put(paramString, paramPlatformViewFactory);
    return true;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.PlatformViewRegistryImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */