package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;

public class KeyCycleOscillator$PathRotateSet
  extends KeyCycleOscillator
{
  public String type;
  public int typeId;
  
  public KeyCycleOscillator$PathRotateSet(String paramString)
  {
    type = paramString;
    typeId = TypedValues.CycleType.getId(paramString);
  }
  
  public void setPathRotate(MotionWidget paramMotionWidget, float paramFloat, double paramDouble1, double paramDouble2)
  {
    paramMotionWidget.setRotationZ(get(paramFloat) + (float)Math.toDegrees(Math.atan2(paramDouble2, paramDouble1)));
  }
  
  public void setProperty(MotionWidget paramMotionWidget, float paramFloat)
  {
    paramMotionWidget.setValue(typeId, get(paramFloat));
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */