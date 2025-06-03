package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public abstract class VirtualLayout
  extends ConstraintHelper
{
  private boolean mApplyElevationOnAttach;
  private boolean mApplyVisibilityOnAttach;
  
  public VirtualLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public VirtualLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public VirtualLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void applyLayoutFeaturesInConstraintSet(ConstraintLayout paramConstraintLayout)
  {
    applyLayoutFeatures(paramConstraintLayout);
  }
  
  public void init(AttributeSet paramAttributeSet)
  {
    super.init(paramAttributeSet);
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ConstraintLayout_Layout);
      int i = paramAttributeSet.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramAttributeSet.getIndex(j);
        if (k == R.styleable.ConstraintLayout_Layout_android_visibility) {
          mApplyVisibilityOnAttach = true;
        } else if (k == R.styleable.ConstraintLayout_Layout_android_elevation) {
          mApplyElevationOnAttach = true;
        }
      }
      paramAttributeSet.recycle();
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if ((mApplyVisibilityOnAttach) || (mApplyElevationOnAttach))
    {
      Object localObject = getParent();
      if ((localObject instanceof ConstraintLayout))
      {
        localObject = (ConstraintLayout)localObject;
        int i = getVisibility();
        float f = getElevation();
        for (int j = 0; j < mCount; j++)
        {
          View localView = ((ConstraintLayout)localObject).getViewById(mIds[j]);
          if (localView != null)
          {
            if (mApplyVisibilityOnAttach) {
              localView.setVisibility(i);
            }
            if ((mApplyElevationOnAttach) && (f > 0.0F)) {
              localView.setTranslationZ(localView.getTranslationZ() + f);
            }
          }
        }
      }
    }
  }
  
  public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout paramVirtualLayout, int paramInt1, int paramInt2) {}
  
  public void setElevation(float paramFloat)
  {
    super.setElevation(paramFloat);
    applyLayoutFeatures();
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    applyLayoutFeatures();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.VirtualLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */