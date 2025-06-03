package io.flutter.embedding.engine;

import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets;

class FlutterEngineConnectionRegistry$DefaultFlutterAssets
  implements FlutterPlugin.FlutterAssets
{
  public final FlutterLoader flutterLoader;
  
  private FlutterEngineConnectionRegistry$DefaultFlutterAssets(FlutterLoader paramFlutterLoader)
  {
    flutterLoader = paramFlutterLoader;
  }
  
  public String getAssetFilePathByName(String paramString)
  {
    return flutterLoader.getLookupKeyForAsset(paramString);
  }
  
  public String getAssetFilePathByName(String paramString1, String paramString2)
  {
    return flutterLoader.getLookupKeyForAsset(paramString1, paramString2);
  }
  
  public String getAssetFilePathBySubpath(String paramString)
  {
    return flutterLoader.getLookupKeyForAsset(paramString);
  }
  
  public String getAssetFilePathBySubpath(String paramString1, String paramString2)
  {
    return flutterLoader.getLookupKeyForAsset(paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterEngineConnectionRegistry.DefaultFlutterAssets
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */