package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.widget.ConstraintAttribute;

class ViewOscillator$CustomSet
  extends ViewOscillator
{
  public ConstraintAttribute mCustom;
  public float[] value = new float[1];
  
  public void setCustom(Object paramObject)
  {
    mCustom = ((ConstraintAttribute)paramObject);
  }
  
  public void setProperty(View paramView, float paramFloat)
  {
    value[0] = get(paramFloat);
    CustomSupport.setInterpolatedValue(mCustom, paramView, value);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewOscillator.CustomSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */