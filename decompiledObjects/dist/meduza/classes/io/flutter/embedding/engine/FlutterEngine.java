package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.content.res.Resources;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.PluginRegistry;
import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface;
import io.flutter.embedding.engine.plugins.service.ServiceControlSurface;
import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.embedding.engine.systemchannels.BackGestureChannel;
import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;
import io.flutter.embedding.engine.systemchannels.LifecycleChannel;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import io.flutter.embedding.engine.systemchannels.MouseCursorChannel;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.embedding.engine.systemchannels.ProcessTextChannel;
import io.flutter.embedding.engine.systemchannels.RestorationChannel;
import io.flutter.embedding.engine.systemchannels.ScribeChannel;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.embedding.engine.systemchannels.SpellCheckChannel;
import io.flutter.embedding.engine.systemchannels.SystemChannel;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.text.ProcessTextPlugin;
import io.flutter.util.ViewUtils;
import io.flutter.util.ViewUtils.DisplayUpdater;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FlutterEngine
  implements ViewUtils.DisplayUpdater
{
  private static final String TAG = "FlutterEngine";
  private final AccessibilityChannel accessibilityChannel;
  private final BackGestureChannel backGestureChannel;
  private final DartExecutor dartExecutor;
  private final DeferredComponentChannel deferredComponentChannel;
  private final EngineLifecycleListener engineLifecycleListener = new EngineLifecycleListener()
  {
    public void onEngineWillDestroy() {}
    
    public void onPreEngineRestart()
    {
      Log.v("FlutterEngine", "onPreEngineRestart()");
      Iterator localIterator = FlutterEngine.access$000(FlutterEngine.this).iterator();
      while (localIterator.hasNext()) {
        ((FlutterEngine.EngineLifecycleListener)localIterator.next()).onPreEngineRestart();
      }
      FlutterEngine.access$100(FlutterEngine.this).onPreEngineRestart();
      FlutterEngine.access$200(FlutterEngine.this).clearData();
    }
  };
  private final Set<EngineLifecycleListener> engineLifecycleListeners = new HashSet();
  private final FlutterJNI flutterJNI;
  private final LifecycleChannel lifecycleChannel;
  private final LocalizationChannel localizationChannel;
  private final LocalizationPlugin localizationPlugin;
  private final MouseCursorChannel mouseCursorChannel;
  private final NavigationChannel navigationChannel;
  private final PlatformChannel platformChannel;
  private final PlatformViewsController platformViewsController;
  private final FlutterEngineConnectionRegistry pluginRegistry;
  private final ProcessTextChannel processTextChannel;
  private final FlutterRenderer renderer;
  private final RestorationChannel restorationChannel;
  private final ScribeChannel scribeChannel;
  private final SettingsChannel settingsChannel;
  private final SpellCheckChannel spellCheckChannel;
  private final SystemChannel systemChannel;
  private final TextInputChannel textInputChannel;
  
  public FlutterEngine(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public FlutterEngine(Context paramContext, FlutterLoader paramFlutterLoader, FlutterJNI paramFlutterJNI)
  {
    this(paramContext, paramFlutterLoader, paramFlutterJNI, null, true);
  }
  
  public FlutterEngine(Context paramContext, FlutterLoader paramFlutterLoader, FlutterJNI paramFlutterJNI, PlatformViewsController paramPlatformViewsController, String[] paramArrayOfString, boolean paramBoolean)
  {
    this(paramContext, paramFlutterLoader, paramFlutterJNI, paramPlatformViewsController, paramArrayOfString, paramBoolean, false);
  }
  
  public FlutterEngine(Context paramContext, FlutterLoader paramFlutterLoader, FlutterJNI paramFlutterJNI, PlatformViewsController paramPlatformViewsController, String[] paramArrayOfString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramContext, paramFlutterLoader, paramFlutterJNI, paramPlatformViewsController, paramArrayOfString, paramBoolean1, paramBoolean2, null);
  }
  
  public FlutterEngine(Context paramContext, FlutterLoader paramFlutterLoader, FlutterJNI paramFlutterJNI, PlatformViewsController paramPlatformViewsController, String[] paramArrayOfString, boolean paramBoolean1, boolean paramBoolean2, FlutterEngineGroup paramFlutterEngineGroup)
  {
    try
    {
      localObject = paramContext.createPackageContext(paramContext.getPackageName(), 0).getAssets();
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localObject = paramContext.getAssets();
    }
    FlutterInjector localFlutterInjector = FlutterInjector.instance();
    FlutterJNI localFlutterJNI = paramFlutterJNI;
    if (paramFlutterJNI == null) {
      localFlutterJNI = localFlutterInjector.getFlutterJNIFactory().provideFlutterJNI();
    }
    flutterJNI = localFlutterJNI;
    paramFlutterJNI = new DartExecutor(localFlutterJNI, (AssetManager)localObject);
    dartExecutor = paramFlutterJNI;
    paramFlutterJNI.onAttachedToJNI();
    Object localObject = FlutterInjector.instance().deferredComponentManager();
    accessibilityChannel = new AccessibilityChannel(paramFlutterJNI, localFlutterJNI);
    DeferredComponentChannel localDeferredComponentChannel = new DeferredComponentChannel(paramFlutterJNI);
    deferredComponentChannel = localDeferredComponentChannel;
    lifecycleChannel = new LifecycleChannel(paramFlutterJNI);
    LocalizationChannel localLocalizationChannel = new LocalizationChannel(paramFlutterJNI);
    localizationChannel = localLocalizationChannel;
    mouseCursorChannel = new MouseCursorChannel(paramFlutterJNI);
    navigationChannel = new NavigationChannel(paramFlutterJNI);
    backGestureChannel = new BackGestureChannel(paramFlutterJNI);
    platformChannel = new PlatformChannel(paramFlutterJNI);
    processTextChannel = new ProcessTextChannel(paramFlutterJNI, paramContext.getPackageManager());
    restorationChannel = new RestorationChannel(paramFlutterJNI, paramBoolean2);
    scribeChannel = new ScribeChannel(paramFlutterJNI);
    settingsChannel = new SettingsChannel(paramFlutterJNI);
    spellCheckChannel = new SpellCheckChannel(paramFlutterJNI);
    systemChannel = new SystemChannel(paramFlutterJNI);
    textInputChannel = new TextInputChannel(paramFlutterJNI);
    if (localObject != null) {
      ((DeferredComponentManager)localObject).setDeferredComponentChannel(localDeferredComponentChannel);
    }
    localObject = new LocalizationPlugin(paramContext, localLocalizationChannel);
    localizationPlugin = ((LocalizationPlugin)localObject);
    paramFlutterJNI = paramFlutterLoader;
    if (paramFlutterLoader == null) {
      paramFlutterJNI = localFlutterInjector.flutterLoader();
    }
    if (!localFlutterJNI.isAttached())
    {
      paramFlutterJNI.startInitialization(paramContext.getApplicationContext());
      paramFlutterJNI.ensureInitializationComplete(paramContext, paramArrayOfString);
    }
    localFlutterJNI.addEngineLifecycleListener(engineLifecycleListener);
    localFlutterJNI.setPlatformViewsController(paramPlatformViewsController);
    localFlutterJNI.setLocalizationPlugin((LocalizationPlugin)localObject);
    localFlutterJNI.setDeferredComponentManager(localFlutterInjector.deferredComponentManager());
    if (!localFlutterJNI.isAttached()) {
      attachToJni();
    }
    renderer = new FlutterRenderer(localFlutterJNI);
    platformViewsController = paramPlatformViewsController;
    paramPlatformViewsController.onAttachedToJNI();
    paramFlutterLoader = new FlutterEngineConnectionRegistry(paramContext.getApplicationContext(), this, paramFlutterJNI, paramFlutterEngineGroup);
    pluginRegistry = paramFlutterLoader;
    ((LocalizationPlugin)localObject).sendLocalesToFlutter(paramContext.getResources().getConfiguration());
    if ((paramBoolean1) && (paramFlutterJNI.automaticallyRegisterPlugins())) {
      GeneratedPluginRegister.registerGeneratedPlugins(this);
    }
    ViewUtils.calculateMaximumDisplayMetrics(paramContext, this);
    paramFlutterLoader.add(new ProcessTextPlugin(getProcessTextChannel()));
  }
  
  public FlutterEngine(Context paramContext, FlutterLoader paramFlutterLoader, FlutterJNI paramFlutterJNI, String[] paramArrayOfString, boolean paramBoolean)
  {
    this(paramContext, paramFlutterLoader, paramFlutterJNI, new PlatformViewsController(), paramArrayOfString, paramBoolean);
  }
  
  public FlutterEngine(Context paramContext, String[] paramArrayOfString)
  {
    this(paramContext, null, null, paramArrayOfString, true);
  }
  
  public FlutterEngine(Context paramContext, String[] paramArrayOfString, boolean paramBoolean)
  {
    this(paramContext, null, null, paramArrayOfString, paramBoolean);
  }
  
  public FlutterEngine(Context paramContext, String[] paramArrayOfString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramContext, null, null, new PlatformViewsController(), paramArrayOfString, paramBoolean1, paramBoolean2);
  }
  
  private void attachToJni()
  {
    Log.v("FlutterEngine", "Attaching to JNI.");
    flutterJNI.attachToNative();
    if (isAttachedToJni()) {
      return;
    }
    throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
  }
  
  private boolean isAttachedToJni()
  {
    return flutterJNI.isAttached();
  }
  
  public void addEngineLifecycleListener(EngineLifecycleListener paramEngineLifecycleListener)
  {
    engineLifecycleListeners.add(paramEngineLifecycleListener);
  }
  
  public void destroy()
  {
    Log.v("FlutterEngine", "Destroying.");
    Iterator localIterator = engineLifecycleListeners.iterator();
    while (localIterator.hasNext()) {
      ((EngineLifecycleListener)localIterator.next()).onEngineWillDestroy();
    }
    pluginRegistry.destroy();
    platformViewsController.onDetachedFromJNI();
    dartExecutor.onDetachedFromJNI();
    flutterJNI.removeEngineLifecycleListener(engineLifecycleListener);
    flutterJNI.setDeferredComponentManager(null);
    flutterJNI.detachFromNativeAndReleaseResources();
    if (FlutterInjector.instance().deferredComponentManager() != null)
    {
      FlutterInjector.instance().deferredComponentManager().destroy();
      deferredComponentChannel.setDeferredComponentManager(null);
    }
  }
  
  public AccessibilityChannel getAccessibilityChannel()
  {
    return accessibilityChannel;
  }
  
  public ActivityControlSurface getActivityControlSurface()
  {
    return pluginRegistry;
  }
  
  public BackGestureChannel getBackGestureChannel()
  {
    return backGestureChannel;
  }
  
  public BroadcastReceiverControlSurface getBroadcastReceiverControlSurface()
  {
    return pluginRegistry;
  }
  
  public ContentProviderControlSurface getContentProviderControlSurface()
  {
    return pluginRegistry;
  }
  
  public DartExecutor getDartExecutor()
  {
    return dartExecutor;
  }
  
  public DeferredComponentChannel getDeferredComponentChannel()
  {
    return deferredComponentChannel;
  }
  
  public LifecycleChannel getLifecycleChannel()
  {
    return lifecycleChannel;
  }
  
  public LocalizationChannel getLocalizationChannel()
  {
    return localizationChannel;
  }
  
  public LocalizationPlugin getLocalizationPlugin()
  {
    return localizationPlugin;
  }
  
  public MouseCursorChannel getMouseCursorChannel()
  {
    return mouseCursorChannel;
  }
  
  public NavigationChannel getNavigationChannel()
  {
    return navigationChannel;
  }
  
  public PlatformChannel getPlatformChannel()
  {
    return platformChannel;
  }
  
  public PlatformViewsController getPlatformViewsController()
  {
    return platformViewsController;
  }
  
  public PluginRegistry getPlugins()
  {
    return pluginRegistry;
  }
  
  public ProcessTextChannel getProcessTextChannel()
  {
    return processTextChannel;
  }
  
  public FlutterRenderer getRenderer()
  {
    return renderer;
  }
  
  public RestorationChannel getRestorationChannel()
  {
    return restorationChannel;
  }
  
  public ScribeChannel getScribeChannel()
  {
    return scribeChannel;
  }
  
  public ServiceControlSurface getServiceControlSurface()
  {
    return pluginRegistry;
  }
  
  public SettingsChannel getSettingsChannel()
  {
    return settingsChannel;
  }
  
  public SpellCheckChannel getSpellCheckChannel()
  {
    return spellCheckChannel;
  }
  
  public SystemChannel getSystemChannel()
  {
    return systemChannel;
  }
  
  public TextInputChannel getTextInputChannel()
  {
    return textInputChannel;
  }
  
  public void removeEngineLifecycleListener(EngineLifecycleListener paramEngineLifecycleListener)
  {
    engineLifecycleListeners.remove(paramEngineLifecycleListener);
  }
  
  public FlutterEngine spawn(Context paramContext, DartExecutor.DartEntrypoint paramDartEntrypoint, String paramString, List<String> paramList, PlatformViewsController paramPlatformViewsController, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (isAttachedToJni()) {
      return new FlutterEngine(paramContext, null, flutterJNI.spawn(dartEntrypointFunctionName, dartEntrypointLibrary, paramString, paramList), paramPlatformViewsController, null, paramBoolean1, paramBoolean2);
    }
    throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
  }
  
  public void updateDisplayMetrics(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    flutterJNI.updateDisplayMetrics(0, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public static abstract interface EngineLifecycleListener
  {
    public abstract void onEngineWillDestroy();
    
    public abstract void onPreEngineRestart();
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterEngine
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */