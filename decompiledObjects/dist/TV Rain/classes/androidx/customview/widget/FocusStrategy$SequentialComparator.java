package androidx.customview.widget;

import android.graphics.Rect;
import java.util.Comparator;

class FocusStrategy$SequentialComparator<T>
  implements Comparator<T>
{
  private final FocusStrategy.BoundsAdapter<T> mAdapter;
  private final boolean mIsLayoutRtl;
  private final Rect mTemp1 = new Rect();
  private final Rect mTemp2 = new Rect();
  
  public FocusStrategy$SequentialComparator(boolean paramBoolean, FocusStrategy.BoundsAdapter<T> paramBoundsAdapter)
  {
    mIsLayoutRtl = paramBoolean;
    mAdapter = paramBoundsAdapter;
  }
  
  public int compare(T paramT1, T paramT2)
  {
    Rect localRect1 = mTemp1;
    Rect localRect2 = mTemp2;
    mAdapter.obtainBounds(paramT1, localRect1);
    mAdapter.obtainBounds(paramT2, localRect2);
    int i = top;
    int j = top;
    int k = -1;
    if (i < j) {
      return -1;
    }
    if (i > j) {
      return 1;
    }
    j = left;
    i = left;
    if (j < i)
    {
      if (mIsLayoutRtl) {
        k = 1;
      }
      return k;
    }
    if (j > i)
    {
      if (!mIsLayoutRtl) {
        k = 1;
      }
      return k;
    }
    j = bottom;
    i = bottom;
    if (j < i) {
      return -1;
    }
    if (j > i) {
      return 1;
    }
    j = right;
    i = right;
    if (j < i)
    {
      if (mIsLayoutRtl) {
        k = 1;
      }
      return k;
    }
    if (j > i)
    {
      if (!mIsLayoutRtl) {
        k = 1;
      }
      return k;
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     androidx.customview.widget.FocusStrategy.SequentialComparator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */