package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class BaseProducerContext
  implements ProducerContext
{
  @GuardedBy("this")
  private final List<ProducerContextCallbacks> mCallbacks;
  private final Object mCallerContext;
  private final String mId;
  private final ImageRequest mImageRequest;
  @GuardedBy("this")
  private boolean mIsCancelled;
  @GuardedBy("this")
  private boolean mIsIntermediateResultExpected;
  @GuardedBy("this")
  private boolean mIsPrefetch;
  private final ImageRequest.RequestLevel mLowestPermittedRequestLevel;
  @GuardedBy("this")
  private Priority mPriority;
  private final ProducerListener mProducerListener;
  
  public BaseProducerContext(ImageRequest paramImageRequest, String paramString, ProducerListener paramProducerListener, Object paramObject, ImageRequest.RequestLevel paramRequestLevel, boolean paramBoolean1, boolean paramBoolean2, Priority paramPriority)
  {
    mImageRequest = paramImageRequest;
    mId = paramString;
    mProducerListener = paramProducerListener;
    mCallerContext = paramObject;
    mLowestPermittedRequestLevel = paramRequestLevel;
    mIsPrefetch = paramBoolean1;
    mPriority = paramPriority;
    mIsIntermediateResultExpected = paramBoolean2;
    mIsCancelled = false;
    mCallbacks = new ArrayList();
  }
  
  public static void callOnCancellationRequested(@Nullable List<ProducerContextCallbacks> paramList)
  {
    if (paramList == null) {
      return;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((ProducerContextCallbacks)paramList.next()).onCancellationRequested();
    }
  }
  
  public static void callOnIsIntermediateResultExpectedChanged(@Nullable List<ProducerContextCallbacks> paramList)
  {
    if (paramList == null) {
      return;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((ProducerContextCallbacks)paramList.next()).onIsIntermediateResultExpectedChanged();
    }
  }
  
  public static void callOnIsPrefetchChanged(@Nullable List<ProducerContextCallbacks> paramList)
  {
    if (paramList == null) {
      return;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((ProducerContextCallbacks)paramList.next()).onIsPrefetchChanged();
    }
  }
  
  public static void callOnPriorityChanged(@Nullable List<ProducerContextCallbacks> paramList)
  {
    if (paramList == null) {
      return;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((ProducerContextCallbacks)paramList.next()).onPriorityChanged();
    }
  }
  
  public void addCallbacks(ProducerContextCallbacks paramProducerContextCallbacks)
  {
    try
    {
      mCallbacks.add(paramProducerContextCallbacks);
      boolean bool = mIsCancelled;
      if (bool) {
        paramProducerContextCallbacks.onCancellationRequested();
      }
      return;
    }
    finally {}
  }
  
  public void cancel()
  {
    callOnCancellationRequested(cancelNoCallbacks());
  }
  
  @Nullable
  public List<ProducerContextCallbacks> cancelNoCallbacks()
  {
    try
    {
      boolean bool = mIsCancelled;
      if (bool) {
        return null;
      }
      mIsCancelled = true;
      ArrayList localArrayList = new ArrayList(mCallbacks);
      return localArrayList;
    }
    finally {}
  }
  
  public Object getCallerContext()
  {
    return mCallerContext;
  }
  
  public String getId()
  {
    return mId;
  }
  
  public ImageRequest getImageRequest()
  {
    return mImageRequest;
  }
  
  public ProducerListener getListener()
  {
    return mProducerListener;
  }
  
  public ImageRequest.RequestLevel getLowestPermittedRequestLevel()
  {
    return mLowestPermittedRequestLevel;
  }
  
  public Priority getPriority()
  {
    try
    {
      Priority localPriority = mPriority;
      return localPriority;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean isCancelled()
  {
    try
    {
      boolean bool = mIsCancelled;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean isIntermediateResultExpected()
  {
    try
    {
      boolean bool = mIsIntermediateResultExpected;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean isPrefetch()
  {
    try
    {
      boolean bool = mIsPrefetch;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @Nullable
  public List<ProducerContextCallbacks> setIsIntermediateResultExpectedNoCallbacks(boolean paramBoolean)
  {
    try
    {
      boolean bool = mIsIntermediateResultExpected;
      if (paramBoolean == bool) {
        return null;
      }
      mIsIntermediateResultExpected = paramBoolean;
      ArrayList localArrayList = new ArrayList(mCallbacks);
      return localArrayList;
    }
    finally {}
  }
  
  @Nullable
  public List<ProducerContextCallbacks> setIsPrefetchNoCallbacks(boolean paramBoolean)
  {
    try
    {
      boolean bool = mIsPrefetch;
      if (paramBoolean == bool) {
        return null;
      }
      mIsPrefetch = paramBoolean;
      ArrayList localArrayList = new ArrayList(mCallbacks);
      return localArrayList;
    }
    finally {}
  }
  
  @Nullable
  public List<ProducerContextCallbacks> setPriorityNoCallbacks(Priority paramPriority)
  {
    try
    {
      Priority localPriority = mPriority;
      if (paramPriority == localPriority) {
        return null;
      }
      mPriority = paramPriority;
      paramPriority = new ArrayList(mCallbacks);
      return paramPriority;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.BaseProducerContext
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */