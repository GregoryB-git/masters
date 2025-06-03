package androidx.activity;

import java.util.ArrayDeque;

class OnBackPressedDispatcher$OnBackPressedCancellable
  implements Cancellable
{
  private final OnBackPressedCallback mOnBackPressedCallback;
  
  public OnBackPressedDispatcher$OnBackPressedCancellable(OnBackPressedDispatcher paramOnBackPressedDispatcher, OnBackPressedCallback paramOnBackPressedCallback)
  {
    mOnBackPressedCallback = paramOnBackPressedCallback;
  }
  
  public void cancel()
  {
    this$0.mOnBackPressedCallbacks.remove(mOnBackPressedCallback);
    mOnBackPressedCallback.removeCancellable(this);
  }
}

/* Location:
 * Qualified Name:     androidx.activity.OnBackPressedDispatcher.OnBackPressedCancellable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */