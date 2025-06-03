package androidx.appcompat.widget;

import android.util.Property;

class SwitchCompat$1
  extends Property<SwitchCompat, Float>
{
  public SwitchCompat$1(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public Float get(SwitchCompat paramSwitchCompat)
  {
    return Float.valueOf(mThumbPosition);
  }
  
  public void set(SwitchCompat paramSwitchCompat, Float paramFloat)
  {
    paramSwitchCompat.setThumbPosition(paramFloat.floatValue());
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SwitchCompat.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */