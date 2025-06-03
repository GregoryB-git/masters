package androidx.lifecycle;

import androidx.annotation.NonNull;

class SingleGeneratedAdapterObserver
  implements LifecycleEventObserver
{
  private final GeneratedAdapter mGeneratedAdapter;
  
  public SingleGeneratedAdapterObserver(GeneratedAdapter paramGeneratedAdapter)
  {
    mGeneratedAdapter = paramGeneratedAdapter;
  }
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    mGeneratedAdapter.callMethods(paramLifecycleOwner, paramEvent, false, null);
    mGeneratedAdapter.callMethods(paramLifecycleOwner, paramEvent, true, null);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.SingleGeneratedAdapterObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */