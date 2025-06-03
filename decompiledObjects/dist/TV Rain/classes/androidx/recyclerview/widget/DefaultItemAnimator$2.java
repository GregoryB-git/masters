package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Iterator;

class DefaultItemAnimator$2
  implements Runnable
{
  public DefaultItemAnimator$2(DefaultItemAnimator paramDefaultItemAnimator, ArrayList paramArrayList) {}
  
  public void run()
  {
    Iterator localIterator = val$changes.iterator();
    while (localIterator.hasNext())
    {
      DefaultItemAnimator.ChangeInfo localChangeInfo = (DefaultItemAnimator.ChangeInfo)localIterator.next();
      this$0.animateChangeImpl(localChangeInfo);
    }
    val$changes.clear();
    this$0.mChangesList.remove(val$changes);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */