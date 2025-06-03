package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import java.util.concurrent.ThreadPoolExecutor;

@RequiresApi(19)
class EmojiCompatInitializer$BackgroundDefaultLoader
  implements EmojiCompat.MetadataRepoLoader
{
  private final Context mContext;
  
  public EmojiCompatInitializer$BackgroundDefaultLoader(Context paramContext)
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

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */