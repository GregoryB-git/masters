package com.facebook.imagepipeline.datasource;

import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.AbstractDataSource;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class SettableDataSource<T>
  extends AbstractDataSource<CloseableReference<T>>
{
  public static <V> SettableDataSource<V> create()
  {
    return new SettableDataSource();
  }
  
  public void closeResult(@Nullable CloseableReference<T> paramCloseableReference)
  {
    CloseableReference.closeSafely(paramCloseableReference);
  }
  
  @Nullable
  public CloseableReference<T> getResult()
  {
    return CloseableReference.cloneOrNull((CloseableReference)super.getResult());
  }
  
  public boolean set(@Nullable CloseableReference<T> paramCloseableReference)
  {
    return super.setResult(CloseableReference.cloneOrNull(paramCloseableReference), true);
  }
  
  public boolean setException(Throwable paramThrowable)
  {
    return super.setFailure(paramThrowable);
  }
  
  public boolean setProgress(float paramFloat)
  {
    return super.setProgress(paramFloat);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.datasource.SettableDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */