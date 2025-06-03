package io.flutter;

import f;
import io.flutter.embedding.engine.FlutterJNI.Factory;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.embedding.engine.loader.FlutterLoader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class FlutterInjector
{
  private static boolean accessed;
  private static FlutterInjector instance;
  private DeferredComponentManager deferredComponentManager;
  private ExecutorService executorService;
  private FlutterJNI.Factory flutterJniFactory;
  private FlutterLoader flutterLoader;
  
  private FlutterInjector(FlutterLoader paramFlutterLoader, DeferredComponentManager paramDeferredComponentManager, FlutterJNI.Factory paramFactory, ExecutorService paramExecutorService)
  {
    flutterLoader = paramFlutterLoader;
    deferredComponentManager = paramDeferredComponentManager;
    flutterJniFactory = paramFactory;
    executorService = paramExecutorService;
  }
  
  public static FlutterInjector instance()
  {
    accessed = true;
    if (instance == null) {
      instance = new Builder().build();
    }
    return instance;
  }
  
  public static void reset()
  {
    accessed = false;
    instance = null;
  }
  
  public static void setInstance(FlutterInjector paramFlutterInjector)
  {
    if (!accessed)
    {
      instance = paramFlutterInjector;
      return;
    }
    throw new IllegalStateException("Cannot change the FlutterInjector instance once it's been read. If you're trying to dependency inject, be sure to do so at the beginning of the program");
  }
  
  public DeferredComponentManager deferredComponentManager()
  {
    return deferredComponentManager;
  }
  
  public ExecutorService executorService()
  {
    return executorService;
  }
  
  public FlutterLoader flutterLoader()
  {
    return flutterLoader;
  }
  
  public FlutterJNI.Factory getFlutterJNIFactory()
  {
    return flutterJniFactory;
  }
  
  public static final class Builder
  {
    private DeferredComponentManager deferredComponentManager;
    private ExecutorService executorService;
    private FlutterJNI.Factory flutterJniFactory;
    private FlutterLoader flutterLoader;
    
    private void fillDefaults()
    {
      if (flutterJniFactory == null) {
        flutterJniFactory = new FlutterJNI.Factory();
      }
      if (executorService == null) {
        executorService = Executors.newCachedThreadPool(new NamedThreadFactory(null));
      }
      if (flutterLoader == null) {
        flutterLoader = new FlutterLoader(flutterJniFactory.provideFlutterJNI(), executorService);
      }
    }
    
    public FlutterInjector build()
    {
      fillDefaults();
      return new FlutterInjector(flutterLoader, deferredComponentManager, flutterJniFactory, executorService, null);
    }
    
    public Builder setDeferredComponentManager(DeferredComponentManager paramDeferredComponentManager)
    {
      deferredComponentManager = paramDeferredComponentManager;
      return this;
    }
    
    public Builder setExecutorService(ExecutorService paramExecutorService)
    {
      executorService = paramExecutorService;
      return this;
    }
    
    public Builder setFlutterJNIFactory(FlutterJNI.Factory paramFactory)
    {
      flutterJniFactory = paramFactory;
      return this;
    }
    
    public Builder setFlutterLoader(FlutterLoader paramFlutterLoader)
    {
      flutterLoader = paramFlutterLoader;
      return this;
    }
    
    public class NamedThreadFactory
      implements ThreadFactory
    {
      private int threadId = 0;
      
      private NamedThreadFactory() {}
      
      public Thread newThread(Runnable paramRunnable)
      {
        paramRunnable = new Thread(paramRunnable);
        StringBuilder localStringBuilder = f.l("flutter-worker-");
        int i = threadId;
        threadId = (i + 1);
        localStringBuilder.append(i);
        paramRunnable.setName(localStringBuilder.toString());
        return paramRunnable;
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.FlutterInjector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */