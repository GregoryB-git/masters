package androidx.emoji2.text;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.core.os.TraceCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer
  implements Initializer<Boolean>
{
  private static final long STARTUP_THREAD_CREATION_DELAY_MS = 500L;
  private static final String S_INITIALIZER_THREAD_NAME = "EmojiCompatInitializer";
  
  @NonNull
  public Boolean create(@NonNull Context paramContext)
  {
    EmojiCompat.init(new BackgroundDefaultConfig(paramContext));
    delayUntilFirstResume(paramContext);
    return Boolean.TRUE;
  }
  
  @RequiresApi(19)
  public void delayUntilFirstResume(@NonNull final Context paramContext)
  {
    paramContext = ((LifecycleOwner)AppInitializer.getInstance(paramContext).initializeComponent(ProcessLifecycleInitializer.class)).getLifecycle();
    paramContext.addObserver(new DefaultLifecycleObserver()
    {
      public void onResume(@NonNull LifecycleOwner paramAnonymousLifecycleOwner)
      {
        loadEmojiCompatAfterDelay();
        paramContext.removeObserver(this);
      }
    });
  }
  
  @NonNull
  public List<Class<? extends Initializer<?>>> dependencies()
  {
    return Collections.singletonList(ProcessLifecycleInitializer.class);
  }
  
  @RequiresApi(19)
  public void loadEmojiCompatAfterDelay()
  {
    ConcurrencyHelpers.mainHandlerAsync().postDelayed(new LoadEmojiCompatRunnable(), 500L);
  }
  
  @RequiresApi(19)
  public static class BackgroundDefaultConfig
    extends EmojiCompat.Config
  {
    public BackgroundDefaultConfig(Context paramContext)
    {
      super();
      setMetadataLoadStrategy(1);
    }
  }
  
  @RequiresApi(19)
  public static class BackgroundDefaultLoader
    implements EmojiCompat.MetadataRepoLoader
  {
    private final Context mContext;
    
    public BackgroundDefaultLoader(Context paramContext)
    {
      mContext = paramContext.getApplicationContext();
    }
    
    @WorkerThread
    public void doLoad(@NonNull EmojiCompat.MetadataRepoLoaderCallback paramMetadataRepoLoaderCallback, @NonNull ThreadPoolExecutor paramThreadPoolExecutor)
    {
      try
      {
        Object localObject = DefaultEmojiCompatConfig.create(mContext);
        if (localObject != null)
        {
          ((FontRequestEmojiCompatConfig)localObject).setLoadingExecutor(paramThreadPoolExecutor);
          EmojiCompat.MetadataRepoLoader localMetadataRepoLoader = ((EmojiCompat.Config)localObject).getMetadataRepoLoader();
          localObject = new androidx/emoji2/text/EmojiCompatInitializer$BackgroundDefaultLoader$1;
          ((1)localObject).<init>(this, paramMetadataRepoLoaderCallback, paramThreadPoolExecutor);
          localMetadataRepoLoader.load((EmojiCompat.MetadataRepoLoaderCallback)localObject);
        }
        else
        {
          localObject = new java/lang/RuntimeException;
          ((RuntimeException)localObject).<init>("EmojiCompat font provider not available on this device.");
          throw ((Throwable)localObject);
        }
      }
      finally
      {
        paramMetadataRepoLoaderCallback.onFailed(localThrowable);
        paramThreadPoolExecutor.shutdown();
      }
    }
    
    public void load(@NonNull EmojiCompat.MetadataRepoLoaderCallback paramMetadataRepoLoaderCallback)
    {
      ThreadPoolExecutor localThreadPoolExecutor = ConcurrencyHelpers.createBackgroundPriorityExecutor("EmojiCompatInitializer");
      localThreadPoolExecutor.execute(new b(this, paramMetadataRepoLoaderCallback, localThreadPoolExecutor));
    }
  }
  
  public static class LoadEmojiCompatRunnable
    implements Runnable
  {
    public void run()
    {
      try
      {
        TraceCompat.beginSection("EmojiCompat.EmojiCompatInitializer.run");
        if (EmojiCompat.isConfigured()) {
          EmojiCompat.get().load();
        }
        return;
      }
      finally
      {
        TraceCompat.endSection();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompatInitializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */