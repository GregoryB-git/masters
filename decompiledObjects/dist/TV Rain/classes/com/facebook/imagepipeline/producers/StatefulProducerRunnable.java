package com.facebook.imagepipeline.producers;

import com.facebook.common.executors.StatefulRunnable;
import java.util.Map;

public abstract class StatefulProducerRunnable<T>
  extends StatefulRunnable<T>
{
  private final Consumer<T> mConsumer;
  private final ProducerListener mProducerListener;
  private final String mProducerName;
  private final String mRequestId;
  
  public StatefulProducerRunnable(Consumer<T> paramConsumer, ProducerListener paramProducerListener, String paramString1, String paramString2)
  {
    mConsumer = paramConsumer;
    mProducerListener = paramProducerListener;
    mProducerName = paramString1;
    mRequestId = paramString2;
    paramProducerListener.onProducerStart(paramString2, paramString1);
  }
  
  public abstract void disposeResult(T paramT);
  
  public Map<String, String> getExtraMapOnCancellation()
  {
    return null;
  }
  
  public Map<String, String> getExtraMapOnFailure(Exception paramException)
  {
    return null;
  }
  
  public Map<String, String> getExtraMapOnSuccess(T paramT)
  {
    return null;
  }
  
  public void onCancellation()
  {
    ProducerListener localProducerListener = mProducerListener;
    String str1 = mRequestId;
    String str2 = mProducerName;
    Map localMap;
    if (localProducerListener.requiresExtraMap(str1)) {
      localMap = getExtraMapOnCancellation();
    } else {
      localMap = null;
    }
    localProducerListener.onProducerFinishWithCancellation(str1, str2, localMap);
    mConsumer.onCancellation();
  }
  
  public void onFailure(Exception paramException)
  {
    ProducerListener localProducerListener = mProducerListener;
    String str1 = mRequestId;
    String str2 = mProducerName;
    Map localMap;
    if (localProducerListener.requiresExtraMap(str1)) {
      localMap = getExtraMapOnFailure(paramException);
    } else {
      localMap = null;
    }
    localProducerListener.onProducerFinishWithFailure(str1, str2, paramException, localMap);
    mConsumer.onFailure(paramException);
  }
  
  public void onSuccess(T paramT)
  {
    ProducerListener localProducerListener = mProducerListener;
    String str1 = mRequestId;
    String str2 = mProducerName;
    Map localMap;
    if (localProducerListener.requiresExtraMap(str1)) {
      localMap = getExtraMapOnSuccess(paramT);
    } else {
      localMap = null;
    }
    localProducerListener.onProducerFinishWithSuccess(str1, str2, localMap);
    mConsumer.onNewResult(paramT, 1);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.StatefulProducerRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */