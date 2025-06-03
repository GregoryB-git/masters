package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Iterator;

class DefaultItemAnimator$1
  implements Runnable
{
  public DefaultItemAnimator$1(DefaultItemAnimator paramDefaultItemAnimator, ArrayList paramArrayList) {}
  
  public void run()
  {
    Iterator localIterator = val$moves.iterator();
    while (localIterator.hasNext())
    {
      DefaultItemAnimator.MoveInfo localMoveInfo = (DefaultItemAnimator.MoveInfo)localIterator.next();
      this$0.animateMoveImpl(holder, fromX, fromY, toX, toY);
    }
    val$moves.clear();
    this$0.mMovesList.remove(val$moves);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */