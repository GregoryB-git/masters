package androidx.core.content;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;

public abstract interface OnTrimMemoryProvider
{
  public abstract void addOnTrimMemoryListener(@NonNull Consumer<Integer> paramConsumer);
  
  public abstract void removeOnTrimMemoryListener(@NonNull Consumer<Integer> paramConsumer);
}

/* Location:
 * Qualified Name:     androidx.core.content.OnTrimMemoryProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */