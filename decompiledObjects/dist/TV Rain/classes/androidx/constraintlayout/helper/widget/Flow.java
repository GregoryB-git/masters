package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.R.styleable;

public class Flow
  extends androidx.constraintlayout.widget.VirtualLayout
{
  public static final int CHAIN_PACKED = 2;
  public static final int CHAIN_SPREAD = 0;
  public static final int CHAIN_SPREAD_INSIDE = 1;
  public static final int HORIZONTAL = 0;
  public static final int HORIZONTAL_ALIGN_CENTER = 2;
  public static final int HORIZONTAL_ALIGN_END = 1;
  public static final int HORIZONTAL_ALIGN_START = 0;
  private static final String TAG = "Flow";
  public static final int VERTICAL = 1;
  public static final int VERTICAL_ALIGN_BASELINE = 3;
  public static final int VERTICAL_ALIGN_BOTTOM = 1;
  public static final int VERTICAL_ALIGN_CENTER = 2;
  public static final int VERTICAL_ALIGN_TOP = 0;
  public static final int WRAP_ALIGNED = 2;
  public static final int WRAP_CHAIN = 1;
  public static final int WRAP_NONE = 0;
  private androidx.constraintlayout.core.widgets.Flow mFlow;
  
  public Flow(Context paramContext)
  {
    super(paramContext);
  }
  
  public Flow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public Flow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void init(AttributeSet paramAttributeSet)
  {
    super.init(paramAttributeSet);
    mFlow = new androidx.constraintlayout.core.widgets.Flow();
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ConstraintLayout_Layout);
      int i = paramAttributeSet.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramAttributeSet.getIndex(j);
        if (k == R.styleable.ConstraintLayout_Layout_android_orientation) {
          mFlow.setOrientation(paramAttributeSet.getInt(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_android_padding) {
          mFlow.setPadding(paramAttributeSet.getDimensionPixelSize(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_android_paddingStart) {
          mFlow.setPaddingStart(paramAttributeSet.getDimensionPixelSize(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_android_paddingEnd) {
          mFlow.setPaddingEnd(paramAttributeSet.getDimensionPixelSize(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_android_paddingLeft) {
          mFlow.setPaddingLeft(paramAttributeSet.getDimensionPixelSize(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_android_paddingTop) {
          mFlow.setPaddingTop(paramAttributeSet.getDimensionPixelSize(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_android_paddingRight) {
          mFlow.setPaddingRight(paramAttributeSet.getDimensionPixelSize(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_android_paddingBottom) {
          mFlow.setPaddingBottom(paramAttributeSet.getDimensionPixelSize(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_wrapMode) {
          mFlow.setWrapMode(paramAttributeSet.getInt(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
          mFlow.setHorizontalStyle(paramAttributeSet.getInt(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_verticalStyle) {
          mFlow.setVerticalStyle(paramAttributeSet.getInt(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
          mFlow.setFirstHorizontalStyle(paramAttributeSet.getInt(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
          mFlow.setLastHorizontalStyle(paramAttributeSet.getInt(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
          mFlow.setFirstVerticalStyle(paramAttributeSet.getInt(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
          mFlow.setLastVerticalStyle(paramAttributeSet.getInt(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_horizontalBias) {
          mFlow.setHorizontalBias(paramAttributeSet.getFloat(k, 0.5F));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
          mFlow.setFirstHorizontalBias(paramAttributeSet.getFloat(k, 0.5F));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
          mFlow.setLastHorizontalBias(paramAttributeSet.getFloat(k, 0.5F));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
          mFlow.setFirstVerticalBias(paramAttributeSet.getFloat(k, 0.5F));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
          mFlow.setLastVerticalBias(paramAttributeSet.getFloat(k, 0.5F));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_verticalBias) {
          mFlow.setVerticalBias(paramAttributeSet.getFloat(k, 0.5F));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
          mFlow.setHorizontalAlign(paramAttributeSet.getInt(k, 2));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_verticalAlign) {
          mFlow.setVerticalAlign(paramAttributeSet.getInt(k, 2));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_horizontalGap) {
          mFlow.setHorizontalGap(paramAttributeSet.getDimensionPixelSize(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_verticalGap) {
          mFlow.setVerticalGap(paramAttributeSet.getDimensionPixelSize(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
          mFlow.setMaxElementsWrap(paramAttributeSet.getInt(k, -1));
        }
      }
      paramAttributeSet.recycle();
    }
    mHelperWidget = mFlow;
    validateParams();
  }
  
  public void loadParameters(ConstraintSet.Constraint paramConstraint, HelperWidget paramHelperWidget, ConstraintLayout.LayoutParams paramLayoutParams, SparseArray<ConstraintWidget> paramSparseArray)
  {
    super.loadParameters(paramConstraint, paramHelperWidget, paramLayoutParams, paramSparseArray);
    if ((paramHelperWidget instanceof androidx.constraintlayout.core.widgets.Flow))
    {
      paramConstraint = (androidx.constraintlayout.core.widgets.Flow)paramHelperWidget;
      int i = orientation;
      if (i != -1) {
        paramConstraint.setOrientation(i);
      }
    }
  }
  
  @SuppressLint({"WrongCall"})
  public void onMeasure(int paramInt1, int paramInt2)
  {
    onMeasure(mFlow, paramInt1, paramInt2);
  }
  
  public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout paramVirtualLayout, int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (paramVirtualLayout != null)
    {
      paramVirtualLayout.measure(i, j, paramInt1, paramInt2);
      setMeasuredDimension(paramVirtualLayout.getMeasuredWidth(), paramVirtualLayout.getMeasuredHeight());
    }
    else
    {
      setMeasuredDimension(0, 0);
    }
  }
  
  public void resolveRtl(ConstraintWidget paramConstraintWidget, boolean paramBoolean)
  {
    mFlow.applyRtl(paramBoolean);
  }
  
  public void setFirstHorizontalBias(float paramFloat)
  {
    mFlow.setFirstHorizontalBias(paramFloat);
    requestLayout();
  }
  
  public void setFirstHorizontalStyle(int paramInt)
  {
    mFlow.setFirstHorizontalStyle(paramInt);
    requestLayout();
  }
  
  public void setFirstVerticalBias(float paramFloat)
  {
    mFlow.setFirstVerticalBias(paramFloat);
    requestLayout();
  }
  
  public void setFirstVerticalStyle(int paramInt)
  {
    mFlow.setFirstVerticalStyle(paramInt);
    requestLayout();
  }
  
  public void setHorizontalAlign(int paramInt)
  {
    mFlow.setHorizontalAlign(paramInt);
    requestLayout();
  }
  
  public void setHorizontalBias(float paramFloat)
  {
    mFlow.setHorizontalBias(paramFloat);
    requestLayout();
  }
  
  public void setHorizontalGap(int paramInt)
  {
    mFlow.setHorizontalGap(paramInt);
    requestLayout();
  }
  
  public void setHorizontalStyle(int paramInt)
  {
    mFlow.setHorizontalStyle(paramInt);
    requestLayout();
  }
  
  public void setLastHorizontalBias(float paramFloat)
  {
    mFlow.setLastHorizontalBias(paramFloat);
    requestLayout();
  }
  
  public void setLastHorizontalStyle(int paramInt)
  {
    mFlow.setLastHorizontalStyle(paramInt);
    requestLayout();
  }
  
  public void setLastVerticalBias(float paramFloat)
  {
    mFlow.setLastVerticalBias(paramFloat);
    requestLayout();
  }
  
  public void setLastVerticalStyle(int paramInt)
  {
    mFlow.setLastVerticalStyle(paramInt);
    requestLayout();
  }
  
  public void setMaxElementsWrap(int paramInt)
  {
    mFlow.setMaxElementsWrap(paramInt);
    requestLayout();
  }
  
  public void setOrientation(int paramInt)
  {
    mFlow.setOrientation(paramInt);
    requestLayout();
  }
  
  public void setPadding(int paramInt)
  {
    mFlow.setPadding(paramInt);
    requestLayout();
  }
  
  public void setPaddingBottom(int paramInt)
  {
    mFlow.setPaddingBottom(paramInt);
    requestLayout();
  }
  
  public void setPaddingLeft(int paramInt)
  {
    mFlow.setPaddingLeft(paramInt);
    requestLayout();
  }
  
  public void setPaddingRight(int paramInt)
  {
    mFlow.setPaddingRight(paramInt);
    requestLayout();
  }
  
  public void setPaddingTop(int paramInt)
  {
    mFlow.setPaddingTop(paramInt);
    requestLayout();
  }
  
  public void setVerticalAlign(int paramInt)
  {
    mFlow.setVerticalAlign(paramInt);
    requestLayout();
  }
  
  public void setVerticalBias(float paramFloat)
  {
    mFlow.setVerticalBias(paramFloat);
    requestLayout();
  }
  
  public void setVerticalGap(int paramInt)
  {
    mFlow.setVerticalGap(paramInt);
    requestLayout();
  }
  
  public void setVerticalStyle(int paramInt)
  {
    mFlow.setVerticalStyle(paramInt);
    requestLayout();
  }
  
  public void setWrapMode(int paramInt)
  {
    mFlow.setWrapMode(paramInt);
    requestLayout();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.helper.widget.Flow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */