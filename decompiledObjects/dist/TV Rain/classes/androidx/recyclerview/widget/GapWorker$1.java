package androidx.recyclerview.widget;

import java.util.Comparator;

class GapWorker$1
  implements Comparator<GapWorker.Task>
{
  public int compare(GapWorker.Task paramTask1, GapWorker.Task paramTask2)
  {
    RecyclerView localRecyclerView = view;
    int i = 1;
    int j = 1;
    if (localRecyclerView == null) {
      k = 1;
    } else {
      k = 0;
    }
    int m;
    if (view == null) {
      m = 1;
    } else {
      m = 0;
    }
    if (k != m)
    {
      if (localRecyclerView == null) {
        k = j;
      } else {
        k = -1;
      }
      return k;
    }
    boolean bool = immediate;
    if (bool != immediate)
    {
      k = i;
      if (bool) {
        k = -1;
      }
      return k;
    }
    int k = viewVelocity - viewVelocity;
    if (k != 0) {
      return k;
    }
    k = distanceToItem - distanceToItem;
    if (k != 0) {
      return k;
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.GapWorker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */