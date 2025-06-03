package com.facebook.imagepipeline.datasource;

import com.facebook.common.internal.Preconditions;
import com.facebook.datasource.AbstractDataSource;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.BaseConsumer;
import com.facebook.imagepipeline.producers.BaseProducerContext;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.SettableProducerContext;
import com.facebook.imagepipeline.request.DataSourceWithImageRequest;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public abstract class AbstractProducerToDataSourceAdapter<T>
  extends AbstractDataSource<T>
  implements DataSourceWithImageRequest<T>
{
  private final RequestListener mRequestListener;
  private final SettableProducerContext mSettableProducerContext;
  
  public AbstractProducerToDataSourceAdapter(Producer<T> paramProducer, SettableProducerContext paramSettableProducerContext, RequestListener paramRequestListener)
  {
    mSettableProducerContext = paramSettableProducerContext;
    mRequestListener = paramRequestListener;
    paramRequestListener.onRequestStart(paramSettableProducerContext.getImageRequest(), paramSettableProducerContext.getCallerContext(), paramSettableProducerContext.getId(), paramSettableProducerContext.isPrefetch());
    paramProducer.produceResults(createConsumer(), paramSettableProducerContext);
  }
  
  private Consumer<T> createConsumer()
  {
    new BaseConsumer()
    {
      public void onCancellationImpl()
      {
        AbstractProducerToDataSourceAdapter.access$100(AbstractProducerToDataSourceAdapter.this);
      }
      
      public void onFailureImpl(Throwable paramAnonymousThrowable)
      {
        AbstractProducerToDataSourceAdapter.access$000(AbstractProducerToDataSourceAdapter.this, paramAnonymousThrowable);
      }
      
      public void onNewResultImpl(@Nullable T paramAnonymousT, int paramAnonymousInt)
      {
        AbstractProducerToDataSourceAdapter.this.onNewResultImpl(paramAnonymousT, paramAnonymousInt);
      }
      
      public void onProgressUpdateImpl(float paramAnonymousFloat)
      {
        AbstractProducerToDataSourceAdapter.access$200(AbstractProducerToDataSourceAdapter.this, paramAnonymousFloat);
      }
    };
  }
  
  private void onCancellationImpl()
  {
    try
    {
      Preconditions.checkState(isClosed());
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void onFailureImpl(Throwable paramThrowable)
  {
    if (super.setFailure(paramThrowable)) {
      mRequestListener.onRequestFailure(mSettableProducerContext.getImageRequest(), mSettableProducerContext.getId(), paramThrowable, mSettableProducerContext.isPrefetch());
    }
  }
  
  public boolean close()
  {
    if (!super.close()) {
      return false;
    }
    if (!super.isFinished())
    {
      mRequestListener.onRequestCancellation(mSettableProducerContext.getId());
      mSettableProducerContext.cancel();
    }
    return true;
  }
  
  public ImageRequest getImageRequest()
  {
    return mSettableProducerContext.getImageRequest();
  }
  
  public void onNewResultImpl(@Nullable T paramT, int paramInt)
  {
    boolean bool = BaseConsumer.isLast(paramInt);
    if ((super.setResult(paramT, bool)) && (bool)) {
      mRequestListener.onRequestSuccess(mSettableProducerContext.getImageRequest(), mSettableProducerContext.getId(), mSettableProducerContext.isPrefetch());
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.datasource.AbstractProducerToDataSourceAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */