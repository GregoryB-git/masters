package io.flutter.embedding.engine.dart;

import f;
import g;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.loader.FlutterLoader;

public class DartExecutor$DartEntrypoint
{
  public final String dartEntrypointFunctionName;
  public final String dartEntrypointLibrary;
  public final String pathToBundle;
  
  public DartExecutor$DartEntrypoint(String paramString1, String paramString2)
  {
    pathToBundle = paramString1;
    dartEntrypointLibrary = null;
    dartEntrypointFunctionName = paramString2;
  }
  
  public DartExecutor$DartEntrypoint(String paramString1, String paramString2, String paramString3)
  {
    pathToBundle = paramString1;
    dartEntrypointLibrary = paramString2;
    dartEntrypointFunctionName = paramString3;
  }
  
  public static DartEntrypoint createDefault()
  {
    FlutterLoader localFlutterLoader = FlutterInjector.instance().flutterLoader();
    if (localFlutterLoader.initialized()) {
      return new DartEntrypoint(localFlutterLoader.findAppBundlePath(), "main");
    }
    throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (DartEntrypoint)paramObject;
      if (!pathToBundle.equals(pathToBundle)) {
        return false;
      }
      return dartEntrypointFunctionName.equals(dartEntrypointFunctionName);
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = pathToBundle.hashCode();
    return dartEntrypointFunctionName.hashCode() + i * 31;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("DartEntrypoint( bundle path: ");
    localStringBuilder.append(pathToBundle);
    localStringBuilder.append(", function: ");
    return g.f(localStringBuilder, dartEntrypointFunctionName, " )");
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */