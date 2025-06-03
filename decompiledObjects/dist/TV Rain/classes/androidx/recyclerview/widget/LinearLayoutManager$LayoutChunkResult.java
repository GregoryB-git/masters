package androidx.recyclerview.widget;

public class LinearLayoutManager$LayoutChunkResult
{
  public int mConsumed;
  public boolean mFinished;
  public boolean mFocusable;
  public boolean mIgnoreConsumed;
  
  public void resetInternal()
  {
    mConsumed = 0;
    mFinished = false;
    mIgnoreConsumed = false;
    mFocusable = false;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.LinearLayoutManager.LayoutChunkResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */