package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

class Transition$WidgetState
{
  public WidgetFrame end = new WidgetFrame();
  public WidgetFrame interpolated = new WidgetFrame();
  public Motion motionControl;
  public MotionWidget motionWidgetEnd = new MotionWidget(end);
  public MotionWidget motionWidgetInterpolated = new MotionWidget(interpolated);
  public MotionWidget motionWidgetStart = new MotionWidget(start);
  public KeyCache myKeyCache = new KeyCache();
  public int myParentHeight = -1;
  public int myParentWidth = -1;
  public WidgetFrame start = new WidgetFrame();
  
  public Transition$WidgetState()
  {
    Motion localMotion = new Motion(motionWidgetStart);
    motionControl = localMotion;
    localMotion.setStart(motionWidgetStart);
    motionControl.setEnd(motionWidgetEnd);
  }
  
  public WidgetFrame getFrame(int paramInt)
  {
    if (paramInt == 0) {
      return start;
    }
    if (paramInt == 1) {
      return end;
    }
    return interpolated;
  }
  
  public void interpolate(int paramInt1, int paramInt2, float paramFloat, Transition paramTransition)
  {
    myParentHeight = paramInt2;
    myParentWidth = paramInt1;
    motionControl.setup(paramInt1, paramInt2, 1.0F, System.nanoTime());
    WidgetFrame.interpolate(paramInt1, paramInt2, interpolated, start, end, paramTransition, paramFloat);
    interpolated.interpolatedPos = paramFloat;
    motionControl.interpolate(motionWidgetInterpolated, paramFloat, System.nanoTime(), myKeyCache);
  }
  
  public void setKeyAttribute(TypedBundle paramTypedBundle)
  {
    MotionKeyAttributes localMotionKeyAttributes = new MotionKeyAttributes();
    paramTypedBundle.applyDelta(localMotionKeyAttributes);
    motionControl.addKey(localMotionKeyAttributes);
  }
  
  public void setKeyCycle(TypedBundle paramTypedBundle)
  {
    MotionKeyCycle localMotionKeyCycle = new MotionKeyCycle();
    paramTypedBundle.applyDelta(localMotionKeyCycle);
    motionControl.addKey(localMotionKeyCycle);
  }
  
  public void setKeyPosition(TypedBundle paramTypedBundle)
  {
    MotionKeyPosition localMotionKeyPosition = new MotionKeyPosition();
    paramTypedBundle.applyDelta(localMotionKeyPosition);
    motionControl.addKey(localMotionKeyPosition);
  }
  
  public void update(ConstraintWidget paramConstraintWidget, int paramInt)
  {
    if (paramInt == 0)
    {
      start.update(paramConstraintWidget);
      motionControl.setStart(motionWidgetStart);
    }
    else if (paramInt == 1)
    {
      end.update(paramConstraintWidget);
      motionControl.setEnd(motionWidgetEnd);
    }
    myParentWidth = -1;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.Transition.WidgetState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */