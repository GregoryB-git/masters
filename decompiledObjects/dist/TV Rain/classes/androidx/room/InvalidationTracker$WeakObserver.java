package androidx.room;

import androidx.annotation.NonNull;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Set;

class InvalidationTracker$WeakObserver
  extends InvalidationTracker.Observer
{
  public final WeakReference<InvalidationTracker.Observer> mDelegateRef;
  public final InvalidationTracker mTracker;
  
  public InvalidationTracker$WeakObserver(InvalidationTracker paramInvalidationTracker, InvalidationTracker.Observer paramObserver)
  {
    super(mTables);
    mTracker = paramInvalidationTracker;
    mDelegateRef = new WeakReference(paramObserver);
  }
  
  public void onInvalidated(@NonNull Set<String> paramSet)
  {
    InvalidationTracker.Observer localObserver = (InvalidationTracker.Observer)mDelegateRef.get();
    if (localObserver == null) {
      mTracker.removeObserver(this);
    } else {
      localObserver.onInvalidated(paramSet);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.InvalidationTracker.WeakObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */