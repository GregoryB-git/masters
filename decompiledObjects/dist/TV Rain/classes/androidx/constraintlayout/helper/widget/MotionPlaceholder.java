package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.widget.ConstraintHelper;

public class MotionPlaceholder
  extends androidx.constraintlayout.widget.VirtualLayout
{
  private static final String TAG = "MotionPlaceholder";
  public Placeholder mPlaceholder;
  
  public MotionPlaceholder(Context paramContext)
  {
    super(paramContext);
  }
  
  public MotionPlaceholder(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MotionPlaceholder(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public MotionPlaceholder(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
  }
  
  public void init(AttributeSet paramAttributeSet)
  {
    super.init(paramAttributeSet);
    mHelperWidget = new Placeholder();
    validateParams();
  }
  
  @SuppressLint({"WrongCall"})
  public void onMeasure(int paramInt1, int paramInt2)
  {
    onMeasure(mPlaceholder, paramInt1, paramInt2);
  }
  
  public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout paramVirtualLayout, int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (paramVirtualLayout != null)
    {
      paramVirtualLayout.measure(i, paramInt1, j, paramInt2);
      setMeasuredDimension(paramVirtualLayout.getMeasuredWidth(), paramVirtualLayout.getMeasuredHeight());
    }
    else
    {
      setMeasuredDimension(0, 0);
    }
  }
  
  public void updatePreLayout(ConstraintWidgetContainer paramConstraintWidgetContainer, Helper paramHelper, SparseArray<ConstraintWidget> paramSparseArray) {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.helper.widget.MotionPlaceholder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */