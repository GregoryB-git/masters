package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;

class KeyCycleOscillator$CoreSpline
  extends KeyCycleOscillator
{
  public String type;
  public int typeId;
  
  public KeyCycleOscillator$CoreSpline(String paramString)
  {
    type = paramString;
    typeId = TypedValues.CycleType.getId(paramString);
  }
  
  public void setProperty(MotionWidget paramMotionWidget, float paramFloat)
  {
    paramMotionWidget.setValue(typeId, get(paramFloat));
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CoreSpline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */