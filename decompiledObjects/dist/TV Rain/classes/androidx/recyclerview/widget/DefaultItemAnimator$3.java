package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Iterator;

class DefaultItemAnimator$3
  implements Runnable
{
  public DefaultItemAnimator$3(DefaultItemAnimator paramDefaultItemAnimator, ArrayList paramArrayList) {}
  
  public void run()
  {
    Iterator localIterator = val$additions.iterator();
    while (localIterator.hasNext())
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)localIterator.next();
      this$0.animateAddImpl(localViewHolder);
    }
    val$additions.clear();
    this$0.mAdditionsList.remove(val$additions);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */