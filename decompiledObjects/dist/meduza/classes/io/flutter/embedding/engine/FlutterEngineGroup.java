package io.flutter.embedding.engine;

import android.content.Context;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import io.flutter.plugin.platform.PlatformViewsController;
import java.util.ArrayList;
import java.util.List;

public class FlutterEngineGroup
{
  public final List<FlutterEngine> activeEngines = new ArrayList();
  
  public FlutterEngineGroup(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public FlutterEngineGroup(Context paramContext, String[] paramArrayOfString)
  {
    FlutterLoader localFlutterLoader = FlutterInjector.instance().flutterLoader();
    if (!localFlutterLoader.initialized())
    {
      localFlutterLoader.startInitialization(paramContext.getApplicationContext());
      localFlutterLoader.ensureInitializationComplete(paramContext.getApplicationContext(), paramArrayOfString);
    }
  }
  
  public FlutterEngine createAndRunDefaultEngine(Context paramContext)
  {
    return createAndRunEngine(paramContext, null);
  }
  
  public FlutterEngine createAndRunEngine(Context paramContext, DartExecutor.DartEntrypoint paramDartEntrypoint)
  {
    return createAndRunEngine(paramContext, paramDartEntrypoint, null);
  }
  
  public FlutterEngine createAndRunEngine(Context paramContext, DartExecutor.DartEntrypoint paramDartEntrypoint, String paramString)
  {
    return createAndRunEngine(new Options(paramContext).setDartEntrypoint(paramDartEntrypoint).setInitialRoute(paramString));
  }
  
  public FlutterEngine createAndRunEngine(final Options paramOptions)
  {
    Context localContext = paramOptions.getContext();
    DartExecutor.DartEntrypoint localDartEntrypoint = paramOptions.getDartEntrypoint();
    String str = paramOptions.getInitialRoute();
    List localList = paramOptions.getDartEntrypointArgs();
    Object localObject = paramOptions.getPlatformViewsController();
    if (localObject == null) {
      localObject = new PlatformViewsController();
    }
    boolean bool1 = paramOptions.getAutomaticallyRegisterPlugins();
    boolean bool2 = paramOptions.getWaitForRestorationData();
    if (localDartEntrypoint == null) {
      paramOptions = DartExecutor.DartEntrypoint.createDefault();
    } else {
      paramOptions = localDartEntrypoint;
    }
    if (activeEngines.size() == 0)
    {
      localObject = createEngine(localContext, (PlatformViewsController)localObject, bool1, bool2);
      if (str != null) {
        ((FlutterEngine)localObject).getNavigationChannel().setInitialRoute(str);
      }
      ((FlutterEngine)localObject).getDartExecutor().executeDartEntrypoint(paramOptions, localList);
      paramOptions = (Options)localObject;
    }
    else
    {
      paramOptions = ((FlutterEngine)activeEngines.get(0)).spawn(localContext, paramOptions, str, localList, (PlatformViewsController)localObject, bool1, bool2);
    }
    activeEngines.add(paramOptions);
    paramOptions.addEngineLifecycleListener(new FlutterEngine.EngineLifecycleListener()
    {
      public void onEngineWillDestroy()
      {
        this$0.activeEngines.remove(paramOptions);
      }
      
      public void onPreEngineRestart() {}
    });
    return paramOptions;
  }
  
  public FlutterEngine createEngine(Context paramContext, PlatformViewsController paramPlatformViewsController, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new FlutterEngine(paramContext, null, null, paramPlatformViewsController, null, paramBoolean1, paramBoolean2, this);
  }
  
  public static class Options
  {
    private boolean automaticallyRegisterPlugins = true;
    private Context context;
    private DartExecutor.DartEntrypoint dartEntrypoint;
    private List<String> dartEntrypointArgs;
    private String initialRoute;
    private PlatformViewsController platformViewsController;
    private boolean waitForRestorationData = false;
    
    public Options(Context paramContext)
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
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterEngineGroup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */