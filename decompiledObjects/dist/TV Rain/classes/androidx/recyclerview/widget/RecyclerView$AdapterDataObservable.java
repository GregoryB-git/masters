package androidx.recyclerview.widget;

import android.database.Observable;
import androidx.annotation.Nullable;
import java.util.ArrayList;

class RecyclerView$AdapterDataObservable
  extends Observable<RecyclerView.AdapterDataObserver>
{
  public boolean hasObservers()
  {
    return mObservers.isEmpty() ^ true;
  }
  
  public void notifyChanged()
  {
    for (int i = mObservers.size() - 1; i >= 0; i--) {
      ((RecyclerView.AdapterDataObserver)mObservers.get(i)).onChanged();
    }
  }
  
  public void notifyItemMoved(int paramInt1, int paramInt2)
  {
    for (int i = mObservers.size() - 1; i >= 0; i--) {
      ((RecyclerView.AdapterDataObserver)mObservers.get(i)).onItemRangeMoved(paramInt1, paramInt2, 1);
    }
  }
  
  public void notifyItemRangeChanged(int paramInt1, int paramInt2)
  {
    notifyItemRangeChanged(paramInt1, paramInt2, null);
  }
  
  public void notifyItemRangeChanged(int paramInt1, int paramInt2, @Nullable Object paramObject)
  {
    for (int i = mObservers.size() - 1; i >= 0; i--) {
      ((RecyclerView.AdapterDataObserver)mObservers.get(i)).onItemRangeChanged(paramInt1, paramInt2, paramObject);
    }
  }
  
  public void notifyItemRangeInserted(int paramInt1, int paramInt2)
  {
    for (int i = mObservers.size() - 1; i >= 0; i--) {
      ((RecyclerView.AdapterDataObserver)mObservers.get(i)).onItemRangeInserted(paramInt1, paramInt2);
    }
  }
  
  public void notifyItemRangeRemoved(int paramInt1, int paramInt2)
  {
    for (int i = mObservers.size() - 1; i >= 0; i--) {
      ((RecyclerView.AdapterDataObserver)mObservers.get(i)).onItemRangeRemoved(paramInt1, paramInt2);
    }
  }
  
  public void notifyStateRestorationPolicyChanged()
  {
    for (int i = mObservers.size() - 1; i >= 0; i--) {
      ((RecyclerView.AdapterDataObserver)mObservers.get(i)).onStateRestorationPolicyChanged();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.AdapterDataObservable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */