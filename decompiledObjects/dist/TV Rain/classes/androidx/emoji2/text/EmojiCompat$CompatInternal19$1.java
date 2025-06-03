package androidx.emoji2.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class EmojiCompat$CompatInternal19$1
  extends EmojiCompat.MetadataRepoLoaderCallback
{
  public EmojiCompat$CompatInternal19$1(EmojiCompat.CompatInternal19 paramCompatInternal19) {}
  
  public void onFailed(@Nullable Throwable paramThrowable)
  {
    this$0.mEmojiCompat.onMetadataLoadFailed(paramThrowable);
  }
  
  public void onLoaded(@NonNull MetadataRepo paramMetadataRepo)
  {
    this$0.onMetadataLoadSuccess(paramMetadataRepo);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompat.CompatInternal19.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */