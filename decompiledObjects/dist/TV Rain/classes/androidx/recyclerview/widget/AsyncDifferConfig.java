package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class AsyncDifferConfig<T>
{
  @NonNull
  private final Executor mBackgroundThreadExecutor;
  @NonNull
  private final DiffUtil.ItemCallback<T> mDiffCallback;
  @Nullable
  private final Executor mMainThreadExecutor;
  
  public AsyncDifferConfig(@Nullable Executor paramExecutor1, @NonNull Executor paramExecutor2, @NonNull DiffUtil.ItemCallback<T> paramItemCallback)
  {
    mMainThreadExecutor = paramExecutor1;
    mBackgroundThreadExecutor = paramExecutor2;
    mDiffCallback = paramItemCallback;
  }
  
  @NonNull
  public Executor getBackgroundThreadExecutor()
  {
    return mBackgroundThreadExecutor;
  }
  
  @NonNull
  public DiffUtil.ItemCallback<T> getDiffCallback()
  {
    return mDiffCallback;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public Executor getMainThreadExecutor()
  {
    return mMainThreadExecutor;
  }
  
  public static final class Builder<T>
  {
    private static Executor sDiffExecutor;
    private static final Object sExecutorLock = new Object();
    private Executor mBackgroundThreadExecutor;
    private final DiffUtil.ItemCallback<T> mDiffCallback;
    @Nullable
    private Executor mMainThreadExecutor;
    
    public Builder(@NonNull DiffUtil.ItemCallback<T> paramItemCallback)
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
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AsyncDifferConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */