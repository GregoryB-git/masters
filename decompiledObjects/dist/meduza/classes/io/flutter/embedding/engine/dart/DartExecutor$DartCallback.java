package io.flutter.embedding.engine.dart;

import android.content.res.AssetManager;
import f;
import g;
import io.flutter.view.FlutterCallbackInformation;

public class DartExecutor$DartCallback
{
  public final AssetManager androidAssetManager;
  public final FlutterCallbackInformation callbackHandle;
  public final String pathToBundle;
  
  public DartExecutor$DartCallback(AssetManager paramAssetManager, String paramString, FlutterCallbackInformation paramFlutterCallbackInformation)
  {
    androidAssetManager = paramAssetManager;
    pathToBundle = paramString;
    callbackHandle = paramFlutterCallbackInformation;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("DartCallback( bundle path: ");
    localStringBuilder.append(pathToBundle);
    localStringBuilder.append(", library path: ");
    localStringBuilder.append(callbackHandle.callbackLibraryPath);
    localStringBuilder.append(", function: ");
    return g.f(localStringBuilder, callbackHandle.callbackName, " )");
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.DartExecutor.DartCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */