package androidx.work.impl.constraints.trackers;

import androidx.work.impl.constraints.ConstraintListener;
import java.util.Iterator;
import java.util.List;

class ConstraintTracker$1
  implements Runnable
{
  public ConstraintTracker$1(ConstraintTracker paramConstraintTracker, List paramList) {}
  
  public void run()
  {
    Iterator localIterator = val$listenersList.iterator();
    while (localIterator.hasNext()) {
      ((ConstraintListener)localIterator.next()).onConstraintChanged(this$0.mCurrentState);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.trackers.ConstraintTracker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */