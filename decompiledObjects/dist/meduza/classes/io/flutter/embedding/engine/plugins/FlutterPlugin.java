package io.flutter.embedding.engine.plugins;

import android.content.Context;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineGroup;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.view.TextureRegistry;

public abstract interface FlutterPlugin
{
  public abstract void onAttachedToEngine(FlutterPluginBinding paramFlutterPluginBinding);
  
  public abstract void onDetachedFromEngine(FlutterPluginBinding paramFlutterPluginBinding);
  
  public static abstract interface FlutterAssets
  {
    public abstract String getAssetFilePathByName(String paramString);
    
    public abstract String getAssetFilePathByName(String paramString1, String paramString2);
    
    public abstract String getAssetFilePathBySubpath(String paramString);
    
    public abstract String getAssetFilePathBySubpath(String paramString1, String paramString2);
  }
  
  public static class FlutterPluginBinding
  {
    private final Context applicationContext;
    private final BinaryMessenger binaryMessenger;
    private final FlutterPlugin.FlutterAssets flutterAssets;
    private final FlutterEngine flutterEngine;
    private final FlutterEngineGroup group;
    private final PlatformViewRegistry platformViewRegistry;
    private final TextureRegistry textureRegistry;
    
    public FlutterPluginBinding(Context paramContext, FlutterEngine paramFlutterEngine, BinaryMessenger paramBinaryMessenger, TextureRegistry paramTextureRegistry, PlatformViewRegistry paramPlatformViewRegistry, FlutterPlugin.FlutterAssets paramFlutterAssets, FlutterEngineGroup paramFlutterEngineGroup)
    {
      applicationContext = paramContext;
      flutterEngine = paramFlutterEngine;
      binaryMessenger = paramBinaryMessenger;
      textureRegistry = paramTextureRegistry;
      platformViewRegistry = paramPlatformViewRegistry;
      flutterAssets = paramFlutterAssets;
      group = paramFlutterEngineGroup;
    }
    
    public Context getApplicationContext()
    {
      return applicationContext;
    }
    
    public BinaryMessenger getBinaryMessenger()
    {
      return binaryMessenger;
    }
    
    public FlutterEngineGroup getEngineGroup()
    {
      return group;
    }
    
    public FlutterPlugin.FlutterAssets getFlutterAssets()
    {
      return flutterAssets;
    }
    
    @Deprecated
    public FlutterEngine getFlutterEngine()
    {
      return flutterEngine;
    }
    
    public PlatformViewRegistry getPlatformViewRegistry()
    {
      return platformViewRegistry;
    }
    
    public TextureRegistry getTextureRegistry()
    {
      return textureRegistry;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.plugins.FlutterPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */