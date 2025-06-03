package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class AsyncDifferConfig$Builder<T>
{
  private static Executor sDiffExecutor;
  private static final Object sExecutorLock = new Object();
  private Executor mBackgroundThreadExecutor;
  private final DiffUtil.ItemCallback<T> mDiffCallback;
  @Nullable
  private Executor mMainThreadExecutor;
  
  public AsyncDifferConfig$Builder(@NonNull DiffUtil.ItemCallback<T> paramItemCallback)
  {
    mDiffCallback = paramItemCallback;
  }
  
  @NonNull
  public AsyncDifferConfig<T> build()
  {
    if (mBackgroundThreadExecutor == null) {
      synchronized (sExecutorLock)
      {
        if (sDiffExecutor == null) {
          sDiffExecutor = Executors.newFixedThreadPool(2);
        }
        mBackgroundThreadExecutor = sDiffExecutor;
      }
    }
    return new AsyncDifferConfig(mMainThreadExecutor, mBackgroundThreadExecutor, mDiffCallback);
  }
  
  @NonNull
  public Builder<T> setBackgroundThreadExecutor(Executor paramExecutor)
  {
    mBackgroundThreadExecutor = paramExecutor;
    return this;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public Builder<T> setMainThreadExecutor(Executor paramExecutor)
  {
    mMainThreadExecutor = paramExecutor;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AsyncDifferConfig.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */