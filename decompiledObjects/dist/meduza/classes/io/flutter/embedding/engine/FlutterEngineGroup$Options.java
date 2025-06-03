package io.flutter.embedding.engine;

import android.content.Context;
import io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint;
import io.flutter.plugin.platform.PlatformViewsController;
import java.util.List;

public class FlutterEngineGroup$Options
{
  private boolean automaticallyRegisterPlugins = true;
  private Context context;
  private DartExecutor.DartEntrypoint dartEntrypoint;
  private List<String> dartEntrypointArgs;
  private String initialRoute;
  private PlatformViewsController platformViewsController;
  private boolean waitForRestorationData = false;
  
  public FlutterEngineGroup$Options(Context paramContext)
  {
    context = paramContext;
  }
  
  public boolean getAutomaticallyRegisterPlugins()
  {
    return automaticallyRegisterPlugins;
  }
  
  public Context getContext()
  {
    return context;
  }
  
  public DartExecutor.DartEntrypoint getDartEntrypoint()
  {
    return dartEntrypoint;
  }
  
  public List<String> getDartEntrypointArgs()
  {
    return dartEntrypointArgs;
  }
  
  public String getInitialRoute()
  {
    return initialRoute;
  }
  
  public PlatformViewsController getPlatformViewsController()
  {
    return platformViewsController;
  }
  
  public boolean getWaitForRestorationData()
  {
    return waitForRestorationData;
  }
  
  public Options setAutomaticallyRegisterPlugins(boolean paramBoolean)
  {
    automaticallyRegisterPlugins = paramBoolean;
    return this;
  }
  
  public Options setDartEntrypoint(DartExecutor.DartEntrypoint paramDartEntrypoint)
  {
    dartEntrypoint = paramDartEntrypoint;
    return this;
  }
  
  public Options setDartEntrypointArgs(List<String> paramList)
  {
    dartEntrypointArgs = paramList;
    return this;
  }
  
  public Options setInitialRoute(String paramString)
  {
    initialRoute = paramString;
    return this;
  }
  
  public Options setPlatformViewsController(PlatformViewsController paramPlatformViewsController)
  {
    platformViewsController = paramPlatformViewsController;
    return this;
  }
  
  public Options setWaitForRestorationData(boolean paramBoolean)
  {
    waitForRestorationData = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterEngineGroup.Options
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */