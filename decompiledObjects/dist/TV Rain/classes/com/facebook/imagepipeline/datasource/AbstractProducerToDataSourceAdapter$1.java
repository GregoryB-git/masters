package com.facebook.imagepipeline.datasource;

import com.facebook.imagepipeline.producers.BaseConsumer;
import javax.annotation.Nullable;

class AbstractProducerToDataSourceAdapter$1
  extends BaseConsumer<T>
{
  public AbstractProducerToDataSourceAdapter$1(AbstractProducerToDataSourceAdapter paramAbstractProducerToDataSourceAdapter) {}
  
  public void onCancellationImpl()
  {
    AbstractProducerToDataSourceAdapter.access$100(this$0);
  }
  
  public void onFailureImpl(Throwable paramThrowable)
  {
    AbstractProducerToDataSourceAdapter.access$000(this$0, paramThrowable);
  }
  
  public void onNewResultImpl(@Nullable T paramT, int paramInt)
  {
    this$0.onNewResultImpl(paramT, paramInt);
  }
  
  public void onProgressUpdateImpl(float paramFloat)
  {
    AbstractProducerToDataSourceAdapter.access$200(this$0, paramFloat);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.datasource.AbstractProducerToDataSourceAdapter.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */