package androidx.recyclerview.widget;

class GapWorker$Task
{
  public int distanceToItem;
  public boolean immediate;
  public int position;
  public RecyclerView view;
  public int viewVelocity;
  
  public void clear()
  {
    immediate = false;
    viewVelocity = 0;
    distanceToItem = 0;
    view = null;
    position = 0;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.GapWorker.Task
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */