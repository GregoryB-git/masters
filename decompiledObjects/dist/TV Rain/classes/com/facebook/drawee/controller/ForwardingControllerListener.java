package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class ForwardingControllerListener<INFO>
  implements ControllerListener<INFO>
{
  private static final String TAG = "FdingControllerListener";
  private final List<ControllerListener<? super INFO>> mListeners = new ArrayList(2);
  
  public static <INFO> ForwardingControllerListener<INFO> create()
  {
    return new ForwardingControllerListener();
  }
  
  public static <INFO> ForwardingControllerListener<INFO> of(ControllerListener<? super INFO> paramControllerListener)
  {
    ForwardingControllerListener localForwardingControllerListener = create();
    localForwardingControllerListener.addListener(paramControllerListener);
    return localForwardingControllerListener;
  }
  
  public static <INFO> ForwardingControllerListener<INFO> of(ControllerListener<? super INFO> paramControllerListener1, ControllerListener<? super INFO> paramControllerListener2)
  {
    ForwardingControllerListener localForwardingControllerListener = create();
    localForwardingControllerListener.addListener(paramControllerListener1);
    localForwardingControllerListener.addListener(paramControllerListener2);
    return localForwardingControllerListener;
  }
  
  private void onException(String paramString, Throwable paramThrowable)
  {
    try
    {
      Log.e("FdingControllerListener", paramString, paramThrowable);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void addListener(ControllerListener<? super INFO> paramControllerListener)
  {
    try
    {
      mListeners.add(paramControllerListener);
      return;
    }
    finally
    {
      paramControllerListener = finally;
      throw paramControllerListener;
    }
  }
  
  public void clearListeners()
  {
    try
    {
      mListeners.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void onFailure(String paramString, Throwable paramThrowable)
  {
    try
    {
      int i = mListeners.size();
      for (int j = 0; j < i; j++) {
        try
        {
          ControllerListener localControllerListener = (ControllerListener)mListeners.get(j);
          if (localControllerListener != null) {
            localControllerListener.onFailure(paramString, paramThrowable);
          }
        }
        catch (Exception localException)
        {
          onException("InternalListener exception in onFailure", localException);
        }
      }
      return;
    }
    finally {}
  }
  
  public void onFinalImageSet(String paramString, @Nullable INFO paramINFO, @Nullable Animatable paramAnimatable)
  {
    try
    {
      int i = mListeners.size();
      for (int j = 0; j < i; j++) {
        try
        {
          ControllerListener localControllerListener = (ControllerListener)mListeners.get(j);
          if (localControllerListener != null) {
            localControllerListener.onFinalImageSet(paramString, paramINFO, paramAnimatable);
          }
        }
        catch (Exception localException)
        {
          onException("InternalListener exception in onFinalImageSet", localException);
        }
      }
      return;
    }
    finally {}
  }
  
  public void onIntermediateImageFailed(String paramString, Throwable paramThrowable)
  {
    int i = mListeners.size();
    for (int j = 0; j < i; j++) {
      try
      {
        ControllerListener localControllerListener = (ControllerListener)mListeners.get(j);
        if (localControllerListener != null) {
          localControllerListener.onIntermediateImageFailed(paramString, paramThrowable);
        }
      }
      catch (Exception localException)
      {
        onException("InternalListener exception in onIntermediateImageFailed", localException);
      }
    }
  }
  
  public void onIntermediateImageSet(String paramString, @Nullable INFO paramINFO)
  {
    int i = mListeners.size();
    for (int j = 0; j < i; j++) {
      try
      {
        ControllerListener localControllerListener = (ControllerListener)mListeners.get(j);
        if (localControllerListener != null) {
          localControllerListener.onIntermediateImageSet(paramString, paramINFO);
        }
      }
      catch (Exception localException)
      {
        onException("InternalListener exception in onIntermediateImageSet", localException);
      }
    }
  }
  
  public void onRelease(String paramString)
  {
    try
    {
      int i = mListeners.size();
      for (int j = 0; j < i; j++) {
        try
        {
          ControllerListener localControllerListener = (ControllerListener)mListeners.get(j);
          if (localControllerListener != null) {
            localControllerListener.onRelease(paramString);
          }
        }
        catch (Exception localException)
        {
          onException("InternalListener exception in onRelease", localException);
        }
      }
      return;
    }
    finally {}
  }
  
  public void onSubmit(String paramString, Object paramObject)
  {
    try
    {
      int i = mListeners.size();
      for (int j = 0; j < i; j++) {
        try
        {
          ControllerListener localControllerListener = (ControllerListener)mListeners.get(j);
          if (localControllerListener != null) {
            localControllerListener.onSubmit(paramString, paramObject);
          }
        }
        catch (Exception localException)
        {
          onException("InternalListener exception in onSubmit", localException);
        }
      }
      return;
    }
    finally {}
  }
  
  public void removeListener(ControllerListener<? super INFO> paramControllerListener)
  {
    try
    {
      int i = mListeners.indexOf(paramControllerListener);
      if (i != -1) {
        mListeners.set(i, null);
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.controller.ForwardingControllerListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */