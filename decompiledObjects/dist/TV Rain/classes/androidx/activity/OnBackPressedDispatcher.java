package androidx.activity;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher
{
  @Nullable
  private final Runnable mFallbackOnBackPressed;
  public final ArrayDeque<OnBackPressedCallback> mOnBackPressedCallbacks = new ArrayDeque();
  
  public OnBackPressedDispatcher()
  {
    this(null);
  }
  
  public OnBackPressedDispatcher(@Nullable Runnable paramRunnable)
  {
    mFallbackOnBackPressed = paramRunnable;
  }
  
  @MainThread
  public void addCallback(@NonNull OnBackPressedCallback paramOnBackPressedCallback)
  {
    addCancellableCallback(paramOnBackPressedCallback);
  }
  
  @SuppressLint({"LambdaLast"})
  @MainThread
  public void addCallback(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull OnBackPressedCallback paramOnBackPressedCallback)
  {
    paramLifecycleOwner = paramLifecycleOwner.getLifecycle();
    if (paramLifecycleOwner.getCurrentState() == Lifecycle.State.DESTROYED) {
      return;
    }
    paramOnBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(paramLifecycleOwner, paramOnBackPressedCallback));
  }
  
  @MainThread
  @NonNull
  public Cancellable addCancellableCallback(@NonNull OnBackPressedCallback paramOnBackPressedCallback)
  {
    mOnBackPressedCallbacks.add(paramOnBackPressedCallback);
    OnBackPressedCancellable localOnBackPressedCancellable = new OnBackPressedCancellable(paramOnBackPressedCallback);
    paramOnBackPressedCallback.addCancellable(localOnBackPressedCancellable);
    return localOnBackPressedCancellable;
  }
  
  @MainThread
  public boolean hasEnabledCallbacks()
  {
    Iterator localIterator = mOnBackPressedCallbacks.descendingIterator();
    while (localIterator.hasNext()) {
      if (((OnBackPressedCallback)localIterator.next()).isEnabled()) {
        return true;
      }
    }
    return false;
  }
  
  @MainThread
  public void onBackPressed()
  {
    Object localObject = mOnBackPressedCallbacks.descendingIterator();
    while (((Iterator)localObject).hasNext())
    {
      OnBackPressedCallback localOnBackPressedCallback = (OnBackPressedCallback)((Iterator)localObject).next();
      if (localOnBackPressedCallback.isEnabled())
      {
        localOnBackPressedCallback.handleOnBackPressed();
        return;
      }
    }
    localObject = mFallbackOnBackPressed;
    if (localObject != null) {
      ((Runnable)localObject).run();
    }
  }
  
  public class LifecycleOnBackPressedCancellable
    implements LifecycleEventObserver, Cancellable
  {
    @Nullable
    private Cancellable mCurrentCancellable;
    private final Lifecycle mLifecycle;
    private final OnBackPressedCallback mOnBackPressedCallback;
    
    public LifecycleOnBackPressedCancellable(@NonNull Lifecycle paramLifecycle, OnBackPressedCallback paramOnBackPressedCallback)
    {
      mLifecycle = paramLifecycle;
      mOnBackPressedCallback = paramOnBackPressedCallback;
      paramLifecycle.addObserver(this);
    }
    
    public void cancel()
    {
      mLifecycle.removeObserver(this);
      mOnBackPressedCallback.removeCancellable(this);
      Cancellable localCancellable = mCurrentCancellable;
      if (localCancellable != null)
      {
        localCancellable.cancel();
        mCurrentCancellable = null;
      }
    }
    
    public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
    {
      if (paramEvent == Lifecycle.Event.ON_START)
      {
        mCurrentCancellable = addCancellableCallback(mOnBackPressedCallback);
      }
      else if (paramEvent == Lifecycle.Event.ON_STOP)
      {
        paramLifecycleOwner = mCurrentCancellable;
        if (paramLifecycleOwner != null) {
          paramLifecycleOwner.cancel();
        }
      }
      else if (paramEvent == Lifecycle.Event.ON_DESTROY)
      {
        cancel();
      }
    }
  }
  
  public class OnBackPressedCancellable
    implements Cancellable
  {
    private final OnBackPressedCallback mOnBackPressedCallback;
    
    public OnBackPressedCancellable(OnBackPressedCallback paramOnBackPressedCallback)
    {
      mOnBackPressedCallback = paramOnBackPressedCallback;
    }
    
    public void cancel()
    {
      mOnBackPressedCallbacks.remove(mOnBackPressedCallback);
      mOnBackPressedCallback.removeCancellable(this);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.OnBackPressedDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */