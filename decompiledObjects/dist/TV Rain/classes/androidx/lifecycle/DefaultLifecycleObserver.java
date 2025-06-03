package androidx.lifecycle;

import androidx.annotation.NonNull;

public abstract interface DefaultLifecycleObserver
  extends FullLifecycleObserver
{
  public void onCreate(@NonNull LifecycleOwner paramLifecycleOwner) {}
  
  public void onDestroy(@NonNull LifecycleOwner paramLifecycleOwner) {}
  
  public void onPause(@NonNull LifecycleOwner paramLifecycleOwner) {}
  
  public void onResume(@NonNull LifecycleOwner paramLifecycleOwner) {}
  
  public void onStart(@NonNull LifecycleOwner paramLifecycleOwner) {}
  
  public void onStop(@NonNull LifecycleOwner paramLifecycleOwner) {}
}

/* Location:
 * Qualified Name:     androidx.lifecycle.DefaultLifecycleObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */