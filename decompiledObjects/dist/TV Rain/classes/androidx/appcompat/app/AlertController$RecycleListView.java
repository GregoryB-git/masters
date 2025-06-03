package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.R.styleable;

public class AlertController$RecycleListView
  extends ListView
{
  private final int mPaddingBottomNoButtons;
  private final int mPaddingTopNoTitle;
  
  public AlertController$RecycleListView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AlertController$RecycleListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.RecycleListView);
    mPaddingBottomNoButtons = paramContext.getDimensionPixelOffset(R.styleable.RecycleListView_paddingBottomNoButtons, -1);
    mPaddingTopNoTitle = paramContext.getDimensionPixelOffset(R.styleable.RecycleListView_paddingTopNoTitle, -1);
  }
  
  public void setHasDecor(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean2) || (!paramBoolean1))
    {
      int i = getPaddingLeft();
      int j;
      if (paramBoolean1) {
        j = getPaddingTop();
      } else {
        j = mPaddingTopNoTitle;
      }
      int k = getPaddingRight();
      int m;
      if (paramBoolean2) {
        m = getPaddingBottom();
      } else {
        m = mPaddingBottomNoButtons;
      }
      setPadding(i, j, k, m);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController.RecycleListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */