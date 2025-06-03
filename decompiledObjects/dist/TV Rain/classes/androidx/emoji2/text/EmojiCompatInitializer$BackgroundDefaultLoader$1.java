package androidx.emoji2.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.ThreadPoolExecutor;

class EmojiCompatInitializer$BackgroundDefaultLoader$1
  extends EmojiCompat.MetadataRepoLoaderCallback
{
  public EmojiCompatInitializer$BackgroundDefaultLoader$1(EmojiCompatInitializer.BackgroundDefaultLoader paramBackgroundDefaultLoader, EmojiCompat.MetadataRepoLoaderCallback paramMetadataRepoLoaderCallback, ThreadPoolExecutor paramThreadPoolExecutor) {}
  
  public void onFailed(@Nullable Throwable paramThrowable)
  {
    try
    {
      val$loaderCallback.onFailed(paramThrowable);
      return;
    }
    finally
    {
      val$executor.shutdown();
    }
  }
  
  public void onLoaded(@NonNull MetadataRepo paramMetadataRepo)
  {
    try
    {
      val$loaderCallback.onLoaded(paramMetadataRepo);
      return;
    }
    finally
    {
      val$executor.shutdown();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */