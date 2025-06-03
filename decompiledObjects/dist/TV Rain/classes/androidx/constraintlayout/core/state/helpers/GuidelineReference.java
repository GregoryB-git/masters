package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

public class GuidelineReference
  implements Facade, Reference
{
  private Object key;
  private int mEnd = -1;
  private Guideline mGuidelineWidget;
  private int mOrientation;
  private float mPercent = 0.0F;
  private int mStart = -1;
  public final State mState;
  
  public GuidelineReference(State paramState)
  {
    mState = paramState;
  }
  
  public void apply()
  {
    mGuidelineWidget.setOrientation(mOrientation);
    int i = mStart;
    if (i != -1)
    {
      mGuidelineWidget.setGuideBegin(i);
    }
    else
    {
      i = mEnd;
      if (i != -1) {
        mGuidelineWidget.setGuideEnd(i);
      } else {
        mGuidelineWidget.setGuidePercent(mPercent);
      }
    }
  }
  
  public GuidelineReference end(Object paramObject)
  {
    mStart = -1;
    mEnd = mState.convertDimension(paramObject);
    mPercent = 0.0F;
    return this;
  }
  
  public ConstraintWidget getConstraintWidget()
  {
    if (mGuidelineWidget == null) {
      mGuidelineWidget = new Guideline();
    }
    return mGuidelineWidget;
  }
  
  public Facade getFacade()
  {
    return null;
  }
  
  public Object getKey()
  {
    return key;
  }
  
  public int getOrientation()
  {
    return mOrientation;
  }
  
  public GuidelineReference percent(float paramFloat)
  {
    mStart = -1;
    mEnd = -1;
    mPercent = paramFloat;
    return this;
  }
  
  public void setConstraintWidget(ConstraintWidget paramConstraintWidget)
  {
    if ((paramConstraintWidget instanceof Guideline)) {
      mGuidelineWidget = ((Guideline)paramConstraintWidget);
    } else {
      mGuidelineWidget = null;
    }
  }
  
  public void setKey(Object paramObject)
  {
    key = paramObject;
  }
  
  public void setOrientation(int paramInt)
  {
    mOrientation = paramInt;
  }
  
  public GuidelineReference start(Object paramObject)
  {
    mStart = mState.convertDimension(paramObject);
    mEnd = -1;
    mPercent = 0.0F;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.helpers.GuidelineReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */