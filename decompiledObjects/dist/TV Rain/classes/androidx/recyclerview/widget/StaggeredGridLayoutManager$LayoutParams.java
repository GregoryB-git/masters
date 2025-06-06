package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class StaggeredGridLayoutManager$LayoutParams
  extends RecyclerView.LayoutParams
{
  public static final int INVALID_SPAN_ID = -1;
  public boolean mFullSpan;
  public StaggeredGridLayoutManager.Span mSpan;
  
  public StaggeredGridLayoutManager$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public StaggeredGridLayoutManager$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public StaggeredGridLayoutManager$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public StaggeredGridLayoutManager$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
  
  public StaggeredGridLayoutManager$LayoutParams(RecyclerView.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public final int getSpanIndex()
  {
    StaggeredGridLayoutManager.Span localSpan = mSpan;
    if (localSpan == null) {
      return -1;
    }
    return mIndex;
  }
  
  public boolean isFullSpan()
  {
    return mFullSpan;
  }
  
  public void setFullSpan(boolean paramBoolean)
  {
    mFullSpan = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */