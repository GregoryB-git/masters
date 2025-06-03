package com.facebook.imagepipeline.producers;

public abstract class DelegatingConsumer<I, O>
  extends BaseConsumer<I>
{
  private final Consumer<O> mConsumer;
  
  public DelegatingConsumer(Consumer<O> paramConsumer)
  {
    mConsumer = paramConsumer;
  }
  
  public Consumer<O> getConsumer()
  {
    return mConsumer;
  }
  
  public void onCancellationImpl()
  {
    mConsumer.onCancellation();
  }
  
  public void onFailureImpl(Throwable paramThrowable)
  {
    mConsumer.onFailure(paramThrowable);
  }
  
  public void onProgressUpdateImpl(float paramFloat)
  {
    mConsumer.onProgressUpdate(paramFloat);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.DelegatingConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */