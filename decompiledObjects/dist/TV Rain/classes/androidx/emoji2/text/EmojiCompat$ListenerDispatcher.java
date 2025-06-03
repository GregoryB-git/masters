package androidx.emoji2.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class EmojiCompat$ListenerDispatcher
  implements Runnable
{
  private final List<EmojiCompat.InitCallback> mInitCallbacks;
  private final int mLoadState;
  private final Throwable mThrowable;
  
  public EmojiCompat$ListenerDispatcher(@NonNull EmojiCompat.InitCallback paramInitCallback, int paramInt)
  {
    this(Arrays.asList(new EmojiCompat.InitCallback[] { (EmojiCompat.InitCallback)Preconditions.checkNotNull(paramInitCallback, "initCallback cannot be null") }), paramInt, null);
  }
  
  public EmojiCompat$ListenerDispatcher(@NonNull Collection<EmojiCompat.InitCallback> paramCollection, int paramInt)
  {
    this(paramCollection, paramInt, null);
  }
  
  public EmojiCompat$ListenerDispatcher(@NonNull Collection<EmojiCompat.InitCallback> paramCollection, int paramInt, @Nullable Throwable paramThrowable)
  {
    Preconditions.checkNotNull(paramCollection, "initCallbacks cannot be null");
    mInitCallbacks = new ArrayList(paramCollection);
    mLoadState = paramInt;
    mThrowable = paramThrowable;
  }
  
  public void run()
  {
    int i = mInitCallbacks.size();
    int j = mLoadState;
    int k = 0;
    int m = 0;
    if (j != 1) {
      for (k = m; k < i; k++) {
        ((EmojiCompat.InitCallback)mInitCallbacks.get(k)).onFailed(mThrowable);
      }
    }
    while (k < i)
    {
      ((EmojiCompat.InitCallback)mInitCallbacks.get(k)).onInitialized();
      k++;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompat.ListenerDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */