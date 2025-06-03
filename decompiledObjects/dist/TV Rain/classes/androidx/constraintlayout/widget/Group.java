package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public class Group
  extends ConstraintHelper
{
  public Group(Context paramContext)
  {
    super(paramContext);
  }
  
  public Group(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public Group(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
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
    mUseViewMeasure = false;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    applyLayoutFeatures();
  }
  
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
  
  public void updatePostLayout(ConstraintLayout paramConstraintLayout)
  {
    paramConstraintLayout = (ConstraintLayout.LayoutParams)getLayoutParams();
    widget.setWidth(0);
    widget.setHeight(0);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.Group
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */