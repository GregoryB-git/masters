package com.facebook.imagepipeline.listener;

import com.facebook.common.logging.FLog;
import com.facebook.imagepipeline.producers.ProducerListener;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ForwardingRequestListener
  implements RequestListener
{
  private static final String TAG = "ForwardingRequestListener";
  private final List<RequestListener> mRequestListeners;
  
  public ForwardingRequestListener(Set<RequestListener> paramSet)
  {
    mRequestListeners = new ArrayList(paramSet.size());
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      paramSet = (RequestListener)localIterator.next();
      if (paramSet != null) {
        mRequestListeners.add(paramSet);
      }
    }
  }
  
  public ForwardingRequestListener(RequestListener... paramVarArgs)
  {
    mRequestListeners = new ArrayList(paramVarArgs.length);
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      RequestListener localRequestListener = paramVarArgs[j];
      if (localRequestListener != null) {
        mRequestListeners.add(localRequestListener);
      }
    }
  }
  
  private void onException(String paramString, Throwable paramThrowable)
  {
    FLog.e("ForwardingRequestListener", paramString, paramThrowable);
  }
  
  public void onProducerEvent(String paramString1, String paramString2, String paramString3)
  {
    int i = mRequestListeners.size();
    for (int j = 0; j < i; j++)
    {
      RequestListener localRequestListener = (RequestListener)mRequestListeners.get(j);
      try
      {
        localRequestListener.onProducerEvent(paramString1, paramString2, paramString3);
      }
      catch (Exception localException)
      {
        onException("InternalListener exception in onIntermediateChunkStart", localException);
      }
    }
  }
  
  public void onProducerFinishWithCancellation(String paramString1, String paramString2, @Nullable Map<String, String> paramMap)
  {
    int i = mRequestListeners.size();
    for (int j = 0; j < i; j++)
    {
      RequestListener localRequestListener = (RequestListener)mRequestListeners.get(j);
      try
      {
        localRequestListener.onProducerFinishWithCancellation(paramString1, paramString2, paramMap);
      }
      catch (Exception localException)
      {
        onException("InternalListener exception in onProducerFinishWithCancellation", localException);
      }
    }
  }
  
  public void onProducerFinishWithFailure(String paramString1, String paramString2, Throwable paramThrowable, @Nullable Map<String, String> paramMap)
  {
    int i = mRequestListeners.size();
    for (int j = 0; j < i; j++)
    {
      RequestListener localRequestListener = (RequestListener)mRequestListeners.get(j);
      try
      {
        localRequestListener.onProducerFinishWithFailure(paramString1, paramString2, paramThrowable, paramMap);
      }
      catch (Exception localException)
      {
        onException("InternalListener exception in onProducerFinishWithFailure", localException);
      }
    }
  }
  
  public void onProducerFinishWithSuccess(String paramString1, String paramString2, @Nullable Map<String, String> paramMap)
  {
    int i = mRequestListeners.size();
    for (int j = 0; j < i; j++)
    {
      RequestListener localRequestListener = (RequestListener)mRequestListeners.get(j);
      try
      {
        localRequestListener.onProducerFinishWithSuccess(paramString1, paramString2, paramMap);
      }
      catch (Exception localException)
      {
        onException("InternalListener exception in onProducerFinishWithSuccess", localException);
      }
    }
  }
  
  public void onProducerStart(String paramString1, String paramString2)
  {
    int i = mRequestListeners.size();
    for (int j = 0; j < i; j++)
    {
      RequestListener localRequestListener = (RequestListener)mRequestListeners.get(j);
      try
      {
        localRequestListener.onProducerStart(paramString1, paramString2);
      }
      catch (Exception localException)
      {
        onException("InternalListener exception in onProducerStart", localException);
      }
    }
  }
  
  public void onRequestCancellation(String paramString)
  {
    int i = mRequestListeners.size();
    for (int j = 0; j < i; j++)
    {
      RequestListener localRequestListener = (RequestListener)mRequestListeners.get(j);
      try
      {
        localRequestListener.onRequestCancellation(paramString);
      }
      catch (Exception localException)
      {
        onException("InternalListener exception in onRequestCancellation", localException);
      }
    }
  }
  
  public void onRequestFailure(ImageRequest paramImageRequest, String paramString, Throwable paramThrowable, boolean paramBoolean)
  {
    int i = mRequestListeners.size();
    for (int j = 0; j < i; j++)
    {
      RequestListener localRequestListener = (RequestListener)mRequestListeners.get(j);
      try
      {
        localRequestListener.onRequestFailure(paramImageRequest, paramString, paramThrowable, paramBoolean);
      }
      catch (Exception localException)
      {
        onException("InternalListener exception in onRequestFailure", localException);
      }
    }
  }
  
  public void onRequestStart(ImageRequest paramImageRequest, Object paramObject, String paramString, boolean paramBoolean)
  {
    int i = mRequestListeners.size();
    for (int j = 0; j < i; j++)
    {
      RequestListener localRequestListener = (RequestListener)mRequestListeners.get(j);
      try
      {
        localRequestListener.onRequestStart(paramImageRequest, paramObject, paramString, paramBoolean);
      }
      catch (Exception localException)
      {
        onException("InternalListener exception in onRequestStart", localException);
      }
    }
  }
  
  public void onRequestSuccess(ImageRequest paramImageRequest, String paramString, boolean paramBoolean)
  {
    int i = mRequestListeners.size();
    for (int j = 0; j < i; j++)
    {
      RequestListener localRequestListener = (RequestListener)mRequestListeners.get(j);
      try
      {
        localRequestListener.onRequestSuccess(paramImageRequest, paramString, paramBoolean);
      }
      catch (Exception localException)
      {
        onException("InternalListener exception in onRequestSuccess", localException);
      }
    }
  }
  
  public void onUltimateProducerReached(String paramString1, String paramString2, boolean paramBoolean)
  {
    int i = mRequestListeners.size();
    for (int j = 0; j < i; j++)
    {
      RequestListener localRequestListener = (RequestListener)mRequestListeners.get(j);
      try
      {
        localRequestListener.onUltimateProducerReached(paramString1, paramString2, paramBoolean);
      }
      catch (Exception localException)
      {
        onException("InternalListener exception in onProducerFinishWithSuccess", localException);
      }
    }
  }
  
  public boolean requiresExtraMap(String paramString)
  {
    int i = mRequestListeners.size();
    for (int j = 0; j < i; j++) {
      if (((RequestListener)mRequestListeners.get(j)).requiresExtraMap(paramString)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.listener.ForwardingRequestListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */