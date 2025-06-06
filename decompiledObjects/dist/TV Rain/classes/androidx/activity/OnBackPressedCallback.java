package androidx.activity;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class OnBackPressedCallback
{
  private CopyOnWriteArrayList<Cancellable> mCancellables = new CopyOnWriteArrayList();
  private boolean mEnabled;
  
  public OnBackPressedCallback(boolean paramBoolean)
  {
    mEnabled = paramBoolean;
  }
  
  public void addCancellable(@NonNull Cancellable paramCancellable)
  {
    mCancellables.add(paramCancellable);
  }
  
  @MainThread
  public abstract void handleOnBackPressed();
  
  @MainThread
  public final boolean isEnabled()
  {
    return mEnabled;
  }
  
  @MainThread
  public final void remove()
  {
    Iterator localIterator = mCancellables.iterator();
    while (localIterator.hasNext()) {
      ((Cancellable)localIterator.next()).cancel();
    }
  }
  
  public void removeCancellable(@NonNull Cancellable paramCancellable)
  {
    mCancellables.remove(paramCancellable);
  }
  
  @MainThread
  public final void setEnabled(boolean paramBoolean)
  {
    mEnabled = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.OnBackPressedCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */