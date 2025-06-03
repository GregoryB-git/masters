package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;

public class Barrier
  extends ConstraintHelper
{
  public static final int BOTTOM = 3;
  public static final int END = 6;
  public static final int LEFT = 0;
  public static final int RIGHT = 1;
  public static final int START = 5;
  public static final int TOP = 2;
  private androidx.constraintlayout.core.widgets.Barrier mBarrier;
  private int mIndicatedType;
  private int mResolvedType;
  
  public Barrier(Context paramContext)
  {
    super(paramContext);
    super.setVisibility(8);
  }
  
  public Barrier(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setVisibility(8);
  }
  
  public Barrier(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    super.setVisibility(8);
  }
  
  private void updateType(ConstraintWidget paramConstraintWidget, int paramInt, boolean paramBoolean)
  {
    mResolvedType = paramInt;
    if (paramBoolean)
    {
      paramInt = mIndicatedType;
      if (paramInt == 5) {
        mResolvedType = 1;
      } else if (paramInt == 6) {
        mResolvedType = 0;
      }
    }
    else
    {
      paramInt = mIndicatedType;
      if (paramInt == 5) {
        mResolvedType = 0;
      } else if (paramInt == 6) {
        mResolvedType = 1;
      }
    }
    if ((paramConstraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier)) {
      ((androidx.constraintlayout.core.widgets.Barrier)paramConstraintWidget).setBarrierType(mResolvedType);
    }
  }
  
  @Deprecated
  public boolean allowsGoneWidget()
  {
    return mBarrier.getAllowsGoneWidget();
  }
  
  public boolean getAllowsGoneWidget()
  {
    return mBarrier.getAllowsGoneWidget();
  }
  
  public int getMargin()
  {
    return mBarrier.getMargin();
  }
  
  public int getType()
  {
    return mIndicatedType;
  }
  
  public void init(AttributeSet paramAttributeSet)
  {
    super.init(paramAttributeSet);
    mBarrier = new androidx.constraintlayout.core.widgets.Barrier();
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ConstraintLayout_Layout);
      int i = paramAttributeSet.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramAttributeSet.getIndex(j);
        if (k == R.styleable.ConstraintLayout_Layout_barrierDirection)
        {
          setType(paramAttributeSet.getInt(k, 0));
        }
        else if (k == R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets)
        {
          mBarrier.setAllowsGoneWidget(paramAttributeSet.getBoolean(k, true));
        }
        else if (k == R.styleable.ConstraintLayout_Layout_barrierMargin)
        {
          k = paramAttributeSet.getDimensionPixelSize(k, 0);
          mBarrier.setMargin(k);
        }
      }
      paramAttributeSet.recycle();
    }
    mHelperWidget = mBarrier;
    validateParams();
  }
  
  public void loadParameters(ConstraintSet.Constraint paramConstraint, HelperWidget paramHelperWidget, ConstraintLayout.LayoutParams paramLayoutParams, SparseArray<ConstraintWidget> paramSparseArray)
  {
    super.loadParameters(paramConstraint, paramHelperWidget, paramLayoutParams, paramSparseArray);
    if ((paramHelperWidget instanceof androidx.constraintlayout.core.widgets.Barrier))
    {
      paramLayoutParams = (androidx.constraintlayout.core.widgets.Barrier)paramHelperWidget;
      boolean bool = ((ConstraintWidgetContainer)paramHelperWidget.getParent()).isRtl();
      updateType(paramLayoutParams, layout.mBarrierDirection, bool);
      paramLayoutParams.setAllowsGoneWidget(layout.mBarrierAllowsGoneWidgets);
      paramLayoutParams.setMargin(layout.mBarrierMargin);
    }
  }
  
  public void resolveRtl(ConstraintWidget paramConstraintWidget, boolean paramBoolean)
  {
    updateType(paramConstraintWidget, mIndicatedType, paramBoolean);
  }
  
  public void setAllowsGoneWidget(boolean paramBoolean)
  {
    mBarrier.setAllowsGoneWidget(paramBoolean);
  }
  
  public void setDpMargin(int paramInt)
  {
    float f = getResourcesgetDisplayMetricsdensity;
    paramInt = (int)(paramInt * f + 0.5F);
    mBarrier.setMargin(paramInt);
  }
  
  public void setMargin(int paramInt)
  {
    mBarrier.setMargin(paramInt);
  }
  
  public void setType(int paramInt)
  {
    mIndicatedType = paramInt;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.Barrier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */